/**
 */
package securitymodels.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import securitymodels.Action;
import securitymodels.Auth;
import securitymodels.ProtectedResource;
import securitymodels.Rule;
import securitymodels.SecuritymodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link securitymodels.impl.RuleImpl#getAction <em>Action</em>}</li>
 *   <li>{@link securitymodels.impl.RuleImpl#getAuths <em>Auths</em>}</li>
 *   <li>{@link securitymodels.impl.RuleImpl#getProtectedResources <em>Protected Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.READ;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuths() <em>Auths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuths()
	 * @generated
	 * @ordered
	 */
	protected EList<Auth> auths;

	/**
	 * The cached value of the '{@link #getProtectedResources() <em>Protected Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectedResource> protectedResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritymodelsPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritymodelsPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritymodelsPackage.RULE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Auth> getAuths() {
		if (auths == null) {
			auths = new EObjectContainmentEList<Auth>(Auth.class, this, SecuritymodelsPackage.RULE__AUTHS);
		}
		return auths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectedResource> getProtectedResources() {
		if (protectedResources == null) {
			protectedResources = new EObjectContainmentEList<ProtectedResource>(ProtectedResource.class, this, SecuritymodelsPackage.RULE__PROTECTED_RESOURCES);
		}
		return protectedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecuritymodelsPackage.RULE__AUTHS:
				return ((InternalEList<?>)getAuths()).basicRemove(otherEnd, msgs);
			case SecuritymodelsPackage.RULE__PROTECTED_RESOURCES:
				return ((InternalEList<?>)getProtectedResources()).basicRemove(otherEnd, msgs);
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
			case SecuritymodelsPackage.RULE__NAME:
				return getName();
			case SecuritymodelsPackage.RULE__ACTION:
				return getAction();
			case SecuritymodelsPackage.RULE__AUTHS:
				return getAuths();
			case SecuritymodelsPackage.RULE__PROTECTED_RESOURCES:
				return getProtectedResources();
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
			case SecuritymodelsPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case SecuritymodelsPackage.RULE__ACTION:
				setAction((Action)newValue);
				return;
			case SecuritymodelsPackage.RULE__AUTHS:
				getAuths().clear();
				getAuths().addAll((Collection<? extends Auth>)newValue);
				return;
			case SecuritymodelsPackage.RULE__PROTECTED_RESOURCES:
				getProtectedResources().clear();
				getProtectedResources().addAll((Collection<? extends ProtectedResource>)newValue);
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
			case SecuritymodelsPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecuritymodelsPackage.RULE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case SecuritymodelsPackage.RULE__AUTHS:
				getAuths().clear();
				return;
			case SecuritymodelsPackage.RULE__PROTECTED_RESOURCES:
				getProtectedResources().clear();
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
			case SecuritymodelsPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecuritymodelsPackage.RULE__ACTION:
				return action != ACTION_EDEFAULT;
			case SecuritymodelsPackage.RULE__AUTHS:
				return auths != null && !auths.isEmpty();
			case SecuritymodelsPackage.RULE__PROTECTED_RESOURCES:
				return protectedResources != null && !protectedResources.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
