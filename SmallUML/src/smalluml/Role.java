/**
 */
package smalluml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Role#getClass_ <em>Class</em>}</li>
 *   <li>{@link smalluml.Role#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(smalluml.Class)
	 * @see smalluml.SmallumlPackage#getRole_Class()
	 * @model required="true"
	 * @generated
	 */
	smalluml.Class getClass_();

	/**
	 * Sets the value of the '{@link smalluml.Role#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(smalluml.Class value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smalluml.Relation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see smalluml.SmallumlPackage#getRole_Relation()
	 * @see smalluml.Relation#getRole
	 * @model opposite="role" required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link smalluml.Role#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

} // Role
