/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.ActivityDiagram#getSpecializableelement <em>Specializableelement</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.ActivityDiagram#getContainableelement <em>Containableelement</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.ActivityDiagram#getPerformingelement <em>Performingelement</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.ActivityDiagram#getExchangeelement <em>Exchangeelement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getActivityDiagram()
 * @model
 * @generated
 */
public interface ActivityDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializableelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.SpecializableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializableelement</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getActivityDiagram_Specializableelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecializableElement> getSpecializableelement();

	/**
	 * Returns the value of the '<em><b>Containableelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.ContainableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containableelement</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getActivityDiagram_Containableelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainableElement> getContainableelement();

	/**
	 * Returns the value of the '<em><b>Performingelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.PerformingElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performingelement</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getActivityDiagram_Performingelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PerformingElement> getPerformingelement();

	/**
	 * Returns the value of the '<em><b>Exchangeelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.ExchangeElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchangeelement</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getActivityDiagram_Exchangeelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangeElement> getExchangeelement();

} // ActivityDiagram
