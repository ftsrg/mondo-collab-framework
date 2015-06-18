package org.mondo.collaboration.wstracker.adapter;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra.dse.merge.model.Attribute;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.Create;
import org.eclipse.viatra.dse.merge.model.Delete;
import org.eclipse.viatra.dse.merge.model.Id;
import org.eclipse.viatra.dse.merge.model.IdType;
import org.eclipse.viatra.dse.merge.model.Kind;
import org.eclipse.viatra.dse.merge.model.ModelFactory;
import org.eclipse.viatra.dse.merge.model.Reference;

public class WSTrackerContentAdapter extends EContentAdapter {

	private EditingDomain trackedDomain;
	private Resource changeResource;
	private ChangeSet changeSet;
	private Logger logger = Logger.getLogger(WSTrackerContentAdapter.class);
	private TransactionalEditingDomain editingDomain;

	public static final String EXTENSION = "changeset";

	public WSTrackerContentAdapter(EditingDomain toTrack) {
		logger.setLevel(Level.INFO);

		this.trackedDomain = toTrack;
		initialize();
	}

	private void initialize() {

		// Register resource factory for the extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(EXTENSION, new XMIResourceFactoryImpl());

		// Create or load change set resource
		ResourceSet rSet = new ResourceSetImpl();
		String uri = trackedDomain.getResourceSet().getResources().get(0).getURI() + "." + EXTENSION;
		changeResource = rSet.createResource(URI.createURI(uri));
		if (changeResource.getContents().isEmpty()) {
			changeSet = ModelFactory.eINSTANCE.createChangeSet();
			changeResource.getContents().add(changeSet);
		} else {
			changeSet = (ChangeSet) changeResource.getContents().get(0);
		}

		// Create transactional editing domain for change resource
		editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rSet);

		// Add this adapter to the tracked resource
		for(Resource r : trackedDomain.getResourceSet().getResources()) {
			r.eAdapters().add(this);
			logger.info("Adapter created and added to resource:" + r.getURI());
		}
		logger.info("Trace info will be stored into:" + changeResource.getURI());
		
		trackedDomain.getCommandStack().addCommandStackListener(new CommandStackListener() {
			
			Command previousCommand = null;
			boolean previousUndo = false;
			
			@Override
			public void commandStackChanged(EventObject event) {
				Object source = event.getSource();
				if(source instanceof BasicCommandStack) {
					BasicCommandStack stack = (BasicCommandStack) source;
					Command currentCommand = stack.getMostRecentCommand();
					if(currentCommand == previousCommand) {
						if(previousUndo) {
							editingDomain.getCommandStack().redo();
							previousUndo = false;
							logger.info("Redo executed on ChangeSet");
						} else {
							editingDomain.getCommandStack().undo();
							previousUndo = true;
							logger.info("Undo executed on ChangeSet");
						}
					}
					previousCommand = currentCommand;
				}
			}
		});
		
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		boolean isSaved = handleSave(notification);
		
		if (!isSaved) {

			RecordingCommand command = new RecordingCommand(editingDomain) {

				@Override
				protected void doExecute() {
					switch (notification.getEventType()) {
						case Notification.ADD:
							handleAdd(notification);
							break;
						case Notification.ADD_MANY:
							handleAddMany(notification);
							break;
						case Notification.MOVE:
							handleMove(notification);
							break;
						case Notification.REMOVE:
							handleRemove(notification);
							break;
						case Notification.REMOVE_MANY:
							handleRemoveMany(notification);
							break;
						case Notification.SET:
							handleSet(notification);
							break;
						case Notification.UNSET:
							handleUnset(notification);
							break;
						default:
							break;
					}
				}
			};

			if(command.canExecute()) {
				editingDomain.getCommandStack().execute(command);
			}
		}
	}

	private void handleAdd(Notification notification) {
		if (notification.getFeature() instanceof EAttribute) {
			Attribute attribute = ModelFactory.eINSTANCE.createAttribute();
			attribute.setKind(Kind.ADD);
			attribute.setFeature((EStructuralFeature) notification.getFeature());
			attribute.setValue(notification.getNewValue());
			attribute.setSrc(getID((EObject) notification.getNotifier()));
			changeSet.getChanges().add(attribute);
		} else if (notification.getFeature() instanceof EReference) {
			if (((EReference) notification.getFeature()).isContainment()) {
				Create create = ModelFactory.eINSTANCE.createCreate();
				create.setClazz(((EObject) notification.getNewValue()).eClass());
				create.setContainer(getID((EObject) notification.getNotifier()));
				create.setSrc(getID((EObject) notification.getNewValue()));
				create.setFeature((EReference) notification.getFeature());
				changeSet.getChanges().add(create);
			} else {
				Reference reference = ModelFactory.eINSTANCE.createReference();
				reference.setKind(Kind.ADD);
				reference.setFeature((EStructuralFeature) notification
						.getFeature());
				reference.setTrg(getID((EObject) notification.getNewValue()));
				reference.setSrc(getID((EObject) notification.getNotifier()));
				changeSet.getChanges().add(reference);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void handleAddMany(Notification notification) {
		for (Object o : (Collection<Object>) (notification.getNewValue())) {
			if (notification.getFeature() instanceof EAttribute) {
				Attribute attribute = ModelFactory.eINSTANCE.createAttribute();
				attribute.setKind(Kind.ADD);
				attribute.setFeature((EStructuralFeature) notification
						.getFeature());
				attribute.setValue(o);
				attribute.setSrc(getID((EObject) notification.getNotifier()));
				changeSet.getChanges().add(attribute);
			} else if (notification.getFeature() instanceof EReference) {
				if (((EReference) notification.getFeature()).isContainment()) {
					Create create = ModelFactory.eINSTANCE.createCreate();
					create.setClazz(((EObject) notification.getNewValue())
							.eClass());
					create.setContainer(getID((EObject) notification
							.getNotifier()));
					create.setSrc(getID((EObject) o));
					create.setFeature((EReference) notification.getFeature());
					changeSet.getChanges().add(create);
				} else {
					Reference reference = ModelFactory.eINSTANCE
							.createReference();
					reference.setKind(Kind.ADD);
					reference.setFeature((EStructuralFeature) notification
							.getFeature());
					reference.setTrg(getID((EObject) o));
					reference
							.setSrc(getID((EObject) notification.getNotifier()));
					changeSet.getChanges().add(reference);
				}
			}
		}
	}

	private void handleMove(Notification notification) {
		// TODO Auto-generated method stub

	}

	private void handleRemove(Notification notification) {
		if (notification.getFeature() instanceof EAttribute) {
			Attribute attribute = ModelFactory.eINSTANCE.createAttribute();
			attribute.setKind(Kind.REMOVE);
			attribute
					.setFeature((EStructuralFeature) notification.getFeature());
			attribute.setValue(notification.getOldValue());
			attribute.setSrc(getID((EObject) notification.getNotifier()));
			changeSet.getChanges().add(attribute);
		} else if (notification.getFeature() instanceof EReference) {
			if (((EReference) notification.getFeature()).isContainment()) {
				Delete delete = ModelFactory.eINSTANCE.createDelete();
				delete.setSrc(getID((EObject) notification.getOldValue()));
				changeSet.getChanges().add(delete);
			} else {
				Reference reference = ModelFactory.eINSTANCE.createReference();
				reference.setKind(Kind.REMOVE);
				reference.setFeature((EStructuralFeature) notification
						.getFeature());
				reference.setTrg(getID((EObject) notification.getOldValue()));
				reference.setSrc(getID((EObject) notification.getNotifier()));
				changeSet.getChanges().add(reference);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void handleRemoveMany(Notification notification) {
		for (Object o : (Collection<Object>) (notification.getOldValue())) {
			if (notification.getFeature() instanceof EAttribute) {
				Attribute attribute = ModelFactory.eINSTANCE.createAttribute();
				attribute.setKind(Kind.REMOVE);
				attribute.setFeature((EStructuralFeature) notification
						.getFeature());
				attribute.setValue(o);
				attribute.setSrc(getID((EObject) notification.getNotifier()));
				changeSet.getChanges().add(attribute);
			} else if (notification.getFeature() instanceof EReference) {
				if (((EReference) notification.getFeature()).isContainment()) {
					Delete delete = ModelFactory.eINSTANCE.createDelete();
					delete.setSrc(getID((EObject) o));
					changeSet.getChanges().add(delete);
				} else {
					Reference reference = ModelFactory.eINSTANCE
							.createReference();
					reference.setKind(Kind.REMOVE);
					reference.setFeature((EStructuralFeature) notification
							.getFeature());
					reference.setTrg(getID((EObject) o));
					reference
							.setSrc(getID((EObject) notification.getNotifier()));
					changeSet.getChanges().add(reference);
				}
			}
		}
	}

	private void handleSet(Notification notification) {
		if (notification.getFeature() instanceof EAttribute) {
			Attribute attribute = ModelFactory.eINSTANCE.createAttribute();
			attribute.setKind(Kind.SET);
			attribute
					.setFeature((EStructuralFeature) notification.getFeature());
			attribute.setValue(notification.getNewValue());
			attribute.setSrc(getID((EObject) notification.getNotifier()));
			changeSet.getChanges().add(attribute);
		} else if (notification.getFeature() instanceof EReference) {
			Reference reference = ModelFactory.eINSTANCE.createReference();
			reference.setKind(Kind.SET);
			reference
					.setFeature((EStructuralFeature) notification.getFeature());
			reference.setTrg(getID((EObject) notification.getNewValue()));
			reference.setSrc(getID((EObject) notification.getNotifier()));
			changeSet.getChanges().add(reference);
		}
	}

	private void handleUnset(Notification notification) {
		if (notification.getFeature() instanceof EAttribute) {
			Attribute attribute = ModelFactory.eINSTANCE.createAttribute();
			attribute.setKind(Kind.UNSET);
			attribute
					.setFeature((EStructuralFeature) notification.getFeature());
			attribute.setSrc(getID((EObject) notification.getNotifier()));
			changeSet.getChanges().add(attribute);
		} else if (notification.getFeature() instanceof EReference) {
			Reference reference = ModelFactory.eINSTANCE.createReference();
			reference.setKind(Kind.UNSET);
			reference
					.setFeature((EStructuralFeature) notification.getFeature());
			reference.setSrc(getID((EObject) notification.getNotifier()));
			changeSet.getChanges().add(reference);
		}
	}

	private boolean handleSave(Notification notification) {
		if (notification.getNotifier() instanceof Resource) {
			if (!((Resource) notification.getNotifier()).isModified()) {
				try {
					changeResource.save(Collections.emptyMap());
				} catch (IOException e) {
					logger.error(e.getMessage(), e);
				}
				return true;
			}
		}
		return false;
	}

	private static Id create(int value) {
		Id id = ModelFactory.eINSTANCE.createId();
		id.setEInt(value);
		id.setType(IdType.EINT);
		return id;
	}

	private static Id create(long value) {
		Id id = ModelFactory.eINSTANCE.createId();
		id.setELong(value);
		id.setType(IdType.ELONG);
		return id;
	}

	private static Id create(String value) {
		Id id = ModelFactory.eINSTANCE.createId();
		id.setEString(value);
		id.setType(IdType.ESTRING);
		return id;
	}

	private static Id create(Object value) {
		if (value instanceof Integer) {
			return create((int) value);
		}
		if (value instanceof Long) {
			return create((long) value);
		}
		if (value instanceof String) {
			return create((String) value);
		}
		return null;
	}

	private static Id getID(EObject object) {
		EStructuralFeature feature = object.eClass()
				.getEStructuralFeature("id");
		return create(object.eGet(feature));
	}

}
