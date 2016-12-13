/*
 * generated by Xtext 2.10.0
 */
package org.smalluml.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.smalluml.ide.contentassist.antlr.internal.InternalSmallUmlParser;
import org.smalluml.services.SmallUmlGrammarAccess;

public class SmallUmlParser extends AbstractContentAssistParser {

	@Inject
	private SmallUmlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSmallUmlParser createParser() {
		InternalSmallUmlParser result = new InternalSmallUmlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new SmallUmlTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getClassAccess().getAlternatives_6(), "rule__Class__Alternatives_6");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_3(), "rule__Class__Group_3__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_4(), "rule__Method__Group_4__0");
					put(grammarAccess.getMethodAccess().getGroup_4_1(), "rule__Method__Group_4_1__0");
					put(grammarAccess.getMethodAccess().getGroup_6(), "rule__Method__Group_6__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getCompositionAccess().getGroup(), "rule__Composition__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getRoleAccess().getGroup_4(), "rule__Role__Group_4__0");
					put(grammarAccess.getString0Access().getGroup(), "rule__String0__Group__0");
					put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
					put(grammarAccess.getBoolAccess().getGroup(), "rule__Bool__Group__0");
					put(grammarAccess.getRealAccess().getGroup(), "rule__Real__Group__0");
					put(grammarAccess.getUnlimitedNaturalAccess().getGroup(), "rule__UnlimitedNatural__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_5(), "rule__Enumeration__Group_5__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getPackageAccess().getNameAssignment_2(), "rule__Package__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getMemberAssignment_4(), "rule__Package__MemberAssignment_4");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getSuperAssignment_3_1(), "rule__Class__SuperAssignment_3_1");
					put(grammarAccess.getClassAccess().getMethodAssignment_6_0(), "rule__Class__MethodAssignment_6_0");
					put(grammarAccess.getClassAccess().getAttributeAssignment_6_1(), "rule__Class__AttributeAssignment_6_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
					put(grammarAccess.getMethodAccess().getNameAssignment_2(), "rule__Method__NameAssignment_2");
					put(grammarAccess.getMethodAccess().getParameterAssignment_4_0(), "rule__Method__ParameterAssignment_4_0");
					put(grammarAccess.getMethodAccess().getParameterAssignment_4_1_1(), "rule__Method__ParameterAssignment_4_1_1");
					put(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1(), "rule__Method__ReturnTypeAssignment_6_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
					put(grammarAccess.getCompositionAccess().getNameAssignment_0(), "rule__Composition__NameAssignment_0");
					put(grammarAccess.getCompositionAccess().getSourceAssignment_2(), "rule__Composition__SourceAssignment_2");
					put(grammarAccess.getCompositionAccess().getTargetAssignment_4(), "rule__Composition__TargetAssignment_4");
					put(grammarAccess.getReferenceAccess().getNameAssignment_0(), "rule__Reference__NameAssignment_0");
					put(grammarAccess.getReferenceAccess().getSourceAssignment_2(), "rule__Reference__SourceAssignment_2");
					put(grammarAccess.getReferenceAccess().getTargetAssignment_4(), "rule__Reference__TargetAssignment_4");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getClassAssignment_3(), "rule__Role__ClassAssignment_3");
					put(grammarAccess.getRoleAccess().getLowerBoundAssignment_4_2(), "rule__Role__LowerBoundAssignment_4_2");
					put(grammarAccess.getRoleAccess().getUpperBoundAssignment_4_4(), "rule__Role__UpperBoundAssignment_4_4");
					put(grammarAccess.getEnumerationAccess().getValueAssignment_4(), "rule__Enumeration__ValueAssignment_4");
					put(grammarAccess.getEnumerationAccess().getValueAssignment_5_1(), "rule__Enumeration__ValueAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSmallUmlParser typedParser = (InternalSmallUmlParser) parser;
			typedParser.entryRulePackage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmallUmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmallUmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
