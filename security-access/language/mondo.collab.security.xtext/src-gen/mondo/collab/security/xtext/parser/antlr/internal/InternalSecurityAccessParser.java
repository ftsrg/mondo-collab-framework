package mondo.collab.security.xtext.parser.antlr.internal; 

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
import mondo.collab.security.xtext.services.SecurityAccessGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityAccessParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'user'", "'group'", "'{'", "'}'", "'policy'", "'rule'", "'query'", "';'", "'bind'", "'<>'", "'r'", "'v'", "'o'", "'import'", "'R'", "'W'", "'RW'", "'deny'", "'permit'", "'obfuscate'", "'deny-overrides'", "'permit-overrides'", "'first-applicable'", "'only-one-applicable-policy'", "'ordered-deny-overrides'", "'ordered-permit-overrides'", "'deny-unless-permit'", "'permit-unless-permit'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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


        public InternalSecurityAccessParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSecurityAccessParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSecurityAccessParser.tokenNames; }
    public String getGrammarFileName() { return "../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g"; }



     	private SecurityAccessGrammarAccess grammarAccess;
     	
        public InternalSecurityAccessParser(TokenStream input, SecurityAccessGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AccessControlModel";	
       	}
       	
       	@Override
       	protected SecurityAccessGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAccessControlModel"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:68:1: entryRuleAccessControlModel returns [EObject current=null] : iv_ruleAccessControlModel= ruleAccessControlModel EOF ;
    public final EObject entryRuleAccessControlModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControlModel = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:69:2: (iv_ruleAccessControlModel= ruleAccessControlModel EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:70:2: iv_ruleAccessControlModel= ruleAccessControlModel EOF
            {
             newCompositeNode(grammarAccess.getAccessControlModelRule()); 
            pushFollow(FOLLOW_ruleAccessControlModel_in_entryRuleAccessControlModel75);
            iv_ruleAccessControlModel=ruleAccessControlModel();

            state._fsp--;

             current =iv_ruleAccessControlModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessControlModel85); 

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
    // $ANTLR end "entryRuleAccessControlModel"


    // $ANTLR start "ruleAccessControlModel"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:77:1: ruleAccessControlModel returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) ) ) ;
    public final EObject ruleAccessControlModel() throws RecognitionException {
        EObject current = null;

        EObject lv_roles_0_0 = null;

        EObject lv_policy_1_0 = null;


         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:80:28: ( ( ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:81:1: ( ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:81:1: ( ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:81:2: ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:81:2: ( (lv_roles_0_0= ruleRole ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:82:1: (lv_roles_0_0= ruleRole )
            	    {
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:82:1: (lv_roles_0_0= ruleRole )
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:83:3: lv_roles_0_0= ruleRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAccessControlModelAccess().getRolesRoleParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRole_in_ruleAccessControlModel131);
            	    lv_roles_0_0=ruleRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAccessControlModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roles",
            	            		lv_roles_0_0, 
            	            		"Role");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:99:3: ( (lv_policy_1_0= rulePolicy ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:100:1: (lv_policy_1_0= rulePolicy )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:100:1: (lv_policy_1_0= rulePolicy )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:101:3: lv_policy_1_0= rulePolicy
            {
             
            	        newCompositeNode(grammarAccess.getAccessControlModelAccess().getPolicyPolicyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePolicy_in_ruleAccessControlModel153);
            lv_policy_1_0=rulePolicy();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccessControlModelRule());
            	        }
                   		set(
                   			current, 
                   			"policy",
                    		lv_policy_1_0, 
                    		"Policy");
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
    // $ANTLR end "ruleAccessControlModel"


    // $ANTLR start "entryRuleRole"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:125:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:126:2: (iv_ruleRole= ruleRole EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:127:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole189);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole199); 

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
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:134:1: ruleRole returns [EObject current=null] : (this_User_0= ruleUser | this_Group_1= ruleGroup ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Group_1 = null;


         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:137:28: ( (this_User_0= ruleUser | this_Group_1= ruleGroup ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:138:1: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:138:1: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:139:5: this_User_0= ruleUser
                    {
                     
                            newCompositeNode(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUser_in_ruleRole246);
                    this_User_0=ruleUser();

                    state._fsp--;

                     
                            current = this_User_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:149:5: this_Group_1= ruleGroup
                    {
                     
                            newCompositeNode(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGroup_in_ruleRole273);
                    this_Group_1=ruleGroup();

                    state._fsp--;

                     
                            current = this_Group_1; 
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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:165:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:166:2: (iv_ruleUser= ruleUser EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:167:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser308);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser318); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:174:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:177:28: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:178:1: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:178:1: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:178:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleUser355); 

                	newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:182:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:183:1: (lv_name_1_0= RULE_ID )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:183:1: (lv_name_1_0= RULE_ID )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser372); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleGroup"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:208:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:209:2: (iv_ruleGroup= ruleGroup EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:210:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup413);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup423); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:217:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:220:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:221:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:221:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:221:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleGroup460); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:225:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:226:1: (lv_name_1_0= RULE_ID )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:226:1: (lv_name_1_0= RULE_ID )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:227:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroup477); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleGroup494); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:247:1: ( (otherlv_3= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:248:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:248:1: (otherlv_3= RULE_ID )
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:249:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroup514); 

            	    		newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleGroup527); 

                	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePolicy"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:272:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:273:2: (iv_rulePolicy= rulePolicy EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:274:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy563);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy573); 

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
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:281:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleConflictResolutionTypes ) ) ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_imports_5_0= ruleImportResource ) )* ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_rules_6_0 = null;


         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:284:28: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleConflictResolutionTypes ) ) ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_imports_5_0= ruleImportResource ) )* ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:285:1: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleConflictResolutionTypes ) ) ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_imports_5_0= ruleImportResource ) )* ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:285:1: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleConflictResolutionTypes ) ) ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_imports_5_0= ruleImportResource ) )* ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}' )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:285:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleConflictResolutionTypes ) ) ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_imports_5_0= ruleImportResource ) )* ( (lv_rules_6_0= ruleRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulePolicy610); 

                	newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:289:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:290:1: (lv_name_1_0= RULE_ID )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:290:1: (lv_name_1_0= RULE_ID )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:291:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePolicy627); 

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

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:307:2: ( (lv_type_2_0= ruleConflictResolutionTypes ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:308:1: (lv_type_2_0= ruleConflictResolutionTypes )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:308:1: (lv_type_2_0= ruleConflictResolutionTypes )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:309:3: lv_type_2_0= ruleConflictResolutionTypes
            {
             
            	        newCompositeNode(grammarAccess.getPolicyAccess().getTypeConflictResolutionTypesEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConflictResolutionTypes_in_rulePolicy653);
            lv_type_2_0=ruleConflictResolutionTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ConflictResolutionTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:325:2: ( (otherlv_3= RULE_ID ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:326:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:326:1: (otherlv_3= RULE_ID )
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:327:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPolicyRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePolicy673); 

            	    		newLeafNode(otherlv_3, grammarAccess.getPolicyAccess().getRolesRoleCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePolicy686); 

                	newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_4());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:342:1: ( (lv_imports_5_0= ruleImportResource ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:343:1: (lv_imports_5_0= ruleImportResource )
            	    {
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:343:1: (lv_imports_5_0= ruleImportResource )
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:344:3: lv_imports_5_0= ruleImportResource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getImportsImportResourceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportResource_in_rulePolicy707);
            	    lv_imports_5_0=ruleImportResource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_5_0, 
            	            		"ImportResource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:360:3: ( (lv_rules_6_0= ruleRule ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:361:1: (lv_rules_6_0= ruleRule )
            	    {
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:361:1: (lv_rules_6_0= ruleRule )
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:362:3: lv_rules_6_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_rulePolicy729);
            	    lv_rules_6_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_6_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_rulePolicy742); 

                	newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleRule"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:390:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:391:2: (iv_ruleRule= ruleRule EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:392:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule778);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule788); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:399:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleRuleType ) ) ( (lv_rights_3_0= ruleRuleRights ) ) otherlv_4= '{' otherlv_5= 'query' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ';' )? ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_type_2_0 = null;

        Enumerator lv_rights_3_0 = null;

        EObject lv_bindings_8_0 = null;


         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:402:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleRuleType ) ) ( (lv_rights_3_0= ruleRuleRights ) ) otherlv_4= '{' otherlv_5= 'query' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ';' )? ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:403:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleRuleType ) ) ( (lv_rights_3_0= ruleRuleRights ) ) otherlv_4= '{' otherlv_5= 'query' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ';' )? ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:403:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleRuleType ) ) ( (lv_rights_3_0= ruleRuleRights ) ) otherlv_4= '{' otherlv_5= 'query' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ';' )? ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}' )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:403:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleRuleType ) ) ( (lv_rights_3_0= ruleRuleRights ) ) otherlv_4= '{' otherlv_5= 'query' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ';' )? ( (lv_bindings_8_0= ruleBinding ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRule825); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:407:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:408:1: (lv_name_1_0= RULE_ID )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:408:1: (lv_name_1_0= RULE_ID )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:409:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule842); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:425:2: ( (lv_type_2_0= ruleRuleType ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:426:1: (lv_type_2_0= ruleRuleType )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:426:1: (lv_type_2_0= ruleRuleType )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:427:3: lv_type_2_0= ruleRuleType
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleType_in_ruleRule868);
            lv_type_2_0=ruleRuleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"RuleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:443:2: ( (lv_rights_3_0= ruleRuleRights ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:444:1: (lv_rights_3_0= ruleRuleRights )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:444:1: (lv_rights_3_0= ruleRuleRights )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:445:3: lv_rights_3_0= ruleRuleRights
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getRightsRuleRightsEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleRights_in_ruleRule889);
            lv_rights_3_0=ruleRuleRights();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"rights",
                    		lv_rights_3_0, 
                    		"RuleRights");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRule901); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleRule913); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getQueryKeyword_5());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:469:1: ( (otherlv_6= RULE_STRING ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:470:1: (otherlv_6= RULE_STRING )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:470:1: (otherlv_6= RULE_STRING )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:471:3: otherlv_6= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRule933); 

            		newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getPatternPatternCrossReference_6_0()); 
            	

            }


            }

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:482:2: (otherlv_7= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:482:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleRule946); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getSemicolonKeyword_7());
                        

                    }
                    break;

            }

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:486:3: ( (lv_bindings_8_0= ruleBinding ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:487:1: (lv_bindings_8_0= ruleBinding )
            	    {
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:487:1: (lv_bindings_8_0= ruleBinding )
            	    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:488:3: lv_bindings_8_0= ruleBinding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinding_in_ruleRule969);
            	    lv_bindings_8_0=ruleBinding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bindings",
            	            		lv_bindings_8_0, 
            	            		"Binding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRule982); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleBinding"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:516:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:517:2: (iv_ruleBinding= ruleBinding EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:518:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding1018);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding1028); 

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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:525:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<>' ( (lv_value_3_0= ruleBind ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:528:28: ( (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<>' ( (lv_value_3_0= ruleBind ) ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:529:1: (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<>' ( (lv_value_3_0= ruleBind ) ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:529:1: (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<>' ( (lv_value_3_0= ruleBind ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:529:3: otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<>' ( (lv_value_3_0= ruleBind ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleBinding1065); 

                	newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:533:1: ( (otherlv_1= RULE_ID ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:534:1: (otherlv_1= RULE_ID )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:534:1: (otherlv_1= RULE_ID )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:535:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinding1085); 

            		newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getParamVariableCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleBinding1097); 

                	newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getLessThanSignGreaterThanSignKeyword_2());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:550:1: ( (lv_value_3_0= ruleBind ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:551:1: (lv_value_3_0= ruleBind )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:551:1: (lv_value_3_0= ruleBind )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:552:3: lv_value_3_0= ruleBind
            {
             
            	        newCompositeNode(grammarAccess.getBindingAccess().getValueBindParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBind_in_ruleBinding1118);
            lv_value_3_0=ruleBind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBindingRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Bind");
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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBind"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:576:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:577:2: (iv_ruleBind= ruleBind EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:578:2: iv_ruleBind= ruleBind EOF
            {
             newCompositeNode(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_ruleBind_in_entryRuleBind1154);
            iv_ruleBind=ruleBind();

            state._fsp--;

             current =iv_ruleBind; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBind1164); 

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
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:585:1: ruleBind returns [EObject current=null] : (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind | this_RoleBind_2= ruleRoleBind ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectBind_0 = null;

        EObject this_ValueBind_1 = null;

        EObject this_RoleBind_2 = null;


         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:588:28: ( (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind | this_RoleBind_2= ruleRoleBind ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:589:1: (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind | this_RoleBind_2= ruleRoleBind )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:589:1: (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind | this_RoleBind_2= ruleRoleBind )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:590:5: this_ObjectBind_0= ruleObjectBind
                    {
                     
                            newCompositeNode(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectBind_in_ruleBind1211);
                    this_ObjectBind_0=ruleObjectBind();

                    state._fsp--;

                     
                            current = this_ObjectBind_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:600:5: this_ValueBind_1= ruleValueBind
                    {
                     
                            newCompositeNode(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleValueBind_in_ruleBind1238);
                    this_ValueBind_1=ruleValueBind();

                    state._fsp--;

                     
                            current = this_ValueBind_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:610:5: this_RoleBind_2= ruleRoleBind
                    {
                     
                            newCompositeNode(grammarAccess.getBindAccess().getRoleBindParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRoleBind_in_ruleBind1265);
                    this_RoleBind_2=ruleRoleBind();

                    state._fsp--;

                     
                            current = this_RoleBind_2; 
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
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleRoleBind"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:626:1: entryRuleRoleBind returns [EObject current=null] : iv_ruleRoleBind= ruleRoleBind EOF ;
    public final EObject entryRuleRoleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleBind = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:627:2: (iv_ruleRoleBind= ruleRoleBind EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:628:2: iv_ruleRoleBind= ruleRoleBind EOF
            {
             newCompositeNode(grammarAccess.getRoleBindRule()); 
            pushFollow(FOLLOW_ruleRoleBind_in_entryRuleRoleBind1300);
            iv_ruleRoleBind=ruleRoleBind();

            state._fsp--;

             current =iv_ruleRoleBind; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleBind1310); 

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
    // $ANTLR end "entryRuleRoleBind"


    // $ANTLR start "ruleRoleBind"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:635:1: ruleRoleBind returns [EObject current=null] : (otherlv_0= 'r' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRoleBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:638:28: ( (otherlv_0= 'r' ( (otherlv_1= RULE_ID ) ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:639:1: (otherlv_0= 'r' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:639:1: (otherlv_0= 'r' ( (otherlv_1= RULE_ID ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:639:3: otherlv_0= 'r' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRoleBind1347); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleBindAccess().getRKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:643:1: ( (otherlv_1= RULE_ID ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:644:1: (otherlv_1= RULE_ID )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:644:1: (otherlv_1= RULE_ID )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:645:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleBindRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRoleBind1367); 

            		newLeafNode(otherlv_1, grammarAccess.getRoleBindAccess().getRoleRoleCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleRoleBind"


    // $ANTLR start "entryRuleValueBind"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:664:1: entryRuleValueBind returns [EObject current=null] : iv_ruleValueBind= ruleValueBind EOF ;
    public final EObject entryRuleValueBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueBind = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:665:2: (iv_ruleValueBind= ruleValueBind EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:666:2: iv_ruleValueBind= ruleValueBind EOF
            {
             newCompositeNode(grammarAccess.getValueBindRule()); 
            pushFollow(FOLLOW_ruleValueBind_in_entryRuleValueBind1403);
            iv_ruleValueBind=ruleValueBind();

            state._fsp--;

             current =iv_ruleValueBind; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueBind1413); 

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
    // $ANTLR end "entryRuleValueBind"


    // $ANTLR start "ruleValueBind"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:673:1: ruleValueBind returns [EObject current=null] : (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleValueBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:676:28: ( (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:677:1: (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:677:1: (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:677:3: otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleValueBind1450); 

                	newLeafNode(otherlv_0, grammarAccess.getValueBindAccess().getVKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:681:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:682:1: (lv_value_1_0= RULE_STRING )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:682:1: (lv_value_1_0= RULE_STRING )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:683:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueBind1467); 

            			newLeafNode(lv_value_1_0, grammarAccess.getValueBindAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueBindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleValueBind"


    // $ANTLR start "entryRuleObjectBind"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:707:1: entryRuleObjectBind returns [EObject current=null] : iv_ruleObjectBind= ruleObjectBind EOF ;
    public final EObject entryRuleObjectBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectBind = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:708:2: (iv_ruleObjectBind= ruleObjectBind EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:709:2: iv_ruleObjectBind= ruleObjectBind EOF
            {
             newCompositeNode(grammarAccess.getObjectBindRule()); 
            pushFollow(FOLLOW_ruleObjectBind_in_entryRuleObjectBind1508);
            iv_ruleObjectBind=ruleObjectBind();

            state._fsp--;

             current =iv_ruleObjectBind; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectBind1518); 

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
    // $ANTLR end "entryRuleObjectBind"


    // $ANTLR start "ruleObjectBind"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:716:1: ruleObjectBind returns [EObject current=null] : (otherlv_0= 'o' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleObjectBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:719:28: ( (otherlv_0= 'o' ( (otherlv_1= RULE_ID ) ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:720:1: (otherlv_0= 'o' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:720:1: (otherlv_0= 'o' ( (otherlv_1= RULE_ID ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:720:3: otherlv_0= 'o' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleObjectBind1555); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectBindAccess().getOKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:724:1: ( (otherlv_1= RULE_ID ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:725:1: (otherlv_1= RULE_ID )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:725:1: (otherlv_1= RULE_ID )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:726:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectBindRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectBind1575); 

            		newLeafNode(otherlv_1, grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleObjectBind"


    // $ANTLR start "entryRuleImportResource"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:745:1: entryRuleImportResource returns [EObject current=null] : iv_ruleImportResource= ruleImportResource EOF ;
    public final EObject entryRuleImportResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportResource = null;


        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:746:2: (iv_ruleImportResource= ruleImportResource EOF )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:747:2: iv_ruleImportResource= ruleImportResource EOF
            {
             newCompositeNode(grammarAccess.getImportResourceRule()); 
            pushFollow(FOLLOW_ruleImportResource_in_entryRuleImportResource1611);
            iv_ruleImportResource=ruleImportResource();

            state._fsp--;

             current =iv_ruleImportResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportResource1621); 

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
    // $ANTLR end "entryRuleImportResource"


    // $ANTLR start "ruleImportResource"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:754:1: ruleImportResource returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleImportResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:757:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:758:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:758:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:758:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleImportResource1658); 

                	newLeafNode(otherlv_0, grammarAccess.getImportResourceAccess().getImportKeyword_0());
                
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:762:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:763:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:763:1: (lv_importURI_1_0= RULE_STRING )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:764:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportResource1675); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportResourceAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:780:2: (otherlv_2= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:780:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleImportResource1693); 

                        	newLeafNode(otherlv_2, grammarAccess.getImportResourceAccess().getSemicolonKeyword_2());
                        

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
    // $ANTLR end "ruleImportResource"


    // $ANTLR start "ruleRuleRights"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:792:1: ruleRuleRights returns [Enumerator current=null] : ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) ) ;
    public final Enumerator ruleRuleRights() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:794:28: ( ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:795:1: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:795:1: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:795:2: (enumLiteral_0= 'R' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:795:2: (enumLiteral_0= 'R' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:795:4: enumLiteral_0= 'R'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleRuleRights1745); 

                            current = grammarAccess.getRuleRightsAccess().getReadEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRuleRightsAccess().getReadEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:801:6: (enumLiteral_1= 'W' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:801:6: (enumLiteral_1= 'W' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:801:8: enumLiteral_1= 'W'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleRuleRights1762); 

                            current = grammarAccess.getRuleRightsAccess().getWriteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRuleRightsAccess().getWriteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:807:6: (enumLiteral_2= 'RW' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:807:6: (enumLiteral_2= 'RW' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:807:8: enumLiteral_2= 'RW'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleRuleRights1779); 

                            current = grammarAccess.getRuleRightsAccess().getReadWriteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRuleRightsAccess().getReadWriteEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleRuleRights"


    // $ANTLR start "ruleRuleType"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:817:1: ruleRuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'deny' ) | (enumLiteral_1= 'permit' ) | (enumLiteral_2= 'obfuscate' ) ) ;
    public final Enumerator ruleRuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:819:28: ( ( (enumLiteral_0= 'deny' ) | (enumLiteral_1= 'permit' ) | (enumLiteral_2= 'obfuscate' ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:820:1: ( (enumLiteral_0= 'deny' ) | (enumLiteral_1= 'permit' ) | (enumLiteral_2= 'obfuscate' ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:820:1: ( (enumLiteral_0= 'deny' ) | (enumLiteral_1= 'permit' ) | (enumLiteral_2= 'obfuscate' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:820:2: (enumLiteral_0= 'deny' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:820:2: (enumLiteral_0= 'deny' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:820:4: enumLiteral_0= 'deny'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleRuleType1824); 

                            current = grammarAccess.getRuleTypeAccess().getDenyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRuleTypeAccess().getDenyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:826:6: (enumLiteral_1= 'permit' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:826:6: (enumLiteral_1= 'permit' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:826:8: enumLiteral_1= 'permit'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleRuleType1841); 

                            current = grammarAccess.getRuleTypeAccess().getPermitEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRuleTypeAccess().getPermitEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:832:6: (enumLiteral_2= 'obfuscate' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:832:6: (enumLiteral_2= 'obfuscate' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:832:8: enumLiteral_2= 'obfuscate'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleRuleType1858); 

                            current = grammarAccess.getRuleTypeAccess().getObfuscateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRuleTypeAccess().getObfuscateEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "ruleConflictResolutionTypes"
    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:842:1: ruleConflictResolutionTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'deny-overrides' ) | (enumLiteral_1= 'permit-overrides' ) | (enumLiteral_2= 'first-applicable' ) | (enumLiteral_3= 'only-one-applicable-policy' ) | (enumLiteral_4= 'ordered-deny-overrides' ) | (enumLiteral_5= 'ordered-permit-overrides' ) | (enumLiteral_6= 'deny-unless-permit' ) | (enumLiteral_7= 'permit-unless-permit' ) ) ;
    public final Enumerator ruleConflictResolutionTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:844:28: ( ( (enumLiteral_0= 'deny-overrides' ) | (enumLiteral_1= 'permit-overrides' ) | (enumLiteral_2= 'first-applicable' ) | (enumLiteral_3= 'only-one-applicable-policy' ) | (enumLiteral_4= 'ordered-deny-overrides' ) | (enumLiteral_5= 'ordered-permit-overrides' ) | (enumLiteral_6= 'deny-unless-permit' ) | (enumLiteral_7= 'permit-unless-permit' ) ) )
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:845:1: ( (enumLiteral_0= 'deny-overrides' ) | (enumLiteral_1= 'permit-overrides' ) | (enumLiteral_2= 'first-applicable' ) | (enumLiteral_3= 'only-one-applicable-policy' ) | (enumLiteral_4= 'ordered-deny-overrides' ) | (enumLiteral_5= 'ordered-permit-overrides' ) | (enumLiteral_6= 'deny-unless-permit' ) | (enumLiteral_7= 'permit-unless-permit' ) )
            {
            // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:845:1: ( (enumLiteral_0= 'deny-overrides' ) | (enumLiteral_1= 'permit-overrides' ) | (enumLiteral_2= 'first-applicable' ) | (enumLiteral_3= 'only-one-applicable-policy' ) | (enumLiteral_4= 'ordered-deny-overrides' ) | (enumLiteral_5= 'ordered-permit-overrides' ) | (enumLiteral_6= 'deny-unless-permit' ) | (enumLiteral_7= 'permit-unless-permit' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt13=1;
                }
                break;
            case 32:
                {
                alt13=2;
                }
                break;
            case 33:
                {
                alt13=3;
                }
                break;
            case 34:
                {
                alt13=4;
                }
                break;
            case 35:
                {
                alt13=5;
                }
                break;
            case 36:
                {
                alt13=6;
                }
                break;
            case 37:
                {
                alt13=7;
                }
                break;
            case 38:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:845:2: (enumLiteral_0= 'deny-overrides' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:845:2: (enumLiteral_0= 'deny-overrides' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:845:4: enumLiteral_0= 'deny-overrides'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleConflictResolutionTypes1903); 

                            current = grammarAccess.getConflictResolutionTypesAccess().getDenyOverridesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionTypesAccess().getDenyOverridesEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:851:6: (enumLiteral_1= 'permit-overrides' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:851:6: (enumLiteral_1= 'permit-overrides' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:851:8: enumLiteral_1= 'permit-overrides'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleConflictResolutionTypes1920); 

                            current = grammarAccess.getConflictResolutionTypesAccess().getPermitOverridesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionTypesAccess().getPermitOverridesEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:857:6: (enumLiteral_2= 'first-applicable' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:857:6: (enumLiteral_2= 'first-applicable' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:857:8: enumLiteral_2= 'first-applicable'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_33_in_ruleConflictResolutionTypes1937); 

                            current = grammarAccess.getConflictResolutionTypesAccess().getFirstApplicableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionTypesAccess().getFirstApplicableEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:863:6: (enumLiteral_3= 'only-one-applicable-policy' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:863:6: (enumLiteral_3= 'only-one-applicable-policy' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:863:8: enumLiteral_3= 'only-one-applicable-policy'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_34_in_ruleConflictResolutionTypes1954); 

                            current = grammarAccess.getConflictResolutionTypesAccess().getOnlyOneApplicablePolicyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionTypesAccess().getOnlyOneApplicablePolicyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:869:6: (enumLiteral_4= 'ordered-deny-overrides' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:869:6: (enumLiteral_4= 'ordered-deny-overrides' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:869:8: enumLiteral_4= 'ordered-deny-overrides'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_35_in_ruleConflictResolutionTypes1971); 

                            current = grammarAccess.getConflictResolutionTypesAccess().getOrderedDenyOverridesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getConflictResolutionTypesAccess().getOrderedDenyOverridesEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:875:6: (enumLiteral_5= 'ordered-permit-overrides' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:875:6: (enumLiteral_5= 'ordered-permit-overrides' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:875:8: enumLiteral_5= 'ordered-permit-overrides'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_36_in_ruleConflictResolutionTypes1988); 

                            current = grammarAccess.getConflictResolutionTypesAccess().getOrderedPermitOverridesEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getConflictResolutionTypesAccess().getOrderedPermitOverridesEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:881:6: (enumLiteral_6= 'deny-unless-permit' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:881:6: (enumLiteral_6= 'deny-unless-permit' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:881:8: enumLiteral_6= 'deny-unless-permit'
                    {
                    enumLiteral_6=(Token)match(input,37,FOLLOW_37_in_ruleConflictResolutionTypes2005); 

                            current = grammarAccess.getConflictResolutionTypesAccess().getDenyUnlessPermitEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getConflictResolutionTypesAccess().getDenyUnlessPermitEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:887:6: (enumLiteral_7= 'permit-unless-permit' )
                    {
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:887:6: (enumLiteral_7= 'permit-unless-permit' )
                    // ../mondo.collab.security.xtext/src-gen/mondo/collab/security/xtext/parser/antlr/internal/InternalSecurityAccess.g:887:8: enumLiteral_7= 'permit-unless-permit'
                    {
                    enumLiteral_7=(Token)match(input,38,FOLLOW_38_in_ruleConflictResolutionTypes2022); 

                            current = grammarAccess.getConflictResolutionTypesAccess().getPermitUnlessDenyEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getConflictResolutionTypesAccess().getPermitUnlessDenyEnumLiteralDeclaration_7()); 
                        

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
    // $ANTLR end "ruleConflictResolutionTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAccessControlModel_in_entryRuleAccessControlModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessControlModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleAccessControlModel131 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_rulePolicy_in_ruleAccessControlModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_ruleRole246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleRole273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUser355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGroup460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroup477 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGroup494 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroup514 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleGroup527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePolicy610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePolicy627 = new BitSet(new long[]{0x0000007F80000000L});
    public static final BitSet FOLLOW_ruleConflictResolutionTypes_in_rulePolicy653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePolicy673 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_rulePolicy686 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_ruleImportResource_in_rulePolicy707 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_ruleRule_in_rulePolicy729 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_rulePolicy742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRule825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule842 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleRuleType_in_ruleRule868 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleRuleRights_in_ruleRule889 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRule901 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRule913 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRule933 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_18_in_ruleRule946 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleRule969 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_ruleRule982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBinding1065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinding1085 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBinding1097 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleBind_in_ruleBinding1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_entryRuleBind1154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBind1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectBind_in_ruleBind1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueBind_in_ruleBind1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBind_in_ruleBind1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBind_in_entryRuleRoleBind1300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleBind1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRoleBind1347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRoleBind1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueBind_in_entryRuleValueBind1403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueBind1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleValueBind1450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueBind1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectBind_in_entryRuleObjectBind1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectBind1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleObjectBind1555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectBind1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportResource_in_entryRuleImportResource1611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportResource1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleImportResource1658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportResource1675 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleImportResource1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRuleRights1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRuleRights1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRuleRights1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRuleType1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRuleType1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRuleType1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleConflictResolutionTypes1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleConflictResolutionTypes1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleConflictResolutionTypes1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleConflictResolutionTypes1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleConflictResolutionTypes1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleConflictResolutionTypes1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleConflictResolutionTypes2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleConflictResolutionTypes2022 = new BitSet(new long[]{0x0000000000000002L});

}