/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.PerformingElement#getPerforms <em>Performs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getPerformingElement()
 * @model abstract="true"
 * @generated
 */
public interface PerformingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Performs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Function}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Function#getIsPerformedBy <em>Is Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getPerformingElement_Performs()
	 * @see org.eclipse.sirius.sample.sierra.Function#getIsPerformedBy
	 * @model opposite="isPerformedBy"
	 * @generated
	 */
	EList<Function> getPerforms();

} // PerformingElement
