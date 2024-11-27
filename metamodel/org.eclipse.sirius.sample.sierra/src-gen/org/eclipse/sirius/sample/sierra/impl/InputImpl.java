/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.sierra.Function;
import org.eclipse.sirius.sample.sierra.Input;
import org.eclipse.sirius.sample.sierra.SierraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.InputImpl#getIsInputOf <em>Is Input Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends PortImpl implements Input {
	/**
	 * The cached value of the '{@link #getIsInputOf() <em>Is Input Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInputOf()
	 * @generated
	 * @ordered
	 */
	protected Function isInputOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getIsInputOf() {
		if (isInputOf != null && isInputOf.eIsProxy()) {
			InternalEObject oldIsInputOf = (InternalEObject) isInputOf;
			isInputOf = (Function) eResolveProxy(oldIsInputOf);
			if (isInputOf != oldIsInputOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SierraPackage.INPUT__IS_INPUT_OF,
							oldIsInputOf, isInputOf));
			}
		}
		return isInputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetIsInputOf() {
		return isInputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInputOf(Function newIsInputOf, NotificationChain msgs) {
		Function oldIsInputOf = isInputOf;
		isInputOf = newIsInputOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SierraPackage.INPUT__IS_INPUT_OF, oldIsInputOf, newIsInputOf);
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
	public void setIsInputOf(Function newIsInputOf) {
		if (newIsInputOf != isInputOf) {
			NotificationChain msgs = null;
			if (isInputOf != null)
				msgs = ((InternalEObject) isInputOf).eInverseRemove(this, SierraPackage.FUNCTION__HAS_INPUT,
						Function.class, msgs);
			if (newIsInputOf != null)
				msgs = ((InternalEObject) newIsInputOf).eInverseAdd(this, SierraPackage.FUNCTION__HAS_INPUT,
						Function.class, msgs);
			msgs = basicSetIsInputOf(newIsInputOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.INPUT__IS_INPUT_OF, newIsInputOf,
					newIsInputOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SierraPackage.INPUT__IS_INPUT_OF:
			if (isInputOf != null)
				msgs = ((InternalEObject) isInputOf).eInverseRemove(this, SierraPackage.FUNCTION__HAS_INPUT,
						Function.class, msgs);
			return basicSetIsInputOf((Function) otherEnd, msgs);
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
		case SierraPackage.INPUT__IS_INPUT_OF:
			return basicSetIsInputOf(null, msgs);
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
		case SierraPackage.INPUT__IS_INPUT_OF:
			if (resolve)
				return getIsInputOf();
			return basicGetIsInputOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SierraPackage.INPUT__IS_INPUT_OF:
			setIsInputOf((Function) newValue);
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
		case SierraPackage.INPUT__IS_INPUT_OF:
			setIsInputOf((Function) null);
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
		case SierraPackage.INPUT__IS_INPUT_OF:
			return isInputOf != null;
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
