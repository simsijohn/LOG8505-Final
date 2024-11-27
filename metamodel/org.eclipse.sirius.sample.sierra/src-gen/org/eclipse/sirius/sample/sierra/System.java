/**
 */
package org.eclipse.sirius.sample.sierra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.sierra.System#getSupports <em>Supports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Component {
	/**
	 * Returns the value of the '<em><b>Supports</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.sierra.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' reference list.
	 * @see org.eclipse.sirius.sample.sierra.SierraPackage#getSystem_Supports()
	 * @model
	 * @generated
	 */
	EList<Capability> getSupports();

} // System
