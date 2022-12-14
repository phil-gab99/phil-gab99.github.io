/*
 * generated by Xtext 2.28.0
 */
package geodes.sms.modelquerylanguage.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import geodes.sms.modelquerylanguage.ide.contentassist.antlr.internal.InternalModelQueryLanguageTextualParser;
import geodes.sms.modelquerylanguage.services.ModelQueryLanguageTextualGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ModelQueryLanguageTextualParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ModelQueryLanguageTextualGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ModelQueryLanguageTextualGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getQueryFileAccess().getQueriesAlternatives_1_0_0(), "rule__QueryFile__QueriesAlternatives_1_0_0");
			builder.put(grammarAccess.getQueryFileAccess().getQueriesAlternatives_1_1_1_0(), "rule__QueryFile__QueriesAlternatives_1_1_1_0");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getOperatorAlternatives_0_0(), "rule__ModelQueryHeadParent__OperatorAlternatives_0_0");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getSubjectAlternatives_1_0(), "rule__ModelQueryHeadParent__SubjectAlternatives_1_0");
			builder.put(grammarAccess.getBranchParameterAccess().getAlternatives_0(), "rule__BranchParameter__Alternatives_0");
			builder.put(grammarAccess.getBranchParameterAccess().getAlternatives_1(), "rule__BranchParameter__Alternatives_1");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getOperatorAlternatives_0_0(), "rule__ModelQueryNextFromTo__OperatorAlternatives_0_0");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getSubjectAlternatives_1_0(), "rule__ModelQueryNextFromTo__SubjectAlternatives_1_0");
			builder.put(grammarAccess.getCommitParameterAccess().getAlternatives_0(), "rule__CommitParameter__Alternatives_0");
			builder.put(grammarAccess.getCommitParameterAccess().getAlternatives_1(), "rule__CommitParameter__Alternatives_1");
			builder.put(grammarAccess.getModelQueryModelAccess().getOperatorAlternatives_0_0(), "rule__ModelQueryModel__OperatorAlternatives_0_0");
			builder.put(grammarAccess.getModelParamaterAccess().getAlternatives_0(), "rule__ModelParamater__Alternatives_0");
			builder.put(grammarAccess.getModelParamaterAccess().getAlternatives_1(), "rule__ModelParamater__Alternatives_1");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getOperatorAlternatives_0_0(), "rule__ModelQueryModelContents__OperatorAlternatives_0_0");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getSubjectAlternatives_1_0(), "rule__ModelQueryModelContents__SubjectAlternatives_1_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getQueryFileAccess().getGroup(), "rule__QueryFile__Group__0");
			builder.put(grammarAccess.getQueryFileAccess().getGroup_1(), "rule__QueryFile__Group_1__0");
			builder.put(grammarAccess.getQueryFileAccess().getGroup_1_1(), "rule__QueryFile__Group_1_1__0");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getGroup(), "rule__ModelQueryHeadParent__Group__0");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getGroup_2(), "rule__ModelQueryHeadParent__Group_2__0");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getGroup_2_2(), "rule__ModelQueryHeadParent__Group_2_2__0");
			builder.put(grammarAccess.getBranchParameterAccess().getGroup(), "rule__BranchParameter__Group__0");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getGroup(), "rule__ModelQueryNextFromTo__Group__0");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getGroup_2(), "rule__ModelQueryNextFromTo__Group_2__0");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getGroup_2_2(), "rule__ModelQueryNextFromTo__Group_2_2__0");
			builder.put(grammarAccess.getCommitParameterAccess().getGroup(), "rule__CommitParameter__Group__0");
			builder.put(grammarAccess.getModelQueryModelAccess().getGroup(), "rule__ModelQueryModel__Group__0");
			builder.put(grammarAccess.getModelQueryModelAccess().getGroup_2(), "rule__ModelQueryModel__Group_2__0");
			builder.put(grammarAccess.getModelQueryModelAccess().getGroup_2_2(), "rule__ModelQueryModel__Group_2_2__0");
			builder.put(grammarAccess.getModelParamaterAccess().getGroup(), "rule__ModelParamater__Group__0");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getGroup(), "rule__ModelQueryModelContents__Group__0");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getGroup_2(), "rule__ModelQueryModelContents__Group_2__0");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getGroup_2_2(), "rule__ModelQueryModelContents__Group_2_2__0");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getGroup_3(), "rule__ModelQueryModelContents__Group_3__0");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getGroup_3_2(), "rule__ModelQueryModelContents__Group_3_2__0");
			builder.put(grammarAccess.getPropertiesAccess().getGroup(), "rule__Properties__Group__0");
			builder.put(grammarAccess.getPropertiesAccess().getGroup_1(), "rule__Properties__Group_1__0");
			builder.put(grammarAccess.getQueryFileAccess().getQueriesAssignment_1_0(), "rule__QueryFile__QueriesAssignment_1_0");
			builder.put(grammarAccess.getQueryFileAccess().getQueriesAssignment_1_1_1(), "rule__QueryFile__QueriesAssignment_1_1_1");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getOperatorAssignment_0(), "rule__ModelQueryHeadParent__OperatorAssignment_0");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getSubjectAssignment_1(), "rule__ModelQueryHeadParent__SubjectAssignment_1");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getContainerParametersAssignment_2_1(), "rule__ModelQueryHeadParent__ContainerParametersAssignment_2_1");
			builder.put(grammarAccess.getModelQueryHeadParentAccess().getContainerParametersAssignment_2_2_1(), "rule__ModelQueryHeadParent__ContainerParametersAssignment_2_2_1");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getOperatorAssignment_0(), "rule__ModelQueryNextFromTo__OperatorAssignment_0");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getSubjectAssignment_1(), "rule__ModelQueryNextFromTo__SubjectAssignment_1");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getContainerParametersAssignment_2_1(), "rule__ModelQueryNextFromTo__ContainerParametersAssignment_2_1");
			builder.put(grammarAccess.getModelQueryNextFromToAccess().getContainerParametersAssignment_2_2_1(), "rule__ModelQueryNextFromTo__ContainerParametersAssignment_2_2_1");
			builder.put(grammarAccess.getModelQueryModelAccess().getOperatorAssignment_0(), "rule__ModelQueryModel__OperatorAssignment_0");
			builder.put(grammarAccess.getModelQueryModelAccess().getSubjectAssignment_1(), "rule__ModelQueryModel__SubjectAssignment_1");
			builder.put(grammarAccess.getModelQueryModelAccess().getContainerParametersAssignment_2_1(), "rule__ModelQueryModel__ContainerParametersAssignment_2_1");
			builder.put(grammarAccess.getModelQueryModelAccess().getContainerParametersAssignment_2_2_1(), "rule__ModelQueryModel__ContainerParametersAssignment_2_2_1");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getOperatorAssignment_0(), "rule__ModelQueryModelContents__OperatorAssignment_0");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getSubjectAssignment_1(), "rule__ModelQueryModelContents__SubjectAssignment_1");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getContainerParametersAssignment_2_1(), "rule__ModelQueryModelContents__ContainerParametersAssignment_2_1");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getContainerParametersAssignment_2_2_1(), "rule__ModelQueryModelContents__ContainerParametersAssignment_2_2_1");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getDiffParametersAssignment_3_1(), "rule__ModelQueryModelContents__DiffParametersAssignment_3_1");
			builder.put(grammarAccess.getModelQueryModelContentsAccess().getDiffParametersAssignment_3_2_1(), "rule__ModelQueryModelContents__DiffParametersAssignment_3_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ModelQueryLanguageTextualGrammarAccess grammarAccess;

	@Override
	protected InternalModelQueryLanguageTextualParser createParser() {
		InternalModelQueryLanguageTextualParser result = new InternalModelQueryLanguageTextualParser(null);
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

	public ModelQueryLanguageTextualGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ModelQueryLanguageTextualGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
