/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AddVariableValueAction is a WriteVariableAction for adding values to a Variable.
 * value <> null
 * if not variable.isOrdered then insertAt = null
 * else 
 *   not isReplaceAll implies
 *   	insertAt<>null and 
 *   	insertAt->forAll(type=UnlimitedNatural and is(1,1.oclAsType(UnlimitedNatural)))
 * endif
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.AddVariableValueAction#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link uml.actions.AddVariableValueAction#isIsReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getAddVariableValueAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='required_value insertAt_pin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL required_value='value <> null' insertAt_pin='if not variable.isOrdered then insertAt = null\nelse \n  not isReplaceAll implies\n  \tinsertAt<>null and \n  \tinsertAt->forAll(type=UnlimitedNatural and is(1,1.oclAsType(UnlimitedNatural)))\nendif\n'"
 * @generated
 */
public interface AddVariableValueAction extends WriteVariableAction {
	/**
	 * Returns the value of the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that gives the position at which to insert a new value or move an existing value in ordered Variables. The type of the insertAt InputPin is UnlimitedNatural, but the value cannot be zero. It is omitted for unordered Variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert At</em>' containment reference.
	 * @see #setInsertAt(InputPin)
	 * @see uml.actions.ActionsPackage#getAddVariableValueAction_InsertAt()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='addVariableValueAction'"
	 * @generated
	 */
	InputPin getInsertAt();

	/**
	 * Sets the value of the '{@link uml.actions.AddVariableValueAction#getInsertAt <em>Insert At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert At</em>' containment reference.
	 * @see #getInsertAt()
	 * @generated
	 */
	void setInsertAt(InputPin value);

	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether existing values of the Variable should be removed before adding the new value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(boolean)
	 * @see uml.actions.ActionsPackage#getAddVariableValueAction_IsReplaceAll()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReplaceAll();

	/**
	 * Sets the value of the '{@link uml.actions.AddVariableValueAction#isIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #isIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(boolean value);

} // AddVariableValueAction
