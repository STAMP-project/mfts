package eu.stamp.mfts.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.stamp.mfts.services.MFTSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMFTSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING", "RULE_EXTERN", "RULE_ID", "RULE_INT", "RULE_BYTE", "RULE_CHAR", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'{'", "'sends'", "','", "'receives'", "'}'", "'message'", "'('", "')'", "'service'", "':'", "'test'", "'par'", "'within'", "'wait'", "'send'", "'!'", "'expect'", "'?'", "'assert'", "'['", "']'", "'&'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_BYTE=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_EXTERN=6;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int RULE_CHAR=10;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_ANNOTATION_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int RULE_FLOAT=11;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMFTSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMFTSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMFTSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMFTS.g"; }



     	private MFTSGrammarAccess grammarAccess;

        public InternalMFTSParser(TokenStream input, MFTSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MFTSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMFTS.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMFTS.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMFTS.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMFTS.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_interfaces_0_0= ruleServiceInterface ) ) | ( (lv_services_1_0= ruleService ) ) | ( (lv_messages_2_0= ruleMessage ) ) | ( (lv_tests_3_0= ruleTestSequence ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaces_0_0 = null;

        EObject lv_services_1_0 = null;

        EObject lv_messages_2_0 = null;

        EObject lv_tests_3_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:77:2: ( ( ( (lv_interfaces_0_0= ruleServiceInterface ) ) | ( (lv_services_1_0= ruleService ) ) | ( (lv_messages_2_0= ruleMessage ) ) | ( (lv_tests_3_0= ruleTestSequence ) ) )* )
            // InternalMFTS.g:78:2: ( ( (lv_interfaces_0_0= ruleServiceInterface ) ) | ( (lv_services_1_0= ruleService ) ) | ( (lv_messages_2_0= ruleMessage ) ) | ( (lv_tests_3_0= ruleTestSequence ) ) )*
            {
            // InternalMFTS.g:78:2: ( ( (lv_interfaces_0_0= ruleServiceInterface ) ) | ( (lv_services_1_0= ruleService ) ) | ( (lv_messages_2_0= ruleMessage ) ) | ( (lv_tests_3_0= ruleTestSequence ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt1=1;
                    }
                    break;
                case 25:
                    {
                    alt1=2;
                    }
                    break;
                case 22:
                    {
                    alt1=3;
                    }
                    break;
                case 27:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalMFTS.g:79:3: ( (lv_interfaces_0_0= ruleServiceInterface ) )
            	    {
            	    // InternalMFTS.g:79:3: ( (lv_interfaces_0_0= ruleServiceInterface ) )
            	    // InternalMFTS.g:80:4: (lv_interfaces_0_0= ruleServiceInterface )
            	    {
            	    // InternalMFTS.g:80:4: (lv_interfaces_0_0= ruleServiceInterface )
            	    // InternalMFTS.g:81:5: lv_interfaces_0_0= ruleServiceInterface
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getInterfacesServiceInterfaceParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_interfaces_0_0=ruleServiceInterface();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interfaces",
            	    						lv_interfaces_0_0,
            	    						"eu.stamp.mfts.MFTS.ServiceInterface");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMFTS.g:99:3: ( (lv_services_1_0= ruleService ) )
            	    {
            	    // InternalMFTS.g:99:3: ( (lv_services_1_0= ruleService ) )
            	    // InternalMFTS.g:100:4: (lv_services_1_0= ruleService )
            	    {
            	    // InternalMFTS.g:100:4: (lv_services_1_0= ruleService )
            	    // InternalMFTS.g:101:5: lv_services_1_0= ruleService
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_services_1_0=ruleService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_1_0,
            	    						"eu.stamp.mfts.MFTS.Service");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMFTS.g:119:3: ( (lv_messages_2_0= ruleMessage ) )
            	    {
            	    // InternalMFTS.g:119:3: ( (lv_messages_2_0= ruleMessage ) )
            	    // InternalMFTS.g:120:4: (lv_messages_2_0= ruleMessage )
            	    {
            	    // InternalMFTS.g:120:4: (lv_messages_2_0= ruleMessage )
            	    // InternalMFTS.g:121:5: lv_messages_2_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMessagesMessageParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_messages_2_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"messages",
            	    						lv_messages_2_0,
            	    						"eu.stamp.mfts.MFTS.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMFTS.g:139:3: ( (lv_tests_3_0= ruleTestSequence ) )
            	    {
            	    // InternalMFTS.g:139:3: ( (lv_tests_3_0= ruleTestSequence ) )
            	    // InternalMFTS.g:140:4: (lv_tests_3_0= ruleTestSequence )
            	    {
            	    // InternalMFTS.g:140:4: (lv_tests_3_0= ruleTestSequence )
            	    // InternalMFTS.g:141:5: lv_tests_3_0= ruleTestSequence
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTestsTestSequenceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tests_3_0=ruleTestSequence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_3_0,
            	    						"eu.stamp.mfts.MFTS.TestSequence");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePlatformAnnotation"
    // InternalMFTS.g:162:1: entryRulePlatformAnnotation returns [EObject current=null] : iv_rulePlatformAnnotation= rulePlatformAnnotation EOF ;
    public final EObject entryRulePlatformAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformAnnotation = null;


        try {
            // InternalMFTS.g:162:59: (iv_rulePlatformAnnotation= rulePlatformAnnotation EOF )
            // InternalMFTS.g:163:2: iv_rulePlatformAnnotation= rulePlatformAnnotation EOF
            {
             newCompositeNode(grammarAccess.getPlatformAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformAnnotation=rulePlatformAnnotation();

            state._fsp--;

             current =iv_rulePlatformAnnotation; 
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
    // $ANTLR end "entryRulePlatformAnnotation"


    // $ANTLR start "rulePlatformAnnotation"
    // InternalMFTS.g:169:1: rulePlatformAnnotation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= RULE_EXTERN ) ) ) ) ;
    public final EObject rulePlatformAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMFTS.g:175:2: ( ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= RULE_EXTERN ) ) ) ) )
            // InternalMFTS.g:176:2: ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= RULE_EXTERN ) ) ) )
            {
            // InternalMFTS.g:176:2: ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= RULE_EXTERN ) ) ) )
            // InternalMFTS.g:177:3: ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= RULE_EXTERN ) ) )
            {
            // InternalMFTS.g:177:3: ( (lv_name_0_0= RULE_ANNOTATION_ID ) )
            // InternalMFTS.g:178:4: (lv_name_0_0= RULE_ANNOTATION_ID )
            {
            // InternalMFTS.g:178:4: (lv_name_0_0= RULE_ANNOTATION_ID )
            // InternalMFTS.g:179:5: lv_name_0_0= RULE_ANNOTATION_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ANNOTATION_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"eu.stamp.mfts.MFTS.ANNOTATION_ID");
            				

            }


            }

            // InternalMFTS.g:195:3: ( ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_value_2_0= RULE_EXTERN ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_EXTERN) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMFTS.g:196:4: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalMFTS.g:196:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalMFTS.g:197:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalMFTS.g:197:5: (lv_value_1_0= RULE_STRING )
                    // InternalMFTS.g:198:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPlatformAnnotationAccess().getValueSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformAnnotationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"eu.stamp.mfts.MFTS.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMFTS.g:215:4: ( (lv_value_2_0= RULE_EXTERN ) )
                    {
                    // InternalMFTS.g:215:4: ( (lv_value_2_0= RULE_EXTERN ) )
                    // InternalMFTS.g:216:5: (lv_value_2_0= RULE_EXTERN )
                    {
                    // InternalMFTS.g:216:5: (lv_value_2_0= RULE_EXTERN )
                    // InternalMFTS.g:217:6: lv_value_2_0= RULE_EXTERN
                    {
                    lv_value_2_0=(Token)match(input,RULE_EXTERN,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getPlatformAnnotationAccess().getValueEXTERNTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformAnnotationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"eu.stamp.mfts.MFTS.EXTERN");
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "rulePlatformAnnotation"


    // $ANTLR start "entryRuleServiceInterface"
    // InternalMFTS.g:238:1: entryRuleServiceInterface returns [EObject current=null] : iv_ruleServiceInterface= ruleServiceInterface EOF ;
    public final EObject entryRuleServiceInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceInterface = null;


        try {
            // InternalMFTS.g:238:57: (iv_ruleServiceInterface= ruleServiceInterface EOF )
            // InternalMFTS.g:239:2: iv_ruleServiceInterface= ruleServiceInterface EOF
            {
             newCompositeNode(grammarAccess.getServiceInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceInterface=ruleServiceInterface();

            state._fsp--;

             current =iv_ruleServiceInterface; 
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
    // $ANTLR end "entryRuleServiceInterface"


    // $ANTLR start "ruleServiceInterface"
    // InternalMFTS.g:245:1: ruleServiceInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) | (otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* ) )* otherlv_12= '}' ) ;
    public final EObject ruleServiceInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_annotations_2_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:251:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) | (otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* ) )* otherlv_12= '}' ) )
            // InternalMFTS.g:252:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) | (otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* ) )* otherlv_12= '}' )
            {
            // InternalMFTS.g:252:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) | (otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* ) )* otherlv_12= '}' )
            // InternalMFTS.g:253:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) | (otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalMFTS.g:257:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMFTS.g:258:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMFTS.g:258:4: (lv_name_1_0= RULE_ID )
            // InternalMFTS.g:259:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.stamp.mfts.MFTS.ID");
            				

            }


            }

            // InternalMFTS.g:275:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ANNOTATION_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMFTS.g:276:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalMFTS.g:276:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalMFTS.g:277:5: lv_annotations_2_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getServiceInterfaceAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_annotations_2_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceInterfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_2_0,
            	    						"eu.stamp.mfts.MFTS.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMFTS.g:298:3: ( (otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) | (otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }
                else if ( (LA6_0==20) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMFTS.g:299:4: (otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            	    {
            	    // InternalMFTS.g:299:4: (otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            	    // InternalMFTS.g:300:5: otherlv_4= 'sends' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_5); 

            	    					newLeafNode(otherlv_4, grammarAccess.getServiceInterfaceAccess().getSendsKeyword_4_0_0());
            	    				
            	    // InternalMFTS.g:304:5: ( (otherlv_5= RULE_ID ) )
            	    // InternalMFTS.g:305:6: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMFTS.g:305:6: (otherlv_5= RULE_ID )
            	    // InternalMFTS.g:306:7: otherlv_5= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getServiceInterfaceRule());
            	    							}
            	    						
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    							newLeafNode(otherlv_5, grammarAccess.getServiceInterfaceAccess().getSendsMessageCrossReference_4_0_1_0());
            	    						

            	    }


            	    }

            	    // InternalMFTS.g:317:5: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==19) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMFTS.g:318:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,19,FOLLOW_5); 

            	    	    						newLeafNode(otherlv_6, grammarAccess.getServiceInterfaceAccess().getCommaKeyword_4_0_2_0());
            	    	    					
            	    	    // InternalMFTS.g:322:6: ( (otherlv_7= RULE_ID ) )
            	    	    // InternalMFTS.g:323:7: (otherlv_7= RULE_ID )
            	    	    {
            	    	    // InternalMFTS.g:323:7: (otherlv_7= RULE_ID )
            	    	    // InternalMFTS.g:324:8: otherlv_7= RULE_ID
            	    	    {

            	    	    								if (current==null) {
            	    	    									current = createModelElement(grammarAccess.getServiceInterfaceRule());
            	    	    								}
            	    	    							
            	    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    	    								newLeafNode(otherlv_7, grammarAccess.getServiceInterfaceAccess().getSendsMessageCrossReference_4_0_2_1_0());
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMFTS.g:338:4: (otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )
            	    {
            	    // InternalMFTS.g:338:4: (otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )
            	    // InternalMFTS.g:339:5: otherlv_8= 'receives' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_5); 

            	    					newLeafNode(otherlv_8, grammarAccess.getServiceInterfaceAccess().getReceivesKeyword_4_1_0());
            	    				
            	    // InternalMFTS.g:343:5: ( (otherlv_9= RULE_ID ) )
            	    // InternalMFTS.g:344:6: (otherlv_9= RULE_ID )
            	    {
            	    // InternalMFTS.g:344:6: (otherlv_9= RULE_ID )
            	    // InternalMFTS.g:345:7: otherlv_9= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getServiceInterfaceRule());
            	    							}
            	    						
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    							newLeafNode(otherlv_9, grammarAccess.getServiceInterfaceAccess().getReceivesMessageCrossReference_4_1_1_0());
            	    						

            	    }


            	    }

            	    // InternalMFTS.g:356:5: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==19) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMFTS.g:357:6: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,19,FOLLOW_5); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getServiceInterfaceAccess().getCommaKeyword_4_1_2_0());
            	    	    					
            	    	    // InternalMFTS.g:361:6: ( (otherlv_11= RULE_ID ) )
            	    	    // InternalMFTS.g:362:7: (otherlv_11= RULE_ID )
            	    	    {
            	    	    // InternalMFTS.g:362:7: (otherlv_11= RULE_ID )
            	    	    // InternalMFTS.g:363:8: otherlv_11= RULE_ID
            	    	    {

            	    	    								if (current==null) {
            	    	    									current = createModelElement(grammarAccess.getServiceInterfaceRule());
            	    	    								}
            	    	    							
            	    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    	    								newLeafNode(otherlv_11, grammarAccess.getServiceInterfaceAccess().getReceivesMessageCrossReference_4_1_2_1_0());
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getServiceInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleServiceInterface"


    // $ANTLR start "entryRuleMessage"
    // InternalMFTS.g:385:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalMFTS.g:385:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalMFTS.g:386:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalMFTS.g:392:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_annotations_7_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:398:2: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) )
            // InternalMFTS.g:399:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            {
            // InternalMFTS.g:399:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            // InternalMFTS.g:400:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalMFTS.g:404:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMFTS.g:405:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMFTS.g:405:4: (lv_name_1_0= RULE_ID )
            // InternalMFTS.g:406:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.stamp.mfts.MFTS.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMFTS.g:426:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMFTS.g:427:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalMFTS.g:427:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalMFTS.g:428:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalMFTS.g:428:5: (lv_parameters_3_0= ruleParameter )
                    // InternalMFTS.g:429:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"eu.stamp.mfts.MFTS.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMFTS.g:446:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMFTS.g:447:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMFTS.g:451:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMFTS.g:452:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMFTS.g:452:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMFTS.g:453:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"eu.stamp.mfts.MFTS.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
            		
            // InternalMFTS.g:476:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ANNOTATION_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMFTS.g:477:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalMFTS.g:477:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalMFTS.g:478:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getMessageAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMessageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_7_0,
            	    						"eu.stamp.mfts.MFTS.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleParameter"
    // InternalMFTS.g:499:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMFTS.g:499:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMFTS.g:500:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMFTS.g:506:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_annotations_1_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_annotations_1_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:512:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_annotations_1_0= rulePlatformAnnotation ) )* ) )
            // InternalMFTS.g:513:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_annotations_1_0= rulePlatformAnnotation ) )* )
            {
            // InternalMFTS.g:513:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_annotations_1_0= rulePlatformAnnotation ) )* )
            // InternalMFTS.g:514:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_annotations_1_0= rulePlatformAnnotation ) )*
            {
            // InternalMFTS.g:514:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMFTS.g:515:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMFTS.g:515:4: (lv_name_0_0= RULE_ID )
            // InternalMFTS.g:516:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"eu.stamp.mfts.MFTS.ID");
            				

            }


            }

            // InternalMFTS.g:532:3: ( (lv_annotations_1_0= rulePlatformAnnotation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ANNOTATION_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMFTS.g:533:4: (lv_annotations_1_0= rulePlatformAnnotation )
            	    {
            	    // InternalMFTS.g:533:4: (lv_annotations_1_0= rulePlatformAnnotation )
            	    // InternalMFTS.g:534:5: lv_annotations_1_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsPlatformAnnotationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_annotations_1_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_1_0,
            	    						"eu.stamp.mfts.MFTS.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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


    // $ANTLR start "entryRuleService"
    // InternalMFTS.g:555:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalMFTS.g:555:48: (iv_ruleService= ruleService EOF )
            // InternalMFTS.g:556:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMFTS.g:562:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (lv_annotations_6_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_6_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:568:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (lv_annotations_6_0= rulePlatformAnnotation ) )* ) )
            // InternalMFTS.g:569:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (lv_annotations_6_0= rulePlatformAnnotation ) )* )
            {
            // InternalMFTS.g:569:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (lv_annotations_6_0= rulePlatformAnnotation ) )* )
            // InternalMFTS.g:570:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (lv_annotations_6_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalMFTS.g:574:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMFTS.g:575:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMFTS.g:575:4: (lv_name_1_0= RULE_ID )
            // InternalMFTS.g:576:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.stamp.mfts.MFTS.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getColonKeyword_2());
            		
            // InternalMFTS.g:596:3: ( (otherlv_3= RULE_ID ) )
            // InternalMFTS.g:597:4: (otherlv_3= RULE_ID )
            {
            // InternalMFTS.g:597:4: (otherlv_3= RULE_ID )
            // InternalMFTS.g:598:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getInterfacesServiceInterfaceCrossReference_3_0());
            				

            }


            }

            // InternalMFTS.g:609:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMFTS.g:610:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMFTS.g:614:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalMFTS.g:615:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMFTS.g:615:5: (otherlv_5= RULE_ID )
            	    // InternalMFTS.g:616:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getInterfacesServiceInterfaceCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalMFTS.g:628:3: ( (lv_annotations_6_0= rulePlatformAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ANNOTATION_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMFTS.g:629:4: (lv_annotations_6_0= rulePlatformAnnotation )
            	    {
            	    // InternalMFTS.g:629:4: (lv_annotations_6_0= rulePlatformAnnotation )
            	    // InternalMFTS.g:630:5: lv_annotations_6_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_annotations_6_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_6_0,
            	    						"eu.stamp.mfts.MFTS.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleTestSequence"
    // InternalMFTS.g:651:1: entryRuleTestSequence returns [EObject current=null] : iv_ruleTestSequence= ruleTestSequence EOF ;
    public final EObject entryRuleTestSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestSequence = null;


        try {
            // InternalMFTS.g:651:53: (iv_ruleTestSequence= ruleTestSequence EOF )
            // InternalMFTS.g:652:2: iv_ruleTestSequence= ruleTestSequence EOF
            {
             newCompositeNode(grammarAccess.getTestSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestSequence=ruleTestSequence();

            state._fsp--;

             current =iv_ruleTestSequence; 
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
    // $ANTLR end "entryRuleTestSequence"


    // $ANTLR start "ruleTestSequence"
    // InternalMFTS.g:658:1: ruleTestSequence returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* ( (lv_actions_3_0= ruleSeq ) ) ) ;
    public final EObject ruleTestSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_actions_3_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:664:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* ( (lv_actions_3_0= ruleSeq ) ) ) )
            // InternalMFTS.g:665:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* ( (lv_actions_3_0= ruleSeq ) ) )
            {
            // InternalMFTS.g:665:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* ( (lv_actions_3_0= ruleSeq ) ) )
            // InternalMFTS.g:666:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* ( (lv_actions_3_0= ruleSeq ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTestSequenceAccess().getTestKeyword_0());
            		
            // InternalMFTS.g:670:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMFTS.g:671:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMFTS.g:671:4: (lv_name_1_0= RULE_ID )
            // InternalMFTS.g:672:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestSequenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.stamp.mfts.MFTS.ID");
            				

            }


            }

            // InternalMFTS.g:688:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ANNOTATION_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMFTS.g:689:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalMFTS.g:689:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalMFTS.g:690:5: lv_annotations_2_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getTestSequenceAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_annotations_2_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestSequenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_2_0,
            	    						"eu.stamp.mfts.MFTS.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMFTS.g:707:3: ( (lv_actions_3_0= ruleSeq ) )
            // InternalMFTS.g:708:4: (lv_actions_3_0= ruleSeq )
            {
            // InternalMFTS.g:708:4: (lv_actions_3_0= ruleSeq )
            // InternalMFTS.g:709:5: lv_actions_3_0= ruleSeq
            {

            					newCompositeNode(grammarAccess.getTestSequenceAccess().getActionsSeqParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_actions_3_0=ruleSeq();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestSequenceRule());
            					}
            					set(
            						current,
            						"actions",
            						lv_actions_3_0,
            						"eu.stamp.mfts.MFTS.Seq");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleTestSequence"


    // $ANTLR start "entryRuleAction"
    // InternalMFTS.g:730:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMFTS.g:730:47: (iv_ruleAction= ruleAction EOF )
            // InternalMFTS.g:731:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMFTS.g:737:1: ruleAction returns [EObject current=null] : (this_Wait_0= ruleWait | this_Send_1= ruleSend | this_Expect_2= ruleExpect | this_Par_3= rulePar | this_Seq_4= ruleSeq ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Wait_0 = null;

        EObject this_Send_1 = null;

        EObject this_Expect_2 = null;

        EObject this_Par_3 = null;

        EObject this_Seq_4 = null;



        	enterRule();

        try {
            // InternalMFTS.g:743:2: ( (this_Wait_0= ruleWait | this_Send_1= ruleSend | this_Expect_2= ruleExpect | this_Par_3= rulePar | this_Seq_4= ruleSeq ) )
            // InternalMFTS.g:744:2: (this_Wait_0= ruleWait | this_Send_1= ruleSend | this_Expect_2= ruleExpect | this_Par_3= rulePar | this_Seq_4= ruleSeq )
            {
            // InternalMFTS.g:744:2: (this_Wait_0= ruleWait | this_Send_1= ruleSend | this_Expect_2= ruleExpect | this_Par_3= rulePar | this_Seq_4= ruleSeq )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            case 28:
                {
                alt14=4;
                }
                break;
            case 17:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMFTS.g:745:3: this_Wait_0= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getWaitParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_0=ruleWait();

                    state._fsp--;


                    			current = this_Wait_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMFTS.g:754:3: this_Send_1= ruleSend
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSendParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Send_1=ruleSend();

                    state._fsp--;


                    			current = this_Send_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMFTS.g:763:3: this_Expect_2= ruleExpect
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getExpectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expect_2=ruleExpect();

                    state._fsp--;


                    			current = this_Expect_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMFTS.g:772:3: this_Par_3= rulePar
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getParParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Par_3=rulePar();

                    state._fsp--;


                    			current = this_Par_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMFTS.g:781:3: this_Seq_4= ruleSeq
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSeqParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Seq_4=ruleSeq();

                    state._fsp--;


                    			current = this_Seq_4;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePar"
    // InternalMFTS.g:793:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
            // InternalMFTS.g:793:44: (iv_rulePar= rulePar EOF )
            // InternalMFTS.g:794:2: iv_rulePar= rulePar EOF
            {
             newCompositeNode(grammarAccess.getParRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePar=rulePar();

            state._fsp--;

             current =iv_rulePar; 
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
    // $ANTLR end "entryRulePar"


    // $ANTLR start "rulePar"
    // InternalMFTS.g:800:1: rulePar returns [EObject current=null] : (otherlv_0= 'par' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'within' ( (lv_time_3_0= ruleTimeInterval ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= '}' ) ;
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_time_3_0 = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:806:2: ( (otherlv_0= 'par' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'within' ( (lv_time_3_0= ruleTimeInterval ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= '}' ) )
            // InternalMFTS.g:807:2: (otherlv_0= 'par' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'within' ( (lv_time_3_0= ruleTimeInterval ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= '}' )
            {
            // InternalMFTS.g:807:2: (otherlv_0= 'par' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'within' ( (lv_time_3_0= ruleTimeInterval ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= '}' )
            // InternalMFTS.g:808:3: otherlv_0= 'par' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'within' ( (lv_time_3_0= ruleTimeInterval ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getParAccess().getParKeyword_0());
            		
            // InternalMFTS.g:812:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMFTS.g:813:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMFTS.g:813:4: (lv_name_1_0= RULE_ID )
                    // InternalMFTS.g:814:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getParAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"eu.stamp.mfts.MFTS.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getParAccess().getWithinKeyword_2());
            		
            // InternalMFTS.g:834:3: ( (lv_time_3_0= ruleTimeInterval ) )
            // InternalMFTS.g:835:4: (lv_time_3_0= ruleTimeInterval )
            {
            // InternalMFTS.g:835:4: (lv_time_3_0= ruleTimeInterval )
            // InternalMFTS.g:836:5: lv_time_3_0= ruleTimeInterval
            {

            					newCompositeNode(grammarAccess.getParAccess().getTimeTimeIntervalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_time_3_0=ruleTimeInterval();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_3_0,
            						"eu.stamp.mfts.MFTS.TimeInterval");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMFTS.g:853:3: ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ANNOTATION_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMFTS.g:854:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    {
            	    // InternalMFTS.g:854:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    // InternalMFTS.g:855:5: lv_annotations_4_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getParAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_annotations_4_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_4_0,
            	    						"eu.stamp.mfts.MFTS.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getParAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMFTS.g:876:3: ( (lv_actions_6_0= ruleAction ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17||LA17_0==28||(LA17_0>=30 && LA17_0<=31)||LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMFTS.g:877:4: (lv_actions_6_0= ruleAction )
            	    {
            	    // InternalMFTS.g:877:4: (lv_actions_6_0= ruleAction )
            	    // InternalMFTS.g:878:5: lv_actions_6_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getParAccess().getActionsActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_actions_6_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_6_0,
            	    						"eu.stamp.mfts.MFTS.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePar"


    // $ANTLR start "entryRuleSeq"
    // InternalMFTS.g:903:1: entryRuleSeq returns [EObject current=null] : iv_ruleSeq= ruleSeq EOF ;
    public final EObject entryRuleSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeq = null;


        try {
            // InternalMFTS.g:903:44: (iv_ruleSeq= ruleSeq EOF )
            // InternalMFTS.g:904:2: iv_ruleSeq= ruleSeq EOF
            {
             newCompositeNode(grammarAccess.getSeqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeq=ruleSeq();

            state._fsp--;

             current =iv_ruleSeq; 
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
    // $ANTLR end "entryRuleSeq"


    // $ANTLR start "ruleSeq"
    // InternalMFTS.g:910:1: ruleSeq returns [EObject current=null] : (otherlv_0= '{' ( (lv_actions_1_0= ruleAction ) )* otherlv_2= '}' ) ;
    public final EObject ruleSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:916:2: ( (otherlv_0= '{' ( (lv_actions_1_0= ruleAction ) )* otherlv_2= '}' ) )
            // InternalMFTS.g:917:2: (otherlv_0= '{' ( (lv_actions_1_0= ruleAction ) )* otherlv_2= '}' )
            {
            // InternalMFTS.g:917:2: (otherlv_0= '{' ( (lv_actions_1_0= ruleAction ) )* otherlv_2= '}' )
            // InternalMFTS.g:918:3: otherlv_0= '{' ( (lv_actions_1_0= ruleAction ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSeqAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMFTS.g:922:3: ( (lv_actions_1_0= ruleAction ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17||LA18_0==28||(LA18_0>=30 && LA18_0<=31)||LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMFTS.g:923:4: (lv_actions_1_0= ruleAction )
            	    {
            	    // InternalMFTS.g:923:4: (lv_actions_1_0= ruleAction )
            	    // InternalMFTS.g:924:5: lv_actions_1_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getSeqAccess().getActionsActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_actions_1_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeqRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"eu.stamp.mfts.MFTS.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSeqAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleSeq"


    // $ANTLR start "entryRuleWait"
    // InternalMFTS.g:949:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalMFTS.g:949:45: (iv_ruleWait= ruleWait EOF )
            // InternalMFTS.g:950:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalMFTS.g:956:1: ruleWait returns [EObject current=null] : (otherlv_0= 'wait' ( (lv_time_1_0= ruleTimeInterval ) ) ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_time_1_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:962:2: ( (otherlv_0= 'wait' ( (lv_time_1_0= ruleTimeInterval ) ) ) )
            // InternalMFTS.g:963:2: (otherlv_0= 'wait' ( (lv_time_1_0= ruleTimeInterval ) ) )
            {
            // InternalMFTS.g:963:2: (otherlv_0= 'wait' ( (lv_time_1_0= ruleTimeInterval ) ) )
            // InternalMFTS.g:964:3: otherlv_0= 'wait' ( (lv_time_1_0= ruleTimeInterval ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWaitKeyword_0());
            		
            // InternalMFTS.g:968:3: ( (lv_time_1_0= ruleTimeInterval ) )
            // InternalMFTS.g:969:4: (lv_time_1_0= ruleTimeInterval )
            {
            // InternalMFTS.g:969:4: (lv_time_1_0= ruleTimeInterval )
            // InternalMFTS.g:970:5: lv_time_1_0= ruleTimeInterval
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getTimeTimeIntervalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_1_0=ruleTimeInterval();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_1_0,
            						"eu.stamp.mfts.MFTS.TimeInterval");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleSend"
    // InternalMFTS.g:991:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // InternalMFTS.g:991:45: (iv_ruleSend= ruleSend EOF )
            // InternalMFTS.g:992:2: iv_ruleSend= ruleSend EOF
            {
             newCompositeNode(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSend=ruleSend();

            state._fsp--;

             current =iv_ruleSend; 
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
    // $ANTLR end "entryRuleSend"


    // $ANTLR start "ruleSend"
    // InternalMFTS.g:998:1: ruleSend returns [EObject current=null] : (otherlv_0= 'send' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_annotations_9_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:1004:2: ( (otherlv_0= 'send' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) )
            // InternalMFTS.g:1005:2: (otherlv_0= 'send' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            {
            // InternalMFTS.g:1005:2: (otherlv_0= 'send' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            // InternalMFTS.g:1006:3: otherlv_0= 'send' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) ) )* )? otherlv_8= ')' ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSendAccess().getSendKeyword_0());
            		
            // InternalMFTS.g:1010:3: ( (otherlv_1= RULE_ID ) )
            // InternalMFTS.g:1011:4: (otherlv_1= RULE_ID )
            {
            // InternalMFTS.g:1011:4: (otherlv_1= RULE_ID )
            // InternalMFTS.g:1012:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getSendAccess().getServiceServiceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSendAccess().getExclamationMarkKeyword_2());
            		
            // InternalMFTS.g:1027:3: ( (otherlv_3= RULE_ID ) )
            // InternalMFTS.g:1028:4: (otherlv_3= RULE_ID )
            {
            // InternalMFTS.g:1028:4: (otherlv_3= RULE_ID )
            // InternalMFTS.g:1029:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getSendAccess().getMessageMessageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getSendAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMFTS.g:1044:3: ( ( (lv_parameters_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_EXTERN)||(LA20_0>=RULE_INT && LA20_0<=RULE_FLOAT)||(LA20_0>=39 && LA20_0<=40)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMFTS.g:1045:4: ( (lv_parameters_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) ) )*
                    {
                    // InternalMFTS.g:1045:4: ( (lv_parameters_5_0= ruleExpression ) )
                    // InternalMFTS.g:1046:5: (lv_parameters_5_0= ruleExpression )
                    {
                    // InternalMFTS.g:1046:5: (lv_parameters_5_0= ruleExpression )
                    // InternalMFTS.g:1047:6: lv_parameters_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSendAccess().getParametersExpressionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSendRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_5_0,
                    							"eu.stamp.mfts.MFTS.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMFTS.g:1064:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==19) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMFTS.g:1065:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleExpression ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSendAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalMFTS.g:1069:5: ( (lv_parameters_7_0= ruleExpression ) )
                    	    // InternalMFTS.g:1070:6: (lv_parameters_7_0= ruleExpression )
                    	    {
                    	    // InternalMFTS.g:1070:6: (lv_parameters_7_0= ruleExpression )
                    	    // InternalMFTS.g:1071:7: lv_parameters_7_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSendAccess().getParametersExpressionParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parameters_7_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSendRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_7_0,
                    	    								"eu.stamp.mfts.MFTS.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getSendAccess().getRightParenthesisKeyword_6());
            		
            // InternalMFTS.g:1094:3: ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ANNOTATION_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMFTS.g:1095:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    {
            	    // InternalMFTS.g:1095:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    // InternalMFTS.g:1096:5: lv_annotations_9_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSendAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_annotations_9_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSendRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_9_0,
            	    						"eu.stamp.mfts.MFTS.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleSend"


    // $ANTLR start "entryRuleExpect"
    // InternalMFTS.g:1117:1: entryRuleExpect returns [EObject current=null] : iv_ruleExpect= ruleExpect EOF ;
    public final EObject entryRuleExpect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpect = null;


        try {
            // InternalMFTS.g:1117:47: (iv_ruleExpect= ruleExpect EOF )
            // InternalMFTS.g:1118:2: iv_ruleExpect= ruleExpect EOF
            {
             newCompositeNode(grammarAccess.getExpectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpect=ruleExpect();

            state._fsp--;

             current =iv_ruleExpect; 
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
    // $ANTLR end "entryRuleExpect"


    // $ANTLR start "ruleExpect"
    // InternalMFTS.g:1124:1: ruleExpect returns [EObject current=null] : (otherlv_0= 'expect' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'within' ( (lv_time_5_0= ruleTimeInterval ) ) ( (lv_annotations_6_0= rulePlatformAnnotation ) )* (otherlv_7= 'assert' ( (lv_asserts_8_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_time_5_0 = null;

        EObject lv_annotations_6_0 = null;

        EObject lv_asserts_8_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:1130:2: ( (otherlv_0= 'expect' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'within' ( (lv_time_5_0= ruleTimeInterval ) ) ( (lv_annotations_6_0= rulePlatformAnnotation ) )* (otherlv_7= 'assert' ( (lv_asserts_8_0= ruleExpression ) ) )* ) )
            // InternalMFTS.g:1131:2: (otherlv_0= 'expect' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'within' ( (lv_time_5_0= ruleTimeInterval ) ) ( (lv_annotations_6_0= rulePlatformAnnotation ) )* (otherlv_7= 'assert' ( (lv_asserts_8_0= ruleExpression ) ) )* )
            {
            // InternalMFTS.g:1131:2: (otherlv_0= 'expect' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'within' ( (lv_time_5_0= ruleTimeInterval ) ) ( (lv_annotations_6_0= rulePlatformAnnotation ) )* (otherlv_7= 'assert' ( (lv_asserts_8_0= ruleExpression ) ) )* )
            // InternalMFTS.g:1132:3: otherlv_0= 'expect' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'within' ( (lv_time_5_0= ruleTimeInterval ) ) ( (lv_annotations_6_0= rulePlatformAnnotation ) )* (otherlv_7= 'assert' ( (lv_asserts_8_0= ruleExpression ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExpectAccess().getExpectKeyword_0());
            		
            // InternalMFTS.g:1136:3: ( (otherlv_1= RULE_ID ) )
            // InternalMFTS.g:1137:4: (otherlv_1= RULE_ID )
            {
            // InternalMFTS.g:1137:4: (otherlv_1= RULE_ID )
            // InternalMFTS.g:1138:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpectRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getExpectAccess().getServiceServiceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExpectAccess().getQuestionMarkKeyword_2());
            		
            // InternalMFTS.g:1153:3: ( (otherlv_3= RULE_ID ) )
            // InternalMFTS.g:1154:4: (otherlv_3= RULE_ID )
            {
            // InternalMFTS.g:1154:4: (otherlv_3= RULE_ID )
            // InternalMFTS.g:1155:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpectRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getExpectAccess().getMessageMessageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getExpectAccess().getWithinKeyword_4());
            		
            // InternalMFTS.g:1170:3: ( (lv_time_5_0= ruleTimeInterval ) )
            // InternalMFTS.g:1171:4: (lv_time_5_0= ruleTimeInterval )
            {
            // InternalMFTS.g:1171:4: (lv_time_5_0= ruleTimeInterval )
            // InternalMFTS.g:1172:5: lv_time_5_0= ruleTimeInterval
            {

            					newCompositeNode(grammarAccess.getExpectAccess().getTimeTimeIntervalParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_time_5_0=ruleTimeInterval();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpectRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_5_0,
            						"eu.stamp.mfts.MFTS.TimeInterval");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMFTS.g:1189:3: ( (lv_annotations_6_0= rulePlatformAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ANNOTATION_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMFTS.g:1190:4: (lv_annotations_6_0= rulePlatformAnnotation )
            	    {
            	    // InternalMFTS.g:1190:4: (lv_annotations_6_0= rulePlatformAnnotation )
            	    // InternalMFTS.g:1191:5: lv_annotations_6_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getExpectAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_annotations_6_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_6_0,
            	    						"eu.stamp.mfts.MFTS.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalMFTS.g:1208:3: (otherlv_7= 'assert' ( (lv_asserts_8_0= ruleExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMFTS.g:1209:4: otherlv_7= 'assert' ( (lv_asserts_8_0= ruleExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_21); 

            	    				newLeafNode(otherlv_7, grammarAccess.getExpectAccess().getAssertKeyword_7_0());
            	    			
            	    // InternalMFTS.g:1213:4: ( (lv_asserts_8_0= ruleExpression ) )
            	    // InternalMFTS.g:1214:5: (lv_asserts_8_0= ruleExpression )
            	    {
            	    // InternalMFTS.g:1214:5: (lv_asserts_8_0= ruleExpression )
            	    // InternalMFTS.g:1215:6: lv_asserts_8_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpectAccess().getAssertsExpressionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_asserts_8_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"asserts",
            	    							lv_asserts_8_0,
            	    							"eu.stamp.mfts.MFTS.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "ruleExpect"


    // $ANTLR start "entryRuleTimeInterval"
    // InternalMFTS.g:1237:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalMFTS.g:1237:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalMFTS.g:1238:2: iv_ruleTimeInterval= ruleTimeInterval EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeInterval=ruleTimeInterval();

            state._fsp--;

             current =iv_ruleTimeInterval; 
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
    // $ANTLR end "entryRuleTimeInterval"


    // $ANTLR start "ruleTimeInterval"
    // InternalMFTS.g:1244:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMFTS.g:1250:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalMFTS.g:1251:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalMFTS.g:1251:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalMFTS.g:1252:3: otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMFTS.g:1256:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalMFTS.g:1257:4: (lv_min_1_0= RULE_INT )
            {
            // InternalMFTS.g:1257:4: (lv_min_1_0= RULE_INT )
            // InternalMFTS.g:1258:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_min_1_0, grammarAccess.getTimeIntervalAccess().getMinINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_1_0,
            						"eu.stamp.mfts.MFTS.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeIntervalAccess().getColonKeyword_2());
            		
            // InternalMFTS.g:1278:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalMFTS.g:1279:4: (lv_max_3_0= RULE_INT )
            {
            // InternalMFTS.g:1279:4: (lv_max_3_0= RULE_INT )
            // InternalMFTS.g:1280:5: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_max_3_0, grammarAccess.getTimeIntervalAccess().getMaxINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_3_0,
            						"eu.stamp.mfts.MFTS.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTimeInterval"


    // $ANTLR start "entryRuleExpression"
    // InternalMFTS.g:1304:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMFTS.g:1304:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMFTS.g:1305:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMFTS.g:1311:1: ruleExpression returns [EObject current=null] : (this_ExternExpression_0= ruleExternExpression | this_ByteLiteral_1= ruleByteLiteral | this_CharLiteral_2= ruleCharLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_StringLiteral_5= ruleStringLiteral | this_DoubleLiteral_6= ruleDoubleLiteral ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExternExpression_0 = null;

        EObject this_ByteLiteral_1 = null;

        EObject this_CharLiteral_2 = null;

        EObject this_IntegerLiteral_3 = null;

        EObject this_BooleanLiteral_4 = null;

        EObject this_StringLiteral_5 = null;

        EObject this_DoubleLiteral_6 = null;



        	enterRule();

        try {
            // InternalMFTS.g:1317:2: ( (this_ExternExpression_0= ruleExternExpression | this_ByteLiteral_1= ruleByteLiteral | this_CharLiteral_2= ruleCharLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_StringLiteral_5= ruleStringLiteral | this_DoubleLiteral_6= ruleDoubleLiteral ) )
            // InternalMFTS.g:1318:2: (this_ExternExpression_0= ruleExternExpression | this_ByteLiteral_1= ruleByteLiteral | this_CharLiteral_2= ruleCharLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_StringLiteral_5= ruleStringLiteral | this_DoubleLiteral_6= ruleDoubleLiteral )
            {
            // InternalMFTS.g:1318:2: (this_ExternExpression_0= ruleExternExpression | this_ByteLiteral_1= ruleByteLiteral | this_CharLiteral_2= ruleCharLiteral | this_IntegerLiteral_3= ruleIntegerLiteral | this_BooleanLiteral_4= ruleBooleanLiteral | this_StringLiteral_5= ruleStringLiteral | this_DoubleLiteral_6= ruleDoubleLiteral )
            int alt24=7;
            switch ( input.LA(1) ) {
            case RULE_EXTERN:
                {
                alt24=1;
                }
                break;
            case RULE_BYTE:
                {
                alt24=2;
                }
                break;
            case RULE_CHAR:
                {
                alt24=3;
                }
                break;
            case RULE_INT:
                {
                alt24=4;
                }
                break;
            case 39:
            case 40:
                {
                alt24=5;
                }
                break;
            case RULE_STRING:
                {
                alt24=6;
                }
                break;
            case RULE_FLOAT:
                {
                alt24=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMFTS.g:1319:3: this_ExternExpression_0= ruleExternExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getExternExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternExpression_0=ruleExternExpression();

                    state._fsp--;


                    			current = this_ExternExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMFTS.g:1328:3: this_ByteLiteral_1= ruleByteLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getByteLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ByteLiteral_1=ruleByteLiteral();

                    state._fsp--;


                    			current = this_ByteLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMFTS.g:1337:3: this_CharLiteral_2= ruleCharLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCharLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharLiteral_2=ruleCharLiteral();

                    state._fsp--;


                    			current = this_CharLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMFTS.g:1346:3: this_IntegerLiteral_3= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIntegerLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_3=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMFTS.g:1355:3: this_BooleanLiteral_4= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_4=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMFTS.g:1364:3: this_StringLiteral_5= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_5=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMFTS.g:1373:3: this_DoubleLiteral_6= ruleDoubleLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDoubleLiteralParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleLiteral_6=ruleDoubleLiteral();

                    state._fsp--;


                    			current = this_DoubleLiteral_6;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExternExpression"
    // InternalMFTS.g:1385:1: entryRuleExternExpression returns [EObject current=null] : iv_ruleExternExpression= ruleExternExpression EOF ;
    public final EObject entryRuleExternExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternExpression = null;


        try {
            // InternalMFTS.g:1385:57: (iv_ruleExternExpression= ruleExternExpression EOF )
            // InternalMFTS.g:1386:2: iv_ruleExternExpression= ruleExternExpression EOF
            {
             newCompositeNode(grammarAccess.getExternExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternExpression=ruleExternExpression();

            state._fsp--;

             current =iv_ruleExternExpression; 
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
    // $ANTLR end "entryRuleExternExpression"


    // $ANTLR start "ruleExternExpression"
    // InternalMFTS.g:1392:1: ruleExternExpression returns [EObject current=null] : ( ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExternExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;
        Token otherlv_1=null;
        EObject lv_segments_2_0 = null;



        	enterRule();

        try {
            // InternalMFTS.g:1398:2: ( ( ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* ) )
            // InternalMFTS.g:1399:2: ( ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* )
            {
            // InternalMFTS.g:1399:2: ( ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )* )
            // InternalMFTS.g:1400:3: ( (lv_expression_0_0= RULE_EXTERN ) ) (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )*
            {
            // InternalMFTS.g:1400:3: ( (lv_expression_0_0= RULE_EXTERN ) )
            // InternalMFTS.g:1401:4: (lv_expression_0_0= RULE_EXTERN )
            {
            // InternalMFTS.g:1401:4: (lv_expression_0_0= RULE_EXTERN )
            // InternalMFTS.g:1402:5: lv_expression_0_0= RULE_EXTERN
            {
            lv_expression_0_0=(Token)match(input,RULE_EXTERN,FOLLOW_27); 

            					newLeafNode(lv_expression_0_0, grammarAccess.getExternExpressionAccess().getExpressionEXTERNTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_0_0,
            						"eu.stamp.mfts.MFTS.EXTERN");
            				

            }


            }

            // InternalMFTS.g:1418:3: (otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMFTS.g:1419:4: otherlv_1= '&' ( (lv_segments_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExternExpressionAccess().getAmpersandKeyword_1_0());
            	    			
            	    // InternalMFTS.g:1423:4: ( (lv_segments_2_0= ruleExpression ) )
            	    // InternalMFTS.g:1424:5: (lv_segments_2_0= ruleExpression )
            	    {
            	    // InternalMFTS.g:1424:5: (lv_segments_2_0= ruleExpression )
            	    // InternalMFTS.g:1425:6: lv_segments_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternExpressionAccess().getSegmentsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_segments_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"segments",
            	    							lv_segments_2_0,
            	    							"eu.stamp.mfts.MFTS.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleExternExpression"


    // $ANTLR start "entryRuleByteLiteral"
    // InternalMFTS.g:1447:1: entryRuleByteLiteral returns [EObject current=null] : iv_ruleByteLiteral= ruleByteLiteral EOF ;
    public final EObject entryRuleByteLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByteLiteral = null;


        try {
            // InternalMFTS.g:1447:52: (iv_ruleByteLiteral= ruleByteLiteral EOF )
            // InternalMFTS.g:1448:2: iv_ruleByteLiteral= ruleByteLiteral EOF
            {
             newCompositeNode(grammarAccess.getByteLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleByteLiteral=ruleByteLiteral();

            state._fsp--;

             current =iv_ruleByteLiteral; 
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
    // $ANTLR end "entryRuleByteLiteral"


    // $ANTLR start "ruleByteLiteral"
    // InternalMFTS.g:1454:1: ruleByteLiteral returns [EObject current=null] : ( (lv_byteValue_0_0= RULE_BYTE ) ) ;
    public final EObject ruleByteLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_byteValue_0_0=null;


        	enterRule();

        try {
            // InternalMFTS.g:1460:2: ( ( (lv_byteValue_0_0= RULE_BYTE ) ) )
            // InternalMFTS.g:1461:2: ( (lv_byteValue_0_0= RULE_BYTE ) )
            {
            // InternalMFTS.g:1461:2: ( (lv_byteValue_0_0= RULE_BYTE ) )
            // InternalMFTS.g:1462:3: (lv_byteValue_0_0= RULE_BYTE )
            {
            // InternalMFTS.g:1462:3: (lv_byteValue_0_0= RULE_BYTE )
            // InternalMFTS.g:1463:4: lv_byteValue_0_0= RULE_BYTE
            {
            lv_byteValue_0_0=(Token)match(input,RULE_BYTE,FOLLOW_2); 

            				newLeafNode(lv_byteValue_0_0, grammarAccess.getByteLiteralAccess().getByteValueBYTETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getByteLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"byteValue",
            					lv_byteValue_0_0,
            					"eu.stamp.mfts.MFTS.BYTE");
            			

            }


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
    // $ANTLR end "ruleByteLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // InternalMFTS.g:1482:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // InternalMFTS.g:1482:52: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // InternalMFTS.g:1483:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
             newCompositeNode(grammarAccess.getCharLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;

             current =iv_ruleCharLiteral; 
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
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // InternalMFTS.g:1489:1: ruleCharLiteral returns [EObject current=null] : ( (lv_charValue_0_0= RULE_CHAR ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_charValue_0_0=null;


        	enterRule();

        try {
            // InternalMFTS.g:1495:2: ( ( (lv_charValue_0_0= RULE_CHAR ) ) )
            // InternalMFTS.g:1496:2: ( (lv_charValue_0_0= RULE_CHAR ) )
            {
            // InternalMFTS.g:1496:2: ( (lv_charValue_0_0= RULE_CHAR ) )
            // InternalMFTS.g:1497:3: (lv_charValue_0_0= RULE_CHAR )
            {
            // InternalMFTS.g:1497:3: (lv_charValue_0_0= RULE_CHAR )
            // InternalMFTS.g:1498:4: lv_charValue_0_0= RULE_CHAR
            {
            lv_charValue_0_0=(Token)match(input,RULE_CHAR,FOLLOW_2); 

            				newLeafNode(lv_charValue_0_0, grammarAccess.getCharLiteralAccess().getCharValueCHARTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCharLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"charValue",
            					lv_charValue_0_0,
            					"eu.stamp.mfts.MFTS.CHAR");
            			

            }


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
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalMFTS.g:1517:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalMFTS.g:1517:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalMFTS.g:1518:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalMFTS.g:1524:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_intValue_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;


        	enterRule();

        try {
            // InternalMFTS.g:1530:2: ( ( (lv_intValue_0_0= RULE_INT ) ) )
            // InternalMFTS.g:1531:2: ( (lv_intValue_0_0= RULE_INT ) )
            {
            // InternalMFTS.g:1531:2: ( (lv_intValue_0_0= RULE_INT ) )
            // InternalMFTS.g:1532:3: (lv_intValue_0_0= RULE_INT )
            {
            // InternalMFTS.g:1532:3: (lv_intValue_0_0= RULE_INT )
            // InternalMFTS.g:1533:4: lv_intValue_0_0= RULE_INT
            {
            lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_intValue_0_0, grammarAccess.getIntegerLiteralAccess().getIntValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"intValue",
            					lv_intValue_0_0,
            					"eu.stamp.mfts.MFTS.INT");
            			

            }


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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMFTS.g:1552:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalMFTS.g:1552:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalMFTS.g:1553:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMFTS.g:1559:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_boolValue_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_boolValue_0_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMFTS.g:1565:2: ( ( ( (lv_boolValue_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) ) )
            // InternalMFTS.g:1566:2: ( ( (lv_boolValue_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) )
            {
            // InternalMFTS.g:1566:2: ( ( (lv_boolValue_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMFTS.g:1567:3: ( (lv_boolValue_0_0= 'true' ) )
                    {
                    // InternalMFTS.g:1567:3: ( (lv_boolValue_0_0= 'true' ) )
                    // InternalMFTS.g:1568:4: (lv_boolValue_0_0= 'true' )
                    {
                    // InternalMFTS.g:1568:4: (lv_boolValue_0_0= 'true' )
                    // InternalMFTS.g:1569:5: lv_boolValue_0_0= 'true'
                    {
                    lv_boolValue_0_0=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_boolValue_0_0, grammarAccess.getBooleanLiteralAccess().getBoolValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(current, "boolValue", true, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMFTS.g:1582:3: ( () otherlv_2= 'false' )
                    {
                    // InternalMFTS.g:1582:3: ( () otherlv_2= 'false' )
                    // InternalMFTS.g:1583:4: () otherlv_2= 'false'
                    {
                    // InternalMFTS.g:1583:4: ()
                    // InternalMFTS.g:1584:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                    			

                    }


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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMFTS.g:1599:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMFTS.g:1599:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMFTS.g:1600:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMFTS.g:1606:1: ruleStringLiteral returns [EObject current=null] : ( (lv_stringValue_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;


        	enterRule();

        try {
            // InternalMFTS.g:1612:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) )
            // InternalMFTS.g:1613:2: ( (lv_stringValue_0_0= RULE_STRING ) )
            {
            // InternalMFTS.g:1613:2: ( (lv_stringValue_0_0= RULE_STRING ) )
            // InternalMFTS.g:1614:3: (lv_stringValue_0_0= RULE_STRING )
            {
            // InternalMFTS.g:1614:3: (lv_stringValue_0_0= RULE_STRING )
            // InternalMFTS.g:1615:4: lv_stringValue_0_0= RULE_STRING
            {
            lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_stringValue_0_0, grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"stringValue",
            					lv_stringValue_0_0,
            					"eu.stamp.mfts.MFTS.STRING");
            			

            }


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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalMFTS.g:1634:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // InternalMFTS.g:1634:54: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // InternalMFTS.g:1635:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
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
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalMFTS.g:1641:1: ruleDoubleLiteral returns [EObject current=null] : ( (lv_doubleValue_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_doubleValue_0_0=null;


        	enterRule();

        try {
            // InternalMFTS.g:1647:2: ( ( (lv_doubleValue_0_0= RULE_FLOAT ) ) )
            // InternalMFTS.g:1648:2: ( (lv_doubleValue_0_0= RULE_FLOAT ) )
            {
            // InternalMFTS.g:1648:2: ( (lv_doubleValue_0_0= RULE_FLOAT ) )
            // InternalMFTS.g:1649:3: (lv_doubleValue_0_0= RULE_FLOAT )
            {
            // InternalMFTS.g:1649:3: (lv_doubleValue_0_0= RULE_FLOAT )
            // InternalMFTS.g:1650:4: lv_doubleValue_0_0= RULE_FLOAT
            {
            lv_doubleValue_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            				newLeafNode(lv_doubleValue_0_0, grammarAccess.getDoubleLiteralAccess().getDoubleValueFLOATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDoubleLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"doubleValue",
            					lv_doubleValue_0_0,
            					"eu.stamp.mfts.MFTS.FLOAT");
            			

            }


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
    // $ANTLR end "ruleDoubleLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000A410002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000002D0220010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000018001000F60L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000018000000F60L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});

}