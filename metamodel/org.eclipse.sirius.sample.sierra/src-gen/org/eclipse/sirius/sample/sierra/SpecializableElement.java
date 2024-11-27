/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specializable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.SpecializableElement#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getSpecializableElement()
 * @model abstract="true"
 * @generated
 */
public interface SpecializableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.SpecializableElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getSpecializableElement_Specializes()
	 * @see org.eclipse.sirius.sample.sierra.SpecializableElement#getIsSpecializedBy
	 * @model opposite="isSpecializedBy"
	 * @generated
	 */
	EList<SpecializableElement> getSpecializes();

	/**
	 * Returns the value of the '<em><b>Is Specialized By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.SpecializableElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Specialized By</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getSpecializableElement_IsSpecializedBy()
	 * @see org.eclipse.sirius.sample.sierra.SpecializableElement#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	EList<SpecializableElement> getIsSpecializedBy();

} // SpecializableElement
