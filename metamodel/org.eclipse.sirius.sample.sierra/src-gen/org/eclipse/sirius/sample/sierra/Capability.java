/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Capability#getInvolves <em>Involves</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Capability#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Capability#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Capability#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Capability#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.sierra.Capability#getIsImplementedBy <em>Is Implemented By</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends SpecializableElement {
	/**
	 * Returns the value of the '<em><b>Involves</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.InvolvableElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getCapability_Involves()
	 * @see org.eclipse.sirius.sample.sierra.InvolvableElement#getIsInvolvedIn
	 * @model opposite="isInvolvedIn"
	 * @generated
	 */
	EList<InvolvableElement> getInvolves();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Capability}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Capability#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getCapability_Includes()
	 * @see org.eclipse.sirius.sample.sierra.Capability#getIsIncludedIn
	 * @model opposite="isIncludedIn"
	 * @generated
	 */
	EList<Capability> getIncludes();

	/**
	 * Returns the value of the '<em><b>Is Included In</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Capability}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Included In</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getCapability_IsIncludedIn()
	 * @see org.eclipse.sirius.sample.sierra.Capability#getIncludes
	 * @model opposite="includes"
	 * @generated
	 */
	EList<Capability> getIsIncludedIn();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Capability}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Capability#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getCapability_Extends()
	 * @see org.eclipse.sirius.sample.sierra.Capability#getIsExtendedBy
	 * @model opposite="isExtendedBy"
	 * @generated
	 */
	EList<Capability> getExtends();

	/**
	 * Returns the value of the '<em><b>Is Extended By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Capability}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Capability#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended By</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getCapability_IsExtendedBy()
	 * @see org.eclipse.sirius.sample.sierra.Capability#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Capability> getIsExtendedBy();

	/**
	 * Returns the value of the '<em><b>Is Implemented By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.sierra.Chain#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Implemented By</em>' reference.
	 * @see #setIsImplementedBy(Chain)
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getCapability_IsImplementedBy()
	 * @see org.eclipse.sirius.sample.sierra.Chain#getImplements
	 * @model opposite="implements"
	 * @generated
	 */
	Chain getIsImplementedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.sierra.Capability#getIsImplementedBy <em>Is Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implemented By</em>' reference.
	 * @see #getIsImplementedBy()
	 * @generated
	 */
	void setIsImplementedBy(Chain value);

} // Capability
