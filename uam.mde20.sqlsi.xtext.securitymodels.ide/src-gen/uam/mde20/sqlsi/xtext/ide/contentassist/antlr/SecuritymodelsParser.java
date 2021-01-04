/*
 * generated by Xtext 2.15.0
 */
package uam.mde20.sqlsi.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uam.mde20.sqlsi.xtext.ide.contentassist.antlr.internal.InternalSecuritymodelsParser;
import uam.mde20.sqlsi.xtext.services.SecuritymodelsGrammarAccess;

public class SecuritymodelsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SecuritymodelsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SecuritymodelsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getSecurityModelAccess().getGroup(), "rule__SecurityModel__Group__0");
			builder.put(grammarAccess.getSecurityModelAccess().getGroup_2(), "rule__SecurityModel__Group_2__0");
			builder.put(grammarAccess.getSecurityModelAccess().getGroup_2_2(), "rule__SecurityModel__Group_2_2__0");
			builder.put(grammarAccess.getSecurityModelAccess().getGroup_6(), "rule__SecurityModel__Group_6__0");
			builder.put(grammarAccess.getSecurityModelAccess().getGroup_8(), "rule__SecurityModel__Group_8__0");
			builder.put(grammarAccess.getSecurityModelAccess().getGroup_8_3(), "rule__SecurityModel__Group_8_3__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_7(), "rule__Rule__Group_7__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_12(), "rule__Rule__Group_12__0");
			builder.put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
			builder.put(grammarAccess.getProtectedResourceAccess().getGroup(), "rule__ProtectedResource__Group__0");
			builder.put(grammarAccess.getAuthAccess().getGroup(), "rule__Auth__Group__0");
			builder.put(grammarAccess.getAuthAccess().getGroup_3(), "rule__Auth__Group_3__0");
			builder.put(grammarAccess.getSecurityModelAccess().getNameAssignment_1(), "rule__SecurityModel__NameAssignment_1");
			builder.put(grammarAccess.getSecurityModelAccess().getResourcesAssignment_2_1(), "rule__SecurityModel__ResourcesAssignment_2_1");
			builder.put(grammarAccess.getSecurityModelAccess().getResourcesAssignment_2_2_1(), "rule__SecurityModel__ResourcesAssignment_2_2_1");
			builder.put(grammarAccess.getSecurityModelAccess().getRolesAssignment_5(), "rule__SecurityModel__RolesAssignment_5");
			builder.put(grammarAccess.getSecurityModelAccess().getRolesAssignment_6_1(), "rule__SecurityModel__RolesAssignment_6_1");
			builder.put(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_2(), "rule__SecurityModel__RulesAssignment_8_2");
			builder.put(grammarAccess.getSecurityModelAccess().getRulesAssignment_8_3_1(), "rule__SecurityModel__RulesAssignment_8_3_1");
			builder.put(grammarAccess.getRuleAccess().getNameAssignment_1(), "rule__Rule__NameAssignment_1");
			builder.put(grammarAccess.getRuleAccess().getActionAssignment_4(), "rule__Rule__ActionAssignment_4");
			builder.put(grammarAccess.getRuleAccess().getProtectedResourcesAssignment_6(), "rule__Rule__ProtectedResourcesAssignment_6");
			builder.put(grammarAccess.getRuleAccess().getProtectedResourcesAssignment_7_1(), "rule__Rule__ProtectedResourcesAssignment_7_1");
			builder.put(grammarAccess.getRuleAccess().getAuthsAssignment_11(), "rule__Rule__AuthsAssignment_11");
			builder.put(grammarAccess.getRuleAccess().getAuthsAssignment_12_1(), "rule__Rule__AuthsAssignment_12_1");
			builder.put(grammarAccess.getRoleAccess().getNameAssignment_0(), "rule__Role__NameAssignment_0");
			builder.put(grammarAccess.getRoleAccess().getUserEntityAssignment_2(), "rule__Role__UserEntityAssignment_2");
			builder.put(grammarAccess.getProtectedResourceAccess().getPropertyAssignment_0(), "rule__ProtectedResource__PropertyAssignment_0");
			builder.put(grammarAccess.getProtectedResourceAccess().getNameAssignment_2(), "rule__ProtectedResource__NameAssignment_2");
			builder.put(grammarAccess.getAuthAccess().getRolesAssignment_2(), "rule__Auth__RolesAssignment_2");
			builder.put(grammarAccess.getAuthAccess().getRolesAssignment_3_1(), "rule__Auth__RolesAssignment_3_1");
			builder.put(grammarAccess.getAuthAccess().getTextualAssignment_8(), "rule__Auth__TextualAssignment_8");
			builder.put(grammarAccess.getAuthAccess().getOclExpAssignment_10(), "rule__Auth__OclExpAssignment_10");
			builder.put(grammarAccess.getAuthAccess().getSqlStmAssignment_12(), "rule__Auth__SqlStmAssignment_12");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SecuritymodelsGrammarAccess grammarAccess;

	@Override
	protected InternalSecuritymodelsParser createParser() {
		InternalSecuritymodelsParser result = new InternalSecuritymodelsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SecuritymodelsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SecuritymodelsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}