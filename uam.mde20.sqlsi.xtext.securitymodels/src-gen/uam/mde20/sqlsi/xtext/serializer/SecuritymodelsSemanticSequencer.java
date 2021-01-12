/*
 * generated by Xtext 2.15.0
 */
package uam.mde20.sqlsi.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import securitymodels.Auth;
import securitymodels.ProtectedResource;
import securitymodels.Role;
import securitymodels.Rule;
import securitymodels.SecurityModel;
import securitymodels.SecuritymodelsPackage;
import uam.mde20.sqlsi.xtext.services.SecuritymodelsGrammarAccess;

@SuppressWarnings("all")
public class SecuritymodelsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SecuritymodelsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SecuritymodelsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SecuritymodelsPackage.AUTH:
				sequence_Auth(context, (Auth) semanticObject); 
				return; 
			case SecuritymodelsPackage.PROTECTED_RESOURCE:
				sequence_ProtectedResource(context, (ProtectedResource) semanticObject); 
				return; 
			case SecuritymodelsPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case SecuritymodelsPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case SecuritymodelsPackage.SECURITY_MODEL:
				sequence_SecurityModel(context, (SecurityModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Auth returns Auth
	 *
	 * Constraint:
	 *     (roles+=[Role|EString] roles+=[Role|EString]* textual=EString oclExp=EString sqlStm=EString)
	 */
	protected void sequence_Auth(ISerializationContext context, Auth semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtectedResource returns ProtectedResource
	 *
	 * Constraint:
	 *     (property=[Property|EString] name=EString)
	 */
	protected void sequence_ProtectedResource(ISerializationContext context, ProtectedResource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecuritymodelsPackage.Literals.PROTECTED_RESOURCE__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecuritymodelsPackage.Literals.PROTECTED_RESOURCE__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, SecuritymodelsPackage.Literals.PROTECTED_RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecuritymodelsPackage.Literals.PROTECTED_RESOURCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProtectedResourceAccess().getPropertyPropertyEStringParserRuleCall_0_0_1(), semanticObject.eGet(SecuritymodelsPackage.Literals.PROTECTED_RESOURCE__PROPERTY, false));
		feeder.accept(grammarAccess.getProtectedResourceAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=EString userEntity=EString)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecuritymodelsPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecuritymodelsPackage.Literals.ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, SecuritymodelsPackage.Literals.ROLE__USER_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecuritymodelsPackage.Literals.ROLE__USER_ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleAccess().getUserEntityEStringParserRuleCall_2_0(), semanticObject.getUserEntity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         action=Action 
	 *         protectedResources+=[ProtectedResource|EString] 
	 *         protectedResources+=[ProtectedResource|EString]* 
	 *         auths+=Auth 
	 *         auths+=Auth*
	 *     )
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SecurityModel returns SecurityModel
	 *
	 * Constraint:
	 *     (name=EString (resources+=ProtectedResource resources+=ProtectedResource*)? roles+=Role roles+=Role* (rules+=Rule rules+=Rule*)?)
	 */
	protected void sequence_SecurityModel(ISerializationContext context, SecurityModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
