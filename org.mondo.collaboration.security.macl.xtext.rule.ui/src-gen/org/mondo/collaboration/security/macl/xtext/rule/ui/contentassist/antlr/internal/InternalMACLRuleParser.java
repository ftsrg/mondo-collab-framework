package org.mondo.collaboration.security.macl.xtext.rule.ui.contentassist.antlr.internal; 

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
import org.mondo.collaboration.security.macl.xtext.rule.services.MACLRuleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMACLRuleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'obfuscate'", "'R'", "'W'", "'RW'", "'deny'", "'permit'", "'user'", "'group'", "'{'", "'}'", "','", "'rule'", "'to'", "'query'", "';'", "'bind'", "'role'", "'value'", "'object'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMACLRuleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMACLRuleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMACLRuleParser.tokenNames; }
    public String getGrammarFileName() { return "../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g"; }


     
     	private MACLRuleGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MACLRuleGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleRuleModel"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:60:1: entryRuleRuleModel : ruleRuleModel EOF ;
    public final void entryRuleRuleModel() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:61:1: ( ruleRuleModel EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:62:1: ruleRuleModel EOF
            {
             before(grammarAccess.getRuleModelRule()); 
            pushFollow(FOLLOW_ruleRuleModel_in_entryRuleRuleModel61);
            ruleRuleModel();

            state._fsp--;

             after(grammarAccess.getRuleModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleModel68); 

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
    // $ANTLR end "entryRuleRuleModel"


    // $ANTLR start "ruleRuleModel"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:69:1: ruleRuleModel : ( ( rule__RuleModel__Group__0 ) ) ;
    public final void ruleRuleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:73:2: ( ( ( rule__RuleModel__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:74:1: ( ( rule__RuleModel__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:74:1: ( ( rule__RuleModel__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:75:1: ( rule__RuleModel__Group__0 )
            {
             before(grammarAccess.getRuleModelAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:76:1: ( rule__RuleModel__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:76:2: rule__RuleModel__Group__0
            {
            pushFollow(FOLLOW_rule__RuleModel__Group__0_in_ruleRuleModel94);
            rule__RuleModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleModelAccess().getGroup()); 

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
    // $ANTLR end "ruleRuleModel"


    // $ANTLR start "entryRuleRole"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:88:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:89:1: ( ruleRole EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:90:1: ruleRole EOF
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:97:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:101:2: ( ( ( rule__Role__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:102:1: ( ( rule__Role__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:102:1: ( ( rule__Role__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:103:1: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:104:1: ( rule__Role__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:104:2: rule__Role__Alternatives
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:116:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:117:1: ( ruleUser EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:118:1: ruleUser EOF
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:125:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:129:2: ( ( ( rule__User__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:130:1: ( ( rule__User__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:130:1: ( ( rule__User__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:131:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:132:1: ( rule__User__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:132:2: rule__User__Group__0
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:144:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:145:1: ( ruleGroup EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:146:1: ruleGroup EOF
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:153:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:157:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:158:1: ( ( rule__Group__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:158:1: ( ( rule__Group__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:159:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:160:1: ( rule__Group__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:160:2: rule__Group__Group__0
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


    // $ANTLR start "entryRuleRule"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:172:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:173:1: ( ruleRule EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:174:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule301);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule308); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:181:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:185:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:186:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:186:1: ( ( rule__Rule__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:187:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:188:1: ( rule__Rule__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:188:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule334);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:200:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:201:1: ( ruleBinding EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:202:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding361);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding368); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:209:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:213:2: ( ( ( rule__Binding__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:214:1: ( ( rule__Binding__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:214:1: ( ( rule__Binding__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:215:1: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:216:1: ( rule__Binding__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:216:2: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_rule__Binding__Group__0_in_ruleBinding394);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:228:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:229:1: ( ruleBind EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:230:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_ruleBind_in_entryRuleBind421);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBind428); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:237:1: ruleBind : ( ( rule__Bind__Alternatives ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:241:2: ( ( ( rule__Bind__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:242:1: ( ( rule__Bind__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:242:1: ( ( rule__Bind__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:243:1: ( rule__Bind__Alternatives )
            {
             before(grammarAccess.getBindAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:244:1: ( rule__Bind__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:244:2: rule__Bind__Alternatives
            {
            pushFollow(FOLLOW_rule__Bind__Alternatives_in_ruleBind454);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:256:1: entryRuleRoleBind : ruleRoleBind EOF ;
    public final void entryRuleRoleBind() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:257:1: ( ruleRoleBind EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:258:1: ruleRoleBind EOF
            {
             before(grammarAccess.getRoleBindRule()); 
            pushFollow(FOLLOW_ruleRoleBind_in_entryRuleRoleBind481);
            ruleRoleBind();

            state._fsp--;

             after(grammarAccess.getRoleBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleBind488); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:265:1: ruleRoleBind : ( ( rule__RoleBind__Group__0 ) ) ;
    public final void ruleRoleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:269:2: ( ( ( rule__RoleBind__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:270:1: ( ( rule__RoleBind__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:270:1: ( ( rule__RoleBind__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:271:1: ( rule__RoleBind__Group__0 )
            {
             before(grammarAccess.getRoleBindAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:272:1: ( rule__RoleBind__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:272:2: rule__RoleBind__Group__0
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__0_in_ruleRoleBind514);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:284:1: entryRuleValueBind : ruleValueBind EOF ;
    public final void entryRuleValueBind() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:285:1: ( ruleValueBind EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:286:1: ruleValueBind EOF
            {
             before(grammarAccess.getValueBindRule()); 
            pushFollow(FOLLOW_ruleValueBind_in_entryRuleValueBind541);
            ruleValueBind();

            state._fsp--;

             after(grammarAccess.getValueBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueBind548); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:293:1: ruleValueBind : ( ( rule__ValueBind__Group__0 ) ) ;
    public final void ruleValueBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:297:2: ( ( ( rule__ValueBind__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:298:1: ( ( rule__ValueBind__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:298:1: ( ( rule__ValueBind__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:299:1: ( rule__ValueBind__Group__0 )
            {
             before(grammarAccess.getValueBindAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:300:1: ( rule__ValueBind__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:300:2: rule__ValueBind__Group__0
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__0_in_ruleValueBind574);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:312:1: entryRuleObjectBind : ruleObjectBind EOF ;
    public final void entryRuleObjectBind() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:313:1: ( ruleObjectBind EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:314:1: ruleObjectBind EOF
            {
             before(grammarAccess.getObjectBindRule()); 
            pushFollow(FOLLOW_ruleObjectBind_in_entryRuleObjectBind601);
            ruleObjectBind();

            state._fsp--;

             after(grammarAccess.getObjectBindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectBind608); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:321:1: ruleObjectBind : ( ( rule__ObjectBind__Group__0 ) ) ;
    public final void ruleObjectBind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:325:2: ( ( ( rule__ObjectBind__Group__0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:326:1: ( ( rule__ObjectBind__Group__0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:326:1: ( ( rule__ObjectBind__Group__0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:327:1: ( rule__ObjectBind__Group__0 )
            {
             before(grammarAccess.getObjectBindAccess().getGroup()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:328:1: ( rule__ObjectBind__Group__0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:328:2: rule__ObjectBind__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__0_in_ruleObjectBind634);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:340:1: entryRuleRuleConstraint : ruleRuleConstraint EOF ;
    public final void entryRuleRuleConstraint() throws RecognitionException {
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:341:1: ( ruleRuleConstraint EOF )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:342:1: ruleRuleConstraint EOF
            {
             before(grammarAccess.getRuleConstraintRule()); 
            pushFollow(FOLLOW_ruleRuleConstraint_in_entryRuleRuleConstraint661);
            ruleRuleConstraint();

            state._fsp--;

             after(grammarAccess.getRuleConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleConstraint668); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:349:1: ruleRuleConstraint : ( ( rule__RuleConstraint__Alternatives ) ) ;
    public final void ruleRuleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:353:2: ( ( ( rule__RuleConstraint__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:354:1: ( ( rule__RuleConstraint__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:354:1: ( ( rule__RuleConstraint__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:355:1: ( rule__RuleConstraint__Alternatives )
            {
             before(grammarAccess.getRuleConstraintAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:356:1: ( rule__RuleConstraint__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:356:2: rule__RuleConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__RuleConstraint__Alternatives_in_ruleRuleConstraint694);
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


    // $ANTLR start "ruleRuleRights"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:369:1: ruleRuleRights : ( ( rule__RuleRights__Alternatives ) ) ;
    public final void ruleRuleRights() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:373:1: ( ( ( rule__RuleRights__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:374:1: ( ( rule__RuleRights__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:374:1: ( ( rule__RuleRights__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:375:1: ( rule__RuleRights__Alternatives )
            {
             before(grammarAccess.getRuleRightsAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:376:1: ( rule__RuleRights__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:376:2: rule__RuleRights__Alternatives
            {
            pushFollow(FOLLOW_rule__RuleRights__Alternatives_in_ruleRuleRights731);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:388:1: ruleRuleType : ( ( rule__RuleType__Alternatives ) ) ;
    public final void ruleRuleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:392:1: ( ( ( rule__RuleType__Alternatives ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:393:1: ( ( rule__RuleType__Alternatives ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:393:1: ( ( rule__RuleType__Alternatives ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:394:1: ( rule__RuleType__Alternatives )
            {
             before(grammarAccess.getRuleTypeAccess().getAlternatives()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:395:1: ( rule__RuleType__Alternatives )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:395:2: rule__RuleType__Alternatives
            {
            pushFollow(FOLLOW_rule__RuleType__Alternatives_in_ruleRuleType767);
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


    // $ANTLR start "rule__Role__Alternatives"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:406:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:410:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:411:1: ( ruleUser )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:411:1: ( ruleUser )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:412:1: ruleUser
                    {
                     before(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUser_in_rule__Role__Alternatives802);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:417:6: ( ruleGroup )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:417:6: ( ruleGroup )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:418:1: ruleGroup
                    {
                     before(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGroup_in_rule__Role__Alternatives819);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:428:1: rule__Bind__Alternatives : ( ( ruleObjectBind ) | ( ruleValueBind ) | ( ruleRoleBind ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:432:1: ( ( ruleObjectBind ) | ( ruleValueBind ) | ( ruleRoleBind ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 27:
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
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:433:1: ( ruleObjectBind )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:433:1: ( ruleObjectBind )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:434:1: ruleObjectBind
                    {
                     before(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectBind_in_rule__Bind__Alternatives851);
                    ruleObjectBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:439:6: ( ruleValueBind )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:439:6: ( ruleValueBind )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:440:1: ruleValueBind
                    {
                     before(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleValueBind_in_rule__Bind__Alternatives868);
                    ruleValueBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:445:6: ( ruleRoleBind )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:445:6: ( ruleRoleBind )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:446:1: ruleRoleBind
                    {
                     before(grammarAccess.getBindAccess().getRoleBindParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRoleBind_in_rule__Bind__Alternatives885);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:456:1: rule__RuleConstraint__Alternatives : ( ( ( rule__RuleConstraint__Group_0__0 ) ) | ( 'obfuscate' ) );
    public final void rule__RuleConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:460:1: ( ( ( rule__RuleConstraint__Group_0__0 ) ) | ( 'obfuscate' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:461:1: ( ( rule__RuleConstraint__Group_0__0 ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:461:1: ( ( rule__RuleConstraint__Group_0__0 ) )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:462:1: ( rule__RuleConstraint__Group_0__0 )
                    {
                     before(grammarAccess.getRuleConstraintAccess().getGroup_0()); 
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:463:1: ( rule__RuleConstraint__Group_0__0 )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:463:2: rule__RuleConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RuleConstraint__Group_0__0_in_rule__RuleConstraint__Alternatives917);
                    rule__RuleConstraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:467:6: ( 'obfuscate' )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:467:6: ( 'obfuscate' )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:468:1: 'obfuscate'
                    {
                     before(grammarAccess.getRuleConstraintAccess().getObfuscateKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__RuleConstraint__Alternatives936); 
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


    // $ANTLR start "rule__RuleRights__Alternatives"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:480:1: rule__RuleRights__Alternatives : ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__RuleRights__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:484:1: ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
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
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:485:1: ( ( 'R' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:485:1: ( ( 'R' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:486:1: ( 'R' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getReadEnumLiteralDeclaration_0()); 
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:487:1: ( 'R' )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:487:3: 'R'
                    {
                    match(input,12,FOLLOW_12_in_rule__RuleRights__Alternatives971); 

                    }

                     after(grammarAccess.getRuleRightsAccess().getReadEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:492:6: ( ( 'W' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:492:6: ( ( 'W' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:493:1: ( 'W' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getWriteEnumLiteralDeclaration_1()); 
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:494:1: ( 'W' )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:494:3: 'W'
                    {
                    match(input,13,FOLLOW_13_in_rule__RuleRights__Alternatives992); 

                    }

                     after(grammarAccess.getRuleRightsAccess().getWriteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:499:6: ( ( 'RW' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:499:6: ( ( 'RW' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:500:1: ( 'RW' )
                    {
                     before(grammarAccess.getRuleRightsAccess().getReadWriteEnumLiteralDeclaration_2()); 
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:501:1: ( 'RW' )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:501:3: 'RW'
                    {
                    match(input,14,FOLLOW_14_in_rule__RuleRights__Alternatives1013); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:511:1: rule__RuleType__Alternatives : ( ( ( 'deny' ) ) | ( ( 'permit' ) ) );
    public final void rule__RuleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:515:1: ( ( ( 'deny' ) ) | ( ( 'permit' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:516:1: ( ( 'deny' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:516:1: ( ( 'deny' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:517:1: ( 'deny' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getDenyEnumLiteralDeclaration_0()); 
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:518:1: ( 'deny' )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:518:3: 'deny'
                    {
                    match(input,15,FOLLOW_15_in_rule__RuleType__Alternatives1049); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getDenyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:523:6: ( ( 'permit' ) )
                    {
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:523:6: ( ( 'permit' ) )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:524:1: ( 'permit' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getPermitEnumLiteralDeclaration_1()); 
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:525:1: ( 'permit' )
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:525:3: 'permit'
                    {
                    match(input,16,FOLLOW_16_in_rule__RuleType__Alternatives1070); 

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


    // $ANTLR start "rule__RuleModel__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:537:1: rule__RuleModel__Group__0 : rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1 ;
    public final void rule__RuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:541:1: ( rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:542:2: rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1
            {
            pushFollow(FOLLOW_rule__RuleModel__Group__0__Impl_in_rule__RuleModel__Group__01103);
            rule__RuleModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleModel__Group__1_in_rule__RuleModel__Group__01106);
            rule__RuleModel__Group__1();

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
    // $ANTLR end "rule__RuleModel__Group__0"


    // $ANTLR start "rule__RuleModel__Group__0__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:549:1: rule__RuleModel__Group__0__Impl : ( ( rule__RuleModel__RolesAssignment_0 )* ) ;
    public final void rule__RuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:553:1: ( ( ( rule__RuleModel__RolesAssignment_0 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:554:1: ( ( rule__RuleModel__RolesAssignment_0 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:554:1: ( ( rule__RuleModel__RolesAssignment_0 )* )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:555:1: ( rule__RuleModel__RolesAssignment_0 )*
            {
             before(grammarAccess.getRuleModelAccess().getRolesAssignment_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:556:1: ( rule__RuleModel__RolesAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:556:2: rule__RuleModel__RolesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__RuleModel__RolesAssignment_0_in_rule__RuleModel__Group__0__Impl1133);
            	    rule__RuleModel__RolesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRuleModelAccess().getRolesAssignment_0()); 

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
    // $ANTLR end "rule__RuleModel__Group__0__Impl"


    // $ANTLR start "rule__RuleModel__Group__1"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:566:1: rule__RuleModel__Group__1 : rule__RuleModel__Group__1__Impl ;
    public final void rule__RuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:570:1: ( rule__RuleModel__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:571:2: rule__RuleModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleModel__Group__1__Impl_in_rule__RuleModel__Group__11164);
            rule__RuleModel__Group__1__Impl();

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
    // $ANTLR end "rule__RuleModel__Group__1"


    // $ANTLR start "rule__RuleModel__Group__1__Impl"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:577:1: rule__RuleModel__Group__1__Impl : ( ( rule__RuleModel__RulesAssignment_1 )* ) ;
    public final void rule__RuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:581:1: ( ( ( rule__RuleModel__RulesAssignment_1 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:582:1: ( ( rule__RuleModel__RulesAssignment_1 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:582:1: ( ( rule__RuleModel__RulesAssignment_1 )* )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:583:1: ( rule__RuleModel__RulesAssignment_1 )*
            {
             before(grammarAccess.getRuleModelAccess().getRulesAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:584:1: ( rule__RuleModel__RulesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:584:2: rule__RuleModel__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RuleModel__RulesAssignment_1_in_rule__RuleModel__Group__1__Impl1191);
            	    rule__RuleModel__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRuleModelAccess().getRulesAssignment_1()); 

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
    // $ANTLR end "rule__RuleModel__Group__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:598:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:602:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:603:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01226);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__01229);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:610:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:614:1: ( ( 'user' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:615:1: ( 'user' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:615:1: ( 'user' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:616:1: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__User__Group__0__Impl1257); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:629:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:633:1: ( rule__User__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:634:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11288);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:640:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:644:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:645:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:645:1: ( ( rule__User__NameAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:646:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:647:1: ( rule__User__NameAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:647:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1315);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:661:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:665:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:666:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01349);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01352);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:673:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:677:1: ( ( 'group' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:678:1: ( 'group' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:678:1: ( 'group' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:679:1: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Group__Group__0__Impl1380); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:692:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:696:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:697:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11411);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11414);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:704:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:708:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:709:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:709:1: ( ( rule__Group__NameAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:710:1: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:711:1: ( rule__Group__NameAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:711:2: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl1441);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:721:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:725:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:726:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21471);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21474);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:733:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:737:1: ( ( '{' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:738:1: ( '{' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:738:1: ( '{' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:739:1: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Group__Group__2__Impl1502); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:752:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:756:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:757:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31533);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31536);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:764:1: rule__Group__Group__3__Impl : ( ( rule__Group__UsersAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:768:1: ( ( ( rule__Group__UsersAssignment_3 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:769:1: ( ( rule__Group__UsersAssignment_3 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:769:1: ( ( rule__Group__UsersAssignment_3 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:770:1: ( rule__Group__UsersAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_3()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:771:1: ( rule__Group__UsersAssignment_3 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:771:2: rule__Group__UsersAssignment_3
            {
            pushFollow(FOLLOW_rule__Group__UsersAssignment_3_in_rule__Group__Group__3__Impl1563);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:781:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:785:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:786:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41593);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41596);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:793:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:797:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:798:1: ( ( rule__Group__Group_4__0 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:798:1: ( ( rule__Group__Group_4__0 )* )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:799:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:800:1: ( rule__Group__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:800:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1623);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:810:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:814:1: ( rule__Group__Group__5__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:815:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__51654);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:821:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:825:1: ( ( '}' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:826:1: ( '}' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:826:1: ( '}' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:827:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Group__Group__5__Impl1682); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:852:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:856:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:857:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01725);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01728);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:864:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:868:1: ( ( ',' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:869:1: ( ',' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:869:1: ( ',' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:870:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Group__Group_4__0__Impl1756); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:883:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:887:1: ( rule__Group__Group_4__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:888:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11787);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:894:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__UsersAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:898:1: ( ( ( rule__Group__UsersAssignment_4_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:899:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:899:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:900:1: ( rule__Group__UsersAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_4_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:901:1: ( rule__Group__UsersAssignment_4_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:901:2: rule__Group__UsersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Group__UsersAssignment_4_1_in_rule__Group__Group_4__1__Impl1814);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:915:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:919:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:920:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01848);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01851);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:927:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:931:1: ( ( 'rule' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:932:1: ( 'rule' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:932:1: ( 'rule' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:933:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Rule__Group__0__Impl1879); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:946:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:950:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:951:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11910);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11913);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:958:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:962:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:963:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:963:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:964:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:965:1: ( rule__Rule__NameAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:965:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl1940);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:975:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:979:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:980:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21970);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21973);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:987:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ContraintAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:991:1: ( ( ( rule__Rule__ContraintAssignment_2 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:992:1: ( ( rule__Rule__ContraintAssignment_2 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:992:1: ( ( rule__Rule__ContraintAssignment_2 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:993:1: ( rule__Rule__ContraintAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getContraintAssignment_2()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:994:1: ( rule__Rule__ContraintAssignment_2 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:994:2: rule__Rule__ContraintAssignment_2
            {
            pushFollow(FOLLOW_rule__Rule__ContraintAssignment_2_in_rule__Rule__Group__2__Impl2000);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1004:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1008:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1009:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32030);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32033);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1016:1: rule__Rule__Group__3__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1020:1: ( ( 'to' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1021:1: ( 'to' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1021:1: ( 'to' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1022:1: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Rule__Group__3__Impl2061); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1035:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1039:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1040:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42092);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42095);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1047:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__RolesAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1051:1: ( ( ( rule__Rule__RolesAssignment_4 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1052:1: ( ( rule__Rule__RolesAssignment_4 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1052:1: ( ( rule__Rule__RolesAssignment_4 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1053:1: ( rule__Rule__RolesAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_4()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1054:1: ( rule__Rule__RolesAssignment_4 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1054:2: rule__Rule__RolesAssignment_4
            {
            pushFollow(FOLLOW_rule__Rule__RolesAssignment_4_in_rule__Rule__Group__4__Impl2122);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1064:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1068:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1069:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52152);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52155);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1076:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )* ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1080:1: ( ( ( rule__Rule__Group_5__0 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1081:1: ( ( rule__Rule__Group_5__0 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1081:1: ( ( rule__Rule__Group_5__0 )* )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1082:1: ( rule__Rule__Group_5__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1083:1: ( rule__Rule__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1083:2: rule__Rule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_5__0_in_rule__Rule__Group__5__Impl2182);
            	    rule__Rule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1093:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1097:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1098:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62213);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62216);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1105:1: rule__Rule__Group__6__Impl : ( '{' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1109:1: ( ( '{' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1110:1: ( '{' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1110:1: ( '{' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1111:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Rule__Group__6__Impl2244); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1124:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1128:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1129:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72275);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__72278);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1136:1: rule__Rule__Group__7__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1140:1: ( ( 'query' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1141:1: ( 'query' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1141:1: ( 'query' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1142:1: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Rule__Group__7__Impl2306); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1155:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1159:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1160:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__82337);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__9_in_rule__Rule__Group__82340);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1167:1: rule__Rule__Group__8__Impl : ( ( rule__Rule__PatternAssignment_8 ) ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1171:1: ( ( ( rule__Rule__PatternAssignment_8 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1172:1: ( ( rule__Rule__PatternAssignment_8 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1172:1: ( ( rule__Rule__PatternAssignment_8 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1173:1: ( rule__Rule__PatternAssignment_8 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_8()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1174:1: ( rule__Rule__PatternAssignment_8 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1174:2: rule__Rule__PatternAssignment_8
            {
            pushFollow(FOLLOW_rule__Rule__PatternAssignment_8_in_rule__Rule__Group__8__Impl2367);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1184:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1188:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1189:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_rule__Rule__Group__9__Impl_in_rule__Rule__Group__92397);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__10_in_rule__Rule__Group__92400);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1196:1: rule__Rule__Group__9__Impl : ( ( ';' )? ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1200:1: ( ( ( ';' )? ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1201:1: ( ( ';' )? )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1201:1: ( ( ';' )? )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1202:1: ( ';' )?
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_9()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1203:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1204:2: ';'
                    {
                    match(input,25,FOLLOW_25_in_rule__Rule__Group__9__Impl2429); 

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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1215:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1219:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1220:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_rule__Rule__Group__10__Impl_in_rule__Rule__Group__102462);
            rule__Rule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__11_in_rule__Rule__Group__102465);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1227:1: rule__Rule__Group__10__Impl : ( ( rule__Rule__BindingsAssignment_10 )* ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1231:1: ( ( ( rule__Rule__BindingsAssignment_10 )* ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1232:1: ( ( rule__Rule__BindingsAssignment_10 )* )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1232:1: ( ( rule__Rule__BindingsAssignment_10 )* )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1233:1: ( rule__Rule__BindingsAssignment_10 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_10()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1234:1: ( rule__Rule__BindingsAssignment_10 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1234:2: rule__Rule__BindingsAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Rule__BindingsAssignment_10_in_rule__Rule__Group__10__Impl2492);
            	    rule__Rule__BindingsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1244:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1248:1: ( rule__Rule__Group__11__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1249:2: rule__Rule__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__11__Impl_in_rule__Rule__Group__112523);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1255:1: rule__Rule__Group__11__Impl : ( '}' ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1259:1: ( ( '}' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1260:1: ( '}' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1260:1: ( '}' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1261:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_11()); 
            match(input,20,FOLLOW_20_in_rule__Rule__Group__11__Impl2551); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1298:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1302:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1303:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__0__Impl_in_rule__Rule__Group_5__02606);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_5__1_in_rule__Rule__Group_5__02609);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1310:1: rule__Rule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1314:1: ( ( ',' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1315:1: ( ',' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1315:1: ( ',' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1316:1: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); 
            match(input,21,FOLLOW_21_in_rule__Rule__Group_5__0__Impl2637); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1329:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1333:1: ( rule__Rule__Group_5__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1334:2: rule__Rule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__1__Impl_in_rule__Rule__Group_5__12668);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1340:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__RolesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1344:1: ( ( ( rule__Rule__RolesAssignment_5_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1345:1: ( ( rule__Rule__RolesAssignment_5_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1345:1: ( ( rule__Rule__RolesAssignment_5_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1346:1: ( rule__Rule__RolesAssignment_5_1 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_5_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1347:1: ( rule__Rule__RolesAssignment_5_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1347:2: rule__Rule__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Rule__RolesAssignment_5_1_in_rule__Rule__Group_5__1__Impl2695);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1361:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1365:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1366:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__02729);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__02732);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1373:1: rule__Binding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1377:1: ( ( 'bind' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1378:1: ( 'bind' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1378:1: ( 'bind' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1379:1: 'bind'
            {
             before(grammarAccess.getBindingAccess().getBindKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Binding__Group__0__Impl2760); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1392:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1396:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1397:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__12791);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__12794);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1404:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__ParamAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1408:1: ( ( ( rule__Binding__ParamAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1409:1: ( ( rule__Binding__ParamAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1409:1: ( ( rule__Binding__ParamAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1410:1: ( rule__Binding__ParamAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getParamAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1411:1: ( rule__Binding__ParamAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1411:2: rule__Binding__ParamAssignment_1
            {
            pushFollow(FOLLOW_rule__Binding__ParamAssignment_1_in_rule__Binding__Group__1__Impl2821);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1421:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1425:1: ( rule__Binding__Group__2__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1426:2: rule__Binding__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__22851);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1432:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ValueAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1436:1: ( ( ( rule__Binding__ValueAssignment_2 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1437:1: ( ( rule__Binding__ValueAssignment_2 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1437:1: ( ( rule__Binding__ValueAssignment_2 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1438:1: ( rule__Binding__ValueAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getValueAssignment_2()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1439:1: ( rule__Binding__ValueAssignment_2 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1439:2: rule__Binding__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Binding__ValueAssignment_2_in_rule__Binding__Group__2__Impl2878);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1455:1: rule__RoleBind__Group__0 : rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1 ;
    public final void rule__RoleBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1459:1: ( rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1460:2: rule__RoleBind__Group__0__Impl rule__RoleBind__Group__1
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__0__Impl_in_rule__RoleBind__Group__02914);
            rule__RoleBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RoleBind__Group__1_in_rule__RoleBind__Group__02917);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1467:1: rule__RoleBind__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1471:1: ( ( 'role' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1472:1: ( 'role' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1472:1: ( 'role' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1473:1: 'role'
            {
             before(grammarAccess.getRoleBindAccess().getRoleKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__RoleBind__Group__0__Impl2945); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1486:1: rule__RoleBind__Group__1 : rule__RoleBind__Group__1__Impl ;
    public final void rule__RoleBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1490:1: ( rule__RoleBind__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1491:2: rule__RoleBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RoleBind__Group__1__Impl_in_rule__RoleBind__Group__12976);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1497:1: rule__RoleBind__Group__1__Impl : ( ( rule__RoleBind__RoleAssignment_1 ) ) ;
    public final void rule__RoleBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1501:1: ( ( ( rule__RoleBind__RoleAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1502:1: ( ( rule__RoleBind__RoleAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1502:1: ( ( rule__RoleBind__RoleAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1503:1: ( rule__RoleBind__RoleAssignment_1 )
            {
             before(grammarAccess.getRoleBindAccess().getRoleAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1504:1: ( rule__RoleBind__RoleAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1504:2: rule__RoleBind__RoleAssignment_1
            {
            pushFollow(FOLLOW_rule__RoleBind__RoleAssignment_1_in_rule__RoleBind__Group__1__Impl3003);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1518:1: rule__ValueBind__Group__0 : rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1 ;
    public final void rule__ValueBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1522:1: ( rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1523:2: rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__0__Impl_in_rule__ValueBind__Group__03037);
            rule__ValueBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueBind__Group__1_in_rule__ValueBind__Group__03040);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1530:1: rule__ValueBind__Group__0__Impl : ( 'value' ) ;
    public final void rule__ValueBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1534:1: ( ( 'value' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1535:1: ( 'value' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1535:1: ( 'value' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1536:1: 'value'
            {
             before(grammarAccess.getValueBindAccess().getValueKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ValueBind__Group__0__Impl3068); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1549:1: rule__ValueBind__Group__1 : rule__ValueBind__Group__1__Impl ;
    public final void rule__ValueBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1553:1: ( rule__ValueBind__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1554:2: rule__ValueBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValueBind__Group__1__Impl_in_rule__ValueBind__Group__13099);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1560:1: rule__ValueBind__Group__1__Impl : ( ( rule__ValueBind__ValueAssignment_1 ) ) ;
    public final void rule__ValueBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1564:1: ( ( ( rule__ValueBind__ValueAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1565:1: ( ( rule__ValueBind__ValueAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1565:1: ( ( rule__ValueBind__ValueAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1566:1: ( rule__ValueBind__ValueAssignment_1 )
            {
             before(grammarAccess.getValueBindAccess().getValueAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1567:1: ( rule__ValueBind__ValueAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1567:2: rule__ValueBind__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ValueBind__ValueAssignment_1_in_rule__ValueBind__Group__1__Impl3126);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1581:1: rule__ObjectBind__Group__0 : rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1 ;
    public final void rule__ObjectBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1585:1: ( rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1586:2: rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__0__Impl_in_rule__ObjectBind__Group__03160);
            rule__ObjectBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectBind__Group__1_in_rule__ObjectBind__Group__03163);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1593:1: rule__ObjectBind__Group__0__Impl : ( 'object' ) ;
    public final void rule__ObjectBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1597:1: ( ( 'object' ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1598:1: ( 'object' )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1598:1: ( 'object' )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1599:1: 'object'
            {
             before(grammarAccess.getObjectBindAccess().getObjectKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ObjectBind__Group__0__Impl3191); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1612:1: rule__ObjectBind__Group__1 : rule__ObjectBind__Group__1__Impl ;
    public final void rule__ObjectBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1616:1: ( rule__ObjectBind__Group__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1617:2: rule__ObjectBind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectBind__Group__1__Impl_in_rule__ObjectBind__Group__13222);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1623:1: rule__ObjectBind__Group__1__Impl : ( ( rule__ObjectBind__ObjectAssignment_1 ) ) ;
    public final void rule__ObjectBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1627:1: ( ( ( rule__ObjectBind__ObjectAssignment_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1628:1: ( ( rule__ObjectBind__ObjectAssignment_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1628:1: ( ( rule__ObjectBind__ObjectAssignment_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1629:1: ( rule__ObjectBind__ObjectAssignment_1 )
            {
             before(grammarAccess.getObjectBindAccess().getObjectAssignment_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1630:1: ( rule__ObjectBind__ObjectAssignment_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1630:2: rule__ObjectBind__ObjectAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectBind__ObjectAssignment_1_in_rule__ObjectBind__Group__1__Impl3249);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1644:1: rule__RuleConstraint__Group_0__0 : rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1 ;
    public final void rule__RuleConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1648:1: ( rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1649:2: rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1
            {
            pushFollow(FOLLOW_rule__RuleConstraint__Group_0__0__Impl_in_rule__RuleConstraint__Group_0__03283);
            rule__RuleConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleConstraint__Group_0__1_in_rule__RuleConstraint__Group_0__03286);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1656:1: rule__RuleConstraint__Group_0__0__Impl : ( ( rule__RuleConstraint__TypeAssignment_0_0 ) ) ;
    public final void rule__RuleConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1660:1: ( ( ( rule__RuleConstraint__TypeAssignment_0_0 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1661:1: ( ( rule__RuleConstraint__TypeAssignment_0_0 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1661:1: ( ( rule__RuleConstraint__TypeAssignment_0_0 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1662:1: ( rule__RuleConstraint__TypeAssignment_0_0 )
            {
             before(grammarAccess.getRuleConstraintAccess().getTypeAssignment_0_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1663:1: ( rule__RuleConstraint__TypeAssignment_0_0 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1663:2: rule__RuleConstraint__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__RuleConstraint__TypeAssignment_0_0_in_rule__RuleConstraint__Group_0__0__Impl3313);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1673:1: rule__RuleConstraint__Group_0__1 : rule__RuleConstraint__Group_0__1__Impl ;
    public final void rule__RuleConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1677:1: ( rule__RuleConstraint__Group_0__1__Impl )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1678:2: rule__RuleConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleConstraint__Group_0__1__Impl_in_rule__RuleConstraint__Group_0__13343);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1684:1: rule__RuleConstraint__Group_0__1__Impl : ( ( rule__RuleConstraint__RightsAssignment_0_1 ) ) ;
    public final void rule__RuleConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1688:1: ( ( ( rule__RuleConstraint__RightsAssignment_0_1 ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1689:1: ( ( rule__RuleConstraint__RightsAssignment_0_1 ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1689:1: ( ( rule__RuleConstraint__RightsAssignment_0_1 ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1690:1: ( rule__RuleConstraint__RightsAssignment_0_1 )
            {
             before(grammarAccess.getRuleConstraintAccess().getRightsAssignment_0_1()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1691:1: ( rule__RuleConstraint__RightsAssignment_0_1 )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1691:2: rule__RuleConstraint__RightsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__RuleConstraint__RightsAssignment_0_1_in_rule__RuleConstraint__Group_0__1__Impl3370);
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


    // $ANTLR start "rule__RuleModel__RolesAssignment_0"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1706:1: rule__RuleModel__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__RuleModel__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1710:1: ( ( ruleRole ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1711:1: ( ruleRole )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1711:1: ( ruleRole )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1712:1: ruleRole
            {
             before(grammarAccess.getRuleModelAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__RuleModel__RolesAssignment_03409);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getRolesRoleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RuleModel__RolesAssignment_0"


    // $ANTLR start "rule__RuleModel__RulesAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1721:1: rule__RuleModel__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__RuleModel__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1725:1: ( ( ruleRule ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1726:1: ( ruleRule )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1726:1: ( ruleRule )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1727:1: ruleRule
            {
             before(grammarAccess.getRuleModelAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__RuleModel__RulesAssignment_13440);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getRulesRuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RuleModel__RulesAssignment_1"


    // $ANTLR start "rule__User__NameAssignment_1"
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1736:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1740:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1741:1: ( RULE_ID )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1741:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1742:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_13471); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1751:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1755:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1756:1: ( RULE_ID )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1756:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1757:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__NameAssignment_13502); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1766:1: rule__Group__UsersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1770:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1771:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1771:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1772:1: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1773:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1774:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_33537); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1785:1: rule__Group__UsersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1789:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1790:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1790:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1791:1: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1792:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1793:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_4_13576); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1804:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1808:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1809:1: ( RULE_ID )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1809:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1810:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_13611); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1819:1: rule__Rule__ContraintAssignment_2 : ( ruleRuleConstraint ) ;
    public final void rule__Rule__ContraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1823:1: ( ( ruleRuleConstraint ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1824:1: ( ruleRuleConstraint )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1824:1: ( ruleRuleConstraint )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1825:1: ruleRuleConstraint
            {
             before(grammarAccess.getRuleAccess().getContraintRuleConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRuleConstraint_in_rule__Rule__ContraintAssignment_23642);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1834:1: rule__Rule__RolesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1838:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1839:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1839:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1840:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_4_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1841:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1842:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__RolesAssignment_43677); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1853:1: rule__Rule__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1857:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1858:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1858:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1859:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1860:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1861:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__RolesAssignment_5_13716); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1872:1: rule__Rule__PatternAssignment_8 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1876:1: ( ( ( RULE_STRING ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1877:1: ( ( RULE_STRING ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1877:1: ( ( RULE_STRING ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1878:1: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_8_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1879:1: ( RULE_STRING )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1880:1: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_8_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rule__PatternAssignment_83755); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1891:1: rule__Rule__BindingsAssignment_10 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1895:1: ( ( ruleBinding ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1896:1: ( ruleBinding )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1896:1: ( ruleBinding )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1897:1: ruleBinding
            {
             before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleBinding_in_rule__Rule__BindingsAssignment_103790);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1906:1: rule__Binding__ParamAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1910:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1911:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1911:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1912:1: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getParamVariableCrossReference_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1913:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1914:1: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getParamVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Binding__ParamAssignment_13825); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1925:1: rule__Binding__ValueAssignment_2 : ( ruleBind ) ;
    public final void rule__Binding__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1929:1: ( ( ruleBind ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1930:1: ( ruleBind )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1930:1: ( ruleBind )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1931:1: ruleBind
            {
             before(grammarAccess.getBindingAccess().getValueBindParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBind_in_rule__Binding__ValueAssignment_23860);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1940:1: rule__RoleBind__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoleBind__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1944:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1945:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1945:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1946:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleBindAccess().getRoleRoleCrossReference_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1947:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1948:1: RULE_ID
            {
             before(grammarAccess.getRoleBindAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RoleBind__RoleAssignment_13895); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1959:1: rule__ValueBind__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ValueBind__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1963:1: ( ( RULE_STRING ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1964:1: ( RULE_STRING )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1964:1: ( RULE_STRING )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1965:1: RULE_STRING
            {
             before(grammarAccess.getValueBindAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ValueBind__ValueAssignment_13930); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1974:1: rule__ObjectBind__ObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectBind__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1978:1: ( ( ( RULE_ID ) ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1979:1: ( ( RULE_ID ) )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1979:1: ( ( RULE_ID ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1980:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0()); 
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1981:1: ( RULE_ID )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1982:1: RULE_ID
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectBind__ObjectAssignment_13965); 
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1993:1: rule__RuleConstraint__TypeAssignment_0_0 : ( ruleRuleType ) ;
    public final void rule__RuleConstraint__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1997:1: ( ( ruleRuleType ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1998:1: ( ruleRuleType )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1998:1: ( ruleRuleType )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:1999:1: ruleRuleType
            {
             before(grammarAccess.getRuleConstraintAccess().getTypeRuleTypeEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleRuleType_in_rule__RuleConstraint__TypeAssignment_0_04000);
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
    // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:2008:1: rule__RuleConstraint__RightsAssignment_0_1 : ( ruleRuleRights ) ;
    public final void rule__RuleConstraint__RightsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:2012:1: ( ( ruleRuleRights ) )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:2013:1: ( ruleRuleRights )
            {
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:2013:1: ( ruleRuleRights )
            // ../org.mondo.collaboration.security.macl.xtext.rule.ui/src-gen/org/mondo/collaboration/security/macl/xtext/rule/ui/contentassist/antlr/internal/InternalMACLRule.g:2014:1: ruleRuleRights
            {
             before(grammarAccess.getRuleConstraintAccess().getRightsRuleRightsEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleRuleRights_in_rule__RuleConstraint__RightsAssignment_0_14031);
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


 

    public static final BitSet FOLLOW_ruleRuleModel_in_entryRuleRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleModel__Group__0_in_ruleRuleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Alternatives_in_ruleRole154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0_in_ruleBinding394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_entryRuleBind421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBind428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bind__Alternatives_in_ruleBind454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBind_in_entryRuleRoleBind481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleBind488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__0_in_ruleRoleBind514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueBind_in_entryRuleValueBind541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueBind548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__0_in_ruleValueBind574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectBind_in_entryRuleObjectBind601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectBind608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__0_in_ruleObjectBind634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleConstraint_in_entryRuleRuleConstraint661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleConstraint668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Alternatives_in_ruleRuleConstraint694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleRights__Alternatives_in_ruleRuleRights731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleType__Alternatives_in_ruleRuleType767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__Role__Alternatives802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Role__Alternatives819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectBind_in_rule__Bind__Alternatives851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueBind_in_rule__Bind__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleBind_in_rule__Bind__Alternatives885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Group_0__0_in_rule__RuleConstraint__Alternatives917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RuleConstraint__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RuleRights__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RuleRights__Alternatives992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RuleRights__Alternatives1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RuleType__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RuleType__Alternatives1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleModel__Group__0__Impl_in_rule__RuleModel__Group__01103 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RuleModel__Group__1_in_rule__RuleModel__Group__01106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleModel__RolesAssignment_0_in_rule__RuleModel__Group__0__Impl1133 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_rule__RuleModel__Group__1__Impl_in_rule__RuleModel__Group__11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleModel__RulesAssignment_1_in_rule__RuleModel__Group__1__Impl1191 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__01229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__User__Group__0__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Group__Group__0__Impl1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11411 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Group__Group__2__Impl1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31533 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__UsersAssignment_3_in_rule__Group__Group__3__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41593 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1623 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__51654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Group__Group__5__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Group__Group_4__0__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__UsersAssignment_4_1_in_rule__Group__Group_4__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Rule__Group__0__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11910 = new BitSet(new long[]{0x0000000000018800L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21970 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ContraintAssignment_2_in_rule__Rule__Group__2__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rule__Group__3__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42092 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__RolesAssignment_4_in_rule__Rule__Group__4__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52152 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__0_in_rule__Rule__Group__5__Impl2182 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62213 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__62216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Rule__Group__6__Impl2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__72275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__72278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Rule__Group__7__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__82337 = new BitSet(new long[]{0x0000000006100000L});
    public static final BitSet FOLLOW_rule__Rule__Group__9_in_rule__Rule__Group__82340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__PatternAssignment_8_in_rule__Rule__Group__8__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__9__Impl_in_rule__Rule__Group__92397 = new BitSet(new long[]{0x0000000006100000L});
    public static final BitSet FOLLOW_rule__Rule__Group__10_in_rule__Rule__Group__92400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Rule__Group__9__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__10__Impl_in_rule__Rule__Group__102462 = new BitSet(new long[]{0x0000000006100000L});
    public static final BitSet FOLLOW_rule__Rule__Group__11_in_rule__Rule__Group__102465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__BindingsAssignment_10_in_rule__Rule__Group__10__Impl2492 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__11__Impl_in_rule__Rule__Group__112523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group__11__Impl2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__0__Impl_in_rule__Rule__Group_5__02606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__1_in_rule__Rule__Group_5__02609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group_5__0__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__1__Impl_in_rule__Rule__Group_5__12668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__RolesAssignment_5_1_in_rule__Rule__Group_5__1__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__0__Impl_in_rule__Binding__Group__02729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binding__Group__1_in_rule__Binding__Group__02732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Binding__Group__0__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__1__Impl_in_rule__Binding__Group__12791 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_rule__Binding__Group__2_in_rule__Binding__Group__12794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__ParamAssignment_1_in_rule__Binding__Group__1__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__Group__2__Impl_in_rule__Binding__Group__22851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binding__ValueAssignment_2_in_rule__Binding__Group__2__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__0__Impl_in_rule__RoleBind__Group__02914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__1_in_rule__RoleBind__Group__02917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RoleBind__Group__0__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__Group__1__Impl_in_rule__RoleBind__Group__12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleBind__RoleAssignment_1_in_rule__RoleBind__Group__1__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__0__Impl_in_rule__ValueBind__Group__03037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__1_in_rule__ValueBind__Group__03040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ValueBind__Group__0__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__Group__1__Impl_in_rule__ValueBind__Group__13099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueBind__ValueAssignment_1_in_rule__ValueBind__Group__1__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__0__Impl_in_rule__ObjectBind__Group__03160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__1_in_rule__ObjectBind__Group__03163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ObjectBind__Group__0__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__Group__1__Impl_in_rule__ObjectBind__Group__13222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectBind__ObjectAssignment_1_in_rule__ObjectBind__Group__1__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Group_0__0__Impl_in_rule__RuleConstraint__Group_0__03283 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Group_0__1_in_rule__RuleConstraint__Group_0__03286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__TypeAssignment_0_0_in_rule__RuleConstraint__Group_0__0__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__Group_0__1__Impl_in_rule__RuleConstraint__Group_0__13343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleConstraint__RightsAssignment_0_1_in_rule__RuleConstraint__Group_0__1__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__RuleModel__RolesAssignment_03409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleModel__RulesAssignment_13440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__NameAssignment_13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_33537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__UsersAssignment_4_13576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_13611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleConstraint_in_rule__Rule__ContraintAssignment_23642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__RolesAssignment_43677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__RolesAssignment_5_13716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rule__PatternAssignment_83755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_rule__Rule__BindingsAssignment_103790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Binding__ParamAssignment_13825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_rule__Binding__ValueAssignment_23860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RoleBind__RoleAssignment_13895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ValueBind__ValueAssignment_13930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectBind__ObjectAssignment_13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleType_in_rule__RuleConstraint__TypeAssignment_0_04000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleRights_in_rule__RuleConstraint__RightsAssignment_0_14031 = new BitSet(new long[]{0x0000000000000002L});

}