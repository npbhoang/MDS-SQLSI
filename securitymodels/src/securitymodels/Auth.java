/**
 */
package securitymodels;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.Auth#getTextual <em>Textual</em>}</li>
 *   <li>{@link securitymodels.Auth#getOclExp <em>Ocl Exp</em>}</li>
 *   <li>{@link securitymodels.Auth#getSqlStm <em>Sql Stm</em>}</li>
 *   <li>{@link securitymodels.Auth#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see securitymodels.SecuritymodelsPackage#getAuth()
 * @model
 * @generated
 */
public interface Auth extends EObject {
	/**
	 * Returns the value of the '<em><b>Textual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textual</em>' attribute.
	 * @see #setTextual(String)
	 * @see securitymodels.SecuritymodelsPackage#getAuth_Textual()
	 * @model required="true"
	 * @generated
	 */
	String getTextual();

	/**
	 * Sets the value of the '{@link securitymodels.Auth#getTextual <em>Textual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textual</em>' attribute.
	 * @see #getTextual()
	 * @generated
	 */
	void setTextual(String value);

	/**
	 * Returns the value of the '<em><b>Ocl Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Exp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Exp</em>' attribute.
	 * @see #setOclExp(String)
	 * @see securitymodels.SecuritymodelsPackage#getAuth_OclExp()
	 * @model required="true"
	 * @generated
	 */
	String getOclExp();

	/**
	 * Sets the value of the '{@link securitymodels.Auth#getOclExp <em>Ocl Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Exp</em>' attribute.
	 * @see #getOclExp()
	 * @generated
	 */
	void setOclExp(String value);

	/**
	 * Returns the value of the '<em><b>Sql Stm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Stm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Stm</em>' attribute.
	 * @see #setSqlStm(String)
	 * @see securitymodels.SecuritymodelsPackage#getAuth_SqlStm()
	 * @model required="true"
	 * @generated
	 */
	String getSqlStm();

	/**
	 * Sets the value of the '{@link securitymodels.Auth#getSqlStm <em>Sql Stm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Stm</em>' attribute.
	 * @see #getSqlStm()
	 * @generated
	 */
	void setSqlStm(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link securitymodels.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see securitymodels.SecuritymodelsPackage#getAuth_Roles()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Auth
