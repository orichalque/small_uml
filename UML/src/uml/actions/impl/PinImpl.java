/**
 */
package uml.actions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.actions.ActionsPackage;
import uml.actions.Pin;

import uml.activities.impl.ObjectNodeImpl;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.MultiplicityElement;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.PinImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.actions.impl.PinImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.actions.impl.PinImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.actions.impl.PinImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.actions.impl.PinImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.actions.impl.PinImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link uml.actions.impl.PinImpl#isIsControl <em>Is Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PinImpl extends ObjectNodeImpl implements Pin {
	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * The default value of the '{@link #isIsControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControl()
	 * @generated
	 * @ordered
	 */
	protected boolean isControl = IS_CONTROL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.PIN__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.PIN__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		// TODO: implement this method to return the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		// TODO: implement this method to set the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionsPackage.PIN__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionsPackage.PIN__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionsPackage.PIN__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.PIN__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		// TODO: implement this method to return the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		// TODO: implement this method to set the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionsPackage.PIN__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionsPackage.PIN__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionsPackage.PIN__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.PIN__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControl() {
		return isControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControl(boolean newIsControl) {
		boolean oldIsControl = isControl;
		isControl = newIsControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.PIN__IS_CONTROL, oldIsControl, isControl));
	}

	/**
	 * The cached invocation delegate for the '{@link #compatibleWith(uml.commonStructure.MultiplicityElement) <em>Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #compatibleWith(uml.commonStructure.MultiplicityElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate COMPATIBLE_WITH_MULTIPLICITY_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean compatibleWith(MultiplicityElement other) {
		try {
			return (Boolean)COMPATIBLE_WITH_MULTIPLICITY_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{other}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #includesMultiplicity(uml.commonStructure.MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includesMultiplicity(uml.commonStructure.MultiplicityElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCLUDES_MULTIPLICITY_MULTIPLICITY_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement m) {
		try {
			return (Boolean)INCLUDES_MULTIPLICITY_MULTIPLICITY_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{m}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #is(int, int) <em>Is</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INT_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___IS__INT_INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is(int lowerbound, int upperbound) {
		try {
			return (Boolean)IS_INT_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{lowerbound, upperbound}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultivalued()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_MULTIVALUED__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___IS_MULTIVALUED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		try {
			return (Boolean)IS_MULTIVALUED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #lower() <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lower()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LOWER__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___LOWER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lower() {
		try {
			return (Integer)LOWER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LOWER_BOUND__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___LOWER_BOUND).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		try {
			return (Integer)LOWER_BOUND__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #upper() <em>Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #upper()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate UPPER__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___UPPER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upper() {
		try {
			return (Integer)UPPER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #upperBound()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate UPPER_BOUND__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___UPPER_BOUND).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		try {
			return (Integer)UPPER_BOUND__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.PIN__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case ActionsPackage.PIN__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
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
			case ActionsPackage.PIN__IS_ORDERED:
				return isIsOrdered();
			case ActionsPackage.PIN__IS_UNIQUE:
				return isIsUnique();
			case ActionsPackage.PIN__LOWER:
				return getLower();
			case ActionsPackage.PIN__LOWER_VALUE:
				return getLowerValue();
			case ActionsPackage.PIN__UPPER:
				return getUpper();
			case ActionsPackage.PIN__UPPER_VALUE:
				return getUpperValue();
			case ActionsPackage.PIN__IS_CONTROL:
				return isIsControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionsPackage.PIN__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case ActionsPackage.PIN__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case ActionsPackage.PIN__LOWER:
				setLower((Integer)newValue);
				return;
			case ActionsPackage.PIN__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case ActionsPackage.PIN__UPPER:
				setUpper((Integer)newValue);
				return;
			case ActionsPackage.PIN__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case ActionsPackage.PIN__IS_CONTROL:
				setIsControl((Boolean)newValue);
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
			case ActionsPackage.PIN__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case ActionsPackage.PIN__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case ActionsPackage.PIN__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case ActionsPackage.PIN__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case ActionsPackage.PIN__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case ActionsPackage.PIN__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case ActionsPackage.PIN__IS_CONTROL:
				setIsControl(IS_CONTROL_EDEFAULT);
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
			case ActionsPackage.PIN__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case ActionsPackage.PIN__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case ActionsPackage.PIN__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case ActionsPackage.PIN__LOWER_VALUE:
				return lowerValue != null;
			case ActionsPackage.PIN__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case ActionsPackage.PIN__UPPER_VALUE:
				return upperValue != null;
			case ActionsPackage.PIN__IS_CONTROL:
				return isControl != IS_CONTROL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case ActionsPackage.PIN__IS_ORDERED: return CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case ActionsPackage.PIN__IS_UNIQUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case ActionsPackage.PIN__LOWER: return CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER;
				case ActionsPackage.PIN__LOWER_VALUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				case ActionsPackage.PIN__UPPER: return CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER;
				case ActionsPackage.PIN__UPPER_VALUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return ActionsPackage.PIN__IS_ORDERED;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return ActionsPackage.PIN__IS_UNIQUE;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER: return ActionsPackage.PIN__LOWER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return ActionsPackage.PIN__LOWER_VALUE;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER: return ActionsPackage.PIN__UPPER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return ActionsPackage.PIN__UPPER_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT: return ActionsPackage.PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT: return ActionsPackage.PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___IS__INT_INT: return ActionsPackage.PIN___IS__INT_INT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED: return ActionsPackage.PIN___IS_MULTIVALUED;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___LOWER: return ActionsPackage.PIN___LOWER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___LOWER_BOUND: return ActionsPackage.PIN___LOWER_BOUND;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___UPPER: return ActionsPackage.PIN___UPPER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___UPPER_BOUND: return ActionsPackage.PIN___UPPER_BOUND;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ActionsPackage.PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
				return compatibleWith((MultiplicityElement)arguments.get(0));
			case ActionsPackage.PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
				return includesMultiplicity((MultiplicityElement)arguments.get(0));
			case ActionsPackage.PIN___IS__INT_INT:
				return is((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ActionsPackage.PIN___IS_MULTIVALUED:
				return isMultivalued();
			case ActionsPackage.PIN___LOWER:
				return lower();
			case ActionsPackage.PIN___LOWER_BOUND:
				return lowerBound();
			case ActionsPackage.PIN___UPPER:
				return upper();
			case ActionsPackage.PIN___UPPER_BOUND:
				return upperBound();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isControl: ");
		result.append(isControl);
		result.append(')');
		return result.toString();
	}

} //PinImpl
