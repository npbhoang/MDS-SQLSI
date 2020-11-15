/**
 */
package datamodels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datamodels.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link datamodels.Attribute#isIsID <em>Is ID</em>}</li>
 * </ul>
 *
 * @see datamodels.DatamodelsPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Property {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link datamodels.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see datamodels.DataType
	 * @see #setType(DataType)
	 * @see datamodels.DatamodelsPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link datamodels.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see datamodels.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Is ID</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ID</em>' attribute.
	 * @see #setIsID(boolean)
	 * @see datamodels.DatamodelsPackage#getAttribute_IsID()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsID();

	/**
	 * Sets the value of the '{@link datamodels.Attribute#isIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #isIsID()
	 * @generated
	 */
	void setIsID(boolean value);

} // Attribute
