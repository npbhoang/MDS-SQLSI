/**
 */
package datamodels.impl;

import datamodels.AssociationEnd;
import datamodels.DatamodelsPackage;
import datamodels.Entity;
import datamodels.Multiplicity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datamodels.impl.AssociationEndImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link datamodels.impl.AssociationEndImpl#getAssociationName <em>Association Name</em>}</li>
 *   <li>{@link datamodels.impl.AssociationEndImpl#getOtherEnd <em>Other End</em>}</li>
 *   <li>{@link datamodels.impl.AssociationEndImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationEndImpl extends PropertyImpl implements AssociationEnd {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_EDEFAULT = Multiplicity.MANY;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationName()
	 * @generated
	 * @ordered
	 */
	protected String associationName = ASSOCIATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherEnd() <em>Other End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnd()
	 * @generated
	 * @ordered
	 */
	protected AssociationEnd otherEnd;

	/**
	 * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity targetEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelsPackage.Literals.ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(Multiplicity newMultiplicity) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelsPackage.ASSOCIATION_END__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociationName() {
		return associationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationName(String newAssociationName) {
		String oldAssociationName = associationName;
		associationName = newAssociationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelsPackage.ASSOCIATION_END__ASSOCIATION_NAME, oldAssociationName, associationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd getOtherEnd() {
		if (otherEnd != null && otherEnd.eIsProxy()) {
			InternalEObject oldOtherEnd = (InternalEObject)otherEnd;
			otherEnd = (AssociationEnd)eResolveProxy(oldOtherEnd);
			if (otherEnd != oldOtherEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelsPackage.ASSOCIATION_END__OTHER_END, oldOtherEnd, otherEnd));
			}
		}
		return otherEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd basicGetOtherEnd() {
		return otherEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEnd(AssociationEnd newOtherEnd) {
		AssociationEnd oldOtherEnd = otherEnd;
		otherEnd = newOtherEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelsPackage.ASSOCIATION_END__OTHER_END, oldOtherEnd, otherEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTargetEntity() {
		if (targetEntity != null && targetEntity.eIsProxy()) {
			InternalEObject oldTargetEntity = (InternalEObject)targetEntity;
			targetEntity = (Entity)eResolveProxy(oldTargetEntity);
			if (targetEntity != oldTargetEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelsPackage.ASSOCIATION_END__TARGET_ENTITY, oldTargetEntity, targetEntity));
			}
		}
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetEntity() {
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEntity(Entity newTargetEntity) {
		Entity oldTargetEntity = targetEntity;
		targetEntity = newTargetEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelsPackage.ASSOCIATION_END__TARGET_ENTITY, oldTargetEntity, targetEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatamodelsPackage.ASSOCIATION_END__MULTIPLICITY:
				return getMultiplicity();
			case DatamodelsPackage.ASSOCIATION_END__ASSOCIATION_NAME:
				return getAssociationName();
			case DatamodelsPackage.ASSOCIATION_END__OTHER_END:
				if (resolve) return getOtherEnd();
				return basicGetOtherEnd();
			case DatamodelsPackage.ASSOCIATION_END__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
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
			case DatamodelsPackage.ASSOCIATION_END__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case DatamodelsPackage.ASSOCIATION_END__ASSOCIATION_NAME:
				setAssociationName((String)newValue);
				return;
			case DatamodelsPackage.ASSOCIATION_END__OTHER_END:
				setOtherEnd((AssociationEnd)newValue);
				return;
			case DatamodelsPackage.ASSOCIATION_END__TARGET_ENTITY:
				setTargetEntity((Entity)newValue);
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
			case DatamodelsPackage.ASSOCIATION_END__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case DatamodelsPackage.ASSOCIATION_END__ASSOCIATION_NAME:
				setAssociationName(ASSOCIATION_NAME_EDEFAULT);
				return;
			case DatamodelsPackage.ASSOCIATION_END__OTHER_END:
				setOtherEnd((AssociationEnd)null);
				return;
			case DatamodelsPackage.ASSOCIATION_END__TARGET_ENTITY:
				setTargetEntity((Entity)null);
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
			case DatamodelsPackage.ASSOCIATION_END__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case DatamodelsPackage.ASSOCIATION_END__ASSOCIATION_NAME:
				return ASSOCIATION_NAME_EDEFAULT == null ? associationName != null : !ASSOCIATION_NAME_EDEFAULT.equals(associationName);
			case DatamodelsPackage.ASSOCIATION_END__OTHER_END:
				return otherEnd != null;
			case DatamodelsPackage.ASSOCIATION_END__TARGET_ENTITY:
				return targetEntity != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(", associationName: ");
		result.append(associationName);
		result.append(')');
		return result.toString();
	}

} //AssociationEndImpl
