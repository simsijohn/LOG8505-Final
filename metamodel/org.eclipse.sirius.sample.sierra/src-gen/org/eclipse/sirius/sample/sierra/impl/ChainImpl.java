/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.sierra.Capability;
import org.eclipse.sirius.sample.sierra.Chain;
import org.eclipse.sirius.sample.sierra.SierraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.ChainImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChainImpl extends ContainableElementImpl implements Chain {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected Capability implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject) implements_;
			implements_ = (Capability) eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SierraPackage.CHAIN__IMPLEMENTS,
							oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplements(Capability newImplements, NotificationChain msgs) {
		Capability oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SierraPackage.CHAIN__IMPLEMENTS, oldImplements, newImplements);
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
	public void setImplements(Capability newImplements) {
		if (newImplements != implements_) {
			NotificationChain msgs = null;
			if (implements_ != null)
				msgs = ((InternalEObject) implements_).eInverseRemove(this, SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY,
						Capability.class, msgs);
			if (newImplements != null)
				msgs = ((InternalEObject) newImplements).eInverseAdd(this, SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY,
						Capability.class, msgs);
			msgs = basicSetImplements(newImplements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.CHAIN__IMPLEMENTS, newImplements,
					newImplements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SierraPackage.CHAIN__IMPLEMENTS:
			if (implements_ != null)
				msgs = ((InternalEObject) implements_).eInverseRemove(this, SierraPackage.CAPABILITY__IS_IMPLEMENTED_BY,
						Capability.class, msgs);
			return basicSetImplements((Capability) otherEnd, msgs);
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
		case SierraPackage.CHAIN__IMPLEMENTS:
			return basicSetImplements(null, msgs);
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
		case SierraPackage.CHAIN__IMPLEMENTS:
			if (resolve)
				return getImplements();
			return basicGetImplements();
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
		case SierraPackage.CHAIN__IMPLEMENTS:
			setImplements((Capability) newValue);
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
		case SierraPackage.CHAIN__IMPLEMENTS:
			setImplements((Capability) null);
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
		case SierraPackage.CHAIN__IMPLEMENTS:
			return implements_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainImpl
