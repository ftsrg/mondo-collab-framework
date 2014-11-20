/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit114;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit114} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit114ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit114ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iWindDirectionRawPropertyDescriptor(object);
			addInput__iNacelleDirectionPropertyDescriptor(object);
			addOutput__oWindDirectionPropertyDescriptor(object);
			addOutput__oWindDirectionAveragePropertyDescriptor(object);
			addOutput__oWindDirectionDispAbsolutePropertyDescriptor(object);
			addOutput__oWindDirectionDispRelativePropertyDescriptor(object);
			addParameter__pVaneOffsetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iWind Direction Raw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iWindDirectionRawPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit114_Input__iWindDirectionRaw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit114_Input__iWindDirectionRaw_feature", "_UI_CtrlUnit114_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit114_Input__iWindDirectionRaw(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iNacelle Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iNacelleDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit114_Input__iNacelleDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit114_Input__iNacelleDirection_feature", "_UI_CtrlUnit114_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit114_Input__iNacelleDirection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oWind Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oWindDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit114_Output__oWindDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit114_Output__oWindDirection_feature", "_UI_CtrlUnit114_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit114_Output__oWindDirection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oWind Direction Average feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oWindDirectionAveragePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit114_Output__oWindDirectionAverage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit114_Output__oWindDirectionAverage_feature", "_UI_CtrlUnit114_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit114_Output__oWindDirectionAverage(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oWind Direction Disp Absolute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oWindDirectionDispAbsolutePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit114_Output__oWindDirectionDispAbsolute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit114_Output__oWindDirectionDispAbsolute_feature", "_UI_CtrlUnit114_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit114_Output__oWindDirectionDispAbsolute(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oWind Direction Disp Relative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oWindDirectionDispRelativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit114_Output__oWindDirectionDispRelative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit114_Output__oWindDirectionDispRelative_feature", "_UI_CtrlUnit114_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit114_Output__oWindDirectionDispRelative(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pVane Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pVaneOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit114_Parameter__pVaneOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit114_Parameter__pVaneOffset_feature", "_UI_CtrlUnit114_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit114_Parameter__pVaneOffset(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit114.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit114"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit114)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit114_type") :
			getString("_UI_CtrlUnit114_type") + " " + label;
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
