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

import org.eclipse.sirius.sample.sierra.Function;
import org.eclipse.sirius.sample.sierra.Input;
import org.eclipse.sirius.sample.sierra.Output;
import org.eclipse.sirius.sample.sierra.PerformingElement;
import org.eclipse.sirius.sample.sierra.Port;
import org.eclipse.sirius.sample.sierra.SierraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.FunctionImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.FunctionImpl#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.FunctionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.FunctionImpl#getIsPerformedBy <em>Is Performed By</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.impl.FunctionImpl#getHasPort <em>Has Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ExchangeElementImpl implements Function {
	/**
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> hasInput;

	/**
	 * The cached value of the '{@link #getHasOutput() <em>Has Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> hasOutput;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * The cached value of the '{@link #getIsPerformedBy() <em>Is Performed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformingElement> isPerformedBy;

	/**
	 * The cached value of the '{@link #getHasPort() <em>Has Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> hasPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SierraPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getHasInput() {
		if (hasInput == null) {
			hasInput = new EObjectWithInverseResolvingEList<Input>(Input.class, this, SierraPackage.FUNCTION__HAS_INPUT,
					SierraPackage.INPUT__IS_INPUT_OF);
		}
		return hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getHasOutput() {
		if (hasOutput == null) {
			hasOutput = new EObjectWithInverseResolvingEList<Output>(Output.class, this,
					SierraPackage.FUNCTION__HAS_OUTPUT, SierraPackage.OUTPUT__IS_OUTPUT_OF);
		}
		return hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (Function) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SierraPackage.FUNCTION__FUNCTION,
							oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SierraPackage.FUNCTION__FUNCTION, oldFunction,
					function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformingElement> getIsPerformedBy() {
		if (isPerformedBy == null) {
			isPerformedBy = new EObjectWithInverseResolvingEList.ManyInverse<PerformingElement>(PerformingElement.class,
					this, SierraPackage.FUNCTION__IS_PERFORMED_BY, SierraPackage.PERFORMING_ELEMENT__PERFORMS);
		}
		return isPerformedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getHasPort() {
		if (hasPort == null) {
			hasPort = new EObjectWithInverseResolvingEList<Port>(Port.class, this, SierraPackage.FUNCTION__HAS_PORT,
					SierraPackage.PORT__IS_PORT_OF2);
		}
		return hasPort;
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
		case SierraPackage.FUNCTION__HAS_INPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHasInput()).basicAdd(otherEnd, msgs);
		case SierraPackage.FUNCTION__HAS_OUTPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHasOutput()).basicAdd(otherEnd, msgs);
		case SierraPackage.FUNCTION__IS_PERFORMED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsPerformedBy()).basicAdd(otherEnd, msgs);
		case SierraPackage.FUNCTION__HAS_PORT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHasPort()).basicAdd(otherEnd, msgs);
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
		case SierraPackage.FUNCTION__HAS_INPUT:
			return ((InternalEList<?>) getHasInput()).basicRemove(otherEnd, msgs);
		case SierraPackage.FUNCTION__HAS_OUTPUT:
			return ((InternalEList<?>) getHasOutput()).basicRemove(otherEnd, msgs);
		case SierraPackage.FUNCTION__IS_PERFORMED_BY:
			return ((InternalEList<?>) getIsPerformedBy()).basicRemove(otherEnd, msgs);
		case SierraPackage.FUNCTION__HAS_PORT:
			return ((InternalEList<?>) getHasPort()).basicRemove(otherEnd, msgs);
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
		case SierraPackage.FUNCTION__HAS_INPUT:
			return getHasInput();
		case SierraPackage.FUNCTION__HAS_OUTPUT:
			return getHasOutput();
		case SierraPackage.FUNCTION__FUNCTION:
			if (resolve)
				return getFunction();
			return basicGetFunction();
		case SierraPackage.FUNCTION__IS_PERFORMED_BY:
			return getIsPerformedBy();
		case SierraPackage.FUNCTION__HAS_PORT:
			return getHasPort();
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
		case SierraPackage.FUNCTION__HAS_INPUT:
			getHasInput().clear();
			getHasInput().addAll((Collection<? extends Input>) newValue);
			return;
		case SierraPackage.FUNCTION__HAS_OUTPUT:
			getHasOutput().clear();
			getHasOutput().addAll((Collection<? extends Output>) newValue);
			return;
		case SierraPackage.FUNCTION__FUNCTION:
			setFunction((Function) newValue);
			return;
		case SierraPackage.FUNCTION__IS_PERFORMED_BY:
			getIsPerformedBy().clear();
			getIsPerformedBy().addAll((Collection<? extends PerformingElement>) newValue);
			return;
		case SierraPackage.FUNCTION__HAS_PORT:
			getHasPort().clear();
			getHasPort().addAll((Collection<? extends Port>) newValue);
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
		case SierraPackage.FUNCTION__HAS_INPUT:
			getHasInput().clear();
			return;
		case SierraPackage.FUNCTION__HAS_OUTPUT:
			getHasOutput().clear();
			return;
		case SierraPackage.FUNCTION__FUNCTION:
			setFunction((Function) null);
			return;
		case SierraPackage.FUNCTION__IS_PERFORMED_BY:
			getIsPerformedBy().clear();
			return;
		case SierraPackage.FUNCTION__HAS_PORT:
			getHasPort().clear();
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
		case SierraPackage.FUNCTION__HAS_INPUT:
			return hasInput != null && !hasInput.isEmpty();
		case SierraPackage.FUNCTION__HAS_OUTPUT:
			return hasOutput != null && !hasOutput.isEmpty();
		case SierraPackage.FUNCTION__FUNCTION:
			return function != null;
		case SierraPackage.FUNCTION__IS_PERFORMED_BY:
			return isPerformedBy != null && !isPerformedBy.isEmpty();
		case SierraPackage.FUNCTION__HAS_PORT:
			return hasPort != null && !hasPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
