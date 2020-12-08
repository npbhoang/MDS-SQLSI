/**
 */
package securitymodels.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import securitymodels.Auth;
import securitymodels.SecuritymodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.impl.AuthImpl#getOclExp <em>Ocl Exp</em>}</li>
 *   <li>{@link securitymodels.impl.AuthImpl#getSqlStm <em>Sql Stm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthImpl extends MinimalEObjectImpl.Container implements Auth {
	/**
	 * The default value of the '{@link #getOclExp() <em>Ocl Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclExp()
	 * @generated
	 * @ordered
	 */
	protected static final String OCL_EXP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOclExp() <em>Ocl Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclExp()
	 * @generated
	 * @ordered
	 */
	protected String oclExp = OCL_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSqlStm() <em>Sql Stm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlStm()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_STM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSqlStm() <em>Sql Stm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlStm()
	 * @generated
	 * @ordered
	 */
	protected String sqlStm = SQL_STM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritymodelsPackage.Literals.AUTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOclExp() {
		return oclExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclExp(String newOclExp) {
		String oldOclExp = oclExp;
		oclExp = newOclExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritymodelsPackage.AUTH__OCL_EXP, oldOclExp, oclExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSqlStm() {
		return sqlStm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlStm(String newSqlStm) {
		String oldSqlStm = sqlStm;
		sqlStm = newSqlStm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritymodelsPackage.AUTH__SQL_STM, oldSqlStm, sqlStm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuritymodelsPackage.AUTH__OCL_EXP:
				return getOclExp();
			case SecuritymodelsPackage.AUTH__SQL_STM:
				return getSqlStm();
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
			case SecuritymodelsPackage.AUTH__OCL_EXP:
				setOclExp((String)newValue);
				return;
			case SecuritymodelsPackage.AUTH__SQL_STM:
				setSqlStm((String)newValue);
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
			case SecuritymodelsPackage.AUTH__OCL_EXP:
				setOclExp(OCL_EXP_EDEFAULT);
				return;
			case SecuritymodelsPackage.AUTH__SQL_STM:
				setSqlStm(SQL_STM_EDEFAULT);
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
			case SecuritymodelsPackage.AUTH__OCL_EXP:
				return OCL_EXP_EDEFAULT == null ? oclExp != null : !OCL_EXP_EDEFAULT.equals(oclExp);
			case SecuritymodelsPackage.AUTH__SQL_STM:
				return SQL_STM_EDEFAULT == null ? sqlStm != null : !SQL_STM_EDEFAULT.equals(sqlStm);
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
		result.append(" (oclExp: ");
		result.append(oclExp);
		result.append(", sqlStm: ");
		result.append(sqlStm);
		result.append(')');
		return result.toString();
	}

} //AuthImpl
