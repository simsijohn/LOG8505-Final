/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.sierra.SierraPackage;
import org.eclipse.sirius.sample.sierra.SpecializableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specializable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.SpecializableElementImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.SpecializableElementImpl#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpecializableElementImpl extends MinimalEObjectImpl.Container implements SpecializableElement {
	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecializableElement> specializes;

	/**
	 * The cached value of the '{@link #getIsSpecializedBy() <em>Is Specialized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpecializedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecializableElement> isSpecializedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.SPECIALIZABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecializableElement> getSpecializes() {
		if (specializes == null) {
			specializes = new EObjectWithInverseResolvingEList.ManyInverse<SpecializableElement>(
					SpecializableElement.class, this, SierraPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES,
					SierraPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY);
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecializableElement> getIsSpecializedBy() {
		if (isSpecializedBy == null) {
			isSpecializedBy = new EObjectWithInverseResolvingEList.ManyInverse<SpecializableElement>(
					SpecializableElement.class, this, SierraPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY,
					SierraPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES);
		}
		return isSpecializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SierraPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSpecializes()).basicAdd(otherEnd, msgs);
		case SierraPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsSpecializedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SierraPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			return ((InternalEList<?>) getSpecializes()).basicRemove(otherEnd, msgs);
		case SierraPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			return ((InternalEList<?>) getIsSpecializedBy()).basicRemove(otherEnd, msgs);
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
		case SierraPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			return getSpecializes();
		case SierraPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			return getIsSpecializedBy();
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
		case SierraPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			getSpecializes().clear();
			getSpecializes().addAll((Collection<? extends SpecializableElement>) newValue);
			return;
		case SierraPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			getIsSpecializedBy().clear();
			getIsSpecializedBy().addAll((Collection<? extends SpecializableElement>) newValue);
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
		case SierraPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			getSpecializes().clear();
			return;
		case SierraPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			getIsSpecializedBy().clear();
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
		case SierraPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			return specializes != null && !specializes.isEmpty();
		case SierraPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			return isSpecializedBy != null && !isSpecializedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecializableElementImpl
