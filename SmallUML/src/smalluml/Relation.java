/**
 */
package smalluml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link smalluml.Relation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Role)
	 * @see smalluml.SmallumlPackage#getRelation_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Role getSource();

	/**
	 * Sets the value of the '{@link smalluml.Relation#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Role value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Role)
	 * @see smalluml.SmallumlPackage#getRelation_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Role getTarget();

	/**
	 * Sets the value of the '{@link smalluml.Relation#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Role value);

} // Relation
