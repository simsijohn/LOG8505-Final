/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.sierra.SierraFactory
 * @model kind="package"
 * @generated
 */
public interface SierraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sierra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sierra";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sierra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SierraPackage eINSTANCE = org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.SpecializableElementImpl <em>Specializable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.SpecializableElementImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getSpecializableElement()
	 * @generated
	 */
	int SPECIALIZABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__SPECIALIZES = 0;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY = 1;

	/**
	 * The number of structural features of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.ContainableElementImpl <em>Containable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.ContainableElementImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getContainableElement()
	 * @generated
	 */
	int CONTAINABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Is Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__IS_CONTAINED_IN = 1;

	/**
	 * The number of structural features of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.CapabilityImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_SPECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Involves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INVOLVES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INCLUDES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Included In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_INCLUDED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EXTENDS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Extended By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_EXTENDED_BY = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_IMPLEMENTED_BY = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.InvolvableElementImpl <em>Involvable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.InvolvableElementImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getInvolvableElement()
	 * @generated
	 */
	int INVOLVABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__PERFORMS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__EXTENDS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__IS_INVOLVED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Involvable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Involvable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.ActorImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SPECIALIZES = INVOLVABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_SPECIALIZED_BY = INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PERFORMS = INVOLVABLE_ELEMENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EXTENDS = INVOLVABLE_ELEMENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_INVOLVED_IN = INVOLVABLE_ELEMENT__IS_INVOLVED_IN;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = INVOLVABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = INVOLVABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.EntityImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPECIALIZES = INVOLVABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_SPECIALIZED_BY = INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PERFORMS = INVOLVABLE_ELEMENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXTENDS = INVOLVABLE_ELEMENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_INVOLVED_IN = INVOLVABLE_ELEMENT__IS_INVOLVED_IN;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = INVOLVABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = INVOLVABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.ComponentImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 16;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Is Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_CONTAINED_IN = CONTAINABLE_ELEMENT__IS_CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PERFORMS = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.SystemImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINS = COMPONENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Is Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IS_CONTAINED_IN = COMPONENT__IS_CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PERFORMS = COMPONENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUPPORTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.ExchangeElementImpl <em>Exchange Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.ExchangeElementImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getExchangeElement()
	 * @generated
	 */
	int EXCHANGE_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Exchange Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exchange Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.FunctionImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_INPUT = EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_OUTPUT = EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNCTION = EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Performed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_PERFORMED_BY = EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_PORT = EXCHANGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = EXCHANGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.ItemImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 9;

	/**
	 * The feature id for the '<em><b>Is Conveyed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_CONVEYED_BY = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.ChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.ChainImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getChain()
	 * @generated
	 */
	int CHAIN = 10;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Is Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__IS_CONTAINED_IN = CONTAINABLE_ELEMENT__IS_CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__IMPLEMENTS = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.PortImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 11;

	/**
	 * The feature id for the '<em><b>Is Port Of2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_PORT_OF2 = EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.InputImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 12;

	/**
	 * The feature id for the '<em><b>Is Port Of2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_PORT_OF2 = PORT__IS_PORT_OF2;

	/**
	 * The feature id for the '<em><b>Is Input Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_INPUT_OF = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.OutputImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 13;

	/**
	 * The feature id for the '<em><b>Is Port Of2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IS_PORT_OF2 = PORT__IS_PORT_OF2;

	/**
	 * The feature id for the '<em><b>Is Output Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IS_OUTPUT_OF = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.exchangeImpl <em>exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.exchangeImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getexchange()
	 * @generated
	 */
	int EXCHANGE = 14;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Is Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__IS_CONTAINED_IN = CONTAINABLE_ELEMENT__IS_CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__SENDS_TO = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receives From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__RECEIVES_FROM = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conveys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__CONVEYS = CONTAINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.PerformingElementImpl <em>Performing Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.PerformingElementImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getPerformingElement()
	 * @generated
	 */
	int PERFORMING_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMING_ELEMENT__PERFORMS = 0;

	/**
	 * The number of structural features of the '<em>Performing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMING_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Performing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.sierra.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.sierra.impl.ActivityDiagramImpl
	 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getActivityDiagram()
	 * @generated
	 */
	int ACTIVITY_DIAGRAM = 17;

	/**
	 * The feature id for the '<em><b>Specializableelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Containableelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__CONTAINABLEELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Performingelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__PERFORMINGELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Exchangeelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__EXCHANGEELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.SpecializableElement <em>Specializable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specializable Element</em>'.
	 * @see org.eclipse.sirius.sample.sierra.SpecializableElement
	 * @generated
	 */
	EClass getSpecializableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializes</em>'.
	 * @see org.eclipse.sirius.sample.sierra.SpecializableElement#getSpecializes()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_Specializes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Specialized By</em>'.
	 * @see org.eclipse.sirius.sample.sierra.SpecializableElement#getIsSpecializedBy()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_IsSpecializedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.ContainableElement <em>Containable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Element</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ContainableElement
	 * @generated
	 */
	EClass getContainableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.ContainableElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ContainableElement#getContains()
	 * @see #getContainableElement()
	 * @generated
	 */
	EReference getContainableElement_Contains();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.ContainableElement#getIsContainedIn <em>Is Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Contained In</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ContainableElement#getIsContainedIn()
	 * @see #getContainableElement()
	 * @generated
	 */
	EReference getContainableElement_IsContainedIn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Capability#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involves</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Capability#getInvolves()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Involves();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Capability#getIncludes()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Includes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Capability#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Included In</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Capability#getIsIncludedIn()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsIncludedIn();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Capability#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Capability#getExtends()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Extends();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Capability#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended By</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Capability#getIsExtendedBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsExtendedBy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.Capability#getIsImplementedBy <em>Is Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Implemented By</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Capability#getIsImplementedBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsImplementedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.InvolvableElement <em>Involvable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Involvable Element</em>'.
	 * @see org.eclipse.sirius.sample.sierra.InvolvableElement
	 * @generated
	 */
	EClass getInvolvableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.InvolvableElement#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see org.eclipse.sirius.sample.sierra.InvolvableElement#getExtends()
	 * @see #getInvolvableElement()
	 * @generated
	 */
	EReference getInvolvableElement_Extends();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Involved In</em>'.
	 * @see org.eclipse.sirius.sample.sierra.InvolvableElement#getIsInvolvedIn()
	 * @see #getInvolvableElement()
	 * @generated
	 */
	EReference getInvolvableElement_IsInvolvedIn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.eclipse.sirius.sample.sierra.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.System#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports</em>'.
	 * @see org.eclipse.sirius.sample.sierra.System#getSupports()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Supports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.ExchangeElement <em>Exchange Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Element</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ExchangeElement
	 * @generated
	 */
	EClass getExchangeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Function#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Input</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Function#getHasInput()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasInput();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Function#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Output</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Function#getHasOutput()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasOutput();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.Function#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Function#getFunction()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Function();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Function#getIsPerformedBy <em>Is Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Performed By</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Function#getIsPerformedBy()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_IsPerformedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Function#getHasPort <em>Has Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Port</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Function#getHasPort()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.Item#getIsConveyedBy <em>Is Conveyed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Conveyed By</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Item#getIsConveyedBy()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_IsConveyedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Chain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Chain
	 * @generated
	 */
	EClass getChain();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.Chain#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Chain#getImplements()
	 * @see #getChain()
	 * @generated
	 */
	EReference getChain_Implements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.Port#getIsPortOf2 <em>Is Port Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Port Of2</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Port#getIsPortOf2()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_IsPortOf2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.Input#getIsInputOf <em>Is Input Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Input Of</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Input#getIsInputOf()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_IsInputOf();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.Output#getIsOutputOf <em>Is Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Output Of</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Output#getIsOutputOf()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_IsOutputOf();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.exchange <em>exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>exchange</em>'.
	 * @see org.eclipse.sirius.sample.sierra.exchange
	 * @generated
	 */
	EClass getexchange();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.exchange#getSendsTo <em>Sends To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends To</em>'.
	 * @see org.eclipse.sirius.sample.sierra.exchange#getSendsTo()
	 * @see #getexchange()
	 * @generated
	 */
	EReference getexchange_SendsTo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.exchange#getReceivesFrom <em>Receives From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receives From</em>'.
	 * @see org.eclipse.sirius.sample.sierra.exchange#getReceivesFrom()
	 * @see #getexchange()
	 * @generated
	 */
	EReference getexchange_ReceivesFrom();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.sierra.exchange#getConveys <em>Conveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conveys</em>'.
	 * @see org.eclipse.sirius.sample.sierra.exchange#getConveys()
	 * @see #getexchange()
	 * @generated
	 */
	EReference getexchange_Conveys();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.PerformingElement <em>Performing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performing Element</em>'.
	 * @see org.eclipse.sirius.sample.sierra.PerformingElement
	 * @generated
	 */
	EClass getPerformingElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.sierra.PerformingElement#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs</em>'.
	 * @see org.eclipse.sirius.sample.sierra.PerformingElement#getPerforms()
	 * @see #getPerformingElement()
	 * @generated
	 */
	EReference getPerformingElement_Performs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.sirius.sample.sierra.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.sierra.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Diagram</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ActivityDiagram
	 * @generated
	 */
	EClass getActivityDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sierra.ActivityDiagram#getSpecializableelement <em>Specializableelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializableelement</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ActivityDiagram#getSpecializableelement()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Specializableelement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sierra.ActivityDiagram#getContainableelement <em>Containableelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containableelement</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ActivityDiagram#getContainableelement()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Containableelement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sierra.ActivityDiagram#getPerformingelement <em>Performingelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performingelement</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ActivityDiagram#getPerformingelement()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Performingelement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.sierra.ActivityDiagram#getExchangeelement <em>Exchangeelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchangeelement</em>'.
	 * @see org.eclipse.sirius.sample.sierra.ActivityDiagram#getExchangeelement()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Exchangeelement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SierraFactory getSierraFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.SpecializableElementImpl <em>Specializable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.SpecializableElementImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getSpecializableElement()
		 * @generated
		 */
		EClass SPECIALIZABLE_ELEMENT = eINSTANCE.getSpecializableElement();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__SPECIALIZES = eINSTANCE.getSpecializableElement_Specializes();

		/**
		 * The meta object literal for the '<em><b>Is Specialized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY = eINSTANCE.getSpecializableElement_IsSpecializedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.ContainableElementImpl <em>Containable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.ContainableElementImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getContainableElement()
		 * @generated
		 */
		EClass CONTAINABLE_ELEMENT = eINSTANCE.getContainableElement();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINABLE_ELEMENT__CONTAINS = eINSTANCE.getContainableElement_Contains();

		/**
		 * The meta object literal for the '<em><b>Is Contained In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINABLE_ELEMENT__IS_CONTAINED_IN = eINSTANCE.getContainableElement_IsContainedIn();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.CapabilityImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Involves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__INVOLVES = eINSTANCE.getCapability_Involves();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__INCLUDES = eINSTANCE.getCapability_Includes();

		/**
		 * The meta object literal for the '<em><b>Is Included In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_INCLUDED_IN = eINSTANCE.getCapability_IsIncludedIn();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__EXTENDS = eINSTANCE.getCapability_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Extended By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_EXTENDED_BY = eINSTANCE.getCapability_IsExtendedBy();

		/**
		 * The meta object literal for the '<em><b>Is Implemented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_IMPLEMENTED_BY = eINSTANCE.getCapability_IsImplementedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.InvolvableElementImpl <em>Involvable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.InvolvableElementImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getInvolvableElement()
		 * @generated
		 */
		EClass INVOLVABLE_ELEMENT = eINSTANCE.getInvolvableElement();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVABLE_ELEMENT__EXTENDS = eINSTANCE.getInvolvableElement_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Involved In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVABLE_ELEMENT__IS_INVOLVED_IN = eINSTANCE.getInvolvableElement_IsInvolvedIn();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.ActorImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.EntityImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.SystemImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SUPPORTS = eINSTANCE.getSystem_Supports();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.ExchangeElementImpl <em>Exchange Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.ExchangeElementImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getExchangeElement()
		 * @generated
		 */
		EClass EXCHANGE_ELEMENT = eINSTANCE.getExchangeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.FunctionImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Has Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_INPUT = eINSTANCE.getFunction_HasInput();

		/**
		 * The meta object literal for the '<em><b>Has Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_OUTPUT = eINSTANCE.getFunction_HasOutput();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FUNCTION = eINSTANCE.getFunction_Function();

		/**
		 * The meta object literal for the '<em><b>Is Performed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IS_PERFORMED_BY = eINSTANCE.getFunction_IsPerformedBy();

		/**
		 * The meta object literal for the '<em><b>Has Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_PORT = eINSTANCE.getFunction_HasPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.ItemImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Is Conveyed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__IS_CONVEYED_BY = eINSTANCE.getItem_IsConveyedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.ChainImpl <em>Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.ChainImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getChain()
		 * @generated
		 */
		EClass CHAIN = eINSTANCE.getChain();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN__IMPLEMENTS = eINSTANCE.getChain_Implements();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.PortImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Is Port Of2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__IS_PORT_OF2 = eINSTANCE.getPort_IsPortOf2();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.InputImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Is Input Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__IS_INPUT_OF = eINSTANCE.getInput_IsInputOf();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.OutputImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Is Output Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__IS_OUTPUT_OF = eINSTANCE.getOutput_IsOutputOf();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.exchangeImpl <em>exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.exchangeImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getexchange()
		 * @generated
		 */
		EClass EXCHANGE = eINSTANCE.getexchange();

		/**
		 * The meta object literal for the '<em><b>Sends To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__SENDS_TO = eINSTANCE.getexchange_SendsTo();

		/**
		 * The meta object literal for the '<em><b>Receives From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__RECEIVES_FROM = eINSTANCE.getexchange_ReceivesFrom();

		/**
		 * The meta object literal for the '<em><b>Conveys</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__CONVEYS = eINSTANCE.getexchange_Conveys();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.PerformingElementImpl <em>Performing Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.PerformingElementImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getPerformingElement()
		 * @generated
		 */
		EClass PERFORMING_ELEMENT = eINSTANCE.getPerformingElement();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMING_ELEMENT__PERFORMS = eINSTANCE.getPerformingElement_Performs();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.ComponentImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.sierra.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.sierra.impl.ActivityDiagramImpl
		 * @see org.eclipse.sirius.sample.sierra.impl.SierraPackageImpl#getActivityDiagram()
		 * @generated
		 */
		EClass ACTIVITY_DIAGRAM = eINSTANCE.getActivityDiagram();

		/**
		 * The meta object literal for the '<em><b>Specializableelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__SPECIALIZABLEELEMENT = eINSTANCE.getActivityDiagram_Specializableelement();

		/**
		 * The meta object literal for the '<em><b>Containableelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__CONTAINABLEELEMENT = eINSTANCE.getActivityDiagram_Containableelement();

		/**
		 * The meta object literal for the '<em><b>Performingelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__PERFORMINGELEMENT = eINSTANCE.getActivityDiagram_Performingelement();

		/**
		 * The meta object literal for the '<em><b>Exchangeelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__EXCHANGEELEMENT = eINSTANCE.getActivityDiagram_Exchangeelement();

	}

} //SierraPackage
