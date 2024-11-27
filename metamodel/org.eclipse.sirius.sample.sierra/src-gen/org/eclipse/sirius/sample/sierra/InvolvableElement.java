/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Involvable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.InvolvableElement#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getInvolvableElement()
 * @model
 * @generated
 */
public interface InvolvableElement extends SpecializableElement, PerformingElement {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.InvolvableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getInvolvableElement_Extends()
	 * @model
	 * @generated
	 */
	EList<InvolvableElement> getExtends();

	/**
	 * Returns the value of the '<em><b>Is Involved In</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Capability}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Capability#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Involved In</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getInvolvableElement_IsInvolvedIn()
	 * @see org.eclipse.sirius.sample.sierra.Capability#getInvolves
	 * @model opposite="involves"
	 * @generated
	 */
	EList<Capability> getIsInvolvedIn();

} // InvolvableElement
