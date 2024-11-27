/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.ContainableElement#getContains <em>Contains</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.ContainableElement#getIsContainedIn <em>Is Contained In</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getContainableElement()
 * @model abstract="true"
 * @generated
 */
public interface ContainableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.ContainableElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.ContainableElement#getIsContainedIn <em>Is Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getContainableElement_Contains()
	 * @see org.eclipse.sirius.sample.sierra.ContainableElement#getIsContainedIn
	 * @model opposite="isContainedIn"
	 * @generated
	 */
	EList<ContainableElement> getContains();

	/**
	 * Returns the value of the '<em><b>Is Contained In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.ContainableElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Contained In</em>' reference.
	 * @see #setIsContainedIn(ContainableElement)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getContainableElement_IsContainedIn()
	 * @see org.eclipse.sirius.sample.sierra.ContainableElement#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	ContainableElement getIsContainedIn();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.ContainableElement#getIsContainedIn <em>Is Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Contained In</em>' reference.
	 * @see #getIsContainedIn()
	 * @generated
	 */
	void setIsContainedIn(ContainableElement value);

} // ContainableElement
