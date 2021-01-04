/**
 */
package securitymodels;

import datamodels.DataModel;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.SecurityModel#getRules <em>Rules</em>}</li>
 *   <li>{@link securitymodels.SecurityModel#getRoles <em>Roles</em>}</li>
 *   <li>{@link securitymodels.SecurityModel#getResources <em>Resources</em>}</li>
 *   <li>{@link securitymodels.SecurityModel#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see securitymodels.SecuritymodelsPackage#getSecurityModel()
 * @model
 * @generated
 */
public interface SecurityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link securitymodels.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see securitymodels.SecuritymodelsPackage#getSecurityModel_Rules()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link securitymodels.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see securitymodels.SecuritymodelsPackage#getSecurityModel_Roles()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link securitymodels.ProtectedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see securitymodels.SecuritymodelsPackage#getSecurityModel_Resources()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ProtectedResource> getResources();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DataModel)
	 * @see securitymodels.SecuritymodelsPackage#getSecurityModel_Source()
	 * @model required="true"
	 * @generated
	 */
	DataModel getSource();

	/**
	 * Sets the value of the '{@link securitymodels.SecurityModel#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataModel value);

} // SecurityModel
