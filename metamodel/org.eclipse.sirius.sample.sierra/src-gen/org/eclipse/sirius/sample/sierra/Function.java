/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Function#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Function#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Function#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Function#getIsPerformedBy <em>Is Performed By</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Function#getHasPort <em>Has Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Has Input</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Input}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Input#getIsInputOf <em>Is Input Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getFunction_HasInput()
	 * @see org.eclipse.sirius.sample.sierra.Input#getIsInputOf
	 * @model opposite="isInputOf"
	 * @generated
	 */
	EList<Input> getHasInput();

	/**
	 * Returns the value of the '<em><b>Has Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Output}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Output#getIsOutputOf <em>Is Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getFunction_HasOutput()
	 * @see org.eclipse.sirius.sample.sierra.Output#getIsOutputOf
	 * @model opposite="isOutputOf"
	 * @generated
	 */
	EList<Output> getHasOutput();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getFunction_Function()
	 * @model
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.Function#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Is Performed By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.PerformingElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.PerformingElement#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Performed By</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getFunction_IsPerformedBy()
	 * @see org.eclipse.sirius.sample.sierra.PerformingElement#getPerforms
	 * @model opposite="performs"
	 * @generated
	 */
	EList<PerformingElement> getIsPerformedBy();

	/**
	 * Returns the value of the '<em><b>Has Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Port}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Port#getIsPortOf2 <em>Is Port Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Port</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getFunction_HasPort()
	 * @see org.eclipse.sirius.sample.sierra.Port#getIsPortOf2
	 * @model opposite="isPortOf2"
	 * @generated
	 */
	EList<Port> getHasPort();

} // Function
