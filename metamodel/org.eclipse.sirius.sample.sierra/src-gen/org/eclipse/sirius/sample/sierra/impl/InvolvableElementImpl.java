/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.sierra.Capability;
import org.eclipse.sirius.sample.sierra.Function;
import org.eclipse.sirius.sample.sierra.InvolvableElement;
import org.eclipse.sirius.sample.sierra.PerformingElement;
import org.eclipse.sirius.sample.sierra.SierraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Involvable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.InvolvableElementImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.InvolvableElementImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.InvolvableElementImpl#getIsInvolvedIn <em>Is Involved In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvolvableElementImpl extends SpecializableElementImpl implements InvolvableElement {
	/**
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> performs;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<InvolvableElement> extends_;

	/**
	 * The cached value of the '{@link #getIsInvolvedIn() <em>Is Involved In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInvolvedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> isInvolvedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvolvableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.INVOLVABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getPerforms() {
		if (performs == null) {
			performs = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this,
					SierraPackage.INVOLVABLE_ELEMENT__PERFORMS, SierraPackage.FUNCTION__IS_PERFORMED_BY);
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvolvableElement> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<InvolvableElement>(InvolvableElement.class, this,
					SierraPackage.INVOLVABLE_ELEMENT__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getIsInvolvedIn() {
		if (isInvolvedIn == null) {
			isInvolvedIn = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					SierraPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN, SierraPackage.CAPABILITY__INVOLVES);
		}
		return isInvolvedIn;
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
		case SierraPackage.INVOLVABLE_ELEMENT__PERFORMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPerforms()).basicAdd(otherEnd, msgs);
		case SierraPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsInvolvedIn()).basicAdd(otherEnd, msgs);
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
		case SierraPackage.INVOLVABLE_ELEMENT__PERFORMS:
			return ((InternalEList<?>) getPerforms()).basicRemove(otherEnd, msgs);
		case SierraPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return ((InternalEList<?>) getIsInvolvedIn()).basicRemove(otherEnd, msgs);
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
		case SierraPackage.INVOLVABLE_ELEMENT__PERFORMS:
			return getPerforms();
		case SierraPackage.INVOLVABLE_ELEMENT__EXTENDS:
			return getExtends();
		case SierraPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return getIsInvolvedIn();
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
		case SierraPackage.INVOLVABLE_ELEMENT__PERFORMS:
			getPerforms().clear();
			getPerforms().addAll((Collection<? extends Function>) newValue);
			return;
		case SierraPackage.INVOLVABLE_ELEMENT__EXTENDS:
			getExtends().clear();
			getExtends().addAll((Collection<? extends InvolvableElement>) newValue);
			return;
		case SierraPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			getIsInvolvedIn().clear();
			getIsInvolvedIn().addAll((Collection<? extends Capability>) newValue);
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
		case SierraPackage.INVOLVABLE_ELEMENT__PERFORMS:
			getPerforms().clear();
			return;
		case SierraPackage.INVOLVABLE_ELEMENT__EXTENDS:
			getExtends().clear();
			return;
		case SierraPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			getIsInvolvedIn().clear();
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
		case SierraPackage.INVOLVABLE_ELEMENT__PERFORMS:
			return performs != null && !performs.isEmpty();
		case SierraPackage.INVOLVABLE_ELEMENT__EXTENDS:
			return extends_ != null && !extends_.isEmpty();
		case SierraPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return isInvolvedIn != null && !isInvolvedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PerformingElement.class) {
			switch (derivedFeatureID) {
			case SierraPackage.INVOLVABLE_ELEMENT__PERFORMS:
				return SierraPackage.PERFORMING_ELEMENT__PERFORMS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PerformingElement.class) {
			switch (baseFeatureID) {
			case SierraPackage.PERFORMING_ELEMENT__PERFORMS:
				return SierraPackage.INVOLVABLE_ELEMENT__PERFORMS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InvolvableElementImpl
