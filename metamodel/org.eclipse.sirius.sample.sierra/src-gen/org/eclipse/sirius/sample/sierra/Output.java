/**
 */
package org.eclipse.sirius.sample.sierra;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Output#getIsOutputOf <em>Is Output Of</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends Port {
	/**
	 * Returns the value of the '<em><b>Is Output Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Function#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Output Of</em>' reference.
	 * @see #setIsOutputOf(Function)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getOutput_IsOutputOf()
	 * @see org.eclipse.sirius.sample.sierra.Function#getHasOutput
	 * @model opposite="hasOutput"
	 * @generated
	 */
	Function getIsOutputOf();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.Output#getIsOutputOf <em>Is Output Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Output Of</em>' reference.
	 * @see #getIsOutputOf()
	 * @generated
	 */
	void setIsOutputOf(Function value);

} // Output
