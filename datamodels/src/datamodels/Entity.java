/**
 */
package datamodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datamodels.Entity#getName <em>Name</em>}</li>
 *   <li>{@link datamodels.Entity#getProperties <em>Properties</em>}</li>
 *   <li>{@link datamodels.Entity#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link datamodels.Entity#isIsUserClass <em>Is User Class</em>}</li>
 * </ul>
 *
 * @see datamodels.DatamodelsPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see datamodels.DatamodelsPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link datamodels.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link datamodels.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see datamodels.DatamodelsPackage#getEntity_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Super Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Entity</em>' reference.
	 * @see #setSuperEntity(Entity)
	 * @see datamodels.DatamodelsPackage#getEntity_SuperEntity()
	 * @model
	 * @generated
	 */
	Entity getSuperEntity();

	/**
	 * Sets the value of the '{@link datamodels.Entity#getSuperEntity <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Entity</em>' reference.
	 * @see #getSuperEntity()
	 * @generated
	 */
	void setSuperEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Is User Class</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is User Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is User Class</em>' attribute.
	 * @see #setIsUserClass(boolean)
	 * @see datamodels.DatamodelsPackage#getEntity_IsUserClass()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsUserClass();

	/**
	 * Sets the value of the '{@link datamodels.Entity#isIsUserClass <em>Is User Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is User Class</em>' attribute.
	 * @see #isIsUserClass()
	 * @generated
	 */
	void setIsUserClass(boolean value);

} // Entity
