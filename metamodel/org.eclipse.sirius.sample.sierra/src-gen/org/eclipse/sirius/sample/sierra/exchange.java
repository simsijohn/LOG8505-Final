/**
 */
package org.eclipse.sirius.sample.sierra;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.exchange#getSendsTo <em>Sends To</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.exchange#getReceivesFrom <em>Receives From</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.exchange#getConveys <em>Conveys</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getexchange()
 * @model
 * @generated
 */
public interface exchange extends ContainableElement {
	/**
	 * Returns the value of the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends To</em>' reference.
	 * @see #setSendsTo(ExchangeElement)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getexchange_SendsTo()
	 * @model required="true"
	 * @generated
	 */
	ExchangeElement getSendsTo();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.exchange#getSendsTo <em>Sends To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sends To</em>' reference.
	 * @see #getSendsTo()
	 * @generated
	 */
	void setSendsTo(ExchangeElement value);

	/**
	 * Returns the value of the '<em><b>Receives From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives From</em>' reference.
	 * @see #setReceivesFrom(ExchangeElement)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getexchange_ReceivesFrom()
	 * @model required="true"
	 * @generated
	 */
	ExchangeElement getReceivesFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.exchange#getReceivesFrom <em>Receives From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receives From</em>' reference.
	 * @see #getReceivesFrom()
	 * @generated
	 */
	void setReceivesFrom(ExchangeElement value);

	/**
	 * Returns the value of the '<em><b>Conveys</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Item#getIsConveyedBy <em>Is Conveyed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveys</em>' reference.
	 * @see #setConveys(Item)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getexchange_Conveys()
	 * @see org.eclipse.sirius.sample.sierra.Item#getIsConveyedBy
	 * @model opposite="isConveyedBy"
	 * @generated
	 */
	Item getConveys();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.exchange#getConveys <em>Conveys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conveys</em>' reference.
	 * @see #getConveys()
	 * @generated
	 */
	void setConveys(Item value);

} // exchange
