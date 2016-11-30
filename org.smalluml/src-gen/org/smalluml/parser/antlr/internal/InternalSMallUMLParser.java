package org.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smalluml.services.SMallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Class'", "'{'", "'super'", "'method'", "','", "'}'", "'attribute'", "'role'", "'Method'", "'parameter'", "'returnType'", "'Attribute'", "'type'", "'Role'", "'relation'", "'Parameter'", "'String'", "'Integer'", "'Bool'", "'Real'", "'UnlimitedNatural'", "'Enumeration'", "'value'", "'-'", "'Composition'", "'upperBound'", "'lowerBound'", "'('", "')'", "'Reference'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSMallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSMallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSMallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSMallUML.g"; }



     	private SMallUMLGrammarAccess grammarAccess;

        public InternalSMallUMLParser(TokenStream input, SMallUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Class";
       	}

       	@Override
       	protected SMallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClass"
    // InternalSMallUML.g:64:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSMallUML.g:64:46: (iv_ruleClass= ruleClass EOF )
            // InternalSMallUML.g:65:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSMallUML.g:71:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'method' otherlv_7= '{' ( (lv_method_8_0= ruleMethod ) ) (otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) ) )* otherlv_11= '}' )? (otherlv_12= 'attribute' otherlv_13= '{' ( (lv_attribute_14_0= ruleAttribute ) ) (otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) ) )* otherlv_17= '}' )? (otherlv_18= 'role' otherlv_19= '{' ( (lv_role_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_role_22_0= ruleRole ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_method_8_0 = null;

        EObject lv_method_10_0 = null;

        EObject lv_attribute_14_0 = null;

        EObject lv_attribute_16_0 = null;

        EObject lv_role_20_0 = null;

        EObject lv_role_22_0 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:77:2: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'method' otherlv_7= '{' ( (lv_method_8_0= ruleMethod ) ) (otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) ) )* otherlv_11= '}' )? (otherlv_12= 'attribute' otherlv_13= '{' ( (lv_attribute_14_0= ruleAttribute ) ) (otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) ) )* otherlv_17= '}' )? (otherlv_18= 'role' otherlv_19= '{' ( (lv_role_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_role_22_0= ruleRole ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalSMallUML.g:78:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'method' otherlv_7= '{' ( (lv_method_8_0= ruleMethod ) ) (otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) ) )* otherlv_11= '}' )? (otherlv_12= 'attribute' otherlv_13= '{' ( (lv_attribute_14_0= ruleAttribute ) ) (otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) ) )* otherlv_17= '}' )? (otherlv_18= 'role' otherlv_19= '{' ( (lv_role_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_role_22_0= ruleRole ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalSMallUML.g:78:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'method' otherlv_7= '{' ( (lv_method_8_0= ruleMethod ) ) (otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) ) )* otherlv_11= '}' )? (otherlv_12= 'attribute' otherlv_13= '{' ( (lv_attribute_14_0= ruleAttribute ) ) (otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) ) )* otherlv_17= '}' )? (otherlv_18= 'role' otherlv_19= '{' ( (lv_role_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_role_22_0= ruleRole ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalSMallUML.g:79:3: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'method' otherlv_7= '{' ( (lv_method_8_0= ruleMethod ) ) (otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) ) )* otherlv_11= '}' )? (otherlv_12= 'attribute' otherlv_13= '{' ( (lv_attribute_14_0= ruleAttribute ) ) (otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) ) )* otherlv_17= '}' )? (otherlv_18= 'role' otherlv_19= '{' ( (lv_role_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_role_22_0= ruleRole ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalSMallUML.g:79:3: ()
            // InternalSMallUML.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSMallUML.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSMallUML.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalSMallUML.g:91:4: (lv_name_2_0= ruleEString )
            // InternalSMallUML.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SMallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSMallUML.g:113:3: (otherlv_4= 'super' ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSMallUML.g:114:4: otherlv_4= 'super' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getSuperKeyword_4_0());
                    			
                    // InternalSMallUML.g:118:4: ( ( ruleEString ) )
                    // InternalSMallUML.g:119:5: ( ruleEString )
                    {
                    // InternalSMallUML.g:119:5: ( ruleEString )
                    // InternalSMallUML.g:120:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getSuperClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSMallUML.g:135:3: (otherlv_6= 'method' otherlv_7= '{' ( (lv_method_8_0= ruleMethod ) ) (otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSMallUML.g:136:4: otherlv_6= 'method' otherlv_7= '{' ( (lv_method_8_0= ruleMethod ) ) (otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getMethodKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSMallUML.g:144:4: ( (lv_method_8_0= ruleMethod ) )
                    // InternalSMallUML.g:145:5: (lv_method_8_0= ruleMethod )
                    {
                    // InternalSMallUML.g:145:5: (lv_method_8_0= ruleMethod )
                    // InternalSMallUML.g:146:6: lv_method_8_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_method_8_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"method",
                    							lv_method_8_0,
                    							"org.smalluml.SMallUML.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSMallUML.g:163:4: (otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSMallUML.g:164:5: otherlv_9= ',' ( (lv_method_10_0= ruleMethod ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSMallUML.g:168:5: ( (lv_method_10_0= ruleMethod ) )
                    	    // InternalSMallUML.g:169:6: (lv_method_10_0= ruleMethod )
                    	    {
                    	    // InternalSMallUML.g:169:6: (lv_method_10_0= ruleMethod )
                    	    // InternalSMallUML.g:170:7: lv_method_10_0= ruleMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_method_10_0=ruleMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"method",
                    	    								lv_method_10_0,
                    	    								"org.smalluml.SMallUML.Method");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSMallUML.g:193:3: (otherlv_12= 'attribute' otherlv_13= '{' ( (lv_attribute_14_0= ruleAttribute ) ) (otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSMallUML.g:194:4: otherlv_12= 'attribute' otherlv_13= '{' ( (lv_attribute_14_0= ruleAttribute ) ) (otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getAttributeKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSMallUML.g:202:4: ( (lv_attribute_14_0= ruleAttribute ) )
                    // InternalSMallUML.g:203:5: (lv_attribute_14_0= ruleAttribute )
                    {
                    // InternalSMallUML.g:203:5: (lv_attribute_14_0= ruleAttribute )
                    // InternalSMallUML.g:204:6: lv_attribute_14_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_attribute_14_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_14_0,
                    							"org.smalluml.SMallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSMallUML.g:221:4: (otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSMallUML.g:222:5: otherlv_15= ',' ( (lv_attribute_16_0= ruleAttribute ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSMallUML.g:226:5: ( (lv_attribute_16_0= ruleAttribute ) )
                    	    // InternalSMallUML.g:227:6: (lv_attribute_16_0= ruleAttribute )
                    	    {
                    	    // InternalSMallUML.g:227:6: (lv_attribute_16_0= ruleAttribute )
                    	    // InternalSMallUML.g:228:7: lv_attribute_16_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_attribute_16_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_16_0,
                    	    								"org.smalluml.SMallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSMallUML.g:251:3: (otherlv_18= 'role' otherlv_19= '{' ( (lv_role_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_role_22_0= ruleRole ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSMallUML.g:252:4: otherlv_18= 'role' otherlv_19= '{' ( (lv_role_20_0= ruleRole ) ) (otherlv_21= ',' ( (lv_role_22_0= ruleRole ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getClassAccess().getRoleKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSMallUML.g:260:4: ( (lv_role_20_0= ruleRole ) )
                    // InternalSMallUML.g:261:5: (lv_role_20_0= ruleRole )
                    {
                    // InternalSMallUML.g:261:5: (lv_role_20_0= ruleRole )
                    // InternalSMallUML.g:262:6: lv_role_20_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getRoleRoleParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_role_20_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"role",
                    							lv_role_20_0,
                    							"org.smalluml.SMallUML.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSMallUML.g:279:4: (otherlv_21= ',' ( (lv_role_22_0= ruleRole ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSMallUML.g:280:5: otherlv_21= ',' ( (lv_role_22_0= ruleRole ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSMallUML.g:284:5: ( (lv_role_22_0= ruleRole ) )
                    	    // InternalSMallUML.g:285:6: (lv_role_22_0= ruleRole )
                    	    {
                    	    // InternalSMallUML.g:285:6: (lv_role_22_0= ruleRole )
                    	    // InternalSMallUML.g:286:7: lv_role_22_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getRoleRoleParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_role_22_0=ruleRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"role",
                    	    								lv_role_22_0,
                    	    								"org.smalluml.SMallUML.Role");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_23, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleType"
    // InternalSMallUML.g:317:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSMallUML.g:317:45: (iv_ruleType= ruleType EOF )
            // InternalSMallUML.g:318:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSMallUML.g:324:1: ruleType returns [EObject current=null] : (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_String0_0 = null;

        EObject this_Integer_1 = null;

        EObject this_Bool_2 = null;

        EObject this_Real_3 = null;

        EObject this_UnlimitedNatural_4 = null;

        EObject this_Enumeration_5 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:330:2: ( (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration ) )
            // InternalSMallUML.g:331:2: (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration )
            {
            // InternalSMallUML.g:331:2: (this_String0_0= ruleString0 | this_Integer_1= ruleInteger | this_Bool_2= ruleBool | this_Real_3= ruleReal | this_UnlimitedNatural_4= ruleUnlimitedNatural | this_Enumeration_5= ruleEnumeration )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            case 32:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSMallUML.g:332:3: this_String0_0= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_0=ruleString0();

                    state._fsp--;


                    			current = this_String0_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSMallUML.g:341:3: this_Integer_1= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_1=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSMallUML.g:350:3: this_Bool_2= ruleBool
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBoolParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bool_2=ruleBool();

                    state._fsp--;


                    			current = this_Bool_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSMallUML.g:359:3: this_Real_3= ruleReal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRealParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Real_3=ruleReal();

                    state._fsp--;


                    			current = this_Real_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSMallUML.g:368:3: this_UnlimitedNatural_4= ruleUnlimitedNatural
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getUnlimitedNaturalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNatural_4=ruleUnlimitedNatural();

                    state._fsp--;


                    			current = this_UnlimitedNatural_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSMallUML.g:377:3: this_Enumeration_5= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_5=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // InternalSMallUML.g:389:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSMallUML.g:389:47: (iv_ruleEString= ruleEString EOF )
            // InternalSMallUML.g:390:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSMallUML.g:396:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSMallUML.g:402:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSMallUML.g:403:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSMallUML.g:403:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSMallUML.g:404:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSMallUML.g:412:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMethod"
    // InternalSMallUML.g:423:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSMallUML.g:423:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSMallUML.g:424:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSMallUML.g:430:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'returnType' ( (lv_returnType_11_0= ruleType ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameter_6_0 = null;

        EObject lv_parameter_8_0 = null;

        EObject lv_returnType_11_0 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:436:2: ( ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'returnType' ( (lv_returnType_11_0= ruleType ) ) )? otherlv_12= '}' ) )
            // InternalSMallUML.g:437:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'returnType' ( (lv_returnType_11_0= ruleType ) ) )? otherlv_12= '}' )
            {
            // InternalSMallUML.g:437:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'returnType' ( (lv_returnType_11_0= ruleType ) ) )? otherlv_12= '}' )
            // InternalSMallUML.g:438:3: () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'returnType' ( (lv_returnType_11_0= ruleType ) ) )? otherlv_12= '}'
            {
            // InternalSMallUML.g:438:3: ()
            // InternalSMallUML.g:439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
            		
            // InternalSMallUML.g:449:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSMallUML.g:450:4: (lv_name_2_0= ruleEString )
            {
            // InternalSMallUML.g:450:4: (lv_name_2_0= ruleEString )
            // InternalSMallUML.g:451:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SMallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSMallUML.g:472:3: (otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSMallUML.g:473:4: otherlv_4= 'parameter' otherlv_5= '{' ( (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getParameterKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSMallUML.g:481:4: ( (lv_parameter_6_0= ruleParameter ) )
                    // InternalSMallUML.g:482:5: (lv_parameter_6_0= ruleParameter )
                    {
                    // InternalSMallUML.g:482:5: (lv_parameter_6_0= ruleParameter )
                    // InternalSMallUML.g:483:6: lv_parameter_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameter_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_6_0,
                    							"org.smalluml.SMallUML.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSMallUML.g:500:4: (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSMallUML.g:501:5: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSMallUML.g:505:5: ( (lv_parameter_8_0= ruleParameter ) )
                    	    // InternalSMallUML.g:506:6: (lv_parameter_8_0= ruleParameter )
                    	    {
                    	    // InternalSMallUML.g:506:6: (lv_parameter_8_0= ruleParameter )
                    	    // InternalSMallUML.g:507:7: lv_parameter_8_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameter_8_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_8_0,
                    	    								"org.smalluml.SMallUML.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSMallUML.g:530:3: (otherlv_10= 'returnType' ( (lv_returnType_11_0= ruleType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSMallUML.g:531:4: otherlv_10= 'returnType' ( (lv_returnType_11_0= ruleType ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getReturnTypeKeyword_5_0());
                    			
                    // InternalSMallUML.g:535:4: ( (lv_returnType_11_0= ruleType ) )
                    // InternalSMallUML.g:536:5: (lv_returnType_11_0= ruleType )
                    {
                    // InternalSMallUML.g:536:5: (lv_returnType_11_0= ruleType )
                    // InternalSMallUML.g:537:6: lv_returnType_11_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_returnType_11_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						set(
                    							current,
                    							"returnType",
                    							lv_returnType_11_0,
                    							"org.smalluml.SMallUML.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleAttribute"
    // InternalSMallUML.g:563:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSMallUML.g:563:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSMallUML.g:564:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSMallUML.g:570:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:576:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' ) )
            // InternalSMallUML.g:577:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' )
            {
            // InternalSMallUML.g:577:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' )
            // InternalSMallUML.g:578:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSMallUML.g:582:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSMallUML.g:583:4: (lv_name_1_0= ruleEString )
            {
            // InternalSMallUML.g:583:4: (lv_name_1_0= ruleEString )
            // InternalSMallUML.g:584:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SMallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
            		
            // InternalSMallUML.g:609:3: ( (lv_type_4_0= ruleType ) )
            // InternalSMallUML.g:610:4: (lv_type_4_0= ruleType )
            {
            // InternalSMallUML.g:610:4: (lv_type_4_0= ruleType )
            // InternalSMallUML.g:611:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.smalluml.SMallUML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRole"
    // InternalSMallUML.g:636:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSMallUML.g:636:45: (iv_ruleRole= ruleRole EOF )
            // InternalSMallUML.g:637:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSMallUML.g:643:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'relation' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:649:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'relation' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSMallUML.g:650:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'relation' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSMallUML.g:650:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'relation' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSMallUML.g:651:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'relation' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalSMallUML.g:655:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSMallUML.g:656:4: (lv_name_1_0= ruleEString )
            {
            // InternalSMallUML.g:656:4: (lv_name_1_0= ruleEString )
            // InternalSMallUML.g:657:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SMallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getRelationKeyword_3());
            		
            // InternalSMallUML.g:682:3: ( ( ruleEString ) )
            // InternalSMallUML.g:683:4: ( ruleEString )
            {
            // InternalSMallUML.g:683:4: ( ruleEString )
            // InternalSMallUML.g:684:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getRelationRelationCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleParameter"
    // InternalSMallUML.g:706:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSMallUML.g:706:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSMallUML.g:707:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSMallUML.g:713:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:719:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' ) )
            // InternalSMallUML.g:720:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' )
            {
            // InternalSMallUML.g:720:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' )
            // InternalSMallUML.g:721:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalSMallUML.g:725:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSMallUML.g:726:4: (lv_name_1_0= ruleEString )
            {
            // InternalSMallUML.g:726:4: (lv_name_1_0= ruleEString )
            // InternalSMallUML.g:727:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SMallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalSMallUML.g:752:3: ( (lv_type_4_0= ruleType ) )
            // InternalSMallUML.g:753:4: (lv_type_4_0= ruleType )
            {
            // InternalSMallUML.g:753:4: (lv_type_4_0= ruleType )
            // InternalSMallUML.g:754:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.smalluml.SMallUML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleString0"
    // InternalSMallUML.g:779:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSMallUML.g:779:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSMallUML.g:780:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSMallUML.g:786:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSMallUML.g:792:2: ( ( () otherlv_1= 'String' ) )
            // InternalSMallUML.g:793:2: ( () otherlv_1= 'String' )
            {
            // InternalSMallUML.g:793:2: ( () otherlv_1= 'String' )
            // InternalSMallUML.g:794:3: () otherlv_1= 'String'
            {
            // InternalSMallUML.g:794:3: ()
            // InternalSMallUML.g:795:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInteger"
    // InternalSMallUML.g:809:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSMallUML.g:809:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSMallUML.g:810:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSMallUML.g:816:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSMallUML.g:822:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalSMallUML.g:823:2: ( () otherlv_1= 'Integer' )
            {
            // InternalSMallUML.g:823:2: ( () otherlv_1= 'Integer' )
            // InternalSMallUML.g:824:3: () otherlv_1= 'Integer'
            {
            // InternalSMallUML.g:824:3: ()
            // InternalSMallUML.g:825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleBool"
    // InternalSMallUML.g:839:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalSMallUML.g:839:45: (iv_ruleBool= ruleBool EOF )
            // InternalSMallUML.g:840:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalSMallUML.g:846:1: ruleBool returns [EObject current=null] : ( () otherlv_1= 'Bool' ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSMallUML.g:852:2: ( ( () otherlv_1= 'Bool' ) )
            // InternalSMallUML.g:853:2: ( () otherlv_1= 'Bool' )
            {
            // InternalSMallUML.g:853:2: ( () otherlv_1= 'Bool' )
            // InternalSMallUML.g:854:3: () otherlv_1= 'Bool'
            {
            // InternalSMallUML.g:854:3: ()
            // InternalSMallUML.g:855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getBoolKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleReal"
    // InternalSMallUML.g:869:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalSMallUML.g:869:45: (iv_ruleReal= ruleReal EOF )
            // InternalSMallUML.g:870:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSMallUML.g:876:1: ruleReal returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSMallUML.g:882:2: ( ( () otherlv_1= 'Real' ) )
            // InternalSMallUML.g:883:2: ( () otherlv_1= 'Real' )
            {
            // InternalSMallUML.g:883:2: ( () otherlv_1= 'Real' )
            // InternalSMallUML.g:884:3: () otherlv_1= 'Real'
            {
            // InternalSMallUML.g:884:3: ()
            // InternalSMallUML.g:885:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealAccess().getRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRealAccess().getRealKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleUnlimitedNatural"
    // InternalSMallUML.g:899:1: entryRuleUnlimitedNatural returns [EObject current=null] : iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF ;
    public final EObject entryRuleUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNatural = null;


        try {
            // InternalSMallUML.g:899:57: (iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF )
            // InternalSMallUML.g:900:2: iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNatural=ruleUnlimitedNatural();

            state._fsp--;

             current =iv_ruleUnlimitedNatural; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnlimitedNatural"


    // $ANTLR start "ruleUnlimitedNatural"
    // InternalSMallUML.g:906:1: ruleUnlimitedNatural returns [EObject current=null] : ( () otherlv_1= 'UnlimitedNatural' ) ;
    public final EObject ruleUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSMallUML.g:912:2: ( ( () otherlv_1= 'UnlimitedNatural' ) )
            // InternalSMallUML.g:913:2: ( () otherlv_1= 'UnlimitedNatural' )
            {
            // InternalSMallUML.g:913:2: ( () otherlv_1= 'UnlimitedNatural' )
            // InternalSMallUML.g:914:3: () otherlv_1= 'UnlimitedNatural'
            {
            // InternalSMallUML.g:914:3: ()
            // InternalSMallUML.g:915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnlimitedNatural"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSMallUML.g:929:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSMallUML.g:929:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSMallUML.g:930:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSMallUML.g:936:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_value_4_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:942:2: ( (otherlv_0= 'Enumeration' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalSMallUML.g:943:2: (otherlv_0= 'Enumeration' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalSMallUML.g:943:2: (otherlv_0= 'Enumeration' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalSMallUML.g:944:3: otherlv_0= 'Enumeration' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getValueKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSMallUML.g:960:3: ( (lv_value_4_0= ruleString0 ) )
            // InternalSMallUML.g:961:4: (lv_value_4_0= ruleString0 )
            {
            // InternalSMallUML.g:961:4: (lv_value_4_0= ruleString0 )
            // InternalSMallUML.g:962:5: lv_value_4_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_4_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.smalluml.SMallUML.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSMallUML.g:979:3: (otherlv_5= ',' ( (lv_value_6_0= ruleString0 ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSMallUML.g:980:4: otherlv_5= ',' ( (lv_value_6_0= ruleString0 ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSMallUML.g:984:4: ( (lv_value_6_0= ruleString0 ) )
            	    // InternalSMallUML.g:985:5: (lv_value_6_0= ruleString0 )
            	    {
            	    // InternalSMallUML.g:985:5: (lv_value_6_0= ruleString0 )
            	    // InternalSMallUML.g:986:6: lv_value_6_0= ruleString0
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_value_6_0=ruleString0();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_6_0,
            	    							"org.smalluml.SMallUML.String0");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEInt"
    // InternalSMallUML.g:1016:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSMallUML.g:1016:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSMallUML.g:1017:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSMallUML.g:1023:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSMallUML.g:1029:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSMallUML.g:1030:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSMallUML.g:1030:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSMallUML.g:1031:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSMallUML.g:1031:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSMallUML.g:1032:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleComposition"
    // InternalSMallUML.g:1049:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalSMallUML.g:1049:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalSMallUML.g:1050:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalSMallUML.g:1056:1: ruleComposition returns [EObject current=null] : ( () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_5_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_7_0 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:1062:2: ( ( () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // InternalSMallUML.g:1063:2: ( () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // InternalSMallUML.g:1063:2: ( () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // InternalSMallUML.g:1064:3: () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            // InternalSMallUML.g:1064:3: ()
            // InternalSMallUML.g:1065:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositionAccess().getCompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getCompositionKeyword_1());
            		
            // InternalSMallUML.g:1075:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSMallUML.g:1076:4: (lv_name_2_0= ruleEString )
            {
            // InternalSMallUML.g:1076:4: (lv_name_2_0= ruleEString )
            // InternalSMallUML.g:1077:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SMallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSMallUML.g:1098:3: (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSMallUML.g:1099:4: otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositionAccess().getUpperBoundKeyword_4_0());
                    			
                    // InternalSMallUML.g:1103:4: ( (lv_upperBound_5_0= ruleEInt ) )
                    // InternalSMallUML.g:1104:5: (lv_upperBound_5_0= ruleEInt )
                    {
                    // InternalSMallUML.g:1104:5: (lv_upperBound_5_0= ruleEInt )
                    // InternalSMallUML.g:1105:6: lv_upperBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getUpperBoundEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_upperBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"org.smalluml.SMallUML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSMallUML.g:1123:3: (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSMallUML.g:1124:4: otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getCompositionAccess().getLowerBoundKeyword_5_0());
                    			
                    // InternalSMallUML.g:1128:4: ( (lv_lowerBound_7_0= ruleEInt ) )
                    // InternalSMallUML.g:1129:5: (lv_lowerBound_7_0= ruleEInt )
                    {
                    // InternalSMallUML.g:1129:5: (lv_lowerBound_7_0= ruleEInt )
                    // InternalSMallUML.g:1130:6: lv_lowerBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getLowerBoundEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_lowerBound_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_7_0,
                    							"org.smalluml.SMallUML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSMallUML.g:1148:3: (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSMallUML.g:1149:4: otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositionAccess().getRoleKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalSMallUML.g:1157:4: ( ( ruleEString ) )
                    // InternalSMallUML.g:1158:5: ( ruleEString )
                    {
                    // InternalSMallUML.g:1158:5: ( ruleEString )
                    // InternalSMallUML.g:1159:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositionAccess().getRoleRoleCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSMallUML.g:1173:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSMallUML.g:1174:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSMallUML.g:1178:5: ( ( ruleEString ) )
                    	    // InternalSMallUML.g:1179:6: ( ruleEString )
                    	    {
                    	    // InternalSMallUML.g:1179:6: ( ruleEString )
                    	    // InternalSMallUML.g:1180:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositionAccess().getRoleRoleCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,39,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getCompositionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleReference"
    // InternalSMallUML.g:1208:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSMallUML.g:1208:50: (iv_ruleReference= ruleReference EOF )
            // InternalSMallUML.g:1209:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalSMallUML.g:1215:1: ruleReference returns [EObject current=null] : ( () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_5_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_7_0 = null;



        	enterRule();

        try {
            // InternalSMallUML.g:1221:2: ( ( () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // InternalSMallUML.g:1222:2: ( () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // InternalSMallUML.g:1222:2: ( () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // InternalSMallUML.g:1223:3: () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )? (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            // InternalSMallUML.g:1223:3: ()
            // InternalSMallUML.g:1224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getReferenceKeyword_1());
            		
            // InternalSMallUML.g:1234:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSMallUML.g:1235:4: (lv_name_2_0= ruleEString )
            {
            // InternalSMallUML.g:1235:4: (lv_name_2_0= ruleEString )
            // InternalSMallUML.g:1236:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SMallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSMallUML.g:1257:3: (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSMallUML.g:1258:4: otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getUpperBoundKeyword_4_0());
                    			
                    // InternalSMallUML.g:1262:4: ( (lv_upperBound_5_0= ruleEInt ) )
                    // InternalSMallUML.g:1263:5: (lv_upperBound_5_0= ruleEInt )
                    {
                    // InternalSMallUML.g:1263:5: (lv_upperBound_5_0= ruleEInt )
                    // InternalSMallUML.g:1264:6: lv_upperBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_upperBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"org.smalluml.SMallUML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSMallUML.g:1282:3: (otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSMallUML.g:1283:4: otherlv_6= 'lowerBound' ( (lv_lowerBound_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getLowerBoundKeyword_5_0());
                    			
                    // InternalSMallUML.g:1287:4: ( (lv_lowerBound_7_0= ruleEInt ) )
                    // InternalSMallUML.g:1288:5: (lv_lowerBound_7_0= ruleEInt )
                    {
                    // InternalSMallUML.g:1288:5: (lv_lowerBound_7_0= ruleEInt )
                    // InternalSMallUML.g:1289:6: lv_lowerBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_lowerBound_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_7_0,
                    							"org.smalluml.SMallUML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSMallUML.g:1307:3: (otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSMallUML.g:1308:4: otherlv_8= 'role' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getReferenceAccess().getRoleKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalSMallUML.g:1316:4: ( ( ruleEString ) )
                    // InternalSMallUML.g:1317:5: ( ruleEString )
                    {
                    // InternalSMallUML.g:1317:5: ( ruleEString )
                    // InternalSMallUML.g:1318:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getRoleRoleCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSMallUML.g:1332:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSMallUML.g:1333:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getReferenceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSMallUML.g:1337:5: ( ( ruleEString ) )
                    	    // InternalSMallUML.g:1338:6: ( ruleEString )
                    	    {
                    	    // InternalSMallUML.g:1338:6: ( ruleEString )
                    	    // InternalSMallUML.g:1339:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReferenceAccess().getRoleRoleCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,39,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getReferenceAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003000050000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000050000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000008000L});

}