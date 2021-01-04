/**
 */
package securitymodels;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see securitymodels.SecuritymodelsFactory
 * @model kind="package"
 * @generated
 */
public interface SecuritymodelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "securitymodels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/final/metamodel/securitymodels.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "securitymodels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecuritymodelsPackage eINSTANCE = securitymodels.impl.SecuritymodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link securitymodels.impl.SecurityModelImpl <em>Security Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see securitymodels.impl.SecurityModelImpl
	 * @see securitymodels.impl.SecuritymodelsPackageImpl#getSecurityModel()
	 * @generated
	 */
	int SECURITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__RULES = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Security Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Security Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link securitymodels.impl.AuthImpl <em>Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see securitymodels.impl.AuthImpl
	 * @see securitymodels.impl.SecuritymodelsPackageImpl#getAuth()
	 * @generated
	 */
	int AUTH = 1;

	/**
	 * The feature id for the '<em><b>Textual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH__TEXTUAL = 0;

	/**
	 * The feature id for the '<em><b>Ocl Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH__OCL_EXP = 1;

	/**
	 * The feature id for the '<em><b>Sql Stm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH__SQL_STM = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH__ROLES = 3;

	/**
	 * The number of structural features of the '<em>Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link securitymodels.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see securitymodels.impl.RuleImpl
	 * @see securitymodels.impl.SecuritymodelsPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Auths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__AUTHS = 2;

	/**
	 * The feature id for the '<em><b>Protected Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PROTECTED_RESOURCES = 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link securitymodels.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see securitymodels.impl.RoleImpl
	 * @see securitymodels.impl.SecuritymodelsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>User Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__USER_ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link securitymodels.impl.ProtectedResourceImpl <em>Protected Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see securitymodels.impl.ProtectedResourceImpl
	 * @see securitymodels.impl.SecuritymodelsPackageImpl#getProtectedResource()
	 * @generated
	 */
	int PROTECTED_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_RESOURCE__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Protected Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Protected Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link securitymodels.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see securitymodels.Action
	 * @see securitymodels.impl.SecuritymodelsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;


	/**
	 * Returns the meta object for class '{@link securitymodels.SecurityModel <em>Security Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Model</em>'.
	 * @see securitymodels.SecurityModel
	 * @generated
	 */
	EClass getSecurityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link securitymodels.SecurityModel#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see securitymodels.SecurityModel#getRules()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link securitymodels.SecurityModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see securitymodels.SecurityModel#getRoles()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link securitymodels.SecurityModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see securitymodels.SecurityModel#getResources()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Resources();

	/**
	 * Returns the meta object for the reference '{@link securitymodels.SecurityModel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see securitymodels.SecurityModel#getSource()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Source();

	/**
	 * Returns the meta object for class '{@link securitymodels.Auth <em>Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auth</em>'.
	 * @see securitymodels.Auth
	 * @generated
	 */
	EClass getAuth();

	/**
	 * Returns the meta object for the attribute '{@link securitymodels.Auth#getTextual <em>Textual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textual</em>'.
	 * @see securitymodels.Auth#getTextual()
	 * @see #getAuth()
	 * @generated
	 */
	EAttribute getAuth_Textual();

	/**
	 * Returns the meta object for the attribute '{@link securitymodels.Auth#getOclExp <em>Ocl Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Exp</em>'.
	 * @see securitymodels.Auth#getOclExp()
	 * @see #getAuth()
	 * @generated
	 */
	EAttribute getAuth_OclExp();

	/**
	 * Returns the meta object for the attribute '{@link securitymodels.Auth#getSqlStm <em>Sql Stm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Stm</em>'.
	 * @see securitymodels.Auth#getSqlStm()
	 * @see #getAuth()
	 * @generated
	 */
	EAttribute getAuth_SqlStm();

	/**
	 * Returns the meta object for the reference list '{@link securitymodels.Auth#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see securitymodels.Auth#getRoles()
	 * @see #getAuth()
	 * @generated
	 */
	EReference getAuth_Roles();

	/**
	 * Returns the meta object for class '{@link securitymodels.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see securitymodels.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link securitymodels.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see securitymodels.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link securitymodels.Rule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see securitymodels.Rule#getAction()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link securitymodels.Rule#getAuths <em>Auths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auths</em>'.
	 * @see securitymodels.Rule#getAuths()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Auths();

	/**
	 * Returns the meta object for the reference list '{@link securitymodels.Rule#getProtectedResources <em>Protected Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protected Resources</em>'.
	 * @see securitymodels.Rule#getProtectedResources()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ProtectedResources();

	/**
	 * Returns the meta object for class '{@link securitymodels.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see securitymodels.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link securitymodels.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see securitymodels.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link securitymodels.Role#getUserEntity <em>User Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Entity</em>'.
	 * @see securitymodels.Role#getUserEntity()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_UserEntity();

	/**
	 * Returns the meta object for class '{@link securitymodels.ProtectedResource <em>Protected Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protected Resource</em>'.
	 * @see securitymodels.ProtectedResource
	 * @generated
	 */
	EClass getProtectedResource();

	/**
	 * Returns the meta object for the attribute '{@link securitymodels.ProtectedResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see securitymodels.ProtectedResource#getName()
	 * @see #getProtectedResource()
	 * @generated
	 */
	EAttribute getProtectedResource_Name();

	/**
	 * Returns the meta object for the reference '{@link securitymodels.ProtectedResource#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see securitymodels.ProtectedResource#getProperty()
	 * @see #getProtectedResource()
	 * @generated
	 */
	EReference getProtectedResource_Property();

	/**
	 * Returns the meta object for enum '{@link securitymodels.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see securitymodels.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecuritymodelsFactory getSecuritymodelsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link securitymodels.impl.SecurityModelImpl <em>Security Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see securitymodels.impl.SecurityModelImpl
		 * @see securitymodels.impl.SecuritymodelsPackageImpl#getSecurityModel()
		 * @generated
		 */
		EClass SECURITY_MODEL = eINSTANCE.getSecurityModel();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__RULES = eINSTANCE.getSecurityModel_Rules();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__ROLES = eINSTANCE.getSecurityModel_Roles();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__RESOURCES = eINSTANCE.getSecurityModel_Resources();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__SOURCE = eINSTANCE.getSecurityModel_Source();

		/**
		 * The meta object literal for the '{@link securitymodels.impl.AuthImpl <em>Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see securitymodels.impl.AuthImpl
		 * @see securitymodels.impl.SecuritymodelsPackageImpl#getAuth()
		 * @generated
		 */
		EClass AUTH = eINSTANCE.getAuth();

		/**
		 * The meta object literal for the '<em><b>Textual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH__TEXTUAL = eINSTANCE.getAuth_Textual();

		/**
		 * The meta object literal for the '<em><b>Ocl Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH__OCL_EXP = eINSTANCE.getAuth_OclExp();

		/**
		 * The meta object literal for the '<em><b>Sql Stm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH__SQL_STM = eINSTANCE.getAuth_SqlStm();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTH__ROLES = eINSTANCE.getAuth_Roles();

		/**
		 * The meta object literal for the '{@link securitymodels.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see securitymodels.impl.RuleImpl
		 * @see securitymodels.impl.SecuritymodelsPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ACTION = eINSTANCE.getRule_Action();

		/**
		 * The meta object literal for the '<em><b>Auths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__AUTHS = eINSTANCE.getRule_Auths();

		/**
		 * The meta object literal for the '<em><b>Protected Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PROTECTED_RESOURCES = eINSTANCE.getRule_ProtectedResources();

		/**
		 * The meta object literal for the '{@link securitymodels.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see securitymodels.impl.RoleImpl
		 * @see securitymodels.impl.SecuritymodelsPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>User Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__USER_ENTITY = eINSTANCE.getRole_UserEntity();

		/**
		 * The meta object literal for the '{@link securitymodels.impl.ProtectedResourceImpl <em>Protected Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see securitymodels.impl.ProtectedResourceImpl
		 * @see securitymodels.impl.SecuritymodelsPackageImpl#getProtectedResource()
		 * @generated
		 */
		EClass PROTECTED_RESOURCE = eINSTANCE.getProtectedResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTED_RESOURCE__NAME = eINSTANCE.getProtectedResource_Name();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTED_RESOURCE__PROPERTY = eINSTANCE.getProtectedResource_Property();

		/**
		 * The meta object literal for the '{@link securitymodels.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see securitymodels.Action
		 * @see securitymodels.impl.SecuritymodelsPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

	}

} //SecuritymodelsPackage
