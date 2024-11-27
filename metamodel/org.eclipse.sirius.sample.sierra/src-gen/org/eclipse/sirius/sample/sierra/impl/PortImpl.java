/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.sierra.Function;
import org.eclipse.sirius.sample.sierra.Port;
import org.eclipse.sirius.sample.sierra.SierraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.PortImpl#getIsPortOf2 <em>Is Port Of2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends ExchangeElementImpl implements Port {
	/**
	 * The cached value of the '{@link #getIsPortOf2() <em>Is Port Of2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPortOf2()
	 * @generated
	 * @ordered
	 */
	protected Function isPortOf2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getIsPortOf2() {
		if (isPortOf2 != null && isPortOf2.eIsProxy()) {
			InternalEObject oldIsPortOf2 = (InternalEObject) isPortOf2;
			isPortOf2 = (Function) eResolveProxy(oldIsPortOf2);
			if (isPortOf2 != oldIsPortOf2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SierraPackage.PORT__IS_PORT_OF2,
							oldIsPortOf2, isPortOf2));
			}
		}
		return isPortOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetIsPortOf2() {
		return isPortOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPortOf2(Function newIsPortOf2, NotificationChain msgs) {
		Function oldIsPortOf2 = isPortOf2;
		isPortOf2 = newIsPortOf2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SierraPackage.PORT__IS_PORT_OF2, oldIsPortOf2, newIsPortOf2);
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
	public void setIsPortOf2(Function newIsPortOf2) {
		if (newIsPortOf2 != isPortOf2) {
			NotificationChain msgs = null;
			if (isPortOf2 != null)
				msgs = ((InternalEObject) isPortOf2).eInverseRemove(this, SierraPackage.FUNCTION__HAS_PORT,
						Function.class, msgs);
			if (newIsPortOf2 != null)
				msgs = ((InternalEObject) newIsPortOf2).eInverseAdd(this, SierraPackage.FUNCTION__HAS_PORT,
						Function.class, msgs);
			msgs = basicSetIsPortOf2(newIsPortOf2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.PORT__IS_PORT_OF2, newIsPortOf2,
					newIsPortOf2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SierraPackage.PORT__IS_PORT_OF2:
			if (isPortOf2 != null)
				msgs = ((InternalEObject) isPortOf2).eInverseRemove(this, SierraPackage.FUNCTION__HAS_PORT,
						Function.class, msgs);
			return basicSetIsPortOf2((Function) otherEnd, msgs);
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
		case SierraPackage.PORT__IS_PORT_OF2:
			return basicSetIsPortOf2(null, msgs);
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
		case SierraPackage.PORT__IS_PORT_OF2:
			if (resolve)
				return getIsPortOf2();
			return basicGetIsPortOf2();
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
		case SierraPackage.PORT__IS_PORT_OF2:
			setIsPortOf2((Function) newValue);
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
		case SierraPackage.PORT__IS_PORT_OF2:
			setIsPortOf2((Function) null);
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
		case SierraPackage.PORT__IS_PORT_OF2:
			return isPortOf2 != null;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
