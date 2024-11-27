/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.sierra.ExchangeElement;
import org.eclipse.sirius.sample.sierra.Item;
import org.eclipse.sirius.sample.sierra.SierraPackage;
import org.eclipse.sirius.sample.sierra.exchange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.exchangeImpl#getSendsTo <em>Sends To</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.exchangeImpl#getReceivesFrom <em>Receives From</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.exchangeImpl#getConveys <em>Conveys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class exchangeImpl extends ContainableElementImpl implements exchange {
	/**
	 * The cached value of the '{@link #getSendsTo() <em>Sends To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsTo()
	 * @generated
	 * @ordered
	 */
	protected ExchangeElement sendsTo;

	/**
	 * The cached value of the '{@link #getReceivesFrom() <em>Receives From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesFrom()
	 * @generated
	 * @ordered
	 */
	protected ExchangeElement receivesFrom;

	/**
	 * The cached value of the '{@link #getConveys() <em>Conveys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveys()
	 * @generated
	 * @ordered
	 */
	protected Item conveys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected exchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeElement getSendsTo() {
		if (sendsTo != null && sendsTo.eIsProxy()) {
			InternalEObject oldSendsTo = (InternalEObject) sendsTo;
			sendsTo = (ExchangeElement) eResolveProxy(oldSendsTo);
			if (sendsTo != oldSendsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SierraPackage.EXCHANGE__SENDS_TO,
							oldSendsTo, sendsTo));
			}
		}
		return sendsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeElement basicGetSendsTo() {
		return sendsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendsTo(ExchangeElement newSendsTo) {
		ExchangeElement oldSendsTo = sendsTo;
		sendsTo = newSendsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.EXCHANGE__SENDS_TO, oldSendsTo,
					sendsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeElement getReceivesFrom() {
		if (receivesFrom != null && receivesFrom.eIsProxy()) {
			InternalEObject oldReceivesFrom = (InternalEObject) receivesFrom;
			receivesFrom = (ExchangeElement) eResolveProxy(oldReceivesFrom);
			if (receivesFrom != oldReceivesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SierraPackage.EXCHANGE__RECEIVES_FROM,
							oldReceivesFrom, receivesFrom));
			}
		}
		return receivesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeElement basicGetReceivesFrom() {
		return receivesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivesFrom(ExchangeElement newReceivesFrom) {
		ExchangeElement oldReceivesFrom = receivesFrom;
		receivesFrom = newReceivesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.EXCHANGE__RECEIVES_FROM,
					oldReceivesFrom, receivesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getConveys() {
		if (conveys != null && conveys.eIsProxy()) {
			InternalEObject oldConveys = (InternalEObject) conveys;
			conveys = (Item) eResolveProxy(oldConveys);
			if (conveys != oldConveys) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SierraPackage.EXCHANGE__CONVEYS,
							oldConveys, conveys));
			}
		}
		return conveys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetConveys() {
		return conveys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConveys(Item newConveys, NotificationChain msgs) {
		Item oldConveys = conveys;
		conveys = newConveys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SierraPackage.EXCHANGE__CONVEYS, oldConveys, newConveys);
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
	public void setConveys(Item newConveys) {
		if (newConveys != conveys) {
			NotificationChain msgs = null;
			if (conveys != null)
				msgs = ((InternalEObject) conveys).eInverseRemove(this, SierraPackage.ITEM__IS_CONVEYED_BY, Item.class,
						msgs);
			if (newConveys != null)
				msgs = ((InternalEObject) newConveys).eInverseAdd(this, SierraPackage.ITEM__IS_CONVEYED_BY, Item.class,
						msgs);
			msgs = basicSetConveys(newConveys, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.EXCHANGE__CONVEYS, newConveys,
					newConveys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SierraPackage.EXCHANGE__CONVEYS:
			if (conveys != null)
				msgs = ((InternalEObject) conveys).eInverseRemove(this, SierraPackage.ITEM__IS_CONVEYED_BY, Item.class,
						msgs);
			return basicSetConveys((Item) otherEnd, msgs);
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
		case SierraPackage.EXCHANGE__CONVEYS:
			return basicSetConveys(null, msgs);
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
		case SierraPackage.EXCHANGE__SENDS_TO:
			if (resolve)
				return getSendsTo();
			return basicGetSendsTo();
		case SierraPackage.EXCHANGE__RECEIVES_FROM:
			if (resolve)
				return getReceivesFrom();
			return basicGetReceivesFrom();
		case SierraPackage.EXCHANGE__CONVEYS:
			if (resolve)
				return getConveys();
			return basicGetConveys();
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
		case SierraPackage.EXCHANGE__SENDS_TO:
			setSendsTo((ExchangeElement) newValue);
			return;
		case SierraPackage.EXCHANGE__RECEIVES_FROM:
			setReceivesFrom((ExchangeElement) newValue);
			return;
		case SierraPackage.EXCHANGE__CONVEYS:
			setConveys((Item) newValue);
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
		case SierraPackage.EXCHANGE__SENDS_TO:
			setSendsTo((ExchangeElement) null);
			return;
		case SierraPackage.EXCHANGE__RECEIVES_FROM:
			setReceivesFrom((ExchangeElement) null);
			return;
		case SierraPackage.EXCHANGE__CONVEYS:
			setConveys((Item) null);
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
		case SierraPackage.EXCHANGE__SENDS_TO:
			return sendsTo != null;
		case SierraPackage.EXCHANGE__RECEIVES_FROM:
			return receivesFrom != null;
		case SierraPackage.EXCHANGE__CONVEYS:
			return conveys != null;
		}
		return super.eIsSet(featureID);
	}

} //exchangeImpl
