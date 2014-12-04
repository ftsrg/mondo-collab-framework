/**
 */
package eu.mondo.collaboration.operationtracemodel.provider;

import eu.mondo.collaboration.operationtracemodel.util.OperationtracemodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationtracemodelItemProviderAdapterFactory extends OperationtracemodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationtracemodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.Trace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceItemProvider traceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.Trace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTraceAdapter() {
		if (traceItemProvider == null) {
			traceItemProvider = new TraceItemProvider(this);
		}

		return traceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.Cemetary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CemetaryItemProvider cemetaryItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.Cemetary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCemetaryAdapter() {
		if (cemetaryItemProvider == null) {
			cemetaryItemProvider = new CemetaryItemProvider(this);
		}

		return cemetaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.InsertAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertAttributeItemProvider insertAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.InsertAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInsertAttributeAdapter() {
		if (insertAttributeItemProvider == null) {
			insertAttributeItemProvider = new InsertAttributeItemProvider(this);
		}

		return insertAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.InsertReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertReferenceItemProvider insertReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.InsertReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInsertReferenceAdapter() {
		if (insertReferenceItemProvider == null) {
			insertReferenceItemProvider = new InsertReferenceItemProvider(this);
		}

		return insertReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateAttributeItemProvider updateAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateAttributeAdapter() {
		if (updateAttributeItemProvider == null) {
			updateAttributeItemProvider = new UpdateAttributeItemProvider(this);
		}

		return updateAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.UpdateReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateReferenceItemProvider updateReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.UpdateReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateReferenceAdapter() {
		if (updateReferenceItemProvider == null) {
			updateReferenceItemProvider = new UpdateReferenceItemProvider(this);
		}

		return updateReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.RemoveAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveAttributeItemProvider removeAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.RemoveAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRemoveAttributeAdapter() {
		if (removeAttributeItemProvider == null) {
			removeAttributeItemProvider = new RemoveAttributeItemProvider(this);
		}

		return removeAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.RemoveReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveReferenceItemProvider removeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.RemoveReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRemoveReferenceAdapter() {
		if (removeReferenceItemProvider == null) {
			removeReferenceItemProvider = new RemoveReferenceItemProvider(this);
		}

		return removeReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.MoveAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveAttributeItemProvider moveAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.MoveAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoveAttributeAdapter() {
		if (moveAttributeItemProvider == null) {
			moveAttributeItemProvider = new MoveAttributeItemProvider(this);
		}

		return moveAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.mondo.collaboration.operationtracemodel.MoveReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveReferenceItemProvider moveReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.mondo.collaboration.operationtracemodel.MoveReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoveReferenceAdapter() {
		if (moveReferenceItemProvider == null) {
			moveReferenceItemProvider = new MoveReferenceItemProvider(this);
		}

		return moveReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (traceItemProvider != null) traceItemProvider.dispose();
		if (commandItemProvider != null) commandItemProvider.dispose();
		if (cemetaryItemProvider != null) cemetaryItemProvider.dispose();
		if (insertAttributeItemProvider != null) insertAttributeItemProvider.dispose();
		if (insertReferenceItemProvider != null) insertReferenceItemProvider.dispose();
		if (updateAttributeItemProvider != null) updateAttributeItemProvider.dispose();
		if (updateReferenceItemProvider != null) updateReferenceItemProvider.dispose();
		if (removeAttributeItemProvider != null) removeAttributeItemProvider.dispose();
		if (removeReferenceItemProvider != null) removeReferenceItemProvider.dispose();
		if (moveAttributeItemProvider != null) moveAttributeItemProvider.dispose();
		if (moveReferenceItemProvider != null) moveReferenceItemProvider.dispose();
	}

}
