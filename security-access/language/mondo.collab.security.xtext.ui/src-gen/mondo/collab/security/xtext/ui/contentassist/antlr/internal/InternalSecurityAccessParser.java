package mondo.collab.security.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import mondo.collab.security.xtext.services.SecurityAccessGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityAccessParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'W'", "'RW'", "'deny'", "'permit'", "'obfuscate'", "'deny-overrides'", "'permit-overrides'", "'first-applicable'", "'only-one-applicable-policy'", "'ordered-deny-overrides'", "'ordered-permit-overrides'", "'deny-unless-permit'", "'permit-unless-permit'", "'user'", "'group'", "'{'", "'}'", "'policy'", "'rule'", "'query'", "';'", "'bind'", "'<>'", "'r'", "'v'", "'o'", "'import'"
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
    public String getGrammarFileName() { return "../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g"; }


     
     	private SecurityAccessGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SecurityAccessGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAccessControlModel"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:60:1: entryRuleAccessControlModel : ruleAccessControlModel EOF ;
    public final void entryRuleAccessControlModel() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:61:1: ( ruleAccessControlModel EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:62:1: ruleAccessControlModel EOF
            {
             before(grammarAccess.getAccessControlModelRule()); 
            pushFollow(FOLLOW_ruleAccessControlModel_in_entryRuleAccessControlModel61);
            ruleAccessControlModel();

            state._fsp--;

             after(grammarAccess.getAccessControlModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessControlModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccessControlModel"


    // $ANTLR start "ruleAccessControlModel"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:69:1: ruleAccessControlModel : ( ( rule__AccessControlModel__Group__0 ) ) ;
    public final void ruleAccessControlModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:73:2: ( ( ( rule__AccessControlModel__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:74:1: ( ( rule__AccessControlModel__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:74:1: ( ( rule__AccessControlModel__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:75:1: ( rule__AccessControlModel__Group__0 )
            {
             before(grammarAccess.getAccessControlModelAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:76:1: ( rule__AccessControlModel__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:76:2: rule__AccessControlModel__Group__0
            {
            pushFollow(FOLLOW_rule__AccessControlModel__Group__0_in_ruleAccessControlModel94);
            rule__AccessControlModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessControlModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessControlModel"


    // $ANTLR start "entryRuleRole"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:88:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:89:1: ( ruleRole EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:90:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole121);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:97:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:101:2: ( ( ( rule__Role__Alternatives ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:102:1: ( ( rule__Role__Alternatives ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:102:1: ( ( rule__Role__Alternatives ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:103:1: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:104:1: ( rule__Role__Alternatives )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:104:2: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_rule__Role__Alternatives_in_ruleRole154);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:116:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:117:1: ( ruleUser EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:118:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser181);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:125:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:129:2: ( ( ( rule__User__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:130:1: ( ( rule__User__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:130:1: ( ( rule__User__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:131:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:132:1: ( rule__User__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:132:2: rule__User__Group__0
            {
            pushFollow(FOLLOW_rule__User__Group__0_in_ruleUser214);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleGroup"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:144:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:145:1: ( ruleGroup EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:146:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup241);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:153:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:157:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:158:1: ( ( rule__Group__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:158:1: ( ( rule__Group__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:159:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:160:1: ( rule__Group__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:160:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup274);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePolicy"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:172:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:173:1: ( rulePolicy EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:174:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy301);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:181:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:185:2: ( ( ( rule__Policy__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:186:1: ( ( rule__Policy__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:186:1: ( ( rule__Policy__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:187:1: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:188:1: ( rule__Policy__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:188:2: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_rule__Policy__Group__0_in_rulePolicy334);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleRule"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:200:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:201:1: ( ruleRule EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:202:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule361);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:209:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:213:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:214:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:214:1: ( ( rule__Rule__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:215:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:216:1: ( rule__Rule__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:216:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule394);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleBinding"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:228:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:229:1: ( ruleBinding EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:230:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding421);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:237:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:241:2: ( ( ( rule__Binding__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:242:1: ( ( rule__Binding__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:242:1: ( ( rule__Binding__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:243:1: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:244:1: ( rule__Binding__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:244:2: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_rule__Binding__Group__0_in_ruleBinding454);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBind"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:256:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:257:1: ( ruleBind EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:258:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_ruleBind_in_entryRuleBind481);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBind488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:265:1: ruleBind : ( ( rule__Bind__Alternatives ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:269:2: ( ( ( rule__Bind__Alternatives ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:270:1: ( ( rule__Bind__Alternatives ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:270:1: ( ( rule__Bind__Alternatives ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:271:1: ( rule__Bind__Alternatives )
            {
             before(grammarAccess.getBindAccess().getAlternatives()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:272:1: ( rule__Bind__Alternatives )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:272:2: rule__Bind__Alternatives
            {
            pushFollow(FOLLOW_rule__Bind__Alternatives_in_ruleBind514);
            rule__Bind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleRoleBind"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:284:1: entryRuleRoleBind : ruleRoleBind EOF ;
    public final void entryRuleRoleBind() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:285:1: ( ruleRoleBind EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:286:1: ruleRoleBind EOF
            {
             before(grammarAccess.getRoleBindRule()); 
            pushFollow(FOLLOW_ruleRoleBind_in_entryRuleRoleBind541);
            ruleRoleBind();

            state._fsp--;

             after(grammarAccess.getRoleBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleBind548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoleBind"


    // $ANTLR start "ruleRoleBind"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:293:1: ruleRoleBind : ( ( rule__RoleBind__Group__0 ) ) ;
    public final void ruleRoleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:297:2: ( ( ( rule__RoleBind__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:298:1: ( ( rule__RoleBind__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:298:1: ( ( rule__RoleBind__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:299:1: ( rule__RoleBind__Group__0 )
            {
             before(grammarAccess.getRoleBindAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:300:1: ( rule__RoleBind__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:300:2: rule__RoleBind__Group__0
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__0_in_ruleRoleBind574);
            rule__RoleBind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleBindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleBind"


    // $ANTLR start "entryRuleValueBind"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:312:1: entryRuleValueBind : ruleValueBind EOF ;
    public final void entryRuleValueBind() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:313:1: ( ruleValueBind EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:314:1: ruleValueBind EOF
            {
             before(grammarAccess.getValueBindRule()); 
            pushFollow(FOLLOW_ruleValueBind_in_entryRuleValueBind601);
            ruleValueBind();

            state._fsp--;

             after(grammarAccess.getValueBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueBind608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueBind"


    // $ANTLR start "ruleValueBind"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:321:1: ruleValueBind : ( ( rule__ValueBind__Group__0 ) ) ;
    public final void ruleValueBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:325:2: ( ( ( rule__ValueBind__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:326:1: ( ( rule__ValueBind__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:326:1: ( ( rule__ValueBind__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:327:1: ( rule__ValueBind__Group__0 )
            {
             before(grammarAccess.getValueBindAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:328:1: ( rule__ValueBind__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:328:2: rule__ValueBind__Group__0
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__0_in_ruleValueBind634);
            rule__ValueBind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueBindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueBind"


    // $ANTLR start "entryRuleObjectBind"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:340:1: entryRuleObjectBind : ruleObjectBind EOF ;
    public final void entryRuleObjectBind() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:341:1: ( ruleObjectBind EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:342:1: ruleObjectBind EOF
            {
             before(grammarAccess.getObjectBindRule()); 
            pushFollow(FOLLOW_ruleObjectBind_in_entryRuleObjectBind661);
            ruleObjectBind();

            state._fsp--;

             after(grammarAccess.getObjectBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectBind668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectBind"


    // $ANTLR start "ruleObjectBind"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:349:1: ruleObjectBind : ( ( rule__ObjectBind__Group__0 ) ) ;
    public final void ruleObjectBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:353:2: ( ( ( rule__ObjectBind__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:354:1: ( ( rule__ObjectBind__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:354:1: ( ( rule__ObjectBind__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:355:1: ( rule__ObjectBind__Group__0 )
            {
             before(grammarAccess.getObjectBindAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:356:1: ( rule__ObjectBind__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:356:2: rule__ObjectBind__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__0_in_ruleObjectBind694);
            rule__ObjectBind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectBindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectBind"


    // $ANTLR start "entryRuleImportResource"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:368:1: entryRuleImportResource : ruleImportResource EOF ;
    public final void entryRuleImportResource() throws RecognitionException {
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:369:1: ( ruleImportResource EOF )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:370:1: ruleImportResource EOF
            {
             before(grammarAccess.getImportResourceRule()); 
            pushFollow(FOLLOW_ruleImportResource_in_entryRuleImportResource721);
            ruleImportResource();

            state._fsp--;

             after(grammarAccess.getImportResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportResource728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportResource"


    // $ANTLR start "ruleImportResource"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:377:1: ruleImportResource : ( ( rule__ImportResource__Group__0 ) ) ;
    public final void ruleImportResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:381:2: ( ( ( rule__ImportResource__Group__0 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:382:1: ( ( rule__ImportResource__Group__0 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:382:1: ( ( rule__ImportResource__Group__0 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:383:1: ( rule__ImportResource__Group__0 )
            {
             before(grammarAccess.getImportResourceAccess().getGroup()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:384:1: ( rule__ImportResource__Group__0 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:384:2: rule__ImportResource__Group__0
            {
            pushFollow(FOLLOW_rule__ImportResource__Group__0_in_ruleImportResource754);
            rule__ImportResource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportResource"


    // $ANTLR start "ruleRuleRights"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:397:1: ruleRuleRights : ( ( rule__RuleRights__Alternatives ) ) ;
    public final void ruleRuleRights() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:401:1: ( ( ( rule__RuleRights__Alternatives ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:402:1: ( ( rule__RuleRights__Alternatives ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:402:1: ( ( rule__RuleRights__Alternatives ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:403:1: ( rule__RuleRights__Alternatives )
            {
             before(grammarAccess.getRuleRightsAccess().getAlternatives()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:404:1: ( rule__RuleRights__Alternatives )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:404:2: rule__RuleRights__Alternatives
            {
            pushFollow(FOLLOW_rule__RuleRights__Alternatives_in_ruleRuleRights791);
            rule__RuleRights__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleRightsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleRights"


    // $ANTLR start "ruleRuleType"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:416:1: ruleRuleType : ( ( rule__RuleType__Alternatives ) ) ;
    public final void ruleRuleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:420:1: ( ( ( rule__RuleType__Alternatives ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:421:1: ( ( rule__RuleType__Alternatives ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:421:1: ( ( rule__RuleType__Alternatives ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:422:1: ( rule__RuleType__Alternatives )
            {
             before(grammarAccess.getRuleTypeAccess().getAlternatives()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:423:1: ( rule__RuleType__Alternatives )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:423:2: rule__RuleType__Alternatives
            {
            pushFollow(FOLLOW_rule__RuleType__Alternatives_in_ruleRuleType827);
            rule__RuleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "ruleConflictResolutionTypes"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:435:1: ruleConflictResolutionTypes : ( ( rule__ConflictResolutionTypes__Alternatives ) ) ;
    public final void ruleConflictResolutionTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:439:1: ( ( ( rule__ConflictResolutionTypes__Alternatives ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:440:1: ( ( rule__ConflictResolutionTypes__Alternatives ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:440:1: ( ( rule__ConflictResolutionTypes__Alternatives ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:441:1: ( rule__ConflictResolutionTypes__Alternatives )
            {
             before(grammarAccess.getConflictResolutionTypesAccess().getAlternatives()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:442:1: ( rule__ConflictResolutionTypes__Alternatives )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:442:2: rule__ConflictResolutionTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__ConflictResolutionTypes__Alternatives_in_ruleConflictResolutionTypes863);
            rule__ConflictResolutionTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConflictResolutionTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConflictResolutionTypes"


    // $ANTLR start "rule__Role__Alternatives"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:453:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:457:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:458:1: ( ruleUser )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:458:1: ( ruleUser )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:459:1: ruleUser
                    {
                     before(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUser_in_rule__Role__Alternatives898);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:464:6: ( ruleGroup )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:464:6: ( ruleGroup )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:465:1: ruleGroup
                    {
                     before(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGroup_in_rule__Role__Alternatives915);
                    ruleGroup();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__Bind__Alternatives"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:475:1: rule__Bind__Alternatives : ( ( ruleObjectBind ) | ( ruleValueBind ) | ( ruleRoleBind ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:479:1: ( ( ruleObjectBind ) | ( ruleValueBind ) | ( ruleRoleBind ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:480:1: ( ruleObjectBind )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:480:1: ( ruleObjectBind )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:481:1: ruleObjectBind
                    {
                     before(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectBind_in_rule__Bind__Alternatives947);
                    ruleObjectBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:486:6: ( ruleValueBind )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:486:6: ( ruleValueBind )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:487:1: ruleValueBind
                    {
                     before(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleValueBind_in_rule__Bind__Alternatives964);
                    ruleValueBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:492:6: ( ruleRoleBind )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:492:6: ( ruleRoleBind )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:493:1: ruleRoleBind
                    {
                     before(grammarAccess.getBindAccess().getRoleBindParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRoleBind_in_rule__Bind__Alternatives981);
                    ruleRoleBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getRoleBindParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Alternatives"


    // $ANTLR start "rule__RuleRights__Alternatives"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:503:1: rule__RuleRights__Alternatives : ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__RuleRights__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:507:1: ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:508:1: ( ( 'R' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:508:1: ( ( 'R' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:509:1: ( 'R' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getReadEnumLiteralDeclaration_0()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:510:1: ( 'R' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:510:3: 'R'
                    {
                    match(input,11,FOLLOW_11_in_rule__RuleRights__Alternatives1014); 

                    }

                     after(grammarAccess.getRuleRightsAccess().getReadEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:515:6: ( ( 'W' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:515:6: ( ( 'W' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:516:1: ( 'W' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getWriteEnumLiteralDeclaration_1()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:517:1: ( 'W' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:517:3: 'W'
                    {
                    match(input,12,FOLLOW_12_in_rule__RuleRights__Alternatives1035); 

                    }

                     after(grammarAccess.getRuleRightsAccess().getWriteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:522:6: ( ( 'RW' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:522:6: ( ( 'RW' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:523:1: ( 'RW' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getReadWriteEnumLiteralDeclaration_2()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:524:1: ( 'RW' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:524:3: 'RW'
                    {
                    match(input,13,FOLLOW_13_in_rule__RuleRights__Alternatives1056); 

                    }

                     after(grammarAccess.getRuleRightsAccess().getReadWriteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleRights__Alternatives"


    // $ANTLR start "rule__RuleType__Alternatives"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:534:1: rule__RuleType__Alternatives : ( ( ( 'deny' ) ) | ( ( 'permit' ) ) | ( ( 'obfuscate' ) ) );
    public final void rule__RuleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:538:1: ( ( ( 'deny' ) ) | ( ( 'permit' ) ) | ( ( 'obfuscate' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:539:1: ( ( 'deny' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:539:1: ( ( 'deny' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:540:1: ( 'deny' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getDenyEnumLiteralDeclaration_0()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:541:1: ( 'deny' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:541:3: 'deny'
                    {
                    match(input,14,FOLLOW_14_in_rule__RuleType__Alternatives1092); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getDenyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:546:6: ( ( 'permit' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:546:6: ( ( 'permit' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:547:1: ( 'permit' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getPermitEnumLiteralDeclaration_1()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:548:1: ( 'permit' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:548:3: 'permit'
                    {
                    match(input,15,FOLLOW_15_in_rule__RuleType__Alternatives1113); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getPermitEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:553:6: ( ( 'obfuscate' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:553:6: ( ( 'obfuscate' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:554:1: ( 'obfuscate' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getObfuscateEnumLiteralDeclaration_2()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:555:1: ( 'obfuscate' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:555:3: 'obfuscate'
                    {
                    match(input,16,FOLLOW_16_in_rule__RuleType__Alternatives1134); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getObfuscateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleType__Alternatives"


    // $ANTLR start "rule__ConflictResolutionTypes__Alternatives"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:565:1: rule__ConflictResolutionTypes__Alternatives : ( ( ( 'deny-overrides' ) ) | ( ( 'permit-overrides' ) ) | ( ( 'first-applicable' ) ) | ( ( 'only-one-applicable-policy' ) ) | ( ( 'ordered-deny-overrides' ) ) | ( ( 'ordered-permit-overrides' ) ) | ( ( 'deny-unless-permit' ) ) | ( ( 'permit-unless-permit' ) ) );
    public final void rule__ConflictResolutionTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:569:1: ( ( ( 'deny-overrides' ) ) | ( ( 'permit-overrides' ) ) | ( ( 'first-applicable' ) ) | ( ( 'only-one-applicable-policy' ) ) | ( ( 'ordered-deny-overrides' ) ) | ( ( 'ordered-permit-overrides' ) ) | ( ( 'deny-unless-permit' ) ) | ( ( 'permit-unless-permit' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            case 23:
                {
                alt5=7;
                }
                break;
            case 24:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:570:1: ( ( 'deny-overrides' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:570:1: ( ( 'deny-overrides' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:571:1: ( 'deny-overrides' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getDenyOverridesEnumLiteralDeclaration_0()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:572:1: ( 'deny-overrides' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:572:3: 'deny-overrides'
                    {
                    match(input,17,FOLLOW_17_in_rule__ConflictResolutionTypes__Alternatives1170); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getDenyOverridesEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:577:6: ( ( 'permit-overrides' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:577:6: ( ( 'permit-overrides' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:578:1: ( 'permit-overrides' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getPermitOverridesEnumLiteralDeclaration_1()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:579:1: ( 'permit-overrides' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:579:3: 'permit-overrides'
                    {
                    match(input,18,FOLLOW_18_in_rule__ConflictResolutionTypes__Alternatives1191); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getPermitOverridesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:584:6: ( ( 'first-applicable' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:584:6: ( ( 'first-applicable' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:585:1: ( 'first-applicable' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getFirstApplicableEnumLiteralDeclaration_2()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:586:1: ( 'first-applicable' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:586:3: 'first-applicable'
                    {
                    match(input,19,FOLLOW_19_in_rule__ConflictResolutionTypes__Alternatives1212); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getFirstApplicableEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:591:6: ( ( 'only-one-applicable-policy' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:591:6: ( ( 'only-one-applicable-policy' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:592:1: ( 'only-one-applicable-policy' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getOnlyOneApplicablePolicyEnumLiteralDeclaration_3()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:593:1: ( 'only-one-applicable-policy' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:593:3: 'only-one-applicable-policy'
                    {
                    match(input,20,FOLLOW_20_in_rule__ConflictResolutionTypes__Alternatives1233); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getOnlyOneApplicablePolicyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:598:6: ( ( 'ordered-deny-overrides' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:598:6: ( ( 'ordered-deny-overrides' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:599:1: ( 'ordered-deny-overrides' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getOrderedDenyOverridesEnumLiteralDeclaration_4()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:600:1: ( 'ordered-deny-overrides' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:600:3: 'ordered-deny-overrides'
                    {
                    match(input,21,FOLLOW_21_in_rule__ConflictResolutionTypes__Alternatives1254); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getOrderedDenyOverridesEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:605:6: ( ( 'ordered-permit-overrides' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:605:6: ( ( 'ordered-permit-overrides' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:606:1: ( 'ordered-permit-overrides' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getOrderedPermitOverridesEnumLiteralDeclaration_5()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:607:1: ( 'ordered-permit-overrides' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:607:3: 'ordered-permit-overrides'
                    {
                    match(input,22,FOLLOW_22_in_rule__ConflictResolutionTypes__Alternatives1275); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getOrderedPermitOverridesEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:612:6: ( ( 'deny-unless-permit' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:612:6: ( ( 'deny-unless-permit' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:613:1: ( 'deny-unless-permit' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getDenyUnlessPermitEnumLiteralDeclaration_6()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:614:1: ( 'deny-unless-permit' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:614:3: 'deny-unless-permit'
                    {
                    match(input,23,FOLLOW_23_in_rule__ConflictResolutionTypes__Alternatives1296); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getDenyUnlessPermitEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:619:6: ( ( 'permit-unless-permit' ) )
                    {
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:619:6: ( ( 'permit-unless-permit' ) )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:620:1: ( 'permit-unless-permit' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getPermitUnlessDenyEnumLiteralDeclaration_7()); 
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:621:1: ( 'permit-unless-permit' )
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:621:3: 'permit-unless-permit'
                    {
                    match(input,24,FOLLOW_24_in_rule__ConflictResolutionTypes__Alternatives1317); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getPermitUnlessDenyEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConflictResolutionTypes__Alternatives"


    // $ANTLR start "rule__AccessControlModel__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:633:1: rule__AccessControlModel__Group__0 : rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1 ;
    public final void rule__AccessControlModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:637:1: ( rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:638:2: rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1
            {
            pushFollow(FOLLOW_rule__AccessControlModel__Group__0__Impl_in_rule__AccessControlModel__Group__01350);
            rule__AccessControlModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessControlModel__Group__1_in_rule__AccessControlModel__Group__01353);
            rule__AccessControlModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessControlModel__Group__0"


    // $ANTLR start "rule__AccessControlModel__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:645:1: rule__AccessControlModel__Group__0__Impl : ( ( rule__AccessControlModel__RolesAssignment_0 )* ) ;
    public final void rule__AccessControlModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:649:1: ( ( ( rule__AccessControlModel__RolesAssignment_0 )* ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:650:1: ( ( rule__AccessControlModel__RolesAssignment_0 )* )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:650:1: ( ( rule__AccessControlModel__RolesAssignment_0 )* )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:651:1: ( rule__AccessControlModel__RolesAssignment_0 )*
            {
             before(grammarAccess.getAccessControlModelAccess().getRolesAssignment_0()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:652:1: ( rule__AccessControlModel__RolesAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=25 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:652:2: rule__AccessControlModel__RolesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AccessControlModel__RolesAssignment_0_in_rule__AccessControlModel__Group__0__Impl1380);
            	    rule__AccessControlModel__RolesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAccessControlModelAccess().getRolesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessControlModel__Group__0__Impl"


    // $ANTLR start "rule__AccessControlModel__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:662:1: rule__AccessControlModel__Group__1 : rule__AccessControlModel__Group__1__Impl ;
    public final void rule__AccessControlModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:666:1: ( rule__AccessControlModel__Group__1__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:667:2: rule__AccessControlModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AccessControlModel__Group__1__Impl_in_rule__AccessControlModel__Group__11411);
            rule__AccessControlModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessControlModel__Group__1"


    // $ANTLR start "rule__AccessControlModel__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:673:1: rule__AccessControlModel__Group__1__Impl : ( ( rule__AccessControlModel__PolicyAssignment_1 ) ) ;
    public final void rule__AccessControlModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:677:1: ( ( ( rule__AccessControlModel__PolicyAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:678:1: ( ( rule__AccessControlModel__PolicyAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:678:1: ( ( rule__AccessControlModel__PolicyAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:679:1: ( rule__AccessControlModel__PolicyAssignment_1 )
            {
             before(grammarAccess.getAccessControlModelAccess().getPolicyAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:680:1: ( rule__AccessControlModel__PolicyAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:680:2: rule__AccessControlModel__PolicyAssignment_1
            {
            pushFollow(FOLLOW_rule__AccessControlModel__PolicyAssignment_1_in_rule__AccessControlModel__Group__1__Impl1438);
            rule__AccessControlModel__PolicyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessControlModelAccess().getPolicyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessControlModel__Group__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:694:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:698:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:699:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01472);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__01475);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:706:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:710:1: ( ( 'user' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:711:1: ( 'user' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:711:1: ( 'user' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:712:1: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__User__Group__0__Impl1503); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:725:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:729:1: ( rule__User__Group__1__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:730:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11534);
            rule__User__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:736:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:740:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:741:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:741:1: ( ( rule__User__NameAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:742:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:743:1: ( rule__User__NameAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:743:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1561);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:757:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:761:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:762:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01595);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01598);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:769:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:773:1: ( ( 'group' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:774:1: ( 'group' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:774:1: ( 'group' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:775:1: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Group__Group__0__Impl1626); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:788:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:792:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:793:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11657);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11660);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:800:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:804:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:805:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:805:1: ( ( rule__Group__NameAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:806:1: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:807:1: ( rule__Group__NameAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:807:2: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl1687);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:817:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:821:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:822:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21717);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21720);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:829:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:833:1: ( ( '{' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:834:1: ( '{' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:834:1: ( '{' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:835:1: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Group__Group__2__Impl1748); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:848:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:852:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:853:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31779);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31782);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:860:1: rule__Group__Group__3__Impl : ( ( rule__Group__UsersAssignment_3 )* ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:864:1: ( ( ( rule__Group__UsersAssignment_3 )* ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:865:1: ( ( rule__Group__UsersAssignment_3 )* )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:865:1: ( ( rule__Group__UsersAssignment_3 )* )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:866:1: ( rule__Group__UsersAssignment_3 )*
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_3()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:867:1: ( rule__Group__UsersAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:867:2: rule__Group__UsersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Group__UsersAssignment_3_in_rule__Group__Group__3__Impl1809);
            	    rule__Group__UsersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getUsersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:877:1: rule__Group__Group__4 : rule__Group__Group__4__Impl ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:881:1: ( rule__Group__Group__4__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:882:2: rule__Group__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41840);
            rule__Group__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:888:1: rule__Group__Group__4__Impl : ( '}' ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:892:1: ( ( '}' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:893:1: ( '}' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:893:1: ( '}' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:894:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Group__Group__4__Impl1868); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:917:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:921:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:922:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__01909);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__01912);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:929:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:933:1: ( ( 'policy' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:934:1: ( 'policy' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:934:1: ( 'policy' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:935:1: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Policy__Group__0__Impl1940); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:948:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:952:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:953:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__11971);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__11974);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:960:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:964:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:965:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:965:1: ( ( rule__Policy__NameAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:966:1: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:967:1: ( rule__Policy__NameAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:967:2: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Policy__NameAssignment_1_in_rule__Policy__Group__1__Impl2001);
            rule__Policy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:977:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:981:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:982:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__22031);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__3_in_rule__Policy__Group__22034);
            rule__Policy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:989:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__TypeAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:993:1: ( ( ( rule__Policy__TypeAssignment_2 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:994:1: ( ( rule__Policy__TypeAssignment_2 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:994:1: ( ( rule__Policy__TypeAssignment_2 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:995:1: ( rule__Policy__TypeAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getTypeAssignment_2()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:996:1: ( rule__Policy__TypeAssignment_2 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:996:2: rule__Policy__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Policy__TypeAssignment_2_in_rule__Policy__Group__2__Impl2061);
            rule__Policy__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1006:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1010:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1011:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_rule__Policy__Group__3__Impl_in_rule__Policy__Group__32091);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__4_in_rule__Policy__Group__32094);
            rule__Policy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1018:1: rule__Policy__Group__3__Impl : ( ( ( rule__Policy__RolesAssignment_3 ) ) ( ( rule__Policy__RolesAssignment_3 )* ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1022:1: ( ( ( ( rule__Policy__RolesAssignment_3 ) ) ( ( rule__Policy__RolesAssignment_3 )* ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1023:1: ( ( ( rule__Policy__RolesAssignment_3 ) ) ( ( rule__Policy__RolesAssignment_3 )* ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1023:1: ( ( ( rule__Policy__RolesAssignment_3 ) ) ( ( rule__Policy__RolesAssignment_3 )* ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1024:1: ( ( rule__Policy__RolesAssignment_3 ) ) ( ( rule__Policy__RolesAssignment_3 )* )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1024:1: ( ( rule__Policy__RolesAssignment_3 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1025:1: ( rule__Policy__RolesAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getRolesAssignment_3()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1026:1: ( rule__Policy__RolesAssignment_3 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1026:2: rule__Policy__RolesAssignment_3
            {
            pushFollow(FOLLOW_rule__Policy__RolesAssignment_3_in_rule__Policy__Group__3__Impl2123);
            rule__Policy__RolesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getRolesAssignment_3()); 

            }

            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1029:1: ( ( rule__Policy__RolesAssignment_3 )* )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1030:1: ( rule__Policy__RolesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getRolesAssignment_3()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1031:1: ( rule__Policy__RolesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1031:2: rule__Policy__RolesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Policy__RolesAssignment_3_in_rule__Policy__Group__3__Impl2135);
            	    rule__Policy__RolesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRolesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1042:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1046:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1047:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_rule__Policy__Group__4__Impl_in_rule__Policy__Group__42168);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__5_in_rule__Policy__Group__42171);
            rule__Policy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1054:1: rule__Policy__Group__4__Impl : ( '{' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1058:1: ( ( '{' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1059:1: ( '{' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1059:1: ( '{' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1060:1: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Policy__Group__4__Impl2199); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__5"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1073:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1077:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1078:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_rule__Policy__Group__5__Impl_in_rule__Policy__Group__52230);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__6_in_rule__Policy__Group__52233);
            rule__Policy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__5"


    // $ANTLR start "rule__Policy__Group__5__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1085:1: rule__Policy__Group__5__Impl : ( ( rule__Policy__ImportsAssignment_5 )* ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1089:1: ( ( ( rule__Policy__ImportsAssignment_5 )* ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1090:1: ( ( rule__Policy__ImportsAssignment_5 )* )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1090:1: ( ( rule__Policy__ImportsAssignment_5 )* )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1091:1: ( rule__Policy__ImportsAssignment_5 )*
            {
             before(grammarAccess.getPolicyAccess().getImportsAssignment_5()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1092:1: ( rule__Policy__ImportsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1092:2: rule__Policy__ImportsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Policy__ImportsAssignment_5_in_rule__Policy__Group__5__Impl2260);
            	    rule__Policy__ImportsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getImportsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__5__Impl"


    // $ANTLR start "rule__Policy__Group__6"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1102:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1106:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1107:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_rule__Policy__Group__6__Impl_in_rule__Policy__Group__62291);
            rule__Policy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__7_in_rule__Policy__Group__62294);
            rule__Policy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__6"


    // $ANTLR start "rule__Policy__Group__6__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1114:1: rule__Policy__Group__6__Impl : ( ( rule__Policy__RulesAssignment_6 )* ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1118:1: ( ( ( rule__Policy__RulesAssignment_6 )* ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1119:1: ( ( rule__Policy__RulesAssignment_6 )* )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1119:1: ( ( rule__Policy__RulesAssignment_6 )* )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1120:1: ( rule__Policy__RulesAssignment_6 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_6()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1121:1: ( rule__Policy__RulesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1121:2: rule__Policy__RulesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Policy__RulesAssignment_6_in_rule__Policy__Group__6__Impl2321);
            	    rule__Policy__RulesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__6__Impl"


    // $ANTLR start "rule__Policy__Group__7"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1131:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1135:1: ( rule__Policy__Group__7__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1136:2: rule__Policy__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group__7__Impl_in_rule__Policy__Group__72352);
            rule__Policy__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__7"


    // $ANTLR start "rule__Policy__Group__7__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1142:1: rule__Policy__Group__7__Impl : ( '}' ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1146:1: ( ( '}' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1147:1: ( '}' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1147:1: ( '}' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1148:1: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__Policy__Group__7__Impl2380); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1177:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1181:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1182:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02427);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02430);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1189:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1193:1: ( ( 'rule' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1194:1: ( 'rule' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1194:1: ( 'rule' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1195:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Rule__Group__0__Impl2458); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1208:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1212:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1213:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12489);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12492);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1220:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1224:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1225:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1225:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1226:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1227:1: ( rule__Rule__NameAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1227:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2519);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1237:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1241:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1242:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22549);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22552);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1249:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__TypeAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1253:1: ( ( ( rule__Rule__TypeAssignment_2 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1254:1: ( ( rule__Rule__TypeAssignment_2 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1254:1: ( ( rule__Rule__TypeAssignment_2 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1255:1: ( rule__Rule__TypeAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getTypeAssignment_2()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1256:1: ( rule__Rule__TypeAssignment_2 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1256:2: rule__Rule__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__TypeAssignment_2_in_rule__Rule__Group__2__Impl2579);
            rule__Rule__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1266:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1270:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1271:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32609);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32612);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1278:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__RightsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1282:1: ( ( ( rule__Rule__RightsAssignment_3 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1283:1: ( ( rule__Rule__RightsAssignment_3 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1283:1: ( ( rule__Rule__RightsAssignment_3 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1284:1: ( rule__Rule__RightsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getRightsAssignment_3()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1285:1: ( rule__Rule__RightsAssignment_3 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1285:2: rule__Rule__RightsAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__RightsAssignment_3_in_rule__Rule__Group__3__Impl2639);
            rule__Rule__RightsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRightsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1295:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1299:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1300:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42669);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42672);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1307:1: rule__Rule__Group__4__Impl : ( '{' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1311:1: ( ( '{' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1312:1: ( '{' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1312:1: ( '{' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1313:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Rule__Group__4__Impl2700); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1326:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1330:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1331:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52731);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52734);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1338:1: rule__Rule__Group__5__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1342:1: ( ( 'query' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1343:1: ( 'query' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1343:1: ( 'query' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1344:1: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__Rule__Group__5__Impl2762); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1357:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1361:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1362:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62793);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62796);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1369:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__PatternAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1373:1: ( ( ( rule__Rule__PatternAssignment_6 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1374:1: ( ( rule__Rule__PatternAssignment_6 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1374:1: ( ( rule__Rule__PatternAssignment_6 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1375:1: ( rule__Rule__PatternAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_6()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1376:1: ( rule__Rule__PatternAssignment_6 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1376:2: rule__Rule__PatternAssignment_6
            {
            pushFollow(FOLLOW_rule__Rule__PatternAssignment_6_in_rule__Rule__Group__6__Impl2823);
            rule__Rule__PatternAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPatternAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1386:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1390:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1391:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72853);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__72856);
            rule__Rule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1398:1: rule__Rule__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1402:1: ( ( ( ';' )? ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1403:1: ( ( ';' )? )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1403:1: ( ( ';' )? )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1404:1: ( ';' )?
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_7()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1405:1: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1406:2: ';'
                    {
                    match(input,32,FOLLOW_32_in_rule__Rule__Group__7__Impl2885); 

                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1417:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1421:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1422:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__82918);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__9_in_rule__Rule__Group__82921);
            rule__Rule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1429:1: rule__Rule__Group__8__Impl : ( ( rule__Rule__BindingsAssignment_8 )* ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1433:1: ( ( ( rule__Rule__BindingsAssignment_8 )* ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1434:1: ( ( rule__Rule__BindingsAssignment_8 )* )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1434:1: ( ( rule__Rule__BindingsAssignment_8 )* )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1435:1: ( rule__Rule__BindingsAssignment_8 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_8()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1436:1: ( rule__Rule__BindingsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1436:2: rule__Rule__BindingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Rule__BindingsAssignment_8_in_rule__Rule__Group__8__Impl2948);
            	    rule__Rule__BindingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBindingsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1446:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1450:1: ( rule__Rule__Group__9__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1451:2: rule__Rule__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__9__Impl_in_rule__Rule__Group__92979);
            rule__Rule__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1457:1: rule__Rule__Group__9__Impl : ( '}' ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1461:1: ( ( '}' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1462:1: ( '}' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1462:1: ( '}' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1463:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_28_in_rule__Rule__Group__9__Impl3007); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1496:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1500:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1501:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__03058);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__03061);
            rule__Binding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1508:1: rule__Binding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1512:1: ( ( 'bind' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1513:1: ( 'bind' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1513:1: ( 'bind' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1514:1: 'bind'
            {
             before(grammarAccess.getBindingAccess().getBindKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Binding__Group__0__Impl3089); 
             after(grammarAccess.getBindingAccess().getBindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1527:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1531:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1532:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__13120);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__13123);
            rule__Binding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1539:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__ParamAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1543:1: ( ( ( rule__Binding__ParamAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1544:1: ( ( rule__Binding__ParamAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1544:1: ( ( rule__Binding__ParamAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1545:1: ( rule__Binding__ParamAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getParamAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1546:1: ( rule__Binding__ParamAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1546:2: rule__Binding__ParamAssignment_1
            {
            pushFollow(FOLLOW_rule__Binding__ParamAssignment_1_in_rule__Binding__Group__1__Impl3150);
            rule__Binding__ParamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getParamAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1556:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1560:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1561:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__23180);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__3_in_rule__Binding__Group__23183);
            rule__Binding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1568:1: rule__Binding__Group__2__Impl : ( '<>' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1572:1: ( ( '<>' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1573:1: ( '<>' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1573:1: ( '<>' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1574:1: '<>'
            {
             before(grammarAccess.getBindingAccess().getLessThanSignGreaterThanSignKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Binding__Group__2__Impl3211); 
             after(grammarAccess.getBindingAccess().getLessThanSignGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1587:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1591:1: ( rule__Binding__Group__3__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1592:2: rule__Binding__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Binding__Group__3__Impl_in_rule__Binding__Group__33242);
            rule__Binding__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1598:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__ValueAssignment_3 ) ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1602:1: ( ( ( rule__Binding__ValueAssignment_3 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1603:1: ( ( rule__Binding__ValueAssignment_3 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1603:1: ( ( rule__Binding__ValueAssignment_3 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1604:1: ( rule__Binding__ValueAssignment_3 )
            {
             before(grammarAccess.getBindingAccess().getValueAssignment_3()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1605:1: ( rule__Binding__ValueAssignment_3 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1605:2: rule__Binding__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Binding__ValueAssignment_3_in_rule__Binding__Group__3__Impl3269);
            rule__Binding__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__RoleBind__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1623:1: rule__RoleBind__Group__0 : rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1 ;
    public final void rule__RoleBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1627:1: ( rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1628:2: rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__0__Impl_in_rule__RoleBind__Group__03307);
            rule__RoleBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RoleBind__Group__1_in_rule__RoleBind__Group__03310);
            rule__RoleBind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleBind__Group__0"


    // $ANTLR start "rule__RoleBind__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1635:1: rule__RoleBind__Group__0__Impl : ( 'r' ) ;
    public final void rule__RoleBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1639:1: ( ( 'r' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1640:1: ( 'r' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1640:1: ( 'r' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1641:1: 'r'
            {
             before(grammarAccess.getRoleBindAccess().getRKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__RoleBind__Group__0__Impl3338); 
             after(grammarAccess.getRoleBindAccess().getRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleBind__Group__0__Impl"


    // $ANTLR start "rule__RoleBind__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1654:1: rule__RoleBind__Group__1 : rule__RoleBind__Group__1__Impl ;
    public final void rule__RoleBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1658:1: ( rule__RoleBind__Group__1__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1659:2: rule__RoleBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__1__Impl_in_rule__RoleBind__Group__13369);
            rule__RoleBind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleBind__Group__1"


    // $ANTLR start "rule__RoleBind__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1665:1: rule__RoleBind__Group__1__Impl : ( ( rule__RoleBind__RoleAssignment_1 ) ) ;
    public final void rule__RoleBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1669:1: ( ( ( rule__RoleBind__RoleAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1670:1: ( ( rule__RoleBind__RoleAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1670:1: ( ( rule__RoleBind__RoleAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1671:1: ( rule__RoleBind__RoleAssignment_1 )
            {
             before(grammarAccess.getRoleBindAccess().getRoleAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1672:1: ( rule__RoleBind__RoleAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1672:2: rule__RoleBind__RoleAssignment_1
            {
            pushFollow(FOLLOW_rule__RoleBind__RoleAssignment_1_in_rule__RoleBind__Group__1__Impl3396);
            rule__RoleBind__RoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleBindAccess().getRoleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleBind__Group__1__Impl"


    // $ANTLR start "rule__ValueBind__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1686:1: rule__ValueBind__Group__0 : rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1 ;
    public final void rule__ValueBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1690:1: ( rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1691:2: rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__0__Impl_in_rule__ValueBind__Group__03430);
            rule__ValueBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueBind__Group__1_in_rule__ValueBind__Group__03433);
            rule__ValueBind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBind__Group__0"


    // $ANTLR start "rule__ValueBind__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1698:1: rule__ValueBind__Group__0__Impl : ( 'v' ) ;
    public final void rule__ValueBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1702:1: ( ( 'v' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1703:1: ( 'v' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1703:1: ( 'v' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1704:1: 'v'
            {
             before(grammarAccess.getValueBindAccess().getVKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ValueBind__Group__0__Impl3461); 
             after(grammarAccess.getValueBindAccess().getVKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBind__Group__0__Impl"


    // $ANTLR start "rule__ValueBind__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1717:1: rule__ValueBind__Group__1 : rule__ValueBind__Group__1__Impl ;
    public final void rule__ValueBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1721:1: ( rule__ValueBind__Group__1__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1722:2: rule__ValueBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__1__Impl_in_rule__ValueBind__Group__13492);
            rule__ValueBind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBind__Group__1"


    // $ANTLR start "rule__ValueBind__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1728:1: rule__ValueBind__Group__1__Impl : ( ( rule__ValueBind__ValueAssignment_1 ) ) ;
    public final void rule__ValueBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1732:1: ( ( ( rule__ValueBind__ValueAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1733:1: ( ( rule__ValueBind__ValueAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1733:1: ( ( rule__ValueBind__ValueAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1734:1: ( rule__ValueBind__ValueAssignment_1 )
            {
             before(grammarAccess.getValueBindAccess().getValueAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1735:1: ( rule__ValueBind__ValueAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1735:2: rule__ValueBind__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ValueBind__ValueAssignment_1_in_rule__ValueBind__Group__1__Impl3519);
            rule__ValueBind__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueBindAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBind__Group__1__Impl"


    // $ANTLR start "rule__ObjectBind__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1749:1: rule__ObjectBind__Group__0 : rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1 ;
    public final void rule__ObjectBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1753:1: ( rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1754:2: rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__0__Impl_in_rule__ObjectBind__Group__03553);
            rule__ObjectBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectBind__Group__1_in_rule__ObjectBind__Group__03556);
            rule__ObjectBind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectBind__Group__0"


    // $ANTLR start "rule__ObjectBind__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1761:1: rule__ObjectBind__Group__0__Impl : ( 'o' ) ;
    public final void rule__ObjectBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1765:1: ( ( 'o' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1766:1: ( 'o' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1766:1: ( 'o' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1767:1: 'o'
            {
             before(grammarAccess.getObjectBindAccess().getOKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ObjectBind__Group__0__Impl3584); 
             after(grammarAccess.getObjectBindAccess().getOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectBind__Group__0__Impl"


    // $ANTLR start "rule__ObjectBind__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1780:1: rule__ObjectBind__Group__1 : rule__ObjectBind__Group__1__Impl ;
    public final void rule__ObjectBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1784:1: ( rule__ObjectBind__Group__1__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1785:2: rule__ObjectBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__1__Impl_in_rule__ObjectBind__Group__13615);
            rule__ObjectBind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectBind__Group__1"


    // $ANTLR start "rule__ObjectBind__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1791:1: rule__ObjectBind__Group__1__Impl : ( ( rule__ObjectBind__ObjectAssignment_1 ) ) ;
    public final void rule__ObjectBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1795:1: ( ( ( rule__ObjectBind__ObjectAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1796:1: ( ( rule__ObjectBind__ObjectAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1796:1: ( ( rule__ObjectBind__ObjectAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1797:1: ( rule__ObjectBind__ObjectAssignment_1 )
            {
             before(grammarAccess.getObjectBindAccess().getObjectAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1798:1: ( rule__ObjectBind__ObjectAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1798:2: rule__ObjectBind__ObjectAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectBind__ObjectAssignment_1_in_rule__ObjectBind__Group__1__Impl3642);
            rule__ObjectBind__ObjectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectBindAccess().getObjectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectBind__Group__1__Impl"


    // $ANTLR start "rule__ImportResource__Group__0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1812:1: rule__ImportResource__Group__0 : rule__ImportResource__Group__0__Impl rule__ImportResource__Group__1 ;
    public final void rule__ImportResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1816:1: ( rule__ImportResource__Group__0__Impl rule__ImportResource__Group__1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1817:2: rule__ImportResource__Group__0__Impl rule__ImportResource__Group__1
            {
            pushFollow(FOLLOW_rule__ImportResource__Group__0__Impl_in_rule__ImportResource__Group__03676);
            rule__ImportResource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportResource__Group__1_in_rule__ImportResource__Group__03679);
            rule__ImportResource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportResource__Group__0"


    // $ANTLR start "rule__ImportResource__Group__0__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1824:1: rule__ImportResource__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1828:1: ( ( 'import' ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1829:1: ( 'import' )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1829:1: ( 'import' )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1830:1: 'import'
            {
             before(grammarAccess.getImportResourceAccess().getImportKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ImportResource__Group__0__Impl3707); 
             after(grammarAccess.getImportResourceAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportResource__Group__0__Impl"


    // $ANTLR start "rule__ImportResource__Group__1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1843:1: rule__ImportResource__Group__1 : rule__ImportResource__Group__1__Impl rule__ImportResource__Group__2 ;
    public final void rule__ImportResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1847:1: ( rule__ImportResource__Group__1__Impl rule__ImportResource__Group__2 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1848:2: rule__ImportResource__Group__1__Impl rule__ImportResource__Group__2
            {
            pushFollow(FOLLOW_rule__ImportResource__Group__1__Impl_in_rule__ImportResource__Group__13738);
            rule__ImportResource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportResource__Group__2_in_rule__ImportResource__Group__13741);
            rule__ImportResource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportResource__Group__1"


    // $ANTLR start "rule__ImportResource__Group__1__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1855:1: rule__ImportResource__Group__1__Impl : ( ( rule__ImportResource__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1859:1: ( ( ( rule__ImportResource__ImportURIAssignment_1 ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1860:1: ( ( rule__ImportResource__ImportURIAssignment_1 ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1860:1: ( ( rule__ImportResource__ImportURIAssignment_1 ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1861:1: ( rule__ImportResource__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportResourceAccess().getImportURIAssignment_1()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1862:1: ( rule__ImportResource__ImportURIAssignment_1 )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1862:2: rule__ImportResource__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportResource__ImportURIAssignment_1_in_rule__ImportResource__Group__1__Impl3768);
            rule__ImportResource__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportResourceAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportResource__Group__1__Impl"


    // $ANTLR start "rule__ImportResource__Group__2"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1872:1: rule__ImportResource__Group__2 : rule__ImportResource__Group__2__Impl ;
    public final void rule__ImportResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1876:1: ( rule__ImportResource__Group__2__Impl )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1877:2: rule__ImportResource__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportResource__Group__2__Impl_in_rule__ImportResource__Group__23798);
            rule__ImportResource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportResource__Group__2"


    // $ANTLR start "rule__ImportResource__Group__2__Impl"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1883:1: rule__ImportResource__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ImportResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1887:1: ( ( ( ';' )? ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1888:1: ( ( ';' )? )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1888:1: ( ( ';' )? )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1889:1: ( ';' )?
            {
             before(grammarAccess.getImportResourceAccess().getSemicolonKeyword_2()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1890:1: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1891:2: ';'
                    {
                    match(input,32,FOLLOW_32_in_rule__ImportResource__Group__2__Impl3827); 

                    }
                    break;

            }

             after(grammarAccess.getImportResourceAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportResource__Group__2__Impl"


    // $ANTLR start "rule__AccessControlModel__RolesAssignment_0"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1909:1: rule__AccessControlModel__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__AccessControlModel__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1913:1: ( ( ruleRole ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1914:1: ( ruleRole )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1914:1: ( ruleRole )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1915:1: ruleRole
            {
             before(grammarAccess.getAccessControlModelAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__AccessControlModel__RolesAssignment_03871);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAccessControlModelAccess().getRolesRoleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessControlModel__RolesAssignment_0"


    // $ANTLR start "rule__AccessControlModel__PolicyAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1924:1: rule__AccessControlModel__PolicyAssignment_1 : ( rulePolicy ) ;
    public final void rule__AccessControlModel__PolicyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1928:1: ( ( rulePolicy ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1929:1: ( rulePolicy )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1929:1: ( rulePolicy )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1930:1: rulePolicy
            {
             before(grammarAccess.getAccessControlModelAccess().getPolicyPolicyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePolicy_in_rule__AccessControlModel__PolicyAssignment_13902);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getAccessControlModelAccess().getPolicyPolicyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessControlModel__PolicyAssignment_1"


    // $ANTLR start "rule__User__NameAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1939:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1943:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1944:1: ( RULE_ID )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1944:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1945:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_13933); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1954:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1958:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1959:1: ( RULE_ID )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1959:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1960:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__NameAssignment_13964); 
             after(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__UsersAssignment_3"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1969:1: rule__Group__UsersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1973:1: ( ( ( RULE_ID ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1974:1: ( ( RULE_ID ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1974:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1975:1: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1976:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1977:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_33999); 
             after(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__UsersAssignment_3"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1988:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1992:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1993:1: ( RULE_ID )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1993:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:1994:1: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Policy__NameAssignment_14034); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__NameAssignment_1"


    // $ANTLR start "rule__Policy__TypeAssignment_2"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2003:1: rule__Policy__TypeAssignment_2 : ( ruleConflictResolutionTypes ) ;
    public final void rule__Policy__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2007:1: ( ( ruleConflictResolutionTypes ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2008:1: ( ruleConflictResolutionTypes )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2008:1: ( ruleConflictResolutionTypes )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2009:1: ruleConflictResolutionTypes
            {
             before(grammarAccess.getPolicyAccess().getTypeConflictResolutionTypesEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConflictResolutionTypes_in_rule__Policy__TypeAssignment_24065);
            ruleConflictResolutionTypes();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getTypeConflictResolutionTypesEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__TypeAssignment_2"


    // $ANTLR start "rule__Policy__RolesAssignment_3"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2018:1: rule__Policy__RolesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Policy__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2022:1: ( ( ( RULE_ID ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2023:1: ( ( RULE_ID ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2023:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2024:1: ( RULE_ID )
            {
             before(grammarAccess.getPolicyAccess().getRolesRoleCrossReference_3_0()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2025:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2026:1: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getRolesRoleIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Policy__RolesAssignment_34100); 
             after(grammarAccess.getPolicyAccess().getRolesRoleIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPolicyAccess().getRolesRoleCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__RolesAssignment_3"


    // $ANTLR start "rule__Policy__ImportsAssignment_5"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2037:1: rule__Policy__ImportsAssignment_5 : ( ruleImportResource ) ;
    public final void rule__Policy__ImportsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2041:1: ( ( ruleImportResource ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2042:1: ( ruleImportResource )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2042:1: ( ruleImportResource )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2043:1: ruleImportResource
            {
             before(grammarAccess.getPolicyAccess().getImportsImportResourceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleImportResource_in_rule__Policy__ImportsAssignment_54135);
            ruleImportResource();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getImportsImportResourceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__ImportsAssignment_5"


    // $ANTLR start "rule__Policy__RulesAssignment_6"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2052:1: rule__Policy__RulesAssignment_6 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2056:1: ( ( ruleRule ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2057:1: ( ruleRule )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2057:1: ( ruleRule )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2058:1: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Policy__RulesAssignment_64166);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__RulesAssignment_6"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2067:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2071:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2072:1: ( RULE_ID )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2072:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2073:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_14197); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__TypeAssignment_2"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2082:1: rule__Rule__TypeAssignment_2 : ( ruleRuleType ) ;
    public final void rule__Rule__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2086:1: ( ( ruleRuleType ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2087:1: ( ruleRuleType )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2087:1: ( ruleRuleType )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2088:1: ruleRuleType
            {
             before(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRuleType_in_rule__Rule__TypeAssignment_24228);
            ruleRuleType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TypeAssignment_2"


    // $ANTLR start "rule__Rule__RightsAssignment_3"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2097:1: rule__Rule__RightsAssignment_3 : ( ruleRuleRights ) ;
    public final void rule__Rule__RightsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2101:1: ( ( ruleRuleRights ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2102:1: ( ruleRuleRights )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2102:1: ( ruleRuleRights )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2103:1: ruleRuleRights
            {
             before(grammarAccess.getRuleAccess().getRightsRuleRightsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRuleRights_in_rule__Rule__RightsAssignment_34259);
            ruleRuleRights();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRightsRuleRightsEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RightsAssignment_3"


    // $ANTLR start "rule__Rule__PatternAssignment_6"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2112:1: rule__Rule__PatternAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2116:1: ( ( ( RULE_STRING ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2117:1: ( ( RULE_STRING ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2117:1: ( ( RULE_STRING ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2118:1: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_6_0()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2119:1: ( RULE_STRING )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2120:1: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_6_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rule__PatternAssignment_64294); 
             after(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPatternPatternCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PatternAssignment_6"


    // $ANTLR start "rule__Rule__BindingsAssignment_8"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2131:1: rule__Rule__BindingsAssignment_8 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2135:1: ( ( ruleBinding ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2136:1: ( ruleBinding )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2136:1: ( ruleBinding )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2137:1: ruleBinding
            {
             before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBinding_in_rule__Rule__BindingsAssignment_84329);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BindingsAssignment_8"


    // $ANTLR start "rule__Binding__ParamAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2146:1: rule__Binding__ParamAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2150:1: ( ( ( RULE_ID ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2151:1: ( ( RULE_ID ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2151:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2152:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getParamVariableCrossReference_1_0()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2153:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2154:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getParamVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__ParamAssignment_14364); 
             after(grammarAccess.getBindingAccess().getParamVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getParamVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ParamAssignment_1"


    // $ANTLR start "rule__Binding__ValueAssignment_3"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2165:1: rule__Binding__ValueAssignment_3 : ( ruleBind ) ;
    public final void rule__Binding__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2169:1: ( ( ruleBind ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2170:1: ( ruleBind )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2170:1: ( ruleBind )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2171:1: ruleBind
            {
             before(grammarAccess.getBindingAccess().getValueBindParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBind_in_rule__Binding__ValueAssignment_34399);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getValueBindParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ValueAssignment_3"


    // $ANTLR start "rule__RoleBind__RoleAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2180:1: rule__RoleBind__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoleBind__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2184:1: ( ( ( RULE_ID ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2185:1: ( ( RULE_ID ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2185:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2186:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleBindAccess().getRoleRoleCrossReference_1_0()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2187:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2188:1: RULE_ID
            {
             before(grammarAccess.getRoleBindAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RoleBind__RoleAssignment_14434); 
             after(grammarAccess.getRoleBindAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRoleBindAccess().getRoleRoleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleBind__RoleAssignment_1"


    // $ANTLR start "rule__ValueBind__ValueAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2199:1: rule__ValueBind__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ValueBind__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2203:1: ( ( RULE_STRING ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2204:1: ( RULE_STRING )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2204:1: ( RULE_STRING )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2205:1: RULE_STRING
            {
             before(grammarAccess.getValueBindAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ValueBind__ValueAssignment_14469); 
             after(grammarAccess.getValueBindAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBind__ValueAssignment_1"


    // $ANTLR start "rule__ObjectBind__ObjectAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2214:1: rule__ObjectBind__ObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectBind__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2218:1: ( ( ( RULE_ID ) ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2219:1: ( ( RULE_ID ) )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2219:1: ( ( RULE_ID ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2220:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0()); 
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2221:1: ( RULE_ID )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2222:1: RULE_ID
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectBind__ObjectAssignment_14504); 
             after(grammarAccess.getObjectBindAccess().getObjectEObjectIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectBind__ObjectAssignment_1"


    // $ANTLR start "rule__ImportResource__ImportURIAssignment_1"
    // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2233:1: rule__ImportResource__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportResource__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2237:1: ( ( RULE_STRING ) )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2238:1: ( RULE_STRING )
            {
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2238:1: ( RULE_STRING )
            // ../mondo.collab.security.xtext.ui/src-gen/mondo/collab/security/xtext/ui/contentassist/antlr/internal/InternalSecurityAccess.g:2239:1: RULE_STRING
            {
             before(grammarAccess.getImportResourceAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportResource__ImportURIAssignment_14539); 
             after(grammarAccess.getImportResourceAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportResource__ImportURIAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAccessControlModel_in_entryRuleAccessControlModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessControlModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__Group__0_in_ruleAccessControlModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Alternatives_in_ruleRole154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0_in_rulePolicy334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0_in_ruleBinding454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_entryRuleBind481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBind488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bind__Alternatives_in_ruleBind514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBind_in_entryRuleRoleBind541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleBind548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__0_in_ruleRoleBind574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueBind_in_entryRuleValueBind601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueBind608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__0_in_ruleValueBind634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectBind_in_entryRuleObjectBind661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectBind668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__0_in_ruleObjectBind694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportResource_in_entryRuleImportResource721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportResource728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__0_in_ruleImportResource754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleRights__Alternatives_in_ruleRuleRights791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleType__Alternatives_in_ruleRuleType827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConflictResolutionTypes__Alternatives_in_ruleConflictResolutionTypes863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__Role__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Role__Alternatives915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectBind_in_rule__Bind__Alternatives947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueBind_in_rule__Bind__Alternatives964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBind_in_rule__Bind__Alternatives981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RuleRights__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RuleRights__Alternatives1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RuleRights__Alternatives1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RuleType__Alternatives1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RuleType__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RuleType__Alternatives1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ConflictResolutionTypes__Alternatives1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConflictResolutionTypes__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConflictResolutionTypes__Alternatives1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConflictResolutionTypes__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConflictResolutionTypes__Alternatives1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConflictResolutionTypes__Alternatives1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ConflictResolutionTypes__Alternatives1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ConflictResolutionTypes__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__Group__0__Impl_in_rule__AccessControlModel__Group__01350 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AccessControlModel__Group__1_in_rule__AccessControlModel__Group__01353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__RolesAssignment_0_in_rule__AccessControlModel__Group__0__Impl1380 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__Group__1__Impl_in_rule__AccessControlModel__Group__11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__PolicyAssignment_1_in_rule__AccessControlModel__Group__1__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__01475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__User__Group__0__Impl1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Group__Group__0__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11657 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21717 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Group__Group__2__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31779 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__UsersAssignment_3_in_rule__Group__Group__3__Impl1809 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Group__Group__4__Impl1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__01909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__01912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Policy__Group__0__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__11971 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__11974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__NameAssignment_1_in_rule__Policy__Group__1__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__22031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Policy__Group__3_in_rule__Policy__Group__22034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__TypeAssignment_2_in_rule__Policy__Group__2__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__3__Impl_in_rule__Policy__Group__32091 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Policy__Group__4_in_rule__Policy__Group__32094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__RolesAssignment_3_in_rule__Policy__Group__3__Impl2123 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Policy__RolesAssignment_3_in_rule__Policy__Group__3__Impl2135 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Policy__Group__4__Impl_in_rule__Policy__Group__42168 = new BitSet(new long[]{0x0000004050000000L});
    public static final BitSet FOLLOW_rule__Policy__Group__5_in_rule__Policy__Group__42171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Policy__Group__4__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__5__Impl_in_rule__Policy__Group__52230 = new BitSet(new long[]{0x0000004050000000L});
    public static final BitSet FOLLOW_rule__Policy__Group__6_in_rule__Policy__Group__52233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__ImportsAssignment_5_in_rule__Policy__Group__5__Impl2260 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__6__Impl_in_rule__Policy__Group__62291 = new BitSet(new long[]{0x0000004050000000L});
    public static final BitSet FOLLOW_rule__Policy__Group__7_in_rule__Policy__Group__62294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__RulesAssignment_6_in_rule__Policy__Group__6__Impl2321 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__7__Impl_in_rule__Policy__Group__72352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Policy__Group__7__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Rule__Group__0__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12489 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22549 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__TypeAssignment_2_in_rule__Rule__Group__2__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32609 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__RightsAssignment_3_in_rule__Rule__Group__3__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42669 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rule__Group__4__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Rule__Group__5__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62793 = new BitSet(new long[]{0x0000000310000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__PatternAssignment_6_in_rule__Rule__Group__6__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72853 = new BitSet(new long[]{0x0000000310000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__72856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Rule__Group__7__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__82918 = new BitSet(new long[]{0x0000000310000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__9_in_rule__Rule__Group__82921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__BindingsAssignment_8_in_rule__Rule__Group__8__Impl2948 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__9__Impl_in_rule__Rule__Group__92979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Rule__Group__9__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__03058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__03061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Binding__Group__0__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__13120 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__ParamAssignment_1_in_rule__Binding__Group__1__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__23180 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_rule__Binding__Group__3_in_rule__Binding__Group__23183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Binding__Group__2__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__3__Impl_in_rule__Binding__Group__33242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__ValueAssignment_3_in_rule__Binding__Group__3__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__0__Impl_in_rule__RoleBind__Group__03307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__1_in_rule__RoleBind__Group__03310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RoleBind__Group__0__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__1__Impl_in_rule__RoleBind__Group__13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__RoleAssignment_1_in_rule__RoleBind__Group__1__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__0__Impl_in_rule__ValueBind__Group__03430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__1_in_rule__ValueBind__Group__03433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ValueBind__Group__0__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__1__Impl_in_rule__ValueBind__Group__13492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__ValueAssignment_1_in_rule__ValueBind__Group__1__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__0__Impl_in_rule__ObjectBind__Group__03553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__1_in_rule__ObjectBind__Group__03556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ObjectBind__Group__0__Impl3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__1__Impl_in_rule__ObjectBind__Group__13615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__ObjectAssignment_1_in_rule__ObjectBind__Group__1__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__0__Impl_in_rule__ImportResource__Group__03676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__1_in_rule__ImportResource__Group__03679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ImportResource__Group__0__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__1__Impl_in_rule__ImportResource__Group__13738 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__2_in_rule__ImportResource__Group__13741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__ImportURIAssignment_1_in_rule__ImportResource__Group__1__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__2__Impl_in_rule__ImportResource__Group__23798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ImportResource__Group__2__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__AccessControlModel__RolesAssignment_03871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_rule__AccessControlModel__PolicyAssignment_13902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_13933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__NameAssignment_13964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_33999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Policy__NameAssignment_14034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictResolutionTypes_in_rule__Policy__TypeAssignment_24065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Policy__RolesAssignment_34100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportResource_in_rule__Policy__ImportsAssignment_54135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Policy__RulesAssignment_64166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_14197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleType_in_rule__Rule__TypeAssignment_24228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleRights_in_rule__Rule__RightsAssignment_34259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rule__PatternAssignment_64294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_rule__Rule__BindingsAssignment_84329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__ParamAssignment_14364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_rule__Binding__ValueAssignment_34399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RoleBind__RoleAssignment_14434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ValueBind__ValueAssignment_14469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectBind__ObjectAssignment_14504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportResource__ImportURIAssignment_14539 = new BitSet(new long[]{0x0000000000000002L});

}