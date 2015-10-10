package org.mondo.collaboration.security.macl.xtext.ui.contentassist.antlr.internal; 

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
import org.mondo.collaboration.security.macl.xtext.services.AccessControlLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAccessControlLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'obfuscate'", "'deny-overrides'", "'permit-overrides'", "'first-applicable'", "'only-one-applicable-policy'", "'ordered-deny-overrides'", "'ordered-permit-overrides'", "'deny-unless-permit'", "'permit-unless-permit'", "'R'", "'W'", "'RW'", "'deny'", "'permit'", "'policy'", "'{'", "'}'", "'rule-reference'", "'resource'", "';'", "'user'", "'group'", "','", "'rule'", "'to'", "'query'", "'bind'", "'role'", "'value'", "'object'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAccessControlLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAccessControlLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAccessControlLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g"; }


     
     	private AccessControlLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AccessControlLanguageGrammarAccess grammarAccess) {
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:60:1: entryRuleAccessControlModel : ruleAccessControlModel EOF ;
    public final void entryRuleAccessControlModel() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:61:1: ( ruleAccessControlModel EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:62:1: ruleAccessControlModel EOF
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:69:1: ruleAccessControlModel : ( ( rule__AccessControlModel__Group__0 ) ) ;
    public final void ruleAccessControlModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:73:2: ( ( ( rule__AccessControlModel__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:74:1: ( ( rule__AccessControlModel__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:74:1: ( ( rule__AccessControlModel__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:75:1: ( rule__AccessControlModel__Group__0 )
            {
             before(grammarAccess.getAccessControlModelAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:76:1: ( rule__AccessControlModel__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:76:2: rule__AccessControlModel__Group__0
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


    // $ANTLR start "entryRulePolicy"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:88:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:89:1: ( rulePolicy EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:90:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy121);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy128); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:97:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:101:2: ( ( ( rule__Policy__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:102:1: ( ( rule__Policy__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:102:1: ( ( rule__Policy__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:103:1: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:104:1: ( rule__Policy__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:104:2: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_rule__Policy__Group__0_in_rulePolicy154);
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


    // $ANTLR start "entryRuleRuleRef"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:116:1: entryRuleRuleRef : ruleRuleRef EOF ;
    public final void entryRuleRuleRef() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:117:1: ( ruleRuleRef EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:118:1: ruleRuleRef EOF
            {
             before(grammarAccess.getRuleRefRule()); 
            pushFollow(FOLLOW_ruleRuleRef_in_entryRuleRuleRef181);
            ruleRuleRef();

            state._fsp--;

             after(grammarAccess.getRuleRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleRef188); 

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
    // $ANTLR end "entryRuleRuleRef"


    // $ANTLR start "ruleRuleRef"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:125:1: ruleRuleRef : ( ( rule__RuleRef__Group__0 ) ) ;
    public final void ruleRuleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:129:2: ( ( ( rule__RuleRef__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:130:1: ( ( rule__RuleRef__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:130:1: ( ( rule__RuleRef__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:131:1: ( rule__RuleRef__Group__0 )
            {
             before(grammarAccess.getRuleRefAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:132:1: ( rule__RuleRef__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:132:2: rule__RuleRef__Group__0
            {
            pushFollow(FOLLOW_rule__RuleRef__Group__0_in_ruleRuleRef214);
            rule__RuleRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleRefAccess().getGroup()); 

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
    // $ANTLR end "ruleRuleRef"


    // $ANTLR start "entryRuleImportResource"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:144:1: entryRuleImportResource : ruleImportResource EOF ;
    public final void entryRuleImportResource() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:145:1: ( ruleImportResource EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:146:1: ruleImportResource EOF
            {
             before(grammarAccess.getImportResourceRule()); 
            pushFollow(FOLLOW_ruleImportResource_in_entryRuleImportResource241);
            ruleImportResource();

            state._fsp--;

             after(grammarAccess.getImportResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportResource248); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:153:1: ruleImportResource : ( ( rule__ImportResource__Group__0 ) ) ;
    public final void ruleImportResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:157:2: ( ( ( rule__ImportResource__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:158:1: ( ( rule__ImportResource__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:158:1: ( ( rule__ImportResource__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:159:1: ( rule__ImportResource__Group__0 )
            {
             before(grammarAccess.getImportResourceAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:160:1: ( rule__ImportResource__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:160:2: rule__ImportResource__Group__0
            {
            pushFollow(FOLLOW_rule__ImportResource__Group__0_in_ruleImportResource274);
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


    // $ANTLR start "entryRuleRole"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:174:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:175:1: ( ruleRole EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:176:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole303);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole310); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:183:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:187:2: ( ( ( rule__Role__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:188:1: ( ( rule__Role__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:188:1: ( ( rule__Role__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:189:1: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:190:1: ( rule__Role__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:190:2: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_rule__Role__Alternatives_in_ruleRole336);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:202:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:203:1: ( ruleUser EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:204:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser363);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser370); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:211:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:215:2: ( ( ( rule__User__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:216:1: ( ( rule__User__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:216:1: ( ( rule__User__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:217:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:218:1: ( rule__User__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:218:2: rule__User__Group__0
            {
            pushFollow(FOLLOW_rule__User__Group__0_in_ruleUser396);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:230:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:231:1: ( ruleGroup EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:232:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup423);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup430); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:239:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:243:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:244:1: ( ( rule__Group__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:244:1: ( ( rule__Group__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:245:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:246:1: ( rule__Group__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:246:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup456);
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


    // $ANTLR start "entryRuleRule"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:258:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:259:1: ( ruleRule EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:260:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule483);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule490); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:267:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:271:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:272:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:272:1: ( ( rule__Rule__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:273:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:274:1: ( rule__Rule__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:274:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule516);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:286:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:287:1: ( ruleBinding EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:288:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding543);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding550); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:295:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:299:2: ( ( ( rule__Binding__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:300:1: ( ( rule__Binding__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:300:1: ( ( rule__Binding__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:301:1: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:302:1: ( rule__Binding__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:302:2: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_rule__Binding__Group__0_in_ruleBinding576);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:314:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:315:1: ( ruleBind EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:316:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_ruleBind_in_entryRuleBind603);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBind610); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:323:1: ruleBind : ( ( rule__Bind__Alternatives ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:327:2: ( ( ( rule__Bind__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:328:1: ( ( rule__Bind__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:328:1: ( ( rule__Bind__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:329:1: ( rule__Bind__Alternatives )
            {
             before(grammarAccess.getBindAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:330:1: ( rule__Bind__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:330:2: rule__Bind__Alternatives
            {
            pushFollow(FOLLOW_rule__Bind__Alternatives_in_ruleBind636);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:342:1: entryRuleRoleBind : ruleRoleBind EOF ;
    public final void entryRuleRoleBind() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:343:1: ( ruleRoleBind EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:344:1: ruleRoleBind EOF
            {
             before(grammarAccess.getRoleBindRule()); 
            pushFollow(FOLLOW_ruleRoleBind_in_entryRuleRoleBind663);
            ruleRoleBind();

            state._fsp--;

             after(grammarAccess.getRoleBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleBind670); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:351:1: ruleRoleBind : ( ( rule__RoleBind__Group__0 ) ) ;
    public final void ruleRoleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:355:2: ( ( ( rule__RoleBind__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:356:1: ( ( rule__RoleBind__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:356:1: ( ( rule__RoleBind__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:357:1: ( rule__RoleBind__Group__0 )
            {
             before(grammarAccess.getRoleBindAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:358:1: ( rule__RoleBind__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:358:2: rule__RoleBind__Group__0
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__0_in_ruleRoleBind696);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:370:1: entryRuleValueBind : ruleValueBind EOF ;
    public final void entryRuleValueBind() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:371:1: ( ruleValueBind EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:372:1: ruleValueBind EOF
            {
             before(grammarAccess.getValueBindRule()); 
            pushFollow(FOLLOW_ruleValueBind_in_entryRuleValueBind723);
            ruleValueBind();

            state._fsp--;

             after(grammarAccess.getValueBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueBind730); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:379:1: ruleValueBind : ( ( rule__ValueBind__Group__0 ) ) ;
    public final void ruleValueBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:383:2: ( ( ( rule__ValueBind__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:384:1: ( ( rule__ValueBind__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:384:1: ( ( rule__ValueBind__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:385:1: ( rule__ValueBind__Group__0 )
            {
             before(grammarAccess.getValueBindAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:386:1: ( rule__ValueBind__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:386:2: rule__ValueBind__Group__0
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__0_in_ruleValueBind756);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:398:1: entryRuleObjectBind : ruleObjectBind EOF ;
    public final void entryRuleObjectBind() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:399:1: ( ruleObjectBind EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:400:1: ruleObjectBind EOF
            {
             before(grammarAccess.getObjectBindRule()); 
            pushFollow(FOLLOW_ruleObjectBind_in_entryRuleObjectBind783);
            ruleObjectBind();

            state._fsp--;

             after(grammarAccess.getObjectBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectBind790); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:407:1: ruleObjectBind : ( ( rule__ObjectBind__Group__0 ) ) ;
    public final void ruleObjectBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:411:2: ( ( ( rule__ObjectBind__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:412:1: ( ( rule__ObjectBind__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:412:1: ( ( rule__ObjectBind__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:413:1: ( rule__ObjectBind__Group__0 )
            {
             before(grammarAccess.getObjectBindAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:414:1: ( rule__ObjectBind__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:414:2: rule__ObjectBind__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__0_in_ruleObjectBind816);
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


    // $ANTLR start "entryRuleRuleConstraint"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:426:1: entryRuleRuleConstraint : ruleRuleConstraint EOF ;
    public final void entryRuleRuleConstraint() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:427:1: ( ruleRuleConstraint EOF )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:428:1: ruleRuleConstraint EOF
            {
             before(grammarAccess.getRuleConstraintRule()); 
            pushFollow(FOLLOW_ruleRuleConstraint_in_entryRuleRuleConstraint843);
            ruleRuleConstraint();

            state._fsp--;

             after(grammarAccess.getRuleConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleConstraint850); 

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
    // $ANTLR end "entryRuleRuleConstraint"


    // $ANTLR start "ruleRuleConstraint"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:435:1: ruleRuleConstraint : ( ( rule__RuleConstraint__Alternatives ) ) ;
    public final void ruleRuleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:439:2: ( ( ( rule__RuleConstraint__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:440:1: ( ( rule__RuleConstraint__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:440:1: ( ( rule__RuleConstraint__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:441:1: ( rule__RuleConstraint__Alternatives )
            {
             before(grammarAccess.getRuleConstraintAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:442:1: ( rule__RuleConstraint__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:442:2: rule__RuleConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__RuleConstraint__Alternatives_in_ruleRuleConstraint876);
            rule__RuleConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleConstraintAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRuleConstraint"


    // $ANTLR start "ruleConflictResolutionTypes"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:455:1: ruleConflictResolutionTypes : ( ( rule__ConflictResolutionTypes__Alternatives ) ) ;
    public final void ruleConflictResolutionTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:459:1: ( ( ( rule__ConflictResolutionTypes__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:460:1: ( ( rule__ConflictResolutionTypes__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:460:1: ( ( rule__ConflictResolutionTypes__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:461:1: ( rule__ConflictResolutionTypes__Alternatives )
            {
             before(grammarAccess.getConflictResolutionTypesAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:462:1: ( rule__ConflictResolutionTypes__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:462:2: rule__ConflictResolutionTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__ConflictResolutionTypes__Alternatives_in_ruleConflictResolutionTypes913);
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


    // $ANTLR start "ruleRuleRights"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:474:1: ruleRuleRights : ( ( rule__RuleRights__Alternatives ) ) ;
    public final void ruleRuleRights() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:478:1: ( ( ( rule__RuleRights__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:479:1: ( ( rule__RuleRights__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:479:1: ( ( rule__RuleRights__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:480:1: ( rule__RuleRights__Alternatives )
            {
             before(grammarAccess.getRuleRightsAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:481:1: ( rule__RuleRights__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:481:2: rule__RuleRights__Alternatives
            {
            pushFollow(FOLLOW_rule__RuleRights__Alternatives_in_ruleRuleRights949);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:493:1: ruleRuleType : ( ( rule__RuleType__Alternatives ) ) ;
    public final void ruleRuleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:497:1: ( ( ( rule__RuleType__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:498:1: ( ( rule__RuleType__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:498:1: ( ( rule__RuleType__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:499:1: ( rule__RuleType__Alternatives )
            {
             before(grammarAccess.getRuleTypeAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:500:1: ( rule__RuleType__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:500:2: rule__RuleType__Alternatives
            {
            pushFollow(FOLLOW_rule__RuleType__Alternatives_in_ruleRuleType985);
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


    // $ANTLR start "rule__Policy__RulesAlternatives_5_0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:511:1: rule__Policy__RulesAlternatives_5_0 : ( ( ruleRule ) | ( ruleRuleRef ) );
    public final void rule__Policy__RulesAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:515:1: ( ( ruleRule ) | ( ruleRuleRef ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            else if ( (LA1_0==28) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:516:1: ( ruleRule )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:516:1: ( ruleRule )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:517:1: ruleRule
                    {
                     before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__Policy__RulesAlternatives_5_01020);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:522:6: ( ruleRuleRef )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:522:6: ( ruleRuleRef )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:523:1: ruleRuleRef
                    {
                     before(grammarAccess.getPolicyAccess().getRulesRuleRefParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_ruleRuleRef_in_rule__Policy__RulesAlternatives_5_01037);
                    ruleRuleRef();

                    state._fsp--;

                     after(grammarAccess.getPolicyAccess().getRulesRuleRefParserRuleCall_5_0_1()); 

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
    // $ANTLR end "rule__Policy__RulesAlternatives_5_0"


    // $ANTLR start "rule__Role__Alternatives"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:533:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:537:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:538:1: ( ruleUser )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:538:1: ( ruleUser )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:539:1: ruleUser
                    {
                     before(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUser_in_rule__Role__Alternatives1069);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:544:6: ( ruleGroup )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:544:6: ( ruleGroup )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:545:1: ruleGroup
                    {
                     before(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGroup_in_rule__Role__Alternatives1086);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:555:1: rule__Bind__Alternatives : ( ( ruleObjectBind ) | ( ruleValueBind ) | ( ruleRoleBind ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:559:1: ( ( ruleObjectBind ) | ( ruleValueBind ) | ( ruleRoleBind ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case 39:
                {
                alt3=2;
                }
                break;
            case 38:
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
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:560:1: ( ruleObjectBind )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:560:1: ( ruleObjectBind )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:561:1: ruleObjectBind
                    {
                     before(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectBind_in_rule__Bind__Alternatives1118);
                    ruleObjectBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:566:6: ( ruleValueBind )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:566:6: ( ruleValueBind )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:567:1: ruleValueBind
                    {
                     before(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleValueBind_in_rule__Bind__Alternatives1135);
                    ruleValueBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:572:6: ( ruleRoleBind )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:572:6: ( ruleRoleBind )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:573:1: ruleRoleBind
                    {
                     before(grammarAccess.getBindAccess().getRoleBindParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRoleBind_in_rule__Bind__Alternatives1152);
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


    // $ANTLR start "rule__RuleConstraint__Alternatives"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:583:1: rule__RuleConstraint__Alternatives : ( ( ( rule__RuleConstraint__Group_0__0 ) ) | ( 'obfuscate' ) );
    public final void rule__RuleConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:587:1: ( ( ( rule__RuleConstraint__Group_0__0 ) ) | ( 'obfuscate' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=23 && LA4_0<=24)) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:588:1: ( ( rule__RuleConstraint__Group_0__0 ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:588:1: ( ( rule__RuleConstraint__Group_0__0 ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:589:1: ( rule__RuleConstraint__Group_0__0 )
                    {
                     before(grammarAccess.getRuleConstraintAccess().getGroup_0()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:590:1: ( rule__RuleConstraint__Group_0__0 )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:590:2: rule__RuleConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RuleConstraint__Group_0__0_in_rule__RuleConstraint__Alternatives1184);
                    rule__RuleConstraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:594:6: ( 'obfuscate' )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:594:6: ( 'obfuscate' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:595:1: 'obfuscate'
                    {
                     before(grammarAccess.getRuleConstraintAccess().getObfuscateKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__RuleConstraint__Alternatives1203); 
                     after(grammarAccess.getRuleConstraintAccess().getObfuscateKeyword_1()); 

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
    // $ANTLR end "rule__RuleConstraint__Alternatives"


    // $ANTLR start "rule__ConflictResolutionTypes__Alternatives"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:607:1: rule__ConflictResolutionTypes__Alternatives : ( ( ( 'deny-overrides' ) ) | ( ( 'permit-overrides' ) ) | ( ( 'first-applicable' ) ) | ( ( 'only-one-applicable-policy' ) ) | ( ( 'ordered-deny-overrides' ) ) | ( ( 'ordered-permit-overrides' ) ) | ( ( 'deny-unless-permit' ) ) | ( ( 'permit-unless-permit' ) ) );
    public final void rule__ConflictResolutionTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:611:1: ( ( ( 'deny-overrides' ) ) | ( ( 'permit-overrides' ) ) | ( ( 'first-applicable' ) ) | ( ( 'only-one-applicable-policy' ) ) | ( ( 'ordered-deny-overrides' ) ) | ( ( 'ordered-permit-overrides' ) ) | ( ( 'deny-unless-permit' ) ) | ( ( 'permit-unless-permit' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            case 18:
                {
                alt5=7;
                }
                break;
            case 19:
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
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:612:1: ( ( 'deny-overrides' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:612:1: ( ( 'deny-overrides' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:613:1: ( 'deny-overrides' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getDenyOverridesEnumLiteralDeclaration_0()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:614:1: ( 'deny-overrides' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:614:3: 'deny-overrides'
                    {
                    match(input,12,FOLLOW_12_in_rule__ConflictResolutionTypes__Alternatives1238); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getDenyOverridesEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:619:6: ( ( 'permit-overrides' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:619:6: ( ( 'permit-overrides' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:620:1: ( 'permit-overrides' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getPermitOverridesEnumLiteralDeclaration_1()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:621:1: ( 'permit-overrides' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:621:3: 'permit-overrides'
                    {
                    match(input,13,FOLLOW_13_in_rule__ConflictResolutionTypes__Alternatives1259); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getPermitOverridesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:626:6: ( ( 'first-applicable' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:626:6: ( ( 'first-applicable' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:627:1: ( 'first-applicable' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getFirstApplicableEnumLiteralDeclaration_2()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:628:1: ( 'first-applicable' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:628:3: 'first-applicable'
                    {
                    match(input,14,FOLLOW_14_in_rule__ConflictResolutionTypes__Alternatives1280); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getFirstApplicableEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:633:6: ( ( 'only-one-applicable-policy' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:633:6: ( ( 'only-one-applicable-policy' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:634:1: ( 'only-one-applicable-policy' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getOnlyOneApplicablePolicyEnumLiteralDeclaration_3()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:635:1: ( 'only-one-applicable-policy' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:635:3: 'only-one-applicable-policy'
                    {
                    match(input,15,FOLLOW_15_in_rule__ConflictResolutionTypes__Alternatives1301); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getOnlyOneApplicablePolicyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:640:6: ( ( 'ordered-deny-overrides' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:640:6: ( ( 'ordered-deny-overrides' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:641:1: ( 'ordered-deny-overrides' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getOrderedDenyOverridesEnumLiteralDeclaration_4()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:642:1: ( 'ordered-deny-overrides' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:642:3: 'ordered-deny-overrides'
                    {
                    match(input,16,FOLLOW_16_in_rule__ConflictResolutionTypes__Alternatives1322); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getOrderedDenyOverridesEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:647:6: ( ( 'ordered-permit-overrides' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:647:6: ( ( 'ordered-permit-overrides' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:648:1: ( 'ordered-permit-overrides' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getOrderedPermitOverridesEnumLiteralDeclaration_5()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:649:1: ( 'ordered-permit-overrides' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:649:3: 'ordered-permit-overrides'
                    {
                    match(input,17,FOLLOW_17_in_rule__ConflictResolutionTypes__Alternatives1343); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getOrderedPermitOverridesEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:654:6: ( ( 'deny-unless-permit' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:654:6: ( ( 'deny-unless-permit' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:655:1: ( 'deny-unless-permit' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getDenyUnlessPermitEnumLiteralDeclaration_6()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:656:1: ( 'deny-unless-permit' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:656:3: 'deny-unless-permit'
                    {
                    match(input,18,FOLLOW_18_in_rule__ConflictResolutionTypes__Alternatives1364); 

                    }

                     after(grammarAccess.getConflictResolutionTypesAccess().getDenyUnlessPermitEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:661:6: ( ( 'permit-unless-permit' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:661:6: ( ( 'permit-unless-permit' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:662:1: ( 'permit-unless-permit' )
                    {
                     before(grammarAccess.getConflictResolutionTypesAccess().getPermitUnlessDenyEnumLiteralDeclaration_7()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:663:1: ( 'permit-unless-permit' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:663:3: 'permit-unless-permit'
                    {
                    match(input,19,FOLLOW_19_in_rule__ConflictResolutionTypes__Alternatives1385); 

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


    // $ANTLR start "rule__RuleRights__Alternatives"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:673:1: rule__RuleRights__Alternatives : ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__RuleRights__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:677:1: ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:678:1: ( ( 'R' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:678:1: ( ( 'R' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:679:1: ( 'R' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getReadEnumLiteralDeclaration_0()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:680:1: ( 'R' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:680:3: 'R'
                    {
                    match(input,20,FOLLOW_20_in_rule__RuleRights__Alternatives1421); 

                    }

                     after(grammarAccess.getRuleRightsAccess().getReadEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:685:6: ( ( 'W' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:685:6: ( ( 'W' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:686:1: ( 'W' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getWriteEnumLiteralDeclaration_1()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:687:1: ( 'W' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:687:3: 'W'
                    {
                    match(input,21,FOLLOW_21_in_rule__RuleRights__Alternatives1442); 

                    }

                     after(grammarAccess.getRuleRightsAccess().getWriteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:692:6: ( ( 'RW' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:692:6: ( ( 'RW' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:693:1: ( 'RW' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getReadWriteEnumLiteralDeclaration_2()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:694:1: ( 'RW' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:694:3: 'RW'
                    {
                    match(input,22,FOLLOW_22_in_rule__RuleRights__Alternatives1463); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:704:1: rule__RuleType__Alternatives : ( ( ( 'deny' ) ) | ( ( 'permit' ) ) );
    public final void rule__RuleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:708:1: ( ( ( 'deny' ) ) | ( ( 'permit' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:709:1: ( ( 'deny' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:709:1: ( ( 'deny' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:710:1: ( 'deny' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getDenyEnumLiteralDeclaration_0()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:711:1: ( 'deny' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:711:3: 'deny'
                    {
                    match(input,23,FOLLOW_23_in_rule__RuleType__Alternatives1499); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getDenyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:716:6: ( ( 'permit' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:716:6: ( ( 'permit' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:717:1: ( 'permit' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getPermitEnumLiteralDeclaration_1()); 
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:718:1: ( 'permit' )
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:718:3: 'permit'
                    {
                    match(input,24,FOLLOW_24_in_rule__RuleType__Alternatives1520); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getPermitEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__AccessControlModel__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:730:1: rule__AccessControlModel__Group__0 : rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1 ;
    public final void rule__AccessControlModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:734:1: ( rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:735:2: rule__AccessControlModel__Group__0__Impl rule__AccessControlModel__Group__1
            {
            pushFollow(FOLLOW_rule__AccessControlModel__Group__0__Impl_in_rule__AccessControlModel__Group__01553);
            rule__AccessControlModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AccessControlModel__Group__1_in_rule__AccessControlModel__Group__01556);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:742:1: rule__AccessControlModel__Group__0__Impl : ( ( rule__AccessControlModel__RolesAssignment_0 )* ) ;
    public final void rule__AccessControlModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:746:1: ( ( ( rule__AccessControlModel__RolesAssignment_0 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:747:1: ( ( rule__AccessControlModel__RolesAssignment_0 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:747:1: ( ( rule__AccessControlModel__RolesAssignment_0 )* )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:748:1: ( rule__AccessControlModel__RolesAssignment_0 )*
            {
             before(grammarAccess.getAccessControlModelAccess().getRolesAssignment_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:749:1: ( rule__AccessControlModel__RolesAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=31 && LA8_0<=32)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:749:2: rule__AccessControlModel__RolesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AccessControlModel__RolesAssignment_0_in_rule__AccessControlModel__Group__0__Impl1583);
            	    rule__AccessControlModel__RolesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:759:1: rule__AccessControlModel__Group__1 : rule__AccessControlModel__Group__1__Impl ;
    public final void rule__AccessControlModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:763:1: ( rule__AccessControlModel__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:764:2: rule__AccessControlModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AccessControlModel__Group__1__Impl_in_rule__AccessControlModel__Group__11614);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:770:1: rule__AccessControlModel__Group__1__Impl : ( ( rule__AccessControlModel__PolicyAssignment_1 ) ) ;
    public final void rule__AccessControlModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:774:1: ( ( ( rule__AccessControlModel__PolicyAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:775:1: ( ( rule__AccessControlModel__PolicyAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:775:1: ( ( rule__AccessControlModel__PolicyAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:776:1: ( rule__AccessControlModel__PolicyAssignment_1 )
            {
             before(grammarAccess.getAccessControlModelAccess().getPolicyAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:777:1: ( rule__AccessControlModel__PolicyAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:777:2: rule__AccessControlModel__PolicyAssignment_1
            {
            pushFollow(FOLLOW_rule__AccessControlModel__PolicyAssignment_1_in_rule__AccessControlModel__Group__1__Impl1641);
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


    // $ANTLR start "rule__Policy__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:791:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:795:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:796:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__01675);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__01678);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:803:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:807:1: ( ( 'policy' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:808:1: ( 'policy' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:808:1: ( 'policy' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:809:1: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Policy__Group__0__Impl1706); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:822:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:826:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:827:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__11737);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__11740);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:834:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:838:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:839:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:839:1: ( ( rule__Policy__NameAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:840:1: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:841:1: ( rule__Policy__NameAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:841:2: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Policy__NameAssignment_1_in_rule__Policy__Group__1__Impl1767);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:851:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:855:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:856:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__21797);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__3_in_rule__Policy__Group__21800);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:863:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__TypeAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:867:1: ( ( ( rule__Policy__TypeAssignment_2 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:868:1: ( ( rule__Policy__TypeAssignment_2 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:868:1: ( ( rule__Policy__TypeAssignment_2 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:869:1: ( rule__Policy__TypeAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getTypeAssignment_2()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:870:1: ( rule__Policy__TypeAssignment_2 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:870:2: rule__Policy__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Policy__TypeAssignment_2_in_rule__Policy__Group__2__Impl1827);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:880:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:884:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:885:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_rule__Policy__Group__3__Impl_in_rule__Policy__Group__31857);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__4_in_rule__Policy__Group__31860);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:892:1: rule__Policy__Group__3__Impl : ( '{' ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:896:1: ( ( '{' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:897:1: ( '{' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:897:1: ( '{' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:898:1: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Policy__Group__3__Impl1888); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:911:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:915:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:916:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_rule__Policy__Group__4__Impl_in_rule__Policy__Group__41919);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__5_in_rule__Policy__Group__41922);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:923:1: rule__Policy__Group__4__Impl : ( ( rule__Policy__ImportsAssignment_4 )* ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:927:1: ( ( ( rule__Policy__ImportsAssignment_4 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:928:1: ( ( rule__Policy__ImportsAssignment_4 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:928:1: ( ( rule__Policy__ImportsAssignment_4 )* )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:929:1: ( rule__Policy__ImportsAssignment_4 )*
            {
             before(grammarAccess.getPolicyAccess().getImportsAssignment_4()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:930:1: ( rule__Policy__ImportsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:930:2: rule__Policy__ImportsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Policy__ImportsAssignment_4_in_rule__Policy__Group__4__Impl1949);
            	    rule__Policy__ImportsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getImportsAssignment_4()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:940:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:944:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:945:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_rule__Policy__Group__5__Impl_in_rule__Policy__Group__51980);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__6_in_rule__Policy__Group__51983);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:952:1: rule__Policy__Group__5__Impl : ( ( rule__Policy__RulesAssignment_5 )* ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:956:1: ( ( ( rule__Policy__RulesAssignment_5 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:957:1: ( ( rule__Policy__RulesAssignment_5 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:957:1: ( ( rule__Policy__RulesAssignment_5 )* )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:958:1: ( rule__Policy__RulesAssignment_5 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_5()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:959:1: ( rule__Policy__RulesAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:959:2: rule__Policy__RulesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Policy__RulesAssignment_5_in_rule__Policy__Group__5__Impl2010);
            	    rule__Policy__RulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_5()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:969:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:973:1: ( rule__Policy__Group__6__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:974:2: rule__Policy__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group__6__Impl_in_rule__Policy__Group__62041);
            rule__Policy__Group__6__Impl();

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:980:1: rule__Policy__Group__6__Impl : ( '}' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:984:1: ( ( '}' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:985:1: ( '}' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:985:1: ( '}' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:986:1: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__Policy__Group__6__Impl2069); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__RuleRef__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1013:1: rule__RuleRef__Group__0 : rule__RuleRef__Group__0__Impl rule__RuleRef__Group__1 ;
    public final void rule__RuleRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1017:1: ( rule__RuleRef__Group__0__Impl rule__RuleRef__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1018:2: rule__RuleRef__Group__0__Impl rule__RuleRef__Group__1
            {
            pushFollow(FOLLOW_rule__RuleRef__Group__0__Impl_in_rule__RuleRef__Group__02114);
            rule__RuleRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleRef__Group__1_in_rule__RuleRef__Group__02117);
            rule__RuleRef__Group__1();

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
    // $ANTLR end "rule__RuleRef__Group__0"


    // $ANTLR start "rule__RuleRef__Group__0__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1025:1: rule__RuleRef__Group__0__Impl : ( 'rule-reference' ) ;
    public final void rule__RuleRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1029:1: ( ( 'rule-reference' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1030:1: ( 'rule-reference' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1030:1: ( 'rule-reference' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1031:1: 'rule-reference'
            {
             before(grammarAccess.getRuleRefAccess().getRuleReferenceKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__RuleRef__Group__0__Impl2145); 
             after(grammarAccess.getRuleRefAccess().getRuleReferenceKeyword_0()); 

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
    // $ANTLR end "rule__RuleRef__Group__0__Impl"


    // $ANTLR start "rule__RuleRef__Group__1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1044:1: rule__RuleRef__Group__1 : rule__RuleRef__Group__1__Impl ;
    public final void rule__RuleRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1048:1: ( rule__RuleRef__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1049:2: rule__RuleRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleRef__Group__1__Impl_in_rule__RuleRef__Group__12176);
            rule__RuleRef__Group__1__Impl();

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
    // $ANTLR end "rule__RuleRef__Group__1"


    // $ANTLR start "rule__RuleRef__Group__1__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1055:1: rule__RuleRef__Group__1__Impl : ( ( rule__RuleRef__RuleAssignment_1 ) ) ;
    public final void rule__RuleRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1059:1: ( ( ( rule__RuleRef__RuleAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1060:1: ( ( rule__RuleRef__RuleAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1060:1: ( ( rule__RuleRef__RuleAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1061:1: ( rule__RuleRef__RuleAssignment_1 )
            {
             before(grammarAccess.getRuleRefAccess().getRuleAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1062:1: ( rule__RuleRef__RuleAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1062:2: rule__RuleRef__RuleAssignment_1
            {
            pushFollow(FOLLOW_rule__RuleRef__RuleAssignment_1_in_rule__RuleRef__Group__1__Impl2203);
            rule__RuleRef__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleRefAccess().getRuleAssignment_1()); 

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
    // $ANTLR end "rule__RuleRef__Group__1__Impl"


    // $ANTLR start "rule__ImportResource__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1076:1: rule__ImportResource__Group__0 : rule__ImportResource__Group__0__Impl rule__ImportResource__Group__1 ;
    public final void rule__ImportResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1080:1: ( rule__ImportResource__Group__0__Impl rule__ImportResource__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1081:2: rule__ImportResource__Group__0__Impl rule__ImportResource__Group__1
            {
            pushFollow(FOLLOW_rule__ImportResource__Group__0__Impl_in_rule__ImportResource__Group__02237);
            rule__ImportResource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportResource__Group__1_in_rule__ImportResource__Group__02240);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1088:1: rule__ImportResource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__ImportResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1092:1: ( ( 'resource' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1093:1: ( 'resource' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1093:1: ( 'resource' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1094:1: 'resource'
            {
             before(grammarAccess.getImportResourceAccess().getResourceKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ImportResource__Group__0__Impl2268); 
             after(grammarAccess.getImportResourceAccess().getResourceKeyword_0()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1107:1: rule__ImportResource__Group__1 : rule__ImportResource__Group__1__Impl rule__ImportResource__Group__2 ;
    public final void rule__ImportResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1111:1: ( rule__ImportResource__Group__1__Impl rule__ImportResource__Group__2 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1112:2: rule__ImportResource__Group__1__Impl rule__ImportResource__Group__2
            {
            pushFollow(FOLLOW_rule__ImportResource__Group__1__Impl_in_rule__ImportResource__Group__12299);
            rule__ImportResource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportResource__Group__2_in_rule__ImportResource__Group__12302);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1119:1: rule__ImportResource__Group__1__Impl : ( ( rule__ImportResource__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1123:1: ( ( ( rule__ImportResource__ImportURIAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1124:1: ( ( rule__ImportResource__ImportURIAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1124:1: ( ( rule__ImportResource__ImportURIAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1125:1: ( rule__ImportResource__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportResourceAccess().getImportURIAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1126:1: ( rule__ImportResource__ImportURIAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1126:2: rule__ImportResource__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportResource__ImportURIAssignment_1_in_rule__ImportResource__Group__1__Impl2329);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1136:1: rule__ImportResource__Group__2 : rule__ImportResource__Group__2__Impl ;
    public final void rule__ImportResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1140:1: ( rule__ImportResource__Group__2__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1141:2: rule__ImportResource__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportResource__Group__2__Impl_in_rule__ImportResource__Group__22359);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1147:1: rule__ImportResource__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ImportResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1151:1: ( ( ( ';' )? ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1152:1: ( ( ';' )? )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1152:1: ( ( ';' )? )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1153:1: ( ';' )?
            {
             before(grammarAccess.getImportResourceAccess().getSemicolonKeyword_2()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1154:1: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1155:2: ';'
                    {
                    match(input,30,FOLLOW_30_in_rule__ImportResource__Group__2__Impl2388); 

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


    // $ANTLR start "rule__User__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1173:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1177:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1178:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__02428);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__02431);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1185:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1189:1: ( ( 'user' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1190:1: ( 'user' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1190:1: ( 'user' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1191:1: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__User__Group__0__Impl2459); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1204:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1208:1: ( rule__User__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1209:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__12490);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1215:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1219:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1220:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1220:1: ( ( rule__User__NameAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1221:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1222:1: ( rule__User__NameAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1222:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl2517);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1236:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1240:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1241:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__02551);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__02554);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1248:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1252:1: ( ( 'group' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1253:1: ( 'group' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1253:1: ( 'group' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1254:1: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Group__Group__0__Impl2582); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1267:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1271:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1272:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__12613);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__12616);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1279:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1283:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1284:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1284:1: ( ( rule__Group__NameAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1285:1: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1286:1: ( rule__Group__NameAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1286:2: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl2643);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1296:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1300:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1301:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__22673);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__22676);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1308:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1312:1: ( ( '{' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1313:1: ( '{' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1313:1: ( '{' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1314:1: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Group__Group__2__Impl2704); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1327:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1331:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1332:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__32735);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__32738);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1339:1: rule__Group__Group__3__Impl : ( ( rule__Group__UsersAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1343:1: ( ( ( rule__Group__UsersAssignment_3 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1344:1: ( ( rule__Group__UsersAssignment_3 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1344:1: ( ( rule__Group__UsersAssignment_3 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1345:1: ( rule__Group__UsersAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_3()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1346:1: ( rule__Group__UsersAssignment_3 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1346:2: rule__Group__UsersAssignment_3
            {
            pushFollow(FOLLOW_rule__Group__UsersAssignment_3_in_rule__Group__Group__3__Impl2765);
            rule__Group__UsersAssignment_3();

            state._fsp--;


            }

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1356:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1360:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1361:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__42795);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__42798);
            rule__Group__Group__5();

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1368:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1372:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1373:1: ( ( rule__Group__Group_4__0 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1373:1: ( ( rule__Group__Group_4__0 )* )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1374:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1375:1: ( rule__Group__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1375:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl2825);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Group__Group__5"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1385:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1389:1: ( rule__Group__Group__5__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1390:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__52856);
            rule__Group__Group__5__Impl();

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
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1396:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1400:1: ( ( '}' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1401:1: ( '}' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1401:1: ( '}' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1402:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Group__Group__5__Impl2884); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group_4__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1427:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1431:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1432:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__02927);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__02930);
            rule__Group__Group_4__1();

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
    // $ANTLR end "rule__Group__Group_4__0"


    // $ANTLR start "rule__Group__Group_4__0__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1439:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1443:1: ( ( ',' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1444:1: ( ',' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1444:1: ( ',' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1445:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Group__Group_4__0__Impl2958); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Group__Group_4__0__Impl"


    // $ANTLR start "rule__Group__Group_4__1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1458:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1462:1: ( rule__Group__Group_4__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1463:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__12989);
            rule__Group__Group_4__1__Impl();

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
    // $ANTLR end "rule__Group__Group_4__1"


    // $ANTLR start "rule__Group__Group_4__1__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1469:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__UsersAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1473:1: ( ( ( rule__Group__UsersAssignment_4_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1474:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1474:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1475:1: ( rule__Group__UsersAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_4_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1476:1: ( rule__Group__UsersAssignment_4_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1476:2: rule__Group__UsersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Group__UsersAssignment_4_1_in_rule__Group__Group_4__1__Impl3016);
            rule__Group__UsersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getUsersAssignment_4_1()); 

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
    // $ANTLR end "rule__Group__Group_4__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1490:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1494:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1495:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03050);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03053);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1502:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1506:1: ( ( 'rule' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1507:1: ( 'rule' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1507:1: ( 'rule' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1508:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Rule__Group__0__Impl3081); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1521:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1525:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1526:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13112);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13115);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1533:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1537:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1538:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1538:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1539:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1540:1: ( rule__Rule__NameAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1540:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3142);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1550:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1554:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1555:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23172);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23175);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1562:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ContraintAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1566:1: ( ( ( rule__Rule__ContraintAssignment_2 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1567:1: ( ( rule__Rule__ContraintAssignment_2 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1567:1: ( ( rule__Rule__ContraintAssignment_2 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1568:1: ( rule__Rule__ContraintAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getContraintAssignment_2()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1569:1: ( rule__Rule__ContraintAssignment_2 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1569:2: rule__Rule__ContraintAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__ContraintAssignment_2_in_rule__Rule__Group__2__Impl3202);
            rule__Rule__ContraintAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getContraintAssignment_2()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1579:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1583:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1584:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33232);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33235);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1591:1: rule__Rule__Group__3__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1595:1: ( ( 'to' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1596:1: ( 'to' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1596:1: ( 'to' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1597:1: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__Rule__Group__3__Impl3263); 
             after(grammarAccess.getRuleAccess().getToKeyword_3()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1610:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1614:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1615:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43294);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43297);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1622:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__RolesAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1626:1: ( ( ( rule__Rule__RolesAssignment_4 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1627:1: ( ( rule__Rule__RolesAssignment_4 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1627:1: ( ( rule__Rule__RolesAssignment_4 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1628:1: ( rule__Rule__RolesAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_4()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1629:1: ( rule__Rule__RolesAssignment_4 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1629:2: rule__Rule__RolesAssignment_4
            {
            pushFollow(FOLLOW_rule__Rule__RolesAssignment_4_in_rule__Rule__Group__4__Impl3324);
            rule__Rule__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRolesAssignment_4()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1639:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1643:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1644:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53354);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__53357);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1651:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )* ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1655:1: ( ( ( rule__Rule__Group_5__0 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1656:1: ( ( rule__Rule__Group_5__0 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1656:1: ( ( rule__Rule__Group_5__0 )* )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1657:1: ( rule__Rule__Group_5__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1658:1: ( rule__Rule__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1658:2: rule__Rule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_5__0_in_rule__Rule__Group__5__Impl3384);
            	    rule__Rule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_5()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1668:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1672:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1673:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__63415);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__63418);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1680:1: rule__Rule__Group__6__Impl : ( '{' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1684:1: ( ( '{' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1685:1: ( '{' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1685:1: ( '{' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1686:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__Rule__Group__6__Impl3446); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_6()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1699:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1703:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1704:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__73477);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__73480);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1711:1: rule__Rule__Group__7__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1715:1: ( ( 'query' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1716:1: ( 'query' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1716:1: ( 'query' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1717:1: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__Rule__Group__7__Impl3508); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_7()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1730:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1734:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1735:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__83539);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__9_in_rule__Rule__Group__83542);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1742:1: rule__Rule__Group__8__Impl : ( ( rule__Rule__PatternAssignment_8 ) ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1746:1: ( ( ( rule__Rule__PatternAssignment_8 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1747:1: ( ( rule__Rule__PatternAssignment_8 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1747:1: ( ( rule__Rule__PatternAssignment_8 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1748:1: ( rule__Rule__PatternAssignment_8 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_8()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1749:1: ( rule__Rule__PatternAssignment_8 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1749:2: rule__Rule__PatternAssignment_8
            {
            pushFollow(FOLLOW_rule__Rule__PatternAssignment_8_in_rule__Rule__Group__8__Impl3569);
            rule__Rule__PatternAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPatternAssignment_8()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1759:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1763:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1764:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_rule__Rule__Group__9__Impl_in_rule__Rule__Group__93599);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__10_in_rule__Rule__Group__93602);
            rule__Rule__Group__10();

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1771:1: rule__Rule__Group__9__Impl : ( ( ';' )? ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1775:1: ( ( ( ';' )? ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1776:1: ( ( ';' )? )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1776:1: ( ( ';' )? )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1777:1: ( ';' )?
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_9()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1778:1: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1779:2: ';'
                    {
                    match(input,30,FOLLOW_30_in_rule__Rule__Group__9__Impl3631); 

                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getSemicolonKeyword_9()); 

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


    // $ANTLR start "rule__Rule__Group__10"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1790:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1794:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1795:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_rule__Rule__Group__10__Impl_in_rule__Rule__Group__103664);
            rule__Rule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__11_in_rule__Rule__Group__103667);
            rule__Rule__Group__11();

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
    // $ANTLR end "rule__Rule__Group__10"


    // $ANTLR start "rule__Rule__Group__10__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1802:1: rule__Rule__Group__10__Impl : ( ( rule__Rule__BindingsAssignment_10 )* ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1806:1: ( ( ( rule__Rule__BindingsAssignment_10 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1807:1: ( ( rule__Rule__BindingsAssignment_10 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1807:1: ( ( rule__Rule__BindingsAssignment_10 )* )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1808:1: ( rule__Rule__BindingsAssignment_10 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_10()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1809:1: ( rule__Rule__BindingsAssignment_10 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1809:2: rule__Rule__BindingsAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Rule__BindingsAssignment_10_in_rule__Rule__Group__10__Impl3694);
            	    rule__Rule__BindingsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBindingsAssignment_10()); 

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
    // $ANTLR end "rule__Rule__Group__10__Impl"


    // $ANTLR start "rule__Rule__Group__11"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1819:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1823:1: ( rule__Rule__Group__11__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1824:2: rule__Rule__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__11__Impl_in_rule__Rule__Group__113725);
            rule__Rule__Group__11__Impl();

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
    // $ANTLR end "rule__Rule__Group__11"


    // $ANTLR start "rule__Rule__Group__11__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1830:1: rule__Rule__Group__11__Impl : ( '}' ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1834:1: ( ( '}' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1835:1: ( '}' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1835:1: ( '}' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1836:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_11()); 
            match(input,27,FOLLOW_27_in_rule__Rule__Group__11__Impl3753); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Rule__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group_5__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1873:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1877:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1878:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__0__Impl_in_rule__Rule__Group_5__03808);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_5__1_in_rule__Rule__Group_5__03811);
            rule__Rule__Group_5__1();

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
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1885:1: rule__Rule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1889:1: ( ( ',' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1890:1: ( ',' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1890:1: ( ',' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1891:1: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__Rule__Group_5__0__Impl3839); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1904:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1908:1: ( rule__Rule__Group_5__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1909:2: rule__Rule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__1__Impl_in_rule__Rule__Group_5__13870);
            rule__Rule__Group_5__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1915:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__RolesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1919:1: ( ( ( rule__Rule__RolesAssignment_5_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1920:1: ( ( rule__Rule__RolesAssignment_5_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1920:1: ( ( rule__Rule__RolesAssignment_5_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1921:1: ( rule__Rule__RolesAssignment_5_1 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_5_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1922:1: ( rule__Rule__RolesAssignment_5_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1922:2: rule__Rule__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Rule__RolesAssignment_5_1_in_rule__Rule__Group_5__1__Impl3897);
            rule__Rule__RolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRolesAssignment_5_1()); 

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
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1936:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1940:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1941:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__03931);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__03934);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1948:1: rule__Binding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1952:1: ( ( 'bind' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1953:1: ( 'bind' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1953:1: ( 'bind' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1954:1: 'bind'
            {
             before(grammarAccess.getBindingAccess().getBindKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Binding__Group__0__Impl3962); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1967:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1971:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1972:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__13993);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__13996);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1979:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__ParamAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1983:1: ( ( ( rule__Binding__ParamAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1984:1: ( ( rule__Binding__ParamAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1984:1: ( ( rule__Binding__ParamAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1985:1: ( rule__Binding__ParamAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getParamAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1986:1: ( rule__Binding__ParamAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1986:2: rule__Binding__ParamAssignment_1
            {
            pushFollow(FOLLOW_rule__Binding__ParamAssignment_1_in_rule__Binding__Group__1__Impl4023);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:1996:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2000:1: ( rule__Binding__Group__2__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2001:2: rule__Binding__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__24053);
            rule__Binding__Group__2__Impl();

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2007:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ValueAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2011:1: ( ( ( rule__Binding__ValueAssignment_2 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2012:1: ( ( rule__Binding__ValueAssignment_2 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2012:1: ( ( rule__Binding__ValueAssignment_2 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2013:1: ( rule__Binding__ValueAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getValueAssignment_2()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2014:1: ( rule__Binding__ValueAssignment_2 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2014:2: rule__Binding__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Binding__ValueAssignment_2_in_rule__Binding__Group__2__Impl4080);
            rule__Binding__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getValueAssignment_2()); 

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


    // $ANTLR start "rule__RoleBind__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2030:1: rule__RoleBind__Group__0 : rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1 ;
    public final void rule__RoleBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2034:1: ( rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2035:2: rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__0__Impl_in_rule__RoleBind__Group__04116);
            rule__RoleBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RoleBind__Group__1_in_rule__RoleBind__Group__04119);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2042:1: rule__RoleBind__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2046:1: ( ( 'role' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2047:1: ( 'role' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2047:1: ( 'role' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2048:1: 'role'
            {
             before(grammarAccess.getRoleBindAccess().getRoleKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__RoleBind__Group__0__Impl4147); 
             after(grammarAccess.getRoleBindAccess().getRoleKeyword_0()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2061:1: rule__RoleBind__Group__1 : rule__RoleBind__Group__1__Impl ;
    public final void rule__RoleBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2065:1: ( rule__RoleBind__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2066:2: rule__RoleBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__1__Impl_in_rule__RoleBind__Group__14178);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2072:1: rule__RoleBind__Group__1__Impl : ( ( rule__RoleBind__RoleAssignment_1 ) ) ;
    public final void rule__RoleBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2076:1: ( ( ( rule__RoleBind__RoleAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2077:1: ( ( rule__RoleBind__RoleAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2077:1: ( ( rule__RoleBind__RoleAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2078:1: ( rule__RoleBind__RoleAssignment_1 )
            {
             before(grammarAccess.getRoleBindAccess().getRoleAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2079:1: ( rule__RoleBind__RoleAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2079:2: rule__RoleBind__RoleAssignment_1
            {
            pushFollow(FOLLOW_rule__RoleBind__RoleAssignment_1_in_rule__RoleBind__Group__1__Impl4205);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2093:1: rule__ValueBind__Group__0 : rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1 ;
    public final void rule__ValueBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2097:1: ( rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2098:2: rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__0__Impl_in_rule__ValueBind__Group__04239);
            rule__ValueBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueBind__Group__1_in_rule__ValueBind__Group__04242);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2105:1: rule__ValueBind__Group__0__Impl : ( 'value' ) ;
    public final void rule__ValueBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2109:1: ( ( 'value' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2110:1: ( 'value' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2110:1: ( 'value' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2111:1: 'value'
            {
             before(grammarAccess.getValueBindAccess().getValueKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ValueBind__Group__0__Impl4270); 
             after(grammarAccess.getValueBindAccess().getValueKeyword_0()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2124:1: rule__ValueBind__Group__1 : rule__ValueBind__Group__1__Impl ;
    public final void rule__ValueBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2128:1: ( rule__ValueBind__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2129:2: rule__ValueBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__1__Impl_in_rule__ValueBind__Group__14301);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2135:1: rule__ValueBind__Group__1__Impl : ( ( rule__ValueBind__ValueAssignment_1 ) ) ;
    public final void rule__ValueBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2139:1: ( ( ( rule__ValueBind__ValueAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2140:1: ( ( rule__ValueBind__ValueAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2140:1: ( ( rule__ValueBind__ValueAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2141:1: ( rule__ValueBind__ValueAssignment_1 )
            {
             before(grammarAccess.getValueBindAccess().getValueAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2142:1: ( rule__ValueBind__ValueAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2142:2: rule__ValueBind__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ValueBind__ValueAssignment_1_in_rule__ValueBind__Group__1__Impl4328);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2156:1: rule__ObjectBind__Group__0 : rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1 ;
    public final void rule__ObjectBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2160:1: ( rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2161:2: rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__0__Impl_in_rule__ObjectBind__Group__04362);
            rule__ObjectBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectBind__Group__1_in_rule__ObjectBind__Group__04365);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2168:1: rule__ObjectBind__Group__0__Impl : ( 'object' ) ;
    public final void rule__ObjectBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2172:1: ( ( 'object' ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2173:1: ( 'object' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2173:1: ( 'object' )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2174:1: 'object'
            {
             before(grammarAccess.getObjectBindAccess().getObjectKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ObjectBind__Group__0__Impl4393); 
             after(grammarAccess.getObjectBindAccess().getObjectKeyword_0()); 

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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2187:1: rule__ObjectBind__Group__1 : rule__ObjectBind__Group__1__Impl ;
    public final void rule__ObjectBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2191:1: ( rule__ObjectBind__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2192:2: rule__ObjectBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__1__Impl_in_rule__ObjectBind__Group__14424);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2198:1: rule__ObjectBind__Group__1__Impl : ( ( rule__ObjectBind__ObjectAssignment_1 ) ) ;
    public final void rule__ObjectBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2202:1: ( ( ( rule__ObjectBind__ObjectAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2203:1: ( ( rule__ObjectBind__ObjectAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2203:1: ( ( rule__ObjectBind__ObjectAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2204:1: ( rule__ObjectBind__ObjectAssignment_1 )
            {
             before(grammarAccess.getObjectBindAccess().getObjectAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2205:1: ( rule__ObjectBind__ObjectAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2205:2: rule__ObjectBind__ObjectAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectBind__ObjectAssignment_1_in_rule__ObjectBind__Group__1__Impl4451);
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


    // $ANTLR start "rule__RuleConstraint__Group_0__0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2219:1: rule__RuleConstraint__Group_0__0 : rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1 ;
    public final void rule__RuleConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2223:1: ( rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2224:2: rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1
            {
            pushFollow(FOLLOW_rule__RuleConstraint__Group_0__0__Impl_in_rule__RuleConstraint__Group_0__04485);
            rule__RuleConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleConstraint__Group_0__1_in_rule__RuleConstraint__Group_0__04488);
            rule__RuleConstraint__Group_0__1();

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
    // $ANTLR end "rule__RuleConstraint__Group_0__0"


    // $ANTLR start "rule__RuleConstraint__Group_0__0__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2231:1: rule__RuleConstraint__Group_0__0__Impl : ( ( rule__RuleConstraint__TypeAssignment_0_0 ) ) ;
    public final void rule__RuleConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2235:1: ( ( ( rule__RuleConstraint__TypeAssignment_0_0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2236:1: ( ( rule__RuleConstraint__TypeAssignment_0_0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2236:1: ( ( rule__RuleConstraint__TypeAssignment_0_0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2237:1: ( rule__RuleConstraint__TypeAssignment_0_0 )
            {
             before(grammarAccess.getRuleConstraintAccess().getTypeAssignment_0_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2238:1: ( rule__RuleConstraint__TypeAssignment_0_0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2238:2: rule__RuleConstraint__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__RuleConstraint__TypeAssignment_0_0_in_rule__RuleConstraint__Group_0__0__Impl4515);
            rule__RuleConstraint__TypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleConstraintAccess().getTypeAssignment_0_0()); 

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
    // $ANTLR end "rule__RuleConstraint__Group_0__0__Impl"


    // $ANTLR start "rule__RuleConstraint__Group_0__1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2248:1: rule__RuleConstraint__Group_0__1 : rule__RuleConstraint__Group_0__1__Impl ;
    public final void rule__RuleConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2252:1: ( rule__RuleConstraint__Group_0__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2253:2: rule__RuleConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleConstraint__Group_0__1__Impl_in_rule__RuleConstraint__Group_0__14545);
            rule__RuleConstraint__Group_0__1__Impl();

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
    // $ANTLR end "rule__RuleConstraint__Group_0__1"


    // $ANTLR start "rule__RuleConstraint__Group_0__1__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2259:1: rule__RuleConstraint__Group_0__1__Impl : ( ( rule__RuleConstraint__RightsAssignment_0_1 ) ) ;
    public final void rule__RuleConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2263:1: ( ( ( rule__RuleConstraint__RightsAssignment_0_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2264:1: ( ( rule__RuleConstraint__RightsAssignment_0_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2264:1: ( ( rule__RuleConstraint__RightsAssignment_0_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2265:1: ( rule__RuleConstraint__RightsAssignment_0_1 )
            {
             before(grammarAccess.getRuleConstraintAccess().getRightsAssignment_0_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2266:1: ( rule__RuleConstraint__RightsAssignment_0_1 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2266:2: rule__RuleConstraint__RightsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__RuleConstraint__RightsAssignment_0_1_in_rule__RuleConstraint__Group_0__1__Impl4572);
            rule__RuleConstraint__RightsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleConstraintAccess().getRightsAssignment_0_1()); 

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
    // $ANTLR end "rule__RuleConstraint__Group_0__1__Impl"


    // $ANTLR start "rule__AccessControlModel__RolesAssignment_0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2281:1: rule__AccessControlModel__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__AccessControlModel__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2285:1: ( ( ruleRole ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2286:1: ( ruleRole )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2286:1: ( ruleRole )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2287:1: ruleRole
            {
             before(grammarAccess.getAccessControlModelAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__AccessControlModel__RolesAssignment_04611);
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2296:1: rule__AccessControlModel__PolicyAssignment_1 : ( rulePolicy ) ;
    public final void rule__AccessControlModel__PolicyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2300:1: ( ( rulePolicy ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2301:1: ( rulePolicy )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2301:1: ( rulePolicy )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2302:1: rulePolicy
            {
             before(grammarAccess.getAccessControlModelAccess().getPolicyPolicyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePolicy_in_rule__AccessControlModel__PolicyAssignment_14642);
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


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2311:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2315:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2316:1: ( RULE_ID )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2316:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2317:1: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Policy__NameAssignment_14673); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2326:1: rule__Policy__TypeAssignment_2 : ( ruleConflictResolutionTypes ) ;
    public final void rule__Policy__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2330:1: ( ( ruleConflictResolutionTypes ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2331:1: ( ruleConflictResolutionTypes )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2331:1: ( ruleConflictResolutionTypes )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2332:1: ruleConflictResolutionTypes
            {
             before(grammarAccess.getPolicyAccess().getTypeConflictResolutionTypesEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConflictResolutionTypes_in_rule__Policy__TypeAssignment_24704);
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


    // $ANTLR start "rule__Policy__ImportsAssignment_4"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2341:1: rule__Policy__ImportsAssignment_4 : ( ruleImportResource ) ;
    public final void rule__Policy__ImportsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2345:1: ( ( ruleImportResource ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2346:1: ( ruleImportResource )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2346:1: ( ruleImportResource )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2347:1: ruleImportResource
            {
             before(grammarAccess.getPolicyAccess().getImportsImportResourceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleImportResource_in_rule__Policy__ImportsAssignment_44735);
            ruleImportResource();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getImportsImportResourceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Policy__ImportsAssignment_4"


    // $ANTLR start "rule__Policy__RulesAssignment_5"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2356:1: rule__Policy__RulesAssignment_5 : ( ( rule__Policy__RulesAlternatives_5_0 ) ) ;
    public final void rule__Policy__RulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2360:1: ( ( ( rule__Policy__RulesAlternatives_5_0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2361:1: ( ( rule__Policy__RulesAlternatives_5_0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2361:1: ( ( rule__Policy__RulesAlternatives_5_0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2362:1: ( rule__Policy__RulesAlternatives_5_0 )
            {
             before(grammarAccess.getPolicyAccess().getRulesAlternatives_5_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2363:1: ( rule__Policy__RulesAlternatives_5_0 )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2363:2: rule__Policy__RulesAlternatives_5_0
            {
            pushFollow(FOLLOW_rule__Policy__RulesAlternatives_5_0_in_rule__Policy__RulesAssignment_54766);
            rule__Policy__RulesAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getRulesAlternatives_5_0()); 

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
    // $ANTLR end "rule__Policy__RulesAssignment_5"


    // $ANTLR start "rule__RuleRef__RuleAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2372:1: rule__RuleRef__RuleAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__RuleRef__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2376:1: ( ( ( RULE_STRING ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2377:1: ( ( RULE_STRING ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2377:1: ( ( RULE_STRING ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2378:1: ( RULE_STRING )
            {
             before(grammarAccess.getRuleRefAccess().getRuleRuleCrossReference_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2379:1: ( RULE_STRING )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2380:1: RULE_STRING
            {
             before(grammarAccess.getRuleRefAccess().getRuleRuleSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RuleRef__RuleAssignment_14803); 
             after(grammarAccess.getRuleRefAccess().getRuleRuleSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRuleRefAccess().getRuleRuleCrossReference_1_0()); 

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
    // $ANTLR end "rule__RuleRef__RuleAssignment_1"


    // $ANTLR start "rule__ImportResource__ImportURIAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2391:1: rule__ImportResource__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportResource__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2395:1: ( ( RULE_STRING ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2396:1: ( RULE_STRING )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2396:1: ( RULE_STRING )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2397:1: RULE_STRING
            {
             before(grammarAccess.getImportResourceAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportResource__ImportURIAssignment_14838); 
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


    // $ANTLR start "rule__User__NameAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2408:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2412:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2413:1: ( RULE_ID )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2413:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2414:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_14871); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2423:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2427:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2428:1: ( RULE_ID )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2428:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2429:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__NameAssignment_14902); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2438:1: rule__Group__UsersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2442:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2443:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2443:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2444:1: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2445:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2446:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_34937); 
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


    // $ANTLR start "rule__Group__UsersAssignment_4_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2457:1: rule__Group__UsersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2461:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2462:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2462:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2463:1: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2464:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2465:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_4_14976); 
             after(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Group__UsersAssignment_4_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2476:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2480:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2481:1: ( RULE_ID )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2481:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2482:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_15011); 
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


    // $ANTLR start "rule__Rule__ContraintAssignment_2"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2491:1: rule__Rule__ContraintAssignment_2 : ( ruleRuleConstraint ) ;
    public final void rule__Rule__ContraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2495:1: ( ( ruleRuleConstraint ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2496:1: ( ruleRuleConstraint )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2496:1: ( ruleRuleConstraint )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2497:1: ruleRuleConstraint
            {
             before(grammarAccess.getRuleAccess().getContraintRuleConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRuleConstraint_in_rule__Rule__ContraintAssignment_25042);
            ruleRuleConstraint();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getContraintRuleConstraintParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rule__ContraintAssignment_2"


    // $ANTLR start "rule__Rule__RolesAssignment_4"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2506:1: rule__Rule__RolesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2510:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2511:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2511:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2512:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_4_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2513:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2514:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__RolesAssignment_45077); 
             after(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRolesRoleCrossReference_4_0()); 

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
    // $ANTLR end "rule__Rule__RolesAssignment_4"


    // $ANTLR start "rule__Rule__RolesAssignment_5_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2525:1: rule__Rule__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2529:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2530:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2530:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2531:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2532:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2533:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__RolesAssignment_5_15116); 
             after(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Rule__RolesAssignment_5_1"


    // $ANTLR start "rule__Rule__PatternAssignment_8"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2544:1: rule__Rule__PatternAssignment_8 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2548:1: ( ( ( RULE_STRING ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2549:1: ( ( RULE_STRING ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2549:1: ( ( RULE_STRING ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2550:1: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_8_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2551:1: ( RULE_STRING )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2552:1: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_8_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rule__PatternAssignment_85155); 
             after(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPatternPatternCrossReference_8_0()); 

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
    // $ANTLR end "rule__Rule__PatternAssignment_8"


    // $ANTLR start "rule__Rule__BindingsAssignment_10"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2563:1: rule__Rule__BindingsAssignment_10 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2567:1: ( ( ruleBinding ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2568:1: ( ruleBinding )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2568:1: ( ruleBinding )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2569:1: ruleBinding
            {
             before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleBinding_in_rule__Rule__BindingsAssignment_105190);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Rule__BindingsAssignment_10"


    // $ANTLR start "rule__Binding__ParamAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2578:1: rule__Binding__ParamAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2582:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2583:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2583:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2584:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getParamVariableCrossReference_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2585:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2586:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getParamVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__ParamAssignment_15225); 
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


    // $ANTLR start "rule__Binding__ValueAssignment_2"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2597:1: rule__Binding__ValueAssignment_2 : ( ruleBind ) ;
    public final void rule__Binding__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2601:1: ( ( ruleBind ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2602:1: ( ruleBind )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2602:1: ( ruleBind )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2603:1: ruleBind
            {
             before(grammarAccess.getBindingAccess().getValueBindParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBind_in_rule__Binding__ValueAssignment_25260);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getValueBindParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binding__ValueAssignment_2"


    // $ANTLR start "rule__RoleBind__RoleAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2612:1: rule__RoleBind__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoleBind__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2616:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2617:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2617:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2618:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleBindAccess().getRoleRoleCrossReference_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2619:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2620:1: RULE_ID
            {
             before(grammarAccess.getRoleBindAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RoleBind__RoleAssignment_15295); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2631:1: rule__ValueBind__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ValueBind__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2635:1: ( ( RULE_STRING ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2636:1: ( RULE_STRING )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2636:1: ( RULE_STRING )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2637:1: RULE_STRING
            {
             before(grammarAccess.getValueBindAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ValueBind__ValueAssignment_15330); 
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
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2646:1: rule__ObjectBind__ObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectBind__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2650:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2651:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2651:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2652:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2653:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2654:1: RULE_ID
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectBind__ObjectAssignment_15365); 
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


    // $ANTLR start "rule__RuleConstraint__TypeAssignment_0_0"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2665:1: rule__RuleConstraint__TypeAssignment_0_0 : ( ruleRuleType ) ;
    public final void rule__RuleConstraint__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2669:1: ( ( ruleRuleType ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2670:1: ( ruleRuleType )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2670:1: ( ruleRuleType )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2671:1: ruleRuleType
            {
             before(grammarAccess.getRuleConstraintAccess().getTypeRuleTypeEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleRuleType_in_rule__RuleConstraint__TypeAssignment_0_05400);
            ruleRuleType();

            state._fsp--;

             after(grammarAccess.getRuleConstraintAccess().getTypeRuleTypeEnumRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__RuleConstraint__TypeAssignment_0_0"


    // $ANTLR start "rule__RuleConstraint__RightsAssignment_0_1"
    // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2680:1: rule__RuleConstraint__RightsAssignment_0_1 : ( ruleRuleRights ) ;
    public final void rule__RuleConstraint__RightsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2684:1: ( ( ruleRuleRights ) )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2685:1: ( ruleRuleRights )
            {
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2685:1: ( ruleRuleRights )
            // ../org.mondo.collaboration.security.macl.xtext.ui/src-gen/org/mondo/collaboration/security/macl/xtext/ui/contentassist/antlr/internal/InternalAccessControlLanguage.g:2686:1: ruleRuleRights
            {
             before(grammarAccess.getRuleConstraintAccess().getRightsRuleRightsEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleRuleRights_in_rule__RuleConstraint__RightsAssignment_0_15431);
            ruleRuleRights();

            state._fsp--;

             after(grammarAccess.getRuleConstraintAccess().getRightsRuleRightsEnumRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__RuleConstraint__RightsAssignment_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAccessControlModel_in_entryRuleAccessControlModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessControlModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__Group__0_in_ruleAccessControlModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0_in_rulePolicy154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleRef_in_entryRuleRuleRef181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleRef188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleRef__Group__0_in_ruleRuleRef214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportResource_in_entryRuleImportResource241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportResource248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__0_in_ruleImportResource274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Alternatives_in_ruleRole336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0_in_ruleBinding576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_entryRuleBind603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBind610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bind__Alternatives_in_ruleBind636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBind_in_entryRuleRoleBind663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleBind670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__0_in_ruleRoleBind696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueBind_in_entryRuleValueBind723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueBind730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__0_in_ruleValueBind756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectBind_in_entryRuleObjectBind783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectBind790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__0_in_ruleObjectBind816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleConstraint_in_entryRuleRuleConstraint843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleConstraint850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Alternatives_in_ruleRuleConstraint876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConflictResolutionTypes__Alternatives_in_ruleConflictResolutionTypes913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleRights__Alternatives_in_ruleRuleRights949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleType__Alternatives_in_ruleRuleType985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Policy__RulesAlternatives_5_01020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleRef_in_rule__Policy__RulesAlternatives_5_01037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__Role__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Role__Alternatives1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectBind_in_rule__Bind__Alternatives1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueBind_in_rule__Bind__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBind_in_rule__Bind__Alternatives1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Group_0__0_in_rule__RuleConstraint__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RuleConstraint__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ConflictResolutionTypes__Alternatives1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ConflictResolutionTypes__Alternatives1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConflictResolutionTypes__Alternatives1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ConflictResolutionTypes__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ConflictResolutionTypes__Alternatives1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ConflictResolutionTypes__Alternatives1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConflictResolutionTypes__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConflictResolutionTypes__Alternatives1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RuleRights__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RuleRights__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RuleRights__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RuleType__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RuleType__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__Group__0__Impl_in_rule__AccessControlModel__Group__01553 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__AccessControlModel__Group__1_in_rule__AccessControlModel__Group__01556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__RolesAssignment_0_in_rule__AccessControlModel__Group__0__Impl1583 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__Group__1__Impl_in_rule__AccessControlModel__Group__11614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessControlModel__PolicyAssignment_1_in_rule__AccessControlModel__Group__1__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__01675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__01678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Policy__Group__0__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__11737 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__11740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__NameAssignment_1_in_rule__Policy__Group__1__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__21797 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Policy__Group__3_in_rule__Policy__Group__21800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__TypeAssignment_2_in_rule__Policy__Group__2__Impl1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__3__Impl_in_rule__Policy__Group__31857 = new BitSet(new long[]{0x0000000438000000L});
    public static final BitSet FOLLOW_rule__Policy__Group__4_in_rule__Policy__Group__31860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Policy__Group__3__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__4__Impl_in_rule__Policy__Group__41919 = new BitSet(new long[]{0x0000000438000000L});
    public static final BitSet FOLLOW_rule__Policy__Group__5_in_rule__Policy__Group__41922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__ImportsAssignment_4_in_rule__Policy__Group__4__Impl1949 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__5__Impl_in_rule__Policy__Group__51980 = new BitSet(new long[]{0x0000000438000000L});
    public static final BitSet FOLLOW_rule__Policy__Group__6_in_rule__Policy__Group__51983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__RulesAssignment_5_in_rule__Policy__Group__5__Impl2010 = new BitSet(new long[]{0x0000000410000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__6__Impl_in_rule__Policy__Group__62041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Policy__Group__6__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleRef__Group__0__Impl_in_rule__RuleRef__Group__02114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RuleRef__Group__1_in_rule__RuleRef__Group__02117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RuleRef__Group__0__Impl2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleRef__Group__1__Impl_in_rule__RuleRef__Group__12176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleRef__RuleAssignment_1_in_rule__RuleRef__Group__1__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__0__Impl_in_rule__ImportResource__Group__02237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__1_in_rule__ImportResource__Group__02240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ImportResource__Group__0__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__1__Impl_in_rule__ImportResource__Group__12299 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__2_in_rule__ImportResource__Group__12302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__ImportURIAssignment_1_in_rule__ImportResource__Group__1__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportResource__Group__2__Impl_in_rule__ImportResource__Group__22359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ImportResource__Group__2__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__02428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__02431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__User__Group__0__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__02551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__02554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Group__Group__0__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__12613 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__22673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__22676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Group__Group__2__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__32735 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__32738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__UsersAssignment_3_in_rule__Group__Group__3__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__42795 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__42798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl2825 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__52856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Group__Group__5__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__02927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__02930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Group__Group_4__0__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__12989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__UsersAssignment_4_1_in_rule__Group__Group_4__1__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Rule__Group__0__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13112 = new BitSet(new long[]{0x0000000001800800L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23172 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ContraintAssignment_2_in_rule__Rule__Group__2__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Rule__Group__3__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43294 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__RolesAssignment_4_in_rule__Rule__Group__4__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53354 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__53357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__0_in_rule__Rule__Group__5__Impl3384 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__63415 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__63418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Rule__Group__6__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__73477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__73480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Rule__Group__7__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__83539 = new BitSet(new long[]{0x0000002048000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__9_in_rule__Rule__Group__83542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__PatternAssignment_8_in_rule__Rule__Group__8__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__9__Impl_in_rule__Rule__Group__93599 = new BitSet(new long[]{0x0000002048000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__10_in_rule__Rule__Group__93602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Rule__Group__9__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__10__Impl_in_rule__Rule__Group__103664 = new BitSet(new long[]{0x0000002048000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__11_in_rule__Rule__Group__103667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__BindingsAssignment_10_in_rule__Rule__Group__10__Impl3694 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__11__Impl_in_rule__Rule__Group__113725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rule__Group__11__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__0__Impl_in_rule__Rule__Group_5__03808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__1_in_rule__Rule__Group_5__03811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Rule__Group_5__0__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__1__Impl_in_rule__Rule__Group_5__13870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__RolesAssignment_5_1_in_rule__Rule__Group_5__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__03931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__03934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Binding__Group__0__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__13993 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__ParamAssignment_1_in_rule__Binding__Group__1__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__24053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__ValueAssignment_2_in_rule__Binding__Group__2__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__0__Impl_in_rule__RoleBind__Group__04116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__1_in_rule__RoleBind__Group__04119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RoleBind__Group__0__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__1__Impl_in_rule__RoleBind__Group__14178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__RoleAssignment_1_in_rule__RoleBind__Group__1__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__0__Impl_in_rule__ValueBind__Group__04239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__1_in_rule__ValueBind__Group__04242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ValueBind__Group__0__Impl4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__1__Impl_in_rule__ValueBind__Group__14301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__ValueAssignment_1_in_rule__ValueBind__Group__1__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__0__Impl_in_rule__ObjectBind__Group__04362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__1_in_rule__ObjectBind__Group__04365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ObjectBind__Group__0__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__1__Impl_in_rule__ObjectBind__Group__14424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__ObjectAssignment_1_in_rule__ObjectBind__Group__1__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Group_0__0__Impl_in_rule__RuleConstraint__Group_0__04485 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Group_0__1_in_rule__RuleConstraint__Group_0__04488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__TypeAssignment_0_0_in_rule__RuleConstraint__Group_0__0__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Group_0__1__Impl_in_rule__RuleConstraint__Group_0__14545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__RightsAssignment_0_1_in_rule__RuleConstraint__Group_0__1__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__AccessControlModel__RolesAssignment_04611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_rule__AccessControlModel__PolicyAssignment_14642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Policy__NameAssignment_14673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictResolutionTypes_in_rule__Policy__TypeAssignment_24704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportResource_in_rule__Policy__ImportsAssignment_44735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__RulesAlternatives_5_0_in_rule__Policy__RulesAssignment_54766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RuleRef__RuleAssignment_14803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportResource__ImportURIAssignment_14838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_14871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__NameAssignment_14902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_34937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_4_14976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_15011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleConstraint_in_rule__Rule__ContraintAssignment_25042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__RolesAssignment_45077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__RolesAssignment_5_15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rule__PatternAssignment_85155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_rule__Rule__BindingsAssignment_105190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__ParamAssignment_15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_rule__Binding__ValueAssignment_25260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RoleBind__RoleAssignment_15295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ValueBind__ValueAssignment_15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectBind__ObjectAssignment_15365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleType_in_rule__RuleConstraint__TypeAssignment_0_05400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleRights_in_rule__RuleConstraint__RightsAssignment_0_15431 = new BitSet(new long[]{0x0000000000000002L});

}