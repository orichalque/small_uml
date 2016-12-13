/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Enumeration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type, NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getEnumeration_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<smalluml.String> getValue();

} // Enumeration
