/**
 */
package org.eclipse.sirius.sample.sierra;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Port#getIsPortOf2 <em>Is Port Of2</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Is Port Of2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Function#getHasPort <em>Has Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Port Of2</em>' reference.
	 * @see #setIsPortOf2(Function)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getPort_IsPortOf2()
	 * @see org.eclipse.sirius.sample.sierra.Function#getHasPort
	 * @model opposite="hasPort"
	 * @generated
	 */
	Function getIsPortOf2();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.Port#getIsPortOf2 <em>Is Port Of2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Port Of2</em>' reference.
	 * @see #getIsPortOf2()
	 * @generated
	 */
	void setIsPortOf2(Function value);

} // Port
