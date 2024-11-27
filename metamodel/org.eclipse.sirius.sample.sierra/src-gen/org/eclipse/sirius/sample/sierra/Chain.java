/**
 */
package org.eclipse.sirius.sample.sierra;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Chain#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getChain()
 * @model
 * @generated
 */
public interface Chain extends ContainableElement {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Capability#getIsImplementedBy <em>Is Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(Capability)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getChain_Implements()
	 * @see org.eclipse.sirius.sample.sierra.Capability#getIsImplementedBy
	 * @model opposite="isImplementedBy"
	 * @generated
	 */
	Capability getImplements();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.Chain#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(Capability value);

} // Chain
