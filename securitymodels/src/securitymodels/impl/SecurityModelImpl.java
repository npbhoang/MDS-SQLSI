/**
 */
package securitymodels.impl;

import datamodels.DataModel;
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
import securitymodels.ProtectedResource;
import securitymodels.Role;
import securitymodels.Rule;
import securitymodels.SecurityModel;
import securitymodels.SecuritymodelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.impl.SecurityModelImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link securitymodels.impl.SecurityModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link securitymodels.impl.SecurityModelImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link securitymodels.impl.SecurityModelImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityModelImpl extends MinimalEObjectImpl.Container implements SecurityModel {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectedResource> resources;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DataModel source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritymodelsPackage.Literals.SECURITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList.Resolving<Rule>(Rule.class, this, SecuritymodelsPackage.SECURITY_MODEL__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList.Resolving<Role>(Role.class, this, SecuritymodelsPackage.SECURITY_MODEL__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectedResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList.Resolving<ProtectedResource>(ProtectedResource.class, this, SecuritymodelsPackage.SECURITY_MODEL__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (DataModel)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecuritymodelsPackage.SECURITY_MODEL__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DataModel newSource) {
		DataModel oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritymodelsPackage.SECURITY_MODEL__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecuritymodelsPackage.SECURITY_MODEL__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case SecuritymodelsPackage.SECURITY_MODEL__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case SecuritymodelsPackage.SECURITY_MODEL__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case SecuritymodelsPackage.SECURITY_MODEL__RULES:
				return getRules();
			case SecuritymodelsPackage.SECURITY_MODEL__ROLES:
				return getRoles();
			case SecuritymodelsPackage.SECURITY_MODEL__RESOURCES:
				return getResources();
			case SecuritymodelsPackage.SECURITY_MODEL__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case SecuritymodelsPackage.SECURITY_MODEL__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case SecuritymodelsPackage.SECURITY_MODEL__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case SecuritymodelsPackage.SECURITY_MODEL__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ProtectedResource>)newValue);
				return;
			case SecuritymodelsPackage.SECURITY_MODEL__SOURCE:
				setSource((DataModel)newValue);
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
			case SecuritymodelsPackage.SECURITY_MODEL__RULES:
				getRules().clear();
				return;
			case SecuritymodelsPackage.SECURITY_MODEL__ROLES:
				getRoles().clear();
				return;
			case SecuritymodelsPackage.SECURITY_MODEL__RESOURCES:
				getResources().clear();
				return;
			case SecuritymodelsPackage.SECURITY_MODEL__SOURCE:
				setSource((DataModel)null);
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
			case SecuritymodelsPackage.SECURITY_MODEL__RULES:
				return rules != null && !rules.isEmpty();
			case SecuritymodelsPackage.SECURITY_MODEL__ROLES:
				return roles != null && !roles.isEmpty();
			case SecuritymodelsPackage.SECURITY_MODEL__RESOURCES:
				return resources != null && !resources.isEmpty();
			case SecuritymodelsPackage.SECURITY_MODEL__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityModelImpl
