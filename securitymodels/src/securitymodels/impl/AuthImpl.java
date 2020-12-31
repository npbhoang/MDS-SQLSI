/**
 */
package securitymodels.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import securitymodels.Auth;
import securitymodels.Role;
import securitymodels.SecuritymodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.impl.AuthImpl#getTextual <em>Textual</em>}</li>
 *   <li>{@link securitymodels.impl.AuthImpl#getOclExp <em>Ocl Exp</em>}</li>
 *   <li>{@link securitymodels.impl.AuthImpl#getSqlStm <em>Sql Stm</em>}</li>
 *   <li>{@link securitymodels.impl.AuthImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthImpl extends MinimalEObjectImpl.Container implements Auth {
	/**
	 * The default value of the '{@link #getTextual() <em>Textual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextual()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextual() <em>Textual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextual()
	 * @generated
	 * @ordered
	 */
	protected String textual = TEXTUAL_EDEFAULT;

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
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

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
	public String getTextual() {
		return textual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextual(String newTextual) {
		String oldTextual = textual;
		textual = newTextual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritymodelsPackage.AUTH__TEXTUAL, oldTextual, textual));
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
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<Role>(Role.class, this, SecuritymodelsPackage.AUTH__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuritymodelsPackage.AUTH__TEXTUAL:
				return getTextual();
			case SecuritymodelsPackage.AUTH__OCL_EXP:
				return getOclExp();
			case SecuritymodelsPackage.AUTH__SQL_STM:
				return getSqlStm();
			case SecuritymodelsPackage.AUTH__ROLES:
				return getRoles();
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
			case SecuritymodelsPackage.AUTH__TEXTUAL:
				setTextual((String)newValue);
				return;
			case SecuritymodelsPackage.AUTH__OCL_EXP:
				setOclExp((String)newValue);
				return;
			case SecuritymodelsPackage.AUTH__SQL_STM:
				setSqlStm((String)newValue);
				return;
			case SecuritymodelsPackage.AUTH__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case SecuritymodelsPackage.AUTH__TEXTUAL:
				setTextual(TEXTUAL_EDEFAULT);
				return;
			case SecuritymodelsPackage.AUTH__OCL_EXP:
				setOclExp(OCL_EXP_EDEFAULT);
				return;
			case SecuritymodelsPackage.AUTH__SQL_STM:
				setSqlStm(SQL_STM_EDEFAULT);
				return;
			case SecuritymodelsPackage.AUTH__ROLES:
				getRoles().clear();
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
			case SecuritymodelsPackage.AUTH__TEXTUAL:
				return TEXTUAL_EDEFAULT == null ? textual != null : !TEXTUAL_EDEFAULT.equals(textual);
			case SecuritymodelsPackage.AUTH__OCL_EXP:
				return OCL_EXP_EDEFAULT == null ? oclExp != null : !OCL_EXP_EDEFAULT.equals(oclExp);
			case SecuritymodelsPackage.AUTH__SQL_STM:
				return SQL_STM_EDEFAULT == null ? sqlStm != null : !SQL_STM_EDEFAULT.equals(sqlStm);
			case SecuritymodelsPackage.AUTH__ROLES:
				return roles != null && !roles.isEmpty();
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
		result.append(" (textual: ");
		result.append(textual);
		result.append(", oclExp: ");
		result.append(oclExp);
		result.append(", sqlStm: ");
		result.append(sqlStm);
		result.append(')');
		return result.toString();
	}

} //AuthImpl
