/**
 */
package org.eclipse.sirius.sample.sierra.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.sample.sierra.ActivityDiagram;
import org.eclipse.sirius.sample.sierra.Actor;
import org.eclipse.sirius.sample.sierra.Capability;
import org.eclipse.sirius.sample.sierra.Chain;
import org.eclipse.sirius.sample.sierra.Component;
import org.eclipse.sirius.sample.sierra.Entity;
import org.eclipse.sirius.sample.sierra.Function;
import org.eclipse.sirius.sample.sierra.Input;
import org.eclipse.sirius.sample.sierra.InvolvableElement;
import org.eclipse.sirius.sample.sierra.Item;
import org.eclipse.sirius.sample.sierra.Output;
import org.eclipse.sirius.sample.sierra.Port;
import org.eclipse.sirius.sample.sierra.SierraFactory;
import org.eclipse.sirius.sample.sierra.SierraPackage;
import org.eclipse.sirius.sample.sierra.exchange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SierraFactoryImpl extends EFactoryImpl implements SierraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SierraFactory init() {
		try {
			SierraFactory theSierraFactory = (SierraFactory) EPackage.Registry.INSTANCE
					.getEFactory(SierraPackage.eNS_URI);
			if (theSierraFactory != null) {
				return theSierraFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SierraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SierraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SierraPackage.CAPABILITY:
			return createCapability();
		case SierraPackage.INVOLVABLE_ELEMENT:
			return createInvolvableElement();
		case SierraPackage.ACTOR:
			return createActor();
		case SierraPackage.ENTITY:
			return createEntity();
		case SierraPackage.SYSTEM:
			return createSystem();
		case SierraPackage.FUNCTION:
			return createFunction();
		case SierraPackage.ITEM:
			return createItem();
		case SierraPackage.CHAIN:
			return createChain();
		case SierraPackage.PORT:
			return createPort();
		case SierraPackage.INPUT:
			return createInput();
		case SierraPackage.OUTPUT:
			return createOutput();
		case SierraPackage.EXCHANGE:
			return createexchange();
		case SierraPackage.COMPONENT:
			return createComponent();
		case SierraPackage.ACTIVITY_DIAGRAM:
			return createActivityDiagram();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvableElement createInvolvableElement() {
		InvolvableElementImpl involvableElement = new InvolvableElementImpl();
		return involvableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.sirius.sample.sierra.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain createChain() {
		ChainImpl chain = new ChainImpl();
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exchange createexchange() {
		exchangeImpl exchange = new exchangeImpl();
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram createActivityDiagram() {
		ActivityDiagramImpl activityDiagram = new ActivityDiagramImpl();
		return activityDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SierraPackage getSierraPackage() {
		return (SierraPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SierraPackage getPackage() {
		return SierraPackage.eINSTANCE;
	}

} //SierraFactoryImpl
