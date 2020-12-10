/*
 * generated by Xtext 2.15.0
 */
package xtext.securitymodels.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xtext.securitymodels.ide.contentassist.antlr.internal.InternalSecurityModelParser;
import xtext.securitymodels.services.SecurityModelGrammarAccess;

public class SecurityModelParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SecurityModelGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SecurityModelGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getSecurityModelAccess().getGroup(), "rule__SecurityModel__Group__0");
			builder.put(grammarAccess.getSecurityModelAccess().getGroup_5(), "rule__SecurityModel__Group_5__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_5(), "rule__Rule__Group_5__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_8(), "rule__Rule__Group_8__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_8_2(), "rule__Rule__Group_8_2__0");
			builder.put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
			builder.put(grammarAccess.getAuthAccess().getGroup(), "rule__Auth__Group__0");
			builder.put(grammarAccess.getAuthAccess().getGroup_4(), "rule__Auth__Group_4__0");
			builder.put(grammarAccess.getSecurityModelAccess().getNameAssignment_2(), "rule__SecurityModel__NameAssignment_2");
			builder.put(grammarAccess.getSecurityModelAccess().getRolesAssignment_4(), "rule__SecurityModel__RolesAssignment_4");
			builder.put(grammarAccess.getSecurityModelAccess().getRulesAssignment_5_1(), "rule__SecurityModel__RulesAssignment_5_1");
			builder.put(grammarAccess.getRuleAccess().getNameAssignment_0(), "rule__Rule__NameAssignment_0");
			builder.put(grammarAccess.getRuleAccess().getActionAssignment_2(), "rule__Rule__ActionAssignment_2");
			builder.put(grammarAccess.getRuleAccess().getResourcesAssignment_4(), "rule__Rule__ResourcesAssignment_4");
			builder.put(grammarAccess.getRuleAccess().getResourcesAssignment_5_1(), "rule__Rule__ResourcesAssignment_5_1");
			builder.put(grammarAccess.getRuleAccess().getAuthsAssignment_8_1(), "rule__Rule__AuthsAssignment_8_1");
			builder.put(grammarAccess.getRuleAccess().getAuthsAssignment_8_2_1(), "rule__Rule__AuthsAssignment_8_2_1");
			builder.put(grammarAccess.getRoleAccess().getNameAssignment_0(), "rule__Role__NameAssignment_0");
			builder.put(grammarAccess.getRoleAccess().getEntityAssignment_2(), "rule__Role__EntityAssignment_2");
			builder.put(grammarAccess.getAuthAccess().getRolesAssignment_3(), "rule__Auth__RolesAssignment_3");
			builder.put(grammarAccess.getAuthAccess().getRolesAssignment_4_1(), "rule__Auth__RolesAssignment_4_1");
			builder.put(grammarAccess.getAuthAccess().getTextualAssignment_7(), "rule__Auth__TextualAssignment_7");
			builder.put(grammarAccess.getAuthAccess().getOclExpAssignment_9(), "rule__Auth__OclExpAssignment_9");
			builder.put(grammarAccess.getAuthAccess().getSqlStmAssignment_11(), "rule__Auth__SqlStmAssignment_11");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SecurityModelGrammarAccess grammarAccess;

	@Override
	protected InternalSecurityModelParser createParser() {
		InternalSecurityModelParser result = new InternalSecurityModelParser(null);
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

	public SecurityModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SecurityModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
