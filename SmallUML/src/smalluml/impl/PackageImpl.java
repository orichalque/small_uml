/**
 */
package smalluml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smalluml.Relation;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.PackageImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link smalluml.impl.PackageImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link smalluml.impl.PackageImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements smalluml.Package {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<smalluml.Class> class_;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relation;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<smalluml.Package> package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<smalluml.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<smalluml.Class>(smalluml.Class.class, this, SmallumlPackage.PACKAGE__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<Relation>(Relation.class, this, SmallumlPackage.PACKAGE__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<smalluml.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentEList<smalluml.Package>(smalluml.Package.class, this, SmallumlPackage.PACKAGE__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.PACKAGE__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.PACKAGE__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.PACKAGE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
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
			case SmallumlPackage.PACKAGE__CLASS:
				return getClass_();
			case SmallumlPackage.PACKAGE__RELATION:
				return getRelation();
			case SmallumlPackage.PACKAGE__PACKAGE:
				return getPackage();
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
			case SmallumlPackage.PACKAGE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends smalluml.Class>)newValue);
				return;
			case SmallumlPackage.PACKAGE__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case SmallumlPackage.PACKAGE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends smalluml.Package>)newValue);
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
			case SmallumlPackage.PACKAGE__CLASS:
				getClass_().clear();
				return;
			case SmallumlPackage.PACKAGE__RELATION:
				getRelation().clear();
				return;
			case SmallumlPackage.PACKAGE__PACKAGE:
				getPackage().clear();
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
			case SmallumlPackage.PACKAGE__CLASS:
				return class_ != null && !class_.isEmpty();
			case SmallumlPackage.PACKAGE__RELATION:
				return relation != null && !relation.isEmpty();
			case SmallumlPackage.PACKAGE__PACKAGE:
				return package_ != null && !package_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
