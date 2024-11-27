/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.sierra.Capability;
import org.eclipse.sirius.sample.sierra.Chain;
import org.eclipse.sirius.sample.sierra.InvolvableElement;
import org.eclipse.sirius.sample.sierra.SierraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.CapabilityImpl#getInvolves <em>Involves</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.CapabilityImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.CapabilityImpl#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.CapabilityImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.CapabilityImpl#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.CapabilityImpl#getIsImplementedBy <em>Is Implemented By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends SpecializableElementImpl implements Capability {
	/**
	 * The cached value of the '{@link #getInvolves() <em>Involves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolves()
	 * @generated
	 * @ordered
	 */
	protected EList<InvolvableElement> involves;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> includes;

	/**
	 * The cached value of the '{@link #getIsIncludedIn() <em>Is Included In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIncludedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> isIncludedIn;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> extends_;

	/**
	 * The cached value of the '{@link #getIsExtendedBy() <em>Is Extended By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtendedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> isExtendedBy;

	/**
	 * The cached value of the '{@link #getIsImplementedBy() <em>Is Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected Chain isImplementedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvolvableElement> getInvolves() {
		if (involves == null) {
			involves = new EObjectWithInverseResolvingEList.ManyInverse<InvolvableElement>(InvolvableElement.class,
					this, SierraPackage.CAPABILITY__INVOLVES, SierraPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN);
		}
		return involves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					SierraPackage.CAPABILITY__INCLUDES, SierraPackage.CAPABILITY__IS_INCLUDED_IN);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getIsIncludedIn() {
		if (isIncludedIn == null) {
			isIncludedIn = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					SierraPackage.CAPABILITY__IS_INCLUDED_IN, SierraPackage.CAPABILITY__INCLUDES);
		}
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					SierraPackage.CAPABILITY__EXTENDS, SierraPackage.CAPABILITY__IS_EXTENDED_BY);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getIsExtendedBy() {
		if (isExtendedBy == null) {
			isExtendedBy = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					SierraPackage.CAPABILITY__IS_EXTENDED_BY, SierraPackage.CAPABILITY__EXTENDS);
		}
		return isExtendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain getIsImplementedBy() {
		if (isImplementedBy != null && isImplementedBy.eIsProxy()) {
			InternalEObject oldIsImplementedBy = (InternalEObject) isImplementedBy;
			isImplementedBy = (Chain) eResolveProxy(oldIsImplementedBy);
			if (isImplementedBy != oldIsImplementedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY, oldIsImplementedBy, isImplementedBy));
			}
		}
		return isImplementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain basicGetIsImplementedBy() {
		return isImplementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsImplementedBy(Chain newIsImplementedBy, NotificationChain msgs) {
		Chain oldIsImplementedBy = isImplementedBy;
		isImplementedBy = newIsImplementedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY, oldIsImplementedBy, newIsImplementedBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImplementedBy(Chain newIsImplementedBy) {
		if (newIsImplementedBy != isImplementedBy) {
			NotificationChain msgs = null;
			if (isImplementedBy != null)
				msgs = ((InternalEObject) isImplementedBy).eInverseRemove(this, SierraPackage.CHAIN__IMPLEMENTS,
						Chain.class, msgs);
			if (newIsImplementedBy != null)
				msgs = ((InternalEObject) newIsImplementedBy).eInverseAdd(this, SierraPackage.CHAIN__IMPLEMENTS,
						Chain.class, msgs);
			msgs = basicSetIsImplementedBy(newIsImplementedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY,
					newIsImplementedBy, newIsImplementedBy));
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
		case SierraPackage.CAPABILITY__INVOLVES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvolves()).basicAdd(otherEnd, msgs);
		case SierraPackage.CAPABILITY__INCLUDES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludes()).basicAdd(otherEnd, msgs);
		case SierraPackage.CAPABILITY__IS_INCLUDED_IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsIncludedIn()).basicAdd(otherEnd, msgs);
		case SierraPackage.CAPABILITY__EXTENDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtends()).basicAdd(otherEnd, msgs);
		case SierraPackage.CAPABILITY__IS_EXTENDED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsExtendedBy()).basicAdd(otherEnd, msgs);
		case SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY:
			if (isImplementedBy != null)
				msgs = ((InternalEObject) isImplementedBy).eInverseRemove(this, SierraPackage.CHAIN__IMPLEMENTS,
						Chain.class, msgs);
			return basicSetIsImplementedBy((Chain) otherEnd, msgs);
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
		case SierraPackage.CAPABILITY__INVOLVES:
			return ((InternalEList<?>) getInvolves()).basicRemove(otherEnd, msgs);
		case SierraPackage.CAPABILITY__INCLUDES:
			return ((InternalEList<?>) getIncludes()).basicRemove(otherEnd, msgs);
		case SierraPackage.CAPABILITY__IS_INCLUDED_IN:
			return ((InternalEList<?>) getIsIncludedIn()).basicRemove(otherEnd, msgs);
		case SierraPackage.CAPABILITY__EXTENDS:
			return ((InternalEList<?>) getExtends()).basicRemove(otherEnd, msgs);
		case SierraPackage.CAPABILITY__IS_EXTENDED_BY:
			return ((InternalEList<?>) getIsExtendedBy()).basicRemove(otherEnd, msgs);
		case SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY:
			return basicSetIsImplementedBy(null, msgs);
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
		case SierraPackage.CAPABILITY__INVOLVES:
			return getInvolves();
		case SierraPackage.CAPABILITY__INCLUDES:
			return getIncludes();
		case SierraPackage.CAPABILITY__IS_INCLUDED_IN:
			return getIsIncludedIn();
		case SierraPackage.CAPABILITY__EXTENDS:
			return getExtends();
		case SierraPackage.CAPABILITY__IS_EXTENDED_BY:
			return getIsExtendedBy();
		case SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY:
			if (resolve)
				return getIsImplementedBy();
			return basicGetIsImplementedBy();
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
		case SierraPackage.CAPABILITY__INVOLVES:
			getInvolves().clear();
			getInvolves().addAll((Collection<? extends InvolvableElement>) newValue);
			return;
		case SierraPackage.CAPABILITY__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Capability>) newValue);
			return;
		case SierraPackage.CAPABILITY__IS_INCLUDED_IN:
			getIsIncludedIn().clear();
			getIsIncludedIn().addAll((Collection<? extends Capability>) newValue);
			return;
		case SierraPackage.CAPABILITY__EXTENDS:
			getExtends().clear();
			getExtends().addAll((Collection<? extends Capability>) newValue);
			return;
		case SierraPackage.CAPABILITY__IS_EXTENDED_BY:
			getIsExtendedBy().clear();
			getIsExtendedBy().addAll((Collection<? extends Capability>) newValue);
			return;
		case SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY:
			setIsImplementedBy((Chain) newValue);
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
		case SierraPackage.CAPABILITY__INVOLVES:
			getInvolves().clear();
			return;
		case SierraPackage.CAPABILITY__INCLUDES:
			getIncludes().clear();
			return;
		case SierraPackage.CAPABILITY__IS_INCLUDED_IN:
			getIsIncludedIn().clear();
			return;
		case SierraPackage.CAPABILITY__EXTENDS:
			getExtends().clear();
			return;
		case SierraPackage.CAPABILITY__IS_EXTENDED_BY:
			getIsExtendedBy().clear();
			return;
		case SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY:
			setIsImplementedBy((Chain) null);
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
		case SierraPackage.CAPABILITY__INVOLVES:
			return involves != null && !involves.isEmpty();
		case SierraPackage.CAPABILITY__INCLUDES:
			return includes != null && !includes.isEmpty();
		case SierraPackage.CAPABILITY__IS_INCLUDED_IN:
			return isIncludedIn != null && !isIncludedIn.isEmpty();
		case SierraPackage.CAPABILITY__EXTENDS:
			return extends_ != null && !extends_.isEmpty();
		case SierraPackage.CAPABILITY__IS_EXTENDED_BY:
			return isExtendedBy != null && !isExtendedBy.isEmpty();
		case SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY:
			return isImplementedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
