/**
 */
package securitymodels;

import datamodels.Property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link securitymodels.Rule#getResources <em>Resources</em>}</li>
 *   <li>{@link securitymodels.Rule#getName <em>Name</em>}</li>
 *   <li>{@link securitymodels.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link securitymodels.Rule#getAuths <em>Auths</em>}</li>
 * </ul>
 *
 * @see securitymodels.SecuritymodelsPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
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
	 * @see securitymodels.SecuritymodelsPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link securitymodels.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link securitymodels.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see securitymodels.Action
	 * @see #setAction(Action)
	 * @see securitymodels.SecuritymodelsPackage#getRule_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link securitymodels.Rule#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see securitymodels.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Auths</b></em>' containment reference list.
	 * The list contents are of type {@link securitymodels.Auth}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auths</em>' containment reference list.
	 * @see securitymodels.SecuritymodelsPackage#getRule_Auths()
	 * @model containment="true"
	 * @generated
	 */
	EList<Auth> getAuths();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link datamodels.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see securitymodels.SecuritymodelsPackage#getRule_Resources()
	 * @model required="true"
	 * @generated
	 */
	EList<Property> getResources();

} // Rule
