/**
 */
package securitymodels;

import datamodels.Property;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protected Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.ProtectedResource#getResources <em>Resources</em>}</li>
 *   <li>{@link securitymodels.ProtectedResource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see securitymodels.SecuritymodelsPackage#getProtectedResource()
 * @model
 * @generated
 */
public interface ProtectedResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference.
	 * @see #setResources(Property)
	 * @see securitymodels.SecuritymodelsPackage#getProtectedResource_Resources()
	 * @model required="true"
	 * @generated
	 */
	Property getResources();

	/**
	 * Sets the value of the '{@link securitymodels.ProtectedResource#getResources <em>Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(Property value);

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
	 * @see securitymodels.SecuritymodelsPackage#getProtectedResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link securitymodels.ProtectedResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ProtectedResource
