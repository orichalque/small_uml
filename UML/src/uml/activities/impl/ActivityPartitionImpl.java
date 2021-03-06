/**
 */
package uml.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.activities.ActivitiesPackage;
import uml.activities.ActivityEdge;
import uml.activities.ActivityNode;
import uml.activities.ActivityPartition;

import uml.commonStructure.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.impl.ActivityPartitionImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityPartitionImpl#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityPartitionImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityPartitionImpl#getSubpartition <em>Subpartition</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityPartitionImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityPartitionImpl extends ActivityGroupImpl implements ActivityPartition {
	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The default value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIMENSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected boolean isDimension = IS_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected Element represents;

	/**
	 * The cached value of the '{@link #getSubpartition() <em>Subpartition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> subpartition;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge>(ActivityEdge.class, this, ActivitiesPackage.ACTIVITY_PARTITION__EDGE, ActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDimension() {
		return isDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDimension(boolean newIsDimension) {
		boolean oldIsDimension = isDimension;
		isDimension = newIsDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension, isDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (Element)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(Element newRepresents) {
		Element oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getSubpartition() {
		if (subpartition == null) {
			subpartition = new EObjectContainmentWithInverseEList<ActivityPartition>(ActivityPartition.class, this, ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION, ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION);
		}
		return subpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSuperPartition() {
		if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION) return null;
		return (ActivityPartition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperPartition(ActivityPartition newSuperPartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperPartition, ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPartition(ActivityPartition newSuperPartition) {
		if (newSuperPartition != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION && newSuperPartition != null)) {
			if (EcoreUtil.isAncestor(this, newSuperPartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperPartition != null)
				msgs = ((InternalEObject)newSuperPartition).eInverseAdd(this, ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION, ActivityPartition.class, msgs);
			msgs = basicSetSuperPartition(newSuperPartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION, newSuperPartition, newSuperPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, ActivitiesPackage.ACTIVITY_PARTITION__NODE, ActivitiesPackage.ACTIVITY_NODE__IN_PARTITION);
		}
		return node;
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
			case ActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartition()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperPartition((ActivityPartition)otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_PARTITION__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
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
			case ActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return ((InternalEList<?>)getSubpartition()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return basicSetSuperPartition(null, msgs);
			case ActivitiesPackage.ACTIVITY_PARTITION__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION, ActivityPartition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				return getEdge();
			case ActivitiesPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return isIsDimension();
			case ActivitiesPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isIsExternal();
			case ActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return getSubpartition();
			case ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition();
			case ActivitiesPackage.ACTIVITY_PARTITION__NODE:
				return getNode();
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
			case ActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension((Boolean)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((Element)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				getSubpartition().clear();
				getSubpartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((ActivityPartition)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
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
			case ActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				getEdge().clear();
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((Element)null);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				getSubpartition().clear();
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((ActivityPartition)null);
				return;
			case ActivitiesPackage.ACTIVITY_PARTITION__NODE:
				getNode().clear();
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
			case ActivitiesPackage.ACTIVITY_PARTITION__EDGE:
				return edge != null && !edge.isEmpty();
			case ActivitiesPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return isDimension != IS_DIMENSION_EDEFAULT;
			case ActivitiesPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isExternal != IS_EXTERNAL_EDEFAULT;
			case ActivitiesPackage.ACTIVITY_PARTITION__REPRESENTS:
				return represents != null;
			case ActivitiesPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return subpartition != null && !subpartition.isEmpty();
			case ActivitiesPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition() != null;
			case ActivitiesPackage.ACTIVITY_PARTITION__NODE:
				return node != null && !node.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDimension: ");
		result.append(isDimension);
		result.append(", isExternal: ");
		result.append(isExternal);
		result.append(')');
		return result.toString();
	}

} //ActivityPartitionImpl
