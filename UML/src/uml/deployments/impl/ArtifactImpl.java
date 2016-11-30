/**
 */
package uml.deployments.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.Operation;
import uml.classification.Property;

import uml.classification.impl.ClassifierImpl;

import uml.deployments.Artifact;
import uml.deployments.DeploymentsPackage;
import uml.deployments.Manifestation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.deployments.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link uml.deployments.impl.ArtifactImpl#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link uml.deployments.impl.ArtifactImpl#getNestedArtifact <em>Nested Artifact</em>}</li>
 *   <li>{@link uml.deployments.impl.ArtifactImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.deployments.impl.ArtifactImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends ClassifierImpl implements Artifact {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManifestation() <em>Manifestation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestation()
	 * @generated
	 * @ordered
	 */
	protected EList<Manifestation> manifestation;

	/**
	 * The cached value of the '{@link #getNestedArtifact() <em>Nested Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> nestedArtifact;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentsPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentsPackage.ARTIFACT__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manifestation> getManifestation() {
		if (manifestation == null) {
			manifestation = new EObjectContainmentEList<Manifestation>(Manifestation.class, this, DeploymentsPackage.ARTIFACT__MANIFESTATION);
		}
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getNestedArtifact() {
		if (nestedArtifact == null) {
			nestedArtifact = new EObjectContainmentEList<Artifact>(Artifact.class, this, DeploymentsPackage.ARTIFACT__NESTED_ARTIFACT);
		}
		return nestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, DeploymentsPackage.ARTIFACT__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentEList<Operation>(Operation.class, this, DeploymentsPackage.ARTIFACT__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentsPackage.ARTIFACT__MANIFESTATION:
				return ((InternalEList<?>)getManifestation()).basicRemove(otherEnd, msgs);
			case DeploymentsPackage.ARTIFACT__NESTED_ARTIFACT:
				return ((InternalEList<?>)getNestedArtifact()).basicRemove(otherEnd, msgs);
			case DeploymentsPackage.ARTIFACT__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case DeploymentsPackage.ARTIFACT__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
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
			case DeploymentsPackage.ARTIFACT__FILE_NAME:
				return getFileName();
			case DeploymentsPackage.ARTIFACT__MANIFESTATION:
				return getManifestation();
			case DeploymentsPackage.ARTIFACT__NESTED_ARTIFACT:
				return getNestedArtifact();
			case DeploymentsPackage.ARTIFACT__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case DeploymentsPackage.ARTIFACT__OWNED_OPERATION:
				return getOwnedOperation();
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
			case DeploymentsPackage.ARTIFACT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case DeploymentsPackage.ARTIFACT__MANIFESTATION:
				getManifestation().clear();
				getManifestation().addAll((Collection<? extends Manifestation>)newValue);
				return;
			case DeploymentsPackage.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifact().clear();
				getNestedArtifact().addAll((Collection<? extends Artifact>)newValue);
				return;
			case DeploymentsPackage.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case DeploymentsPackage.ARTIFACT__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
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
			case DeploymentsPackage.ARTIFACT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case DeploymentsPackage.ARTIFACT__MANIFESTATION:
				getManifestation().clear();
				return;
			case DeploymentsPackage.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifact().clear();
				return;
			case DeploymentsPackage.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case DeploymentsPackage.ARTIFACT__OWNED_OPERATION:
				getOwnedOperation().clear();
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
			case DeploymentsPackage.ARTIFACT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case DeploymentsPackage.ARTIFACT__MANIFESTATION:
				return manifestation != null && !manifestation.isEmpty();
			case DeploymentsPackage.ARTIFACT__NESTED_ARTIFACT:
				return nestedArtifact != null && !nestedArtifact.isEmpty();
			case DeploymentsPackage.ARTIFACT__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case DeploymentsPackage.ARTIFACT__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
