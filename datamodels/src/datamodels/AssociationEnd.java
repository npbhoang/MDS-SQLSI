/**
 */
package datamodels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datamodels.AssociationEnd#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link datamodels.AssociationEnd#getAssociationName <em>Association Name</em>}</li>
 *   <li>{@link datamodels.AssociationEnd#getOtherEnd <em>Other End</em>}</li>
 *   <li>{@link datamodels.AssociationEnd#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @see datamodels.DatamodelsPackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends Property {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link datamodels.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see datamodels.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see datamodels.DatamodelsPackage#getAssociationEnd_Multiplicity()
	 * @model required="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link datamodels.AssociationEnd#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see datamodels.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Association Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Name</em>' attribute.
	 * @see #setAssociationName(String)
	 * @see datamodels.DatamodelsPackage#getAssociationEnd_AssociationName()
	 * @model required="true"
	 * @generated
	 */
	String getAssociationName();

	/**
	 * Sets the value of the '{@link datamodels.AssociationEnd#getAssociationName <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Name</em>' attribute.
	 * @see #getAssociationName()
	 * @generated
	 */
	void setAssociationName(String value);

	/**
	 * Returns the value of the '<em><b>Other End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other End</em>' reference.
	 * @see #setOtherEnd(AssociationEnd)
	 * @see datamodels.DatamodelsPackage#getAssociationEnd_OtherEnd()
	 * @model required="true"
	 * @generated
	 */
	AssociationEnd getOtherEnd();

	/**
	 * Sets the value of the '{@link datamodels.AssociationEnd#getOtherEnd <em>Other End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other End</em>' reference.
	 * @see #getOtherEnd()
	 * @generated
	 */
	void setOtherEnd(AssociationEnd value);

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see #setTargetEntity(Entity)
	 * @see datamodels.DatamodelsPackage#getAssociationEnd_TargetEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Sets the value of the '{@link datamodels.AssociationEnd#getTargetEntity <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' reference.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(Entity value);

} // AssociationEnd
