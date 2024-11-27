/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.sierra.Function;
import org.eclipse.sirius.sample.sierra.Output;
import org.eclipse.sirius.sample.sierra.SierraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.OutputImpl#getIsOutputOf <em>Is Output Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends PortImpl implements Output {
	/**
	 * The cached value of the '{@link #getIsOutputOf() <em>Is Output Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOutputOf()
	 * @generated
	 * @ordered
	 */
	protected Function isOutputOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getIsOutputOf() {
		if (isOutputOf != null && isOutputOf.eIsProxy()) {
			InternalEObject oldIsOutputOf = (InternalEObject) isOutputOf;
			isOutputOf = (Function) eResolveProxy(oldIsOutputOf);
			if (isOutputOf != oldIsOutputOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SierraPackage.OUTPUT__IS_OUTPUT_OF,
							oldIsOutputOf, isOutputOf));
			}
		}
		return isOutputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetIsOutputOf() {
		return isOutputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOutputOf(Function newIsOutputOf, NotificationChain msgs) {
		Function oldIsOutputOf = isOutputOf;
		isOutputOf = newIsOutputOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SierraPackage.OUTPUT__IS_OUTPUT_OF, oldIsOutputOf, newIsOutputOf);
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
	public void setIsOutputOf(Function newIsOutputOf) {
		if (newIsOutputOf != isOutputOf) {
			NotificationChain msgs = null;
			if (isOutputOf != null)
				msgs = ((InternalEObject) isOutputOf).eInverseRemove(this, SierraPackage.FUNCTION__HAS_OUTPUT,
						Function.class, msgs);
			if (newIsOutputOf != null)
				msgs = ((InternalEObject) newIsOutputOf).eInverseAdd(this, SierraPackage.FUNCTION__HAS_OUTPUT,
						Function.class, msgs);
			msgs = basicSetIsOutputOf(newIsOutputOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.OUTPUT__IS_OUTPUT_OF, newIsOutputOf,
					newIsOutputOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SierraPackage.OUTPUT__IS_OUTPUT_OF:
			if (isOutputOf != null)
				msgs = ((InternalEObject) isOutputOf).eInverseRemove(this, SierraPackage.FUNCTION__HAS_OUTPUT,
						Function.class, msgs);
			return basicSetIsOutputOf((Function) otherEnd, msgs);
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
		case SierraPackage.OUTPUT__IS_OUTPUT_OF:
			return basicSetIsOutputOf(null, msgs);
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
		case SierraPackage.OUTPUT__IS_OUTPUT_OF:
			if (resolve)
				return getIsOutputOf();
			return basicGetIsOutputOf();
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
		case SierraPackage.OUTPUT__IS_OUTPUT_OF:
			setIsOutputOf((Function) newValue);
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
		case SierraPackage.OUTPUT__IS_OUTPUT_OF:
			setIsOutputOf((Function) null);
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
		case SierraPackage.OUTPUT__IS_OUTPUT_OF:
			return isOutputOf != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputImpl
