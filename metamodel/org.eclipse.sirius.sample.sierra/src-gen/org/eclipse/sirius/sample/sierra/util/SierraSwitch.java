/**
 */
package org.eclipse.sirius.sample.sierra.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sirius.sample.sierra.ActivityDiagram;
import org.eclipse.sirius.sample.sierra.Actor;
import org.eclipse.sirius.sample.sierra.Capability;
import org.eclipse.sirius.sample.sierra.Chain;
import org.eclipse.sirius.sample.sierra.Component;
import org.eclipse.sirius.sample.sierra.ContainableElement;
import org.eclipse.sirius.sample.sierra.Entity;
import org.eclipse.sirius.sample.sierra.ExchangeElement;
import org.eclipse.sirius.sample.sierra.Function;
import org.eclipse.sirius.sample.sierra.Input;
import org.eclipse.sirius.sample.sierra.InvolvableElement;
import org.eclipse.sirius.sample.sierra.Item;
import org.eclipse.sirius.sample.sierra.Output;
import org.eclipse.sirius.sample.sierra.PerformingElement;
import org.eclipse.sirius.sample.sierra.Port;
import org.eclipse.sirius.sample.sierra.SierraPackage;
import org.eclipse.sirius.sample.sierra.SpecializableElement;
import org.eclipse.sirius.sample.sierra.exchange;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.sierra.SierraPackage
 * @generated
 */
public class SierraSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SierraPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SierraSwitch() {
		if (modelPackage == null) {
			modelPackage = SierraPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SierraPackage.SPECIALIZABLE_ELEMENT: {
			SpecializableElement specializableElement = (SpecializableElement) theEObject;
			T result = caseSpecializableElement(specializableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.CONTAINABLE_ELEMENT: {
			ContainableElement containableElement = (ContainableElement) theEObject;
			T result = caseContainableElement(containableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.CAPABILITY: {
			Capability capability = (Capability) theEObject;
			T result = caseCapability(capability);
			if (result == null)
				result = caseSpecializableElement(capability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.INVOLVABLE_ELEMENT: {
			InvolvableElement involvableElement = (InvolvableElement) theEObject;
			T result = caseInvolvableElement(involvableElement);
			if (result == null)
				result = caseSpecializableElement(involvableElement);
			if (result == null)
				result = casePerformingElement(involvableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseInvolvableElement(actor);
			if (result == null)
				result = caseSpecializableElement(actor);
			if (result == null)
				result = casePerformingElement(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = caseInvolvableElement(entity);
			if (result == null)
				result = caseSpecializableElement(entity);
			if (result == null)
				result = casePerformingElement(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.SYSTEM: {
			org.eclipse.sirius.sample.sierra.System system = (org.eclipse.sirius.sample.sierra.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = caseComponent(system);
			if (result == null)
				result = caseContainableElement(system);
			if (result == null)
				result = casePerformingElement(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.EXCHANGE_ELEMENT: {
			ExchangeElement exchangeElement = (ExchangeElement) theEObject;
			T result = caseExchangeElement(exchangeElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = caseExchangeElement(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.ITEM: {
			Item item = (Item) theEObject;
			T result = caseItem(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.CHAIN: {
			Chain chain = (Chain) theEObject;
			T result = caseChain(chain);
			if (result == null)
				result = caseContainableElement(chain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = caseExchangeElement(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = casePort(input);
			if (result == null)
				result = caseExchangeElement(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.OUTPUT: {
			Output output = (Output) theEObject;
			T result = caseOutput(output);
			if (result == null)
				result = casePort(output);
			if (result == null)
				result = caseExchangeElement(output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.EXCHANGE: {
			exchange exchange = (exchange) theEObject;
			T result = caseexchange(exchange);
			if (result == null)
				result = caseContainableElement(exchange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.PERFORMING_ELEMENT: {
			PerformingElement performingElement = (PerformingElement) theEObject;
			T result = casePerformingElement(performingElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseContainableElement(component);
			if (result == null)
				result = casePerformingElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SierraPackage.ACTIVITY_DIAGRAM: {
			ActivityDiagram activityDiagram = (ActivityDiagram) theEObject;
			T result = caseActivityDiagram(activityDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specializable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specializable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializableElement(SpecializableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainableElement(ContainableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Involvable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Involvable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvolvableElement(InvolvableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.eclipse.sirius.sample.sierra.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeElement(ExchangeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChain(Chain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseexchange(exchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performing Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performing Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformingElement(PerformingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDiagram(ActivityDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SierraSwitch
