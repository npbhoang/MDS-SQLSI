/**
 */
package securitymodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.Role#getName <em>Name</em>}</li>
 *   <li>{@link securitymodels.Role#getUserEntity <em>User Entity</em>}</li>
 * </ul>
 *
 * @see securitymodels.SecuritymodelsPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see securitymodels.SecuritymodelsPackage#getRole_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link securitymodels.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Entity</em>' attribute.
	 * @see #setUserEntity(String)
	 * @see securitymodels.SecuritymodelsPackage#getRole_UserEntity()
	 * @model required="true"
	 * @generated
	 */
	String getUserEntity();

	/**
	 * Sets the value of the '{@link securitymodels.Role#getUserEntity <em>User Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Entity</em>' attribute.
	 * @see #getUserEntity()
	 * @generated
	 */
	void setUserEntity(String value);

} // Role
