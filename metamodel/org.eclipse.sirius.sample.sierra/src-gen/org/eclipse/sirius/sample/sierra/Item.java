/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Item#getIsConveyedBy <em>Is Conveyed By</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Conveyed By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.exchange}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.exchange#getConveys <em>Conveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Conveyed By</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getItem_IsConveyedBy()
	 * @see org.eclipse.sirius.sample.sierra.exchange#getConveys
	 * @model opposite="conveys"
	 * @generated
	 */
	EList<exchange> getIsConveyedBy();

} // Item
