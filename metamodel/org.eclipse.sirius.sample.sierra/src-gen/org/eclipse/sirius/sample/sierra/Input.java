/**
 */
package org.eclipse.sirius.sample.sierra;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Input#getIsInputOf <em>Is Input Of</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Port {
	/**
	 * Returns the value of the '<em><b>Is Input Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Function#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Input Of</em>' reference.
	 * @see #setIsInputOf(Function)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getInput_IsInputOf()
	 * @see org.eclipse.sirius.sample.sierra.Function#getHasInput
	 * @model opposite="hasInput"
	 * @generated
	 */
	Function getIsInputOf();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.Input#getIsInputOf <em>Is Input Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Input Of</em>' reference.
	 * @see #getIsInputOf()
	 * @generated
	 */
	void setIsInputOf(Function value);

} // Input
