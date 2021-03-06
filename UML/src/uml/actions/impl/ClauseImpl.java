/**
 */
package uml.actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.ActionsPackage;
import uml.actions.Clause;
import uml.actions.OutputPin;

import uml.activities.ExecutableNode;

import uml.commonStructure.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.ClauseImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uml.actions.impl.ClauseImpl#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link uml.actions.impl.ClauseImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link uml.actions.impl.ClauseImpl#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link uml.actions.impl.ClauseImpl#getSuccessorClause <em>Successor Clause</em>}</li>
 *   <li>{@link uml.actions.impl.ClauseImpl#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClauseImpl extends ElementImpl implements Clause {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> body;

	/**
	 * The cached value of the '{@link #getBodyOutput() <em>Body Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> bodyOutput;

	/**
	 * The cached value of the '{@link #getDecider() <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider()
	 * @generated
	 * @ordered
	 */
	protected OutputPin decider;

	/**
	 * The cached value of the '{@link #getPredecessorClause() <em>Predecessor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> predecessorClause;

	/**
	 * The cached value of the '{@link #getSuccessorClause() <em>Successor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> successorClause;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, ActionsPackage.CLAUSE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getBodyOutput() {
		if (bodyOutput == null) {
			bodyOutput = new EObjectResolvingEList<OutputPin>(OutputPin.class, this, ActionsPackage.CLAUSE__BODY_OUTPUT);
		}
		return bodyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		if (decider != null && decider.eIsProxy()) {
			InternalEObject oldDecider = (InternalEObject)decider;
			decider = (OutputPin)eResolveProxy(oldDecider);
			if (decider != oldDecider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.CLAUSE__DECIDER, oldDecider, decider));
			}
		}
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetDecider() {
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider(OutputPin newDecider) {
		OutputPin oldDecider = decider;
		decider = newDecider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.CLAUSE__DECIDER, oldDecider, decider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getPredecessorClause() {
		if (predecessorClause == null) {
			predecessorClause = new EObjectWithInverseResolvingEList.ManyInverse<Clause>(Clause.class, this, ActionsPackage.CLAUSE__PREDECESSOR_CLAUSE, ActionsPackage.CLAUSE__SUCCESSOR_CLAUSE);
		}
		return predecessorClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getSuccessorClause() {
		if (successorClause == null) {
			successorClause = new EObjectWithInverseResolvingEList.ManyInverse<Clause>(Clause.class, this, ActionsPackage.CLAUSE__SUCCESSOR_CLAUSE, ActionsPackage.CLAUSE__PREDECESSOR_CLAUSE);
		}
		return successorClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getTest() {
		if (test == null) {
			test = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, ActionsPackage.CLAUSE__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessorClause()).basicAdd(otherEnd, msgs);
			case ActionsPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuccessorClause()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return ((InternalEList<?>)getPredecessorClause()).basicRemove(otherEnd, msgs);
			case ActionsPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return ((InternalEList<?>)getSuccessorClause()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.CLAUSE__BODY:
				return getBody();
			case ActionsPackage.CLAUSE__BODY_OUTPUT:
				return getBodyOutput();
			case ActionsPackage.CLAUSE__DECIDER:
				if (resolve) return getDecider();
				return basicGetDecider();
			case ActionsPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return getPredecessorClause();
			case ActionsPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return getSuccessorClause();
			case ActionsPackage.CLAUSE__TEST:
				return getTest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionsPackage.CLAUSE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case ActionsPackage.CLAUSE__BODY_OUTPUT:
				getBodyOutput().clear();
				getBodyOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case ActionsPackage.CLAUSE__DECIDER:
				setDecider((OutputPin)newValue);
				return;
			case ActionsPackage.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClause().clear();
				getPredecessorClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case ActionsPackage.CLAUSE__SUCCESSOR_CLAUSE:
				getSuccessorClause().clear();
				getSuccessorClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case ActionsPackage.CLAUSE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActionsPackage.CLAUSE__BODY:
				getBody().clear();
				return;
			case ActionsPackage.CLAUSE__BODY_OUTPUT:
				getBodyOutput().clear();
				return;
			case ActionsPackage.CLAUSE__DECIDER:
				setDecider((OutputPin)null);
				return;
			case ActionsPackage.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClause().clear();
				return;
			case ActionsPackage.CLAUSE__SUCCESSOR_CLAUSE:
				getSuccessorClause().clear();
				return;
			case ActionsPackage.CLAUSE__TEST:
				getTest().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActionsPackage.CLAUSE__BODY:
				return body != null && !body.isEmpty();
			case ActionsPackage.CLAUSE__BODY_OUTPUT:
				return bodyOutput != null && !bodyOutput.isEmpty();
			case ActionsPackage.CLAUSE__DECIDER:
				return decider != null;
			case ActionsPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return predecessorClause != null && !predecessorClause.isEmpty();
			case ActionsPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return successorClause != null && !successorClause.isEmpty();
			case ActionsPackage.CLAUSE__TEST:
				return test != null && !test.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClauseImpl
