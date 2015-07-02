/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit90;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit90} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit90ItemProvider
	extends wtcItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit90ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInput__iStatusRPropertyDescriptor(object);
			addInput__iStatusSPropertyDescriptor(object);
			addInput__iStatusTPropertyDescriptor(object);
			addInput__iValueRPropertyDescriptor(object);
			addInput__iValueSPropertyDescriptor(object);
			addInput__iValueTPropertyDescriptor(object);
			addOutput__oCosinePhiPropertyDescriptor(object);
			addOutput__oFrequencyPropertyDescriptor(object);
			addOutput__oControlRPropertyDescriptor(object);
			addOutput__oControlSPropertyDescriptor(object);
			addOutput__oControlTPropertyDescriptor(object);
			addOutput__oApparentPowerPropertyDescriptor(object);
			addOutput__oVoltageRPropertyDescriptor(object);
			addOutput__oVoltageSPropertyDescriptor(object);
			addOutput__oVoltageTPropertyDescriptor(object);
			addOutput__oCurrentRPropertyDescriptor(object);
			addOutput__oCurrentSPropertyDescriptor(object);
			addOutput__oCurrentTPropertyDescriptor(object);
			addParameter__pCurrentFactorPropertyDescriptor(object);
			addParameter__pVoltageFactorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iStatus R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iStatusRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Input__iStatusR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Input__iStatusR_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Input__iStatusR(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iStatus S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iStatusSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Input__iStatusS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Input__iStatusS_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Input__iStatusS(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iStatus T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iStatusTPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Input__iStatusT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Input__iStatusT_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Input__iStatusT(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iValue R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iValueRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Input__iValueR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Input__iValueR_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Input__iValueR(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iValue S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iValueSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Input__iValueS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Input__iValueS_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Input__iValueS(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iValue T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iValueTPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Input__iValueT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Input__iValueT_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Input__iValueT(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oCosine Phi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oCosinePhiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oCosinePhi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oCosinePhi_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oCosinePhi(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oFrequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oFrequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oFrequency_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oFrequency(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oControl R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oControlRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oControlR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oControlR_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oControlR(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oControl S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oControlSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oControlS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oControlS_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oControlS(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oControl T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oControlTPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oControlT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oControlT_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oControlT(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oApparent Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oApparentPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oApparentPower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oApparentPower_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oApparentPower(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oVoltage R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oVoltageRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oVoltageR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oVoltageR_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oVoltageR(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oVoltage S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oVoltageSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oVoltageS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oVoltageS_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oVoltageS(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oVoltage T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oVoltageTPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oVoltageT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oVoltageT_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oVoltageT(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oCurrent R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oCurrentRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oCurrentR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oCurrentR_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oCurrentR(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oCurrent S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oCurrentSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oCurrentS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oCurrentS_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oCurrentS(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oCurrent T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oCurrentTPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Output__oCurrentT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Output__oCurrentT_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Output__oCurrentT(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pCurrent Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pCurrentFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Parameter__pCurrentFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Parameter__pCurrentFactor_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Parameter__pCurrentFactor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pVoltage Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pVoltageFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit90_Parameter__pVoltageFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit90_Parameter__pVoltageFactor_feature", "_UI_CtrlUnit90_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit90_Parameter__pVoltageFactor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit90.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit90"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit90)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit90_type") :
			getString("_UI_CtrlUnit90_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
