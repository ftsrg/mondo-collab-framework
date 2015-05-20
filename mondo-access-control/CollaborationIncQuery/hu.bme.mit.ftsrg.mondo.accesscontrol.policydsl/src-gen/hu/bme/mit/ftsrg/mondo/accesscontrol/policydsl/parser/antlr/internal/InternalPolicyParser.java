package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.services.PolicyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolicyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Policy'", "'{'", "'permission'", "';'", "'query'", "'pattern'", "'}'", "'Association'", "'defaultPermission'", "'override'", "'target'", "'.'", "'policies'", "','", "'UNSET'", "'DENY'", "'ALLOW'", "'GROUP'", "'USER'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPolicyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPolicyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPolicyParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g"; }



     	private PolicyGrammarAccess grammarAccess;
     	
        public InternalPolicyParser(TokenStream input, PolicyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PolicyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElements ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:80:28: ( ( (lv_elements_0_0= ruleElements ) )* )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:81:1: ( (lv_elements_0_0= ruleElements ) )*
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:81:1: ( (lv_elements_0_0= ruleElements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:82:1: (lv_elements_0_0= ruleElements )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:82:1: (lv_elements_0_0= ruleElements )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:83:3: lv_elements_0_0= ruleElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementsParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElements_in_ruleModel130);
            	    lv_elements_0_0=ruleElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Elements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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


    // $ANTLR start "entryRulePolicy"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:107:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:108:2: (iv_rulePolicy= rulePolicy EOF )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:109:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy166);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy176); 

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
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:116:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_query_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_pattern_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_permission_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:119:28: ( (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:120:1: (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:120:1: (otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:120:3: otherlv_0= 'Policy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePolicy213); 

                	newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
                
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:125:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePolicy230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPolicyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:142:2: (otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:142:4: otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePolicy248); 

                	newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2_0());
                
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:146:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:148:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:148:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:149:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1());
            	
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:152:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:153:3: ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:153:3: ( ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:155:4: ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:155:4: ({...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:156:5: {...}? => ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0)");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:156:105: ( ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:157:6: ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0);
            	    	 				
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:160:6: ({...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:160:7: {...}? => (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "true");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:160:16: (otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';' )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:160:18: otherlv_4= 'permission' ( (lv_permission_5_0= rulePermissionType ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePolicy306); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getPermissionKeyword_2_1_0_0());
            	        
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:164:1: ( (lv_permission_5_0= rulePermissionType ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:165:1: (lv_permission_5_0= rulePermissionType )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:165:1: (lv_permission_5_0= rulePermissionType )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:166:3: lv_permission_5_0= rulePermissionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getPermissionPermissionTypeEnumRuleCall_2_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermissionType_in_rulePolicy327);
            	    lv_permission_5_0=rulePermissionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"permission",
            	            		lv_permission_5_0, 
            	            		"PermissionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulePolicy339); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:193:4: ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:193:4: ({...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:194:5: {...}? => ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1)");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:194:105: ( ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:195:6: ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1);
            	    	 				
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:198:6: ({...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:198:7: {...}? => (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "true");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:198:16: (otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:198:18: otherlv_7= 'query' ( (lv_query_8_0= RULE_STRING ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_rulePolicy407); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getQueryKeyword_2_1_1_0());
            	        
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:202:1: ( (lv_query_8_0= RULE_STRING ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:203:1: (lv_query_8_0= RULE_STRING )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:203:1: (lv_query_8_0= RULE_STRING )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:204:3: lv_query_8_0= RULE_STRING
            	    {
            	    lv_query_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePolicy424); 

            	    			newLeafNode(lv_query_8_0, grammarAccess.getPolicyAccess().getQuerySTRINGTerminalRuleCall_2_1_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPolicyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"query",
            	            		lv_query_8_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_rulePolicy441); 

            	        	newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:231:4: ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:231:4: ({...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:232:5: {...}? => ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2)");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:232:105: ( ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:233:6: ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2);
            	    	 				
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:236:6: ({...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:236:7: {...}? => (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "true");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:236:16: (otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';' )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:236:18: otherlv_10= 'pattern' ( (lv_pattern_11_0= RULE_STRING ) ) otherlv_12= ';'
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_rulePolicy509); 

            	        	newLeafNode(otherlv_10, grammarAccess.getPolicyAccess().getPatternKeyword_2_1_2_0());
            	        
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:240:1: ( (lv_pattern_11_0= RULE_STRING ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:241:1: (lv_pattern_11_0= RULE_STRING )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:241:1: (lv_pattern_11_0= RULE_STRING )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:242:3: lv_pattern_11_0= RULE_STRING
            	    {
            	    lv_pattern_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePolicy526); 

            	    			newLeafNode(lv_pattern_11_0, grammarAccess.getPolicyAccess().getPatternSTRINGTerminalRuleCall_2_1_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPolicyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"pattern",
            	            		lv_pattern_11_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_12=(Token)match(input,14,FOLLOW_14_in_rulePolicy543); 

            	        	newLeafNode(otherlv_12, grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1()) ) {
                throw new FailedPredicateException(input, "rulePolicy", "getUnorderedGroupHelper().canLeave(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1());
            	

            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_rulePolicy602); 

                	newLeafNode(otherlv_13, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_2_2());
                

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
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleAssociation"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:289:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:290:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:291:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation639);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation649); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:298:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Association' (otherlv_1= '{' ( (lv_teszt_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_teszt_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_target_id_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Enumerator lv_defaultPermission_5_0 = null;

        Enumerator lv_override_8_0 = null;

        Enumerator lv_target_11_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:301:28: ( (otherlv_0= 'Association' (otherlv_1= '{' ( (lv_teszt_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:302:1: (otherlv_0= 'Association' (otherlv_1= '{' ( (lv_teszt_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:302:1: (otherlv_0= 'Association' (otherlv_1= '{' ( (lv_teszt_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:302:3: otherlv_0= 'Association' (otherlv_1= '{' ( (lv_teszt_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAssociation686); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
                
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:306:1: (otherlv_1= '{' ( (lv_teszt_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:306:3: otherlv_1= '{' ( (lv_teszt_2_0= RULE_STRING ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) ) otherlv_20= '}'
            {
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAssociation699); 

                	newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_1_0());
                
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:310:1: ( (lv_teszt_2_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:311:1: (lv_teszt_2_0= RULE_STRING )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:311:1: (lv_teszt_2_0= RULE_STRING )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:312:3: lv_teszt_2_0= RULE_STRING
                    {
                    lv_teszt_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation716); 

                    			newLeafNode(lv_teszt_2_0, grammarAccess.getAssociationAccess().getTesztSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"teszt",
                            		lv_teszt_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:328:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:330:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:330:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:331:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            	
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:334:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?)
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:335:3: ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+ {...}?
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:335:3: ( ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                int LA5_0 = input.LA(1);

                if ( LA5_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3) ) {
                    alt5=4;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:337:4: ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:337:4: ({...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:338:5: {...}? => ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:338:110: ( ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:339:6: ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0);
            	    	 				
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:342:6: ({...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:342:7: {...}? => (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:342:16: (otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';' )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:342:18: otherlv_4= 'defaultPermission' ( (lv_defaultPermission_5_0= rulePermissionType ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAssociation780); 

            	        	newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getDefaultPermissionKeyword_1_2_0_0());
            	        
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:346:1: ( (lv_defaultPermission_5_0= rulePermissionType ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:347:1: (lv_defaultPermission_5_0= rulePermissionType )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:347:1: (lv_defaultPermission_5_0= rulePermissionType )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:348:3: lv_defaultPermission_5_0= rulePermissionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssociationAccess().getDefaultPermissionPermissionTypeEnumRuleCall_1_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermissionType_in_ruleAssociation801);
            	    lv_defaultPermission_5_0=rulePermissionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"defaultPermission",
            	            		lv_defaultPermission_5_0, 
            	            		"PermissionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleAssociation813); 

            	        	newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:375:4: ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:375:4: ({...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:376:5: {...}? => ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:376:110: ( ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:377:6: ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1);
            	    	 				
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:380:6: ({...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:380:7: {...}? => (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:380:16: (otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';' )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:380:18: otherlv_7= 'override' ( (lv_override_8_0= rulePermissionType ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleAssociation881); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getOverrideKeyword_1_2_1_0());
            	        
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:384:1: ( (lv_override_8_0= rulePermissionType ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:385:1: (lv_override_8_0= rulePermissionType )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:385:1: (lv_override_8_0= rulePermissionType )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:386:3: lv_override_8_0= rulePermissionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssociationAccess().getOverridePermissionTypeEnumRuleCall_1_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermissionType_in_ruleAssociation902);
            	    lv_override_8_0=rulePermissionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"override",
            	            		lv_override_8_0, 
            	            		"PermissionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleAssociation914); 

            	        	newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:413:4: ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:413:4: ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:414:5: {...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:414:110: ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:415:6: ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2);
            	    	 				
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:418:6: ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:418:7: {...}? => (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:418:16: (otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:418:18: otherlv_10= 'target' ( (lv_target_11_0= ruleTargetType ) ) otherlv_12= '.' ( (lv_target_id_13_0= RULE_STRING ) ) otherlv_14= ';'
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleAssociation982); 

            	        	newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getTargetKeyword_1_2_2_0());
            	        
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:422:1: ( (lv_target_11_0= ruleTargetType ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:423:1: (lv_target_11_0= ruleTargetType )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:423:1: (lv_target_11_0= ruleTargetType )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:424:3: lv_target_11_0= ruleTargetType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssociationAccess().getTargetTargetTypeEnumRuleCall_1_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTargetType_in_ruleAssociation1003);
            	    lv_target_11_0=ruleTargetType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"target",
            	            		lv_target_11_0, 
            	            		"TargetType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleAssociation1015); 

            	        	newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getFullStopKeyword_1_2_2_2());
            	        
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:444:1: ( (lv_target_id_13_0= RULE_STRING ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:445:1: (lv_target_id_13_0= RULE_STRING )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:445:1: (lv_target_id_13_0= RULE_STRING )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:446:3: lv_target_id_13_0= RULE_STRING
            	    {
            	    lv_target_id_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation1032); 

            	    			newLeafNode(lv_target_id_13_0, grammarAccess.getAssociationAccess().getTarget_idSTRINGTerminalRuleCall_1_2_2_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAssociationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"target_id",
            	            		lv_target_id_13_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleAssociation1049); 

            	        	newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_2_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:473:4: ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:473:4: ({...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:474:5: {...}? => ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3)");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:474:110: ( ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:475:6: ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3);
            	    	 				
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:478:6: ({...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:478:7: {...}? => (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:478:16: (otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';' )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:478:18: otherlv_15= 'policies' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= ';'
            	    {
            	    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleAssociation1117); 

            	        	newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getPoliciesKeyword_1_2_3_0());
            	        
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:482:1: ( (otherlv_16= RULE_ID ) )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:483:1: (otherlv_16= RULE_ID )
            	    {
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:483:1: (otherlv_16= RULE_ID )
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:484:3: otherlv_16= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAssociationRule());
            	    	        }
            	            
            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation1137); 

            	    		newLeafNode(otherlv_16, grammarAccess.getAssociationAccess().getPoliciesPolicyCrossReference_1_2_3_1_0()); 
            	    	

            	    }


            	    }

            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:495:2: (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==24) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:495:4: otherlv_17= ',' ( (otherlv_18= RULE_ID ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleAssociation1150); 

            	    	        	newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getCommaKeyword_1_2_3_2_0());
            	    	        
            	    	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:499:1: ( (otherlv_18= RULE_ID ) )
            	    	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:500:1: (otherlv_18= RULE_ID )
            	    	    {
            	    	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:500:1: (otherlv_18= RULE_ID )
            	    	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:501:3: otherlv_18= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getAssociationRule());
            	    	    	        }
            	    	            
            	    	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation1170); 

            	    	    		newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getPoliciesPolicyCrossReference_1_2_3_2_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,14,FOLLOW_14_in_ruleAssociation1184); 

            	        	newLeafNode(otherlv_19, grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2()) ) {
                throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            	

            }

            otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleAssociation1243); 

                	newLeafNode(otherlv_20, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_1_3());
                

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleElements"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:543:1: entryRuleElements returns [EObject current=null] : iv_ruleElements= ruleElements EOF ;
    public final EObject entryRuleElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElements = null;


        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:544:2: (iv_ruleElements= ruleElements EOF )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:545:2: iv_ruleElements= ruleElements EOF
            {
             newCompositeNode(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_ruleElements_in_entryRuleElements1280);
            iv_ruleElements=ruleElements();

            state._fsp--;

             current =iv_ruleElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElements1290); 

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
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:552:1: ruleElements returns [EObject current=null] : (this_Policy_0= rulePolicy | this_Association_1= ruleAssociation ) ;
    public final EObject ruleElements() throws RecognitionException {
        EObject current = null;

        EObject this_Policy_0 = null;

        EObject this_Association_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:555:28: ( (this_Policy_0= rulePolicy | this_Association_1= ruleAssociation ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:556:1: (this_Policy_0= rulePolicy | this_Association_1= ruleAssociation )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:556:1: (this_Policy_0= rulePolicy | this_Association_1= ruleAssociation )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:557:5: this_Policy_0= rulePolicy
                    {
                     
                            newCompositeNode(grammarAccess.getElementsAccess().getPolicyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePolicy_in_ruleElements1337);
                    this_Policy_0=rulePolicy();

                    state._fsp--;

                     
                            current = this_Policy_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:567:5: this_Association_1= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getElementsAccess().getAssociationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssociation_in_ruleElements1364);
                    this_Association_1=ruleAssociation();

                    state._fsp--;

                     
                            current = this_Association_1; 
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
    // $ANTLR end "ruleElements"


    // $ANTLR start "rulePermissionType"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:583:1: rulePermissionType returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= 'DENY' ) | (enumLiteral_2= 'ALLOW' ) ) ;
    public final Enumerator rulePermissionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:585:28: ( ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= 'DENY' ) | (enumLiteral_2= 'ALLOW' ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:586:1: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= 'DENY' ) | (enumLiteral_2= 'ALLOW' ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:586:1: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= 'DENY' ) | (enumLiteral_2= 'ALLOW' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:586:2: (enumLiteral_0= 'UNSET' )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:586:2: (enumLiteral_0= 'UNSET' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:586:4: enumLiteral_0= 'UNSET'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_rulePermissionType1413); 

                            current = grammarAccess.getPermissionTypeAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPermissionTypeAccess().getUNSETEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:592:6: (enumLiteral_1= 'DENY' )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:592:6: (enumLiteral_1= 'DENY' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:592:8: enumLiteral_1= 'DENY'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_rulePermissionType1430); 

                            current = grammarAccess.getPermissionTypeAccess().getDENYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPermissionTypeAccess().getDENYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:598:6: (enumLiteral_2= 'ALLOW' )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:598:6: (enumLiteral_2= 'ALLOW' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:598:8: enumLiteral_2= 'ALLOW'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_rulePermissionType1447); 

                            current = grammarAccess.getPermissionTypeAccess().getALLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPermissionTypeAccess().getALLOWEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "rulePermissionType"


    // $ANTLR start "ruleTargetType"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:608:1: ruleTargetType returns [Enumerator current=null] : ( (enumLiteral_0= 'GROUP' ) | (enumLiteral_1= 'USER' ) ) ;
    public final Enumerator ruleTargetType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:610:28: ( ( (enumLiteral_0= 'GROUP' ) | (enumLiteral_1= 'USER' ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:611:1: ( (enumLiteral_0= 'GROUP' ) | (enumLiteral_1= 'USER' ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:611:1: ( (enumLiteral_0= 'GROUP' ) | (enumLiteral_1= 'USER' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:611:2: (enumLiteral_0= 'GROUP' )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:611:2: (enumLiteral_0= 'GROUP' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:611:4: enumLiteral_0= 'GROUP'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleTargetType1492); 

                            current = grammarAccess.getTargetTypeAccess().getGROUPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTargetTypeAccess().getGROUPEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:617:6: (enumLiteral_1= 'USER' )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:617:6: (enumLiteral_1= 'USER' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/parser/antlr/internal/InternalPolicy.g:617:8: enumLiteral_1= 'USER'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleTargetType1509); 

                            current = grammarAccess.getTargetTypeAccess().getUSEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTargetTypeAccess().getUSEREnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleTargetType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElements_in_ruleModel130 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePolicy213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePolicy230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePolicy248 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_13_in_rulePolicy306 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rulePermissionType_in_rulePolicy327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePolicy339 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_15_in_rulePolicy407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePolicy424 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePolicy441 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_16_in_rulePolicy509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePolicy526 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePolicy543 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_17_in_rulePolicy602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssociation686 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssociation699 = new BitSet(new long[]{0x0000000000B80020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation716 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_19_in_ruleAssociation780 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rulePermissionType_in_ruleAssociation801 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation813 = new BitSet(new long[]{0x0000000000BA0000L});
    public static final BitSet FOLLOW_20_in_ruleAssociation881 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rulePermissionType_in_ruleAssociation902 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation914 = new BitSet(new long[]{0x0000000000BA0000L});
    public static final BitSet FOLLOW_21_in_ruleAssociation982 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleTargetType_in_ruleAssociation1003 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssociation1015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation1032 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation1049 = new BitSet(new long[]{0x0000000000BA0000L});
    public static final BitSet FOLLOW_23_in_ruleAssociation1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation1137 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleAssociation1150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation1170 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation1184 = new BitSet(new long[]{0x0000000000BA0000L});
    public static final BitSet FOLLOW_17_in_ruleAssociation1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElements_in_entryRuleElements1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElements1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_ruleElements1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleElements1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePermissionType1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePermissionType1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePermissionType1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTargetType1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTargetType1509 = new BitSet(new long[]{0x0000000000000002L});

}
