/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.sierra.ActivityDiagram;
import org.eclipse.sirius.sample.sierra.ContainableElement;
import org.eclipse.sirius.sample.sierra.ExchangeElement;
import org.eclipse.sirius.sample.sierra.PerformingElement;
import org.eclipse.sirius.sample.sierra.SierraPackage;
import org.eclipse.sirius.sample.sierra.SpecializableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.ActivityDiagramImpl#getSpecializableelement <em>Specializableelement</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.ActivityDiagramImpl#getContainableelement <em>Containableelement</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.ActivityDiagramImpl#getPerformingelement <em>Performingelement</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.ActivityDiagramImpl#getExchangeelement <em>Exchangeelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDiagramImpl extends MinimalEObjectImpl.Container implements ActivityDiagram {
	/**
	 * The cached value of the '{@link #getSpecializableelement() <em>Specializableelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializableelement()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecializableElement> specializableelement;

	/**
	 * The cached value of the '{@link #getContainableelement() <em>Containableelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainableelement()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainableElement> containableelement;

	/**
	 * The cached value of the '{@link #getPerformingelement() <em>Performingelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformingelement()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformingElement> performingelement;

	/**
	 * The cached value of the '{@link #getExchangeelement() <em>Exchangeelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeelement()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeElement> exchangeelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.ACTIVITY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecializableElement> getSpecializableelement() {
		if (specializableelement == null) {
			specializableelement = new EObjectContainmentEList<SpecializableElement>(SpecializableElement.class, this,
					SierraPackage.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT);
		}
		return specializableelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainableElement> getContainableelement() {
		if (containableelement == null) {
			containableelement = new EObjectContainmentEList<ContainableElement>(ContainableElement.class, this,
					SierraPackage.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT);
		}
		return containableelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformingElement> getPerformingelement() {
		if (performingelement == null) {
			performingelement = new EObjectContainmentEList<PerformingElement>(PerformingElement.class, this,
					SierraPackage.ACTIVITY_DIAGRAM__PERFORMINGELEMENT);
		}
		return performingelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeElement> getExchangeelement() {
		if (exchangeelement == null) {
			exchangeelement = new EObjectContainmentEList<ExchangeElement>(ExchangeElement.class, this,
					SierraPackage.ACTIVITY_DIAGRAM__EXCHANGEELEMENT);
		}
		return exchangeelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SierraPackage.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT:
			return ((InternalEList<?>) getSpecializableelement()).basicRemove(otherEnd, msgs);
		case SierraPackage.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT:
			return ((InternalEList<?>) getContainableelement()).basicRemove(otherEnd, msgs);
		case SierraPackage.ACTIVITY_DIAGRAM__PERFORMINGELEMENT:
			return ((InternalEList<?>) getPerformingelement()).basicRemove(otherEnd, msgs);
		case SierraPackage.ACTIVITY_DIAGRAM__EXCHANGEELEMENT:
			return ((InternalEList<?>) getExchangeelement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SierraPackage.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT:
			return getSpecializableelement();
		case SierraPackage.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT:
			return getContainableelement();
		case SierraPackage.ACTIVITY_DIAGRAM__PERFORMINGELEMENT:
			return getPerformingelement();
		case SierraPackage.ACTIVITY_DIAGRAM__EXCHANGEELEMENT:
			return getExchangeelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SierraPackage.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT:
			getSpecializableelement().clear();
			getSpecializableelement().addAll((Collection<? extends SpecializableElement>) newValue);
			return;
		case SierraPackage.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT:
			getContainableelement().clear();
			getContainableelement().addAll((Collection<? extends ContainableElement>) newValue);
			return;
		case SierraPackage.ACTIVITY_DIAGRAM__PERFORMINGELEMENT:
			getPerformingelement().clear();
			getPerformingelement().addAll((Collection<? extends PerformingElement>) newValue);
			return;
		case SierraPackage.ACTIVITY_DIAGRAM__EXCHANGEELEMENT:
			getExchangeelement().clear();
			getExchangeelement().addAll((Collection<? extends ExchangeElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SierraPackage.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT:
			getSpecializableelement().clear();
			return;
		case SierraPackage.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT:
			getContainableelement().clear();
			return;
		case SierraPackage.ACTIVITY_DIAGRAM__PERFORMINGELEMENT:
			getPerformingelement().clear();
			return;
		case SierraPackage.ACTIVITY_DIAGRAM__EXCHANGEELEMENT:
			getExchangeelement().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SierraPackage.ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT:
			return specializableelement != null && !specializableelement.isEmpty();
		case SierraPackage.ACTIVITY_DIAGRAM__CONTAINABLEELEMENT:
			return containableelement != null && !containableelement.isEmpty();
		case SierraPackage.ACTIVITY_DIAGRAM__PERFORMINGELEMENT:
			return performingelement != null && !performingelement.isEmpty();
		case SierraPackage.ACTIVITY_DIAGRAM__EXCHANGEELEMENT:
			return exchangeelement != null && !exchangeelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityDiagramImpl
