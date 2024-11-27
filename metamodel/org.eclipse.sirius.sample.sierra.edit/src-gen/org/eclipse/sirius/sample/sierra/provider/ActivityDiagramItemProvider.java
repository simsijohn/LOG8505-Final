/**
 */
package org.eclipse.sirius.sample.sierra.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.sirius.sample.sierra.ActivityDiagram;
import org.eclipse.sirius.sample.sierra.SierraFactory;
import org.eclipse.sirius.sample.sierra.SierraPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.sample.sierra.ActivityDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SierraPackage.Literals.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT);
			childrenFeatures.add(SierraPackage.Literals.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT);
			childrenFeatures.add(SierraPackage.Literals.ACTIVITY_DIAGRAM__PERFORMINGELEMENT);
			childrenFeatures.add(SierraPackage.Literals.ACTIVITY_DIAGRAM__EXCHANGEELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ActivityDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityDiagram"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ActivityDiagram_type");
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

		switch (notification.getFeatureID(ActivityDiagram.class)) {
		case SierraPackage.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT:
		case SierraPackage.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT:
		case SierraPackage.ACTIVITY_DIAGRAM__PERFORMINGELEMENT:
		case SierraPackage.ACTIVITY_DIAGRAM__EXCHANGEELEMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
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

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT,
				SierraFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT,
				SierraFactory.eINSTANCE.createInvolvableElement()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT,
				SierraFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT,
				SierraFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT,
				SierraFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT,
				SierraFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT,
				SierraFactory.eINSTANCE.createChain()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT,
				SierraFactory.eINSTANCE.createexchange()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__PERFORMINGELEMENT,
				SierraFactory.eINSTANCE.createInvolvableElement()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__PERFORMINGELEMENT,
				SierraFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__PERFORMINGELEMENT,
				SierraFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__PERFORMINGELEMENT,
				SierraFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__PERFORMINGELEMENT,
				SierraFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__EXCHANGEELEMENT,
				SierraFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__EXCHANGEELEMENT,
				SierraFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__EXCHANGEELEMENT,
				SierraFactory.eINSTANCE.createInput()));

		newChildDescriptors.add(createChildParameter(SierraPackage.Literals.ACTIVITY_DIAGRAM__EXCHANGEELEMENT,
				SierraFactory.eINSTANCE.createOutput()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == SierraPackage.Literals.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT
				|| childFeature == SierraPackage.Literals.ACTIVITY_DIAGRAM__PERFORMINGELEMENT
				|| childFeature == SierraPackage.Literals.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SierraEditPlugin.INSTANCE;
	}

}
