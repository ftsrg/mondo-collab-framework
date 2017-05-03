package org.mondo.collaboration.policy.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mondo.collaboration.policy.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'", "'user'", "'group'", "'{'", "'}'", "','", "'policy'", "'by'", "'default'", "'with'", "'resolution'", "'rule'", "'to'", "'from'", "'query'", "'select'", "'priority'", "'obfuscate'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRules.g"; }


    	private RulesGrammarAccess grammarAccess;

    	public void setGrammarAccess(RulesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalRules.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRules.g:54:1: ( ruleModel EOF )
            // InternalRules.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRules.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalRules.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalRules.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalRules.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalRules.g:69:3: ( rule__Model__Group__0 )
            // InternalRules.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRole"
    // InternalRules.g:78:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalRules.g:79:1: ( ruleRole EOF )
            // InternalRules.g:80:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRules.g:87:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:91:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalRules.g:92:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalRules.g:92:2: ( ( rule__Role__Alternatives ) )
            // InternalRules.g:93:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalRules.g:94:3: ( rule__Role__Alternatives )
            // InternalRules.g:94:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:103:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalRules.g:104:1: ( ruleUser EOF )
            // InternalRules.g:105:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRules.g:112:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:116:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalRules.g:117:2: ( ( rule__User__Group__0 ) )
            {
            // InternalRules.g:117:2: ( ( rule__User__Group__0 ) )
            // InternalRules.g:118:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalRules.g:119:3: ( rule__User__Group__0 )
            // InternalRules.g:119:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:128:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalRules.g:129:1: ( ruleGroup EOF )
            // InternalRules.g:130:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRules.g:137:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:141:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalRules.g:142:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalRules.g:142:2: ( ( rule__Group__Group__0 ) )
            // InternalRules.g:143:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalRules.g:144:3: ( rule__Group__Group__0 )
            // InternalRules.g:144:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:153:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalRules.g:154:1: ( rulePolicy EOF )
            // InternalRules.g:155:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRules.g:162:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:166:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalRules.g:167:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalRules.g:167:2: ( ( rule__Policy__Group__0 ) )
            // InternalRules.g:168:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalRules.g:169:3: ( rule__Policy__Group__0 )
            // InternalRules.g:169:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:178:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRules.g:179:1: ( ruleRule EOF )
            // InternalRules.g:180:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRules.g:187:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:191:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRules.g:192:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRules.g:192:2: ( ( rule__Rule__Group__0 ) )
            // InternalRules.g:193:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRules.g:194:3: ( rule__Rule__Group__0 )
            // InternalRules.g:194:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleRuleConstraint"
    // InternalRules.g:203:1: entryRuleRuleConstraint : ruleRuleConstraint EOF ;
    public final void entryRuleRuleConstraint() throws RecognitionException {
        try {
            // InternalRules.g:204:1: ( ruleRuleConstraint EOF )
            // InternalRules.g:205:1: ruleRuleConstraint EOF
            {
             before(grammarAccess.getRuleConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleConstraint();

            state._fsp--;

             after(grammarAccess.getRuleConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRules.g:212:1: ruleRuleConstraint : ( ( rule__RuleConstraint__Alternatives ) ) ;
    public final void ruleRuleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:216:2: ( ( ( rule__RuleConstraint__Alternatives ) ) )
            // InternalRules.g:217:2: ( ( rule__RuleConstraint__Alternatives ) )
            {
            // InternalRules.g:217:2: ( ( rule__RuleConstraint__Alternatives ) )
            // InternalRules.g:218:3: ( rule__RuleConstraint__Alternatives )
            {
             before(grammarAccess.getRuleConstraintAccess().getAlternatives()); 
            // InternalRules.g:219:3: ( rule__RuleConstraint__Alternatives )
            // InternalRules.g:219:4: rule__RuleConstraint__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleAsset"
    // InternalRules.g:228:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // InternalRules.g:229:1: ( ruleAsset EOF )
            // InternalRules.g:230:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_1);
            ruleAsset();

            state._fsp--;

             after(grammarAccess.getAssetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // InternalRules.g:237:1: ruleAsset : ( ( rule__Asset__Alternatives ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:241:2: ( ( ( rule__Asset__Alternatives ) ) )
            // InternalRules.g:242:2: ( ( rule__Asset__Alternatives ) )
            {
            // InternalRules.g:242:2: ( ( rule__Asset__Alternatives ) )
            // InternalRules.g:243:3: ( rule__Asset__Alternatives )
            {
             before(grammarAccess.getAssetAccess().getAlternatives()); 
            // InternalRules.g:244:3: ( rule__Asset__Alternatives )
            // InternalRules.g:244:4: rule__Asset__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Asset__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleObjectFact"
    // InternalRules.g:253:1: entryRuleObjectFact : ruleObjectFact EOF ;
    public final void entryRuleObjectFact() throws RecognitionException {
        try {
            // InternalRules.g:254:1: ( ruleObjectFact EOF )
            // InternalRules.g:255:1: ruleObjectFact EOF
            {
             before(grammarAccess.getObjectFactRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectFact();

            state._fsp--;

             after(grammarAccess.getObjectFactRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjectFact"


    // $ANTLR start "ruleObjectFact"
    // InternalRules.g:262:1: ruleObjectFact : ( ( rule__ObjectFact__Group__0 ) ) ;
    public final void ruleObjectFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:266:2: ( ( ( rule__ObjectFact__Group__0 ) ) )
            // InternalRules.g:267:2: ( ( rule__ObjectFact__Group__0 ) )
            {
            // InternalRules.g:267:2: ( ( rule__ObjectFact__Group__0 ) )
            // InternalRules.g:268:3: ( rule__ObjectFact__Group__0 )
            {
             before(grammarAccess.getObjectFactAccess().getGroup()); 
            // InternalRules.g:269:3: ( rule__ObjectFact__Group__0 )
            // InternalRules.g:269:4: rule__ObjectFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectFact"


    // $ANTLR start "entryRuleReferenceFact"
    // InternalRules.g:278:1: entryRuleReferenceFact : ruleReferenceFact EOF ;
    public final void entryRuleReferenceFact() throws RecognitionException {
        try {
            // InternalRules.g:279:1: ( ruleReferenceFact EOF )
            // InternalRules.g:280:1: ruleReferenceFact EOF
            {
             before(grammarAccess.getReferenceFactRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceFact();

            state._fsp--;

             after(grammarAccess.getReferenceFactRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferenceFact"


    // $ANTLR start "ruleReferenceFact"
    // InternalRules.g:287:1: ruleReferenceFact : ( ( rule__ReferenceFact__Group__0 ) ) ;
    public final void ruleReferenceFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:291:2: ( ( ( rule__ReferenceFact__Group__0 ) ) )
            // InternalRules.g:292:2: ( ( rule__ReferenceFact__Group__0 ) )
            {
            // InternalRules.g:292:2: ( ( rule__ReferenceFact__Group__0 ) )
            // InternalRules.g:293:3: ( rule__ReferenceFact__Group__0 )
            {
             before(grammarAccess.getReferenceFactAccess().getGroup()); 
            // InternalRules.g:294:3: ( rule__ReferenceFact__Group__0 )
            // InternalRules.g:294:4: rule__ReferenceFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getGroup()); 

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
    // $ANTLR end "ruleReferenceFact"


    // $ANTLR start "entryRuleAttributeFact"
    // InternalRules.g:303:1: entryRuleAttributeFact : ruleAttributeFact EOF ;
    public final void entryRuleAttributeFact() throws RecognitionException {
        try {
            // InternalRules.g:304:1: ( ruleAttributeFact EOF )
            // InternalRules.g:305:1: ruleAttributeFact EOF
            {
             before(grammarAccess.getAttributeFactRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeFact();

            state._fsp--;

             after(grammarAccess.getAttributeFactRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeFact"


    // $ANTLR start "ruleAttributeFact"
    // InternalRules.g:312:1: ruleAttributeFact : ( ( rule__AttributeFact__Group__0 ) ) ;
    public final void ruleAttributeFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:316:2: ( ( ( rule__AttributeFact__Group__0 ) ) )
            // InternalRules.g:317:2: ( ( rule__AttributeFact__Group__0 ) )
            {
            // InternalRules.g:317:2: ( ( rule__AttributeFact__Group__0 ) )
            // InternalRules.g:318:3: ( rule__AttributeFact__Group__0 )
            {
             before(grammarAccess.getAttributeFactAccess().getGroup()); 
            // InternalRules.g:319:3: ( rule__AttributeFact__Group__0 )
            // InternalRules.g:319:4: rule__AttributeFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeFact"


    // $ANTLR start "entryRuleBinding"
    // InternalRules.g:328:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalRules.g:329:1: ( ruleBinding EOF )
            // InternalRules.g:330:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRules.g:337:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:341:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalRules.g:342:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalRules.g:342:2: ( ( rule__Binding__Group__0 ) )
            // InternalRules.g:343:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalRules.g:344:3: ( rule__Binding__Group__0 )
            // InternalRules.g:344:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:353:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalRules.g:354:1: ( ruleBind EOF )
            // InternalRules.g:355:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRules.g:362:1: ruleBind : ( ( rule__Bind__Alternatives ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:366:2: ( ( ( rule__Bind__Alternatives ) ) )
            // InternalRules.g:367:2: ( ( rule__Bind__Alternatives ) )
            {
            // InternalRules.g:367:2: ( ( rule__Bind__Alternatives ) )
            // InternalRules.g:368:3: ( rule__Bind__Alternatives )
            {
             before(grammarAccess.getBindAccess().getAlternatives()); 
            // InternalRules.g:369:3: ( rule__Bind__Alternatives )
            // InternalRules.g:369:4: rule__Bind__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:378:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:382:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalRules.g:383:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalRules.g:383:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalRules.g:384:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalRules.g:385:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalRules.g:385:4: rule__AccessibilityLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessibilityLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAccessibilityLevel"


    // $ANTLR start "ruleOperationType"
    // InternalRules.g:394:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:398:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalRules.g:399:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalRules.g:399:2: ( ( rule__OperationType__Alternatives ) )
            // InternalRules.g:400:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalRules.g:401:3: ( rule__OperationType__Alternatives )
            // InternalRules.g:401:4: rule__OperationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "ruleResolutionType"
    // InternalRules.g:410:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:414:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalRules.g:415:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalRules.g:415:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalRules.g:416:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalRules.g:417:3: ( rule__ResolutionType__Alternatives )
            // InternalRules.g:417:4: rule__ResolutionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResolutionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResolutionTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleResolutionType"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalRules.g:425:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:429:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRules.g:430:2: ( ruleUser )
                    {
                    // InternalRules.g:430:2: ( ruleUser )
                    // InternalRules.g:431:3: ruleUser
                    {
                     before(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:436:2: ( ruleGroup )
                    {
                    // InternalRules.g:436:2: ( ruleGroup )
                    // InternalRules.g:437:3: ruleGroup
                    {
                     before(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__RuleConstraint__Alternatives"
    // InternalRules.g:446:1: rule__RuleConstraint__Alternatives : ( ( ( rule__RuleConstraint__Group_0__0 ) ) | ( ( rule__RuleConstraint__Group_1__0 ) ) );
    public final void rule__RuleConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:450:1: ( ( ( rule__RuleConstraint__Group_0__0 ) ) | ( ( rule__RuleConstraint__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRules.g:451:2: ( ( rule__RuleConstraint__Group_0__0 ) )
                    {
                    // InternalRules.g:451:2: ( ( rule__RuleConstraint__Group_0__0 ) )
                    // InternalRules.g:452:3: ( rule__RuleConstraint__Group_0__0 )
                    {
                     before(grammarAccess.getRuleConstraintAccess().getGroup_0()); 
                    // InternalRules.g:453:3: ( rule__RuleConstraint__Group_0__0 )
                    // InternalRules.g:453:4: rule__RuleConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleConstraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:457:2: ( ( rule__RuleConstraint__Group_1__0 ) )
                    {
                    // InternalRules.g:457:2: ( ( rule__RuleConstraint__Group_1__0 ) )
                    // InternalRules.g:458:3: ( rule__RuleConstraint__Group_1__0 )
                    {
                     before(grammarAccess.getRuleConstraintAccess().getGroup_1()); 
                    // InternalRules.g:459:3: ( rule__RuleConstraint__Group_1__0 )
                    // InternalRules.g:459:4: rule__RuleConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleConstraint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleConstraintAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Asset__Alternatives"
    // InternalRules.g:467:1: rule__Asset__Alternatives : ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) );
    public final void rule__Asset__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:471:1: ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 41:
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
                    // InternalRules.g:472:2: ( ruleObjectFact )
                    {
                    // InternalRules.g:472:2: ( ruleObjectFact )
                    // InternalRules.g:473:3: ruleObjectFact
                    {
                     before(grammarAccess.getAssetAccess().getObjectFactParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectFact();

                    state._fsp--;

                     after(grammarAccess.getAssetAccess().getObjectFactParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:478:2: ( ruleReferenceFact )
                    {
                    // InternalRules.g:478:2: ( ruleReferenceFact )
                    // InternalRules.g:479:3: ruleReferenceFact
                    {
                     before(grammarAccess.getAssetAccess().getReferenceFactParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceFact();

                    state._fsp--;

                     after(grammarAccess.getAssetAccess().getReferenceFactParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:484:2: ( ruleAttributeFact )
                    {
                    // InternalRules.g:484:2: ( ruleAttributeFact )
                    // InternalRules.g:485:3: ruleAttributeFact
                    {
                     before(grammarAccess.getAssetAccess().getAttributeFactParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeFact();

                    state._fsp--;

                     after(grammarAccess.getAssetAccess().getAttributeFactParserRuleCall_2()); 

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
    // $ANTLR end "rule__Asset__Alternatives"


    // $ANTLR start "rule__Bind__Alternatives"
    // InternalRules.g:494:1: rule__Bind__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:498:1: ( ( RULE_STRING ) | ( RULE_INT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRules.g:499:2: ( RULE_STRING )
                    {
                    // InternalRules.g:499:2: ( RULE_STRING )
                    // InternalRules.g:500:3: RULE_STRING
                    {
                     before(grammarAccess.getBindAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:505:2: ( RULE_INT )
                    {
                    // InternalRules.g:505:2: ( RULE_INT )
                    // InternalRules.g:506:3: RULE_INT
                    {
                     before(grammarAccess.getBindAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getINTTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__AccessibilityLevel__Alternatives"
    // InternalRules.g:515:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'allow' ) ) | ( ( 'deny' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:519:1: ( ( ( 'allow' ) ) | ( ( 'deny' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRules.g:520:2: ( ( 'allow' ) )
                    {
                    // InternalRules.g:520:2: ( ( 'allow' ) )
                    // InternalRules.g:521:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 
                    // InternalRules.g:522:3: ( 'allow' )
                    // InternalRules.g:522:4: 'allow'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:526:2: ( ( 'deny' ) )
                    {
                    // InternalRules.g:526:2: ( ( 'deny' ) )
                    // InternalRules.g:527:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 
                    // InternalRules.g:528:3: ( 'deny' )
                    // InternalRules.g:528:4: 'deny'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AccessibilityLevel__Alternatives"


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalRules.g:536:1: rule__OperationType__Alternatives : ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:540:1: ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
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
                    // InternalRules.g:541:2: ( ( 'R' ) )
                    {
                    // InternalRules.g:541:2: ( ( 'R' ) )
                    // InternalRules.g:542:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 
                    // InternalRules.g:543:3: ( 'R' )
                    // InternalRules.g:543:4: 'R'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:547:2: ( ( 'W' ) )
                    {
                    // InternalRules.g:547:2: ( ( 'W' ) )
                    // InternalRules.g:548:3: ( 'W' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:549:3: ( 'W' )
                    // InternalRules.g:549:4: 'W'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:553:2: ( ( 'RW' ) )
                    {
                    // InternalRules.g:553:2: ( ( 'RW' ) )
                    // InternalRules.g:554:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_2()); 
                    // InternalRules.g:555:3: ( 'RW' )
                    // InternalRules.g:555:4: 'RW'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__OperationType__Alternatives"


    // $ANTLR start "rule__ResolutionType__Alternatives"
    // InternalRules.g:563:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:567:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRules.g:568:2: ( ( 'restrictive' ) )
                    {
                    // InternalRules.g:568:2: ( ( 'restrictive' ) )
                    // InternalRules.g:569:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalRules.g:570:3: ( 'restrictive' )
                    // InternalRules.g:570:4: 'restrictive'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:574:2: ( ( 'permissive' ) )
                    {
                    // InternalRules.g:574:2: ( ( 'permissive' ) )
                    // InternalRules.g:575:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:576:3: ( 'permissive' )
                    // InternalRules.g:576:4: 'permissive'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ResolutionType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalRules.g:584:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:588:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRules.g:589:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalRules.g:596:1: rule__Model__Group__0__Impl : ( ( rule__Model__RolesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:600:1: ( ( ( rule__Model__RolesAssignment_0 )* ) )
            // InternalRules.g:601:1: ( ( rule__Model__RolesAssignment_0 )* )
            {
            // InternalRules.g:601:1: ( ( rule__Model__RolesAssignment_0 )* )
            // InternalRules.g:602:2: ( rule__Model__RolesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getRolesAssignment_0()); 
            // InternalRules.g:603:2: ( rule__Model__RolesAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRules.g:603:3: rule__Model__RolesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RolesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRolesAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalRules.g:611:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:615:1: ( rule__Model__Group__1__Impl )
            // InternalRules.g:616:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalRules.g:622:1: rule__Model__Group__1__Impl : ( ( rule__Model__PolicyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:626:1: ( ( ( rule__Model__PolicyAssignment_1 ) ) )
            // InternalRules.g:627:1: ( ( rule__Model__PolicyAssignment_1 ) )
            {
            // InternalRules.g:627:1: ( ( rule__Model__PolicyAssignment_1 ) )
            // InternalRules.g:628:2: ( rule__Model__PolicyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPolicyAssignment_1()); 
            // InternalRules.g:629:2: ( rule__Model__PolicyAssignment_1 )
            // InternalRules.g:629:3: rule__Model__PolicyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PolicyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPolicyAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalRules.g:638:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:642:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalRules.g:643:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:650:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:654:1: ( ( 'user' ) )
            // InternalRules.g:655:1: ( 'user' )
            {
            // InternalRules.g:655:1: ( 'user' )
            // InternalRules.g:656:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRules.g:665:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:669:1: ( rule__User__Group__1__Impl )
            // InternalRules.g:670:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:676:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:680:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalRules.g:681:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalRules.g:681:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalRules.g:682:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalRules.g:683:2: ( rule__User__NameAssignment_1 )
            // InternalRules.g:683:3: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:692:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:696:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalRules.g:697:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:704:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:708:1: ( ( 'group' ) )
            // InternalRules.g:709:1: ( 'group' )
            {
            // InternalRules.g:709:1: ( 'group' )
            // InternalRules.g:710:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRules.g:719:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:723:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalRules.g:724:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:731:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:735:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalRules.g:736:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalRules.g:736:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalRules.g:737:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalRules.g:738:2: ( rule__Group__NameAssignment_1 )
            // InternalRules.g:738:3: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:746:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:750:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalRules.g:751:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:758:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:762:1: ( ( '{' ) )
            // InternalRules.g:763:1: ( '{' )
            {
            // InternalRules.g:763:1: ( '{' )
            // InternalRules.g:764:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRules.g:773:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:777:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalRules.g:778:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:785:1: rule__Group__Group__3__Impl : ( ( rule__Group__UsersAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:789:1: ( ( ( rule__Group__UsersAssignment_3 ) ) )
            // InternalRules.g:790:1: ( ( rule__Group__UsersAssignment_3 ) )
            {
            // InternalRules.g:790:1: ( ( rule__Group__UsersAssignment_3 ) )
            // InternalRules.g:791:2: ( rule__Group__UsersAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_3()); 
            // InternalRules.g:792:2: ( rule__Group__UsersAssignment_3 )
            // InternalRules.g:792:3: rule__Group__UsersAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:800:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:804:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalRules.g:805:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:812:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:816:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // InternalRules.g:817:1: ( ( rule__Group__Group_4__0 )* )
            {
            // InternalRules.g:817:1: ( ( rule__Group__Group_4__0 )* )
            // InternalRules.g:818:2: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // InternalRules.g:819:2: ( rule__Group__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRules.g:819:3: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRules.g:827:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:831:1: ( rule__Group__Group__5__Impl )
            // InternalRules.g:832:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:838:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:842:1: ( ( '}' ) )
            // InternalRules.g:843:1: ( '}' )
            {
            // InternalRules.g:843:1: ( '}' )
            // InternalRules.g:844:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRules.g:854:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:858:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // InternalRules.g:859:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:866:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:870:1: ( ( ',' ) )
            // InternalRules.g:871:1: ( ',' )
            {
            // InternalRules.g:871:1: ( ',' )
            // InternalRules.g:872:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRules.g:881:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:885:1: ( rule__Group__Group_4__1__Impl )
            // InternalRules.g:886:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:892:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__UsersAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:896:1: ( ( ( rule__Group__UsersAssignment_4_1 ) ) )
            // InternalRules.g:897:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            {
            // InternalRules.g:897:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            // InternalRules.g:898:2: ( rule__Group__UsersAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_4_1()); 
            // InternalRules.g:899:2: ( rule__Group__UsersAssignment_4_1 )
            // InternalRules.g:899:3: rule__Group__UsersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Policy__Group__0"
    // InternalRules.g:908:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:912:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalRules.g:913:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:920:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:924:1: ( ( 'policy' ) )
            // InternalRules.g:925:1: ( 'policy' )
            {
            // InternalRules.g:925:1: ( 'policy' )
            // InternalRules.g:926:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:935:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:939:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalRules.g:940:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:947:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:951:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalRules.g:952:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalRules.g:952:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalRules.g:953:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalRules.g:954:2: ( rule__Policy__NameAssignment_1 )
            // InternalRules.g:954:3: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:962:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:966:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalRules.g:967:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:974:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__AccessAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:978:1: ( ( ( rule__Policy__AccessAssignment_2 ) ) )
            // InternalRules.g:979:1: ( ( rule__Policy__AccessAssignment_2 ) )
            {
            // InternalRules.g:979:1: ( ( rule__Policy__AccessAssignment_2 ) )
            // InternalRules.g:980:2: ( rule__Policy__AccessAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 
            // InternalRules.g:981:2: ( rule__Policy__AccessAssignment_2 )
            // InternalRules.g:981:3: rule__Policy__AccessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Policy__AccessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 

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
    // InternalRules.g:989:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:993:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalRules.g:994:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1001:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__OperationAssignment_3 ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1005:1: ( ( ( rule__Policy__OperationAssignment_3 ) ) )
            // InternalRules.g:1006:1: ( ( rule__Policy__OperationAssignment_3 ) )
            {
            // InternalRules.g:1006:1: ( ( rule__Policy__OperationAssignment_3 ) )
            // InternalRules.g:1007:2: ( rule__Policy__OperationAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getOperationAssignment_3()); 
            // InternalRules.g:1008:2: ( rule__Policy__OperationAssignment_3 )
            // InternalRules.g:1008:3: rule__Policy__OperationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Policy__OperationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getOperationAssignment_3()); 

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
    // InternalRules.g:1016:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1020:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalRules.g:1021:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1028:1: rule__Policy__Group__4__Impl : ( 'by' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1032:1: ( ( 'by' ) )
            // InternalRules.g:1033:1: ( 'by' )
            {
            // InternalRules.g:1033:1: ( 'by' )
            // InternalRules.g:1034:2: 'by'
            {
             before(grammarAccess.getPolicyAccess().getByKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getByKeyword_4()); 

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
    // InternalRules.g:1043:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1047:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalRules.g:1048:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1055:1: rule__Policy__Group__5__Impl : ( 'default' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1059:1: ( ( 'default' ) )
            // InternalRules.g:1060:1: ( 'default' )
            {
            // InternalRules.g:1060:1: ( 'default' )
            // InternalRules.g:1061:2: 'default'
            {
             before(grammarAccess.getPolicyAccess().getDefaultKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getDefaultKeyword_5()); 

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
    // InternalRules.g:1070:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1074:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalRules.g:1075:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Policy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1082:1: rule__Policy__Group__6__Impl : ( '{' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1086:1: ( ( '{' ) )
            // InternalRules.g:1087:1: ( '{' )
            {
            // InternalRules.g:1087:1: ( '{' )
            // InternalRules.g:1088:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6()); 

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
    // InternalRules.g:1097:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1101:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalRules.g:1102:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Policy__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__8();

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
    // InternalRules.g:1109:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__RulesAssignment_7 )* ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1113:1: ( ( ( rule__Policy__RulesAssignment_7 )* ) )
            // InternalRules.g:1114:1: ( ( rule__Policy__RulesAssignment_7 )* )
            {
            // InternalRules.g:1114:1: ( ( rule__Policy__RulesAssignment_7 )* )
            // InternalRules.g:1115:2: ( rule__Policy__RulesAssignment_7 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_7()); 
            // InternalRules.g:1116:2: ( rule__Policy__RulesAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRules.g:1116:3: rule__Policy__RulesAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Policy__RulesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_7()); 

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


    // $ANTLR start "rule__Policy__Group__8"
    // InternalRules.g:1124:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl rule__Policy__Group__9 ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1128:1: ( rule__Policy__Group__8__Impl rule__Policy__Group__9 )
            // InternalRules.g:1129:2: rule__Policy__Group__8__Impl rule__Policy__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Policy__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__9();

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
    // $ANTLR end "rule__Policy__Group__8"


    // $ANTLR start "rule__Policy__Group__8__Impl"
    // InternalRules.g:1136:1: rule__Policy__Group__8__Impl : ( '}' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1140:1: ( ( '}' ) )
            // InternalRules.g:1141:1: ( '}' )
            {
            // InternalRules.g:1141:1: ( '}' )
            // InternalRules.g:1142:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Policy__Group__8__Impl"


    // $ANTLR start "rule__Policy__Group__9"
    // InternalRules.g:1151:1: rule__Policy__Group__9 : rule__Policy__Group__9__Impl rule__Policy__Group__10 ;
    public final void rule__Policy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1155:1: ( rule__Policy__Group__9__Impl rule__Policy__Group__10 )
            // InternalRules.g:1156:2: rule__Policy__Group__9__Impl rule__Policy__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Policy__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__10();

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
    // $ANTLR end "rule__Policy__Group__9"


    // $ANTLR start "rule__Policy__Group__9__Impl"
    // InternalRules.g:1163:1: rule__Policy__Group__9__Impl : ( 'with' ) ;
    public final void rule__Policy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1167:1: ( ( 'with' ) )
            // InternalRules.g:1168:1: ( 'with' )
            {
            // InternalRules.g:1168:1: ( 'with' )
            // InternalRules.g:1169:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getWithKeyword_9()); 

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
    // $ANTLR end "rule__Policy__Group__9__Impl"


    // $ANTLR start "rule__Policy__Group__10"
    // InternalRules.g:1178:1: rule__Policy__Group__10 : rule__Policy__Group__10__Impl rule__Policy__Group__11 ;
    public final void rule__Policy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1182:1: ( rule__Policy__Group__10__Impl rule__Policy__Group__11 )
            // InternalRules.g:1183:2: rule__Policy__Group__10__Impl rule__Policy__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__Policy__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__11();

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
    // $ANTLR end "rule__Policy__Group__10"


    // $ANTLR start "rule__Policy__Group__10__Impl"
    // InternalRules.g:1190:1: rule__Policy__Group__10__Impl : ( ( rule__Policy__ResolutionAssignment_10 ) ) ;
    public final void rule__Policy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1194:1: ( ( ( rule__Policy__ResolutionAssignment_10 ) ) )
            // InternalRules.g:1195:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            {
            // InternalRules.g:1195:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            // InternalRules.g:1196:2: ( rule__Policy__ResolutionAssignment_10 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_10()); 
            // InternalRules.g:1197:2: ( rule__Policy__ResolutionAssignment_10 )
            // InternalRules.g:1197:3: rule__Policy__ResolutionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ResolutionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getResolutionAssignment_10()); 

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
    // $ANTLR end "rule__Policy__Group__10__Impl"


    // $ANTLR start "rule__Policy__Group__11"
    // InternalRules.g:1205:1: rule__Policy__Group__11 : rule__Policy__Group__11__Impl ;
    public final void rule__Policy__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1209:1: ( rule__Policy__Group__11__Impl )
            // InternalRules.g:1210:2: rule__Policy__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__11__Impl();

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
    // $ANTLR end "rule__Policy__Group__11"


    // $ANTLR start "rule__Policy__Group__11__Impl"
    // InternalRules.g:1216:1: rule__Policy__Group__11__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1220:1: ( ( 'resolution' ) )
            // InternalRules.g:1221:1: ( 'resolution' )
            {
            // InternalRules.g:1221:1: ( 'resolution' )
            // InternalRules.g:1222:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getResolutionKeyword_11()); 

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
    // $ANTLR end "rule__Policy__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRules.g:1232:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1236:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRules.g:1237:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1244:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1248:1: ( ( 'rule' ) )
            // InternalRules.g:1249:1: ( 'rule' )
            {
            // InternalRules.g:1249:1: ( 'rule' )
            // InternalRules.g:1250:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRules.g:1259:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1263:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRules.g:1264:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1271:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1275:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalRules.g:1276:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalRules.g:1276:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalRules.g:1277:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalRules.g:1278:2: ( rule__Rule__NameAssignment_1 )
            // InternalRules.g:1278:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1286:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1290:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRules.g:1291:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1298:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ConstraintAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1302:1: ( ( ( rule__Rule__ConstraintAssignment_2 ) ) )
            // InternalRules.g:1303:1: ( ( rule__Rule__ConstraintAssignment_2 ) )
            {
            // InternalRules.g:1303:1: ( ( rule__Rule__ConstraintAssignment_2 ) )
            // InternalRules.g:1304:2: ( rule__Rule__ConstraintAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getConstraintAssignment_2()); 
            // InternalRules.g:1305:2: ( rule__Rule__ConstraintAssignment_2 )
            // InternalRules.g:1305:3: rule__Rule__ConstraintAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConstraintAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConstraintAssignment_2()); 

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
    // InternalRules.g:1313:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1317:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRules.g:1318:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1325:1: rule__Rule__Group__3__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1329:1: ( ( 'to' ) )
            // InternalRules.g:1330:1: ( 'to' )
            {
            // InternalRules.g:1330:1: ( 'to' )
            // InternalRules.g:1331:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRules.g:1340:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1344:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRules.g:1345:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1352:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__RolesAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1356:1: ( ( ( rule__Rule__RolesAssignment_4 ) ) )
            // InternalRules.g:1357:1: ( ( rule__Rule__RolesAssignment_4 ) )
            {
            // InternalRules.g:1357:1: ( ( rule__Rule__RolesAssignment_4 ) )
            // InternalRules.g:1358:2: ( rule__Rule__RolesAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_4()); 
            // InternalRules.g:1359:2: ( rule__Rule__RolesAssignment_4 )
            // InternalRules.g:1359:3: rule__Rule__RolesAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1367:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1371:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalRules.g:1372:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1379:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )* ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1383:1: ( ( ( rule__Rule__Group_5__0 )* ) )
            // InternalRules.g:1384:1: ( ( rule__Rule__Group_5__0 )* )
            {
            // InternalRules.g:1384:1: ( ( rule__Rule__Group_5__0 )* )
            // InternalRules.g:1385:2: ( rule__Rule__Group_5__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // InternalRules.g:1386:2: ( rule__Rule__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRules.g:1386:3: rule__Rule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Rule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRules.g:1394:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1398:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalRules.g:1399:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1406:1: rule__Rule__Group__6__Impl : ( '{' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1410:1: ( ( '{' ) )
            // InternalRules.g:1411:1: ( '{' )
            {
            // InternalRules.g:1411:1: ( '{' )
            // InternalRules.g:1412:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRules.g:1421:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1425:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalRules.g:1426:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1433:1: rule__Rule__Group__7__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1437:1: ( ( 'from' ) )
            // InternalRules.g:1438:1: ( 'from' )
            {
            // InternalRules.g:1438:1: ( 'from' )
            // InternalRules.g:1439:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_7()); 

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
    // InternalRules.g:1448:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1452:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalRules.g:1453:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1460:1: rule__Rule__Group__8__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1464:1: ( ( 'query' ) )
            // InternalRules.g:1465:1: ( 'query' )
            {
            // InternalRules.g:1465:1: ( 'query' )
            // InternalRules.g:1466:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_8()); 

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
    // InternalRules.g:1475:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1479:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalRules.g:1480:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1487:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__PatternAssignment_9 ) ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1491:1: ( ( ( rule__Rule__PatternAssignment_9 ) ) )
            // InternalRules.g:1492:1: ( ( rule__Rule__PatternAssignment_9 ) )
            {
            // InternalRules.g:1492:1: ( ( rule__Rule__PatternAssignment_9 ) )
            // InternalRules.g:1493:2: ( rule__Rule__PatternAssignment_9 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_9()); 
            // InternalRules.g:1494:2: ( rule__Rule__PatternAssignment_9 )
            // InternalRules.g:1494:3: rule__Rule__PatternAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PatternAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPatternAssignment_9()); 

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
    // InternalRules.g:1502:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1506:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalRules.g:1507:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__Rule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1514:1: rule__Rule__Group__10__Impl : ( 'select' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1518:1: ( ( 'select' ) )
            // InternalRules.g:1519:1: ( 'select' )
            {
            // InternalRules.g:1519:1: ( 'select' )
            // InternalRules.g:1520:2: 'select'
            {
             before(grammarAccess.getRuleAccess().getSelectKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSelectKeyword_10()); 

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
    // InternalRules.g:1529:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1533:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalRules.g:1534:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
            {
            pushFollow(FOLLOW_26);
            rule__Rule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__12();

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
    // InternalRules.g:1541:1: rule__Rule__Group__11__Impl : ( ( rule__Rule__AssetAssignment_11 ) ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1545:1: ( ( ( rule__Rule__AssetAssignment_11 ) ) )
            // InternalRules.g:1546:1: ( ( rule__Rule__AssetAssignment_11 ) )
            {
            // InternalRules.g:1546:1: ( ( rule__Rule__AssetAssignment_11 ) )
            // InternalRules.g:1547:2: ( rule__Rule__AssetAssignment_11 )
            {
             before(grammarAccess.getRuleAccess().getAssetAssignment_11()); 
            // InternalRules.g:1548:2: ( rule__Rule__AssetAssignment_11 )
            // InternalRules.g:1548:3: rule__Rule__AssetAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AssetAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAssetAssignment_11()); 

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


    // $ANTLR start "rule__Rule__Group__12"
    // InternalRules.g:1556:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl rule__Rule__Group__13 ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1560:1: ( rule__Rule__Group__12__Impl rule__Rule__Group__13 )
            // InternalRules.g:1561:2: rule__Rule__Group__12__Impl rule__Rule__Group__13
            {
            pushFollow(FOLLOW_26);
            rule__Rule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__13();

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
    // $ANTLR end "rule__Rule__Group__12"


    // $ANTLR start "rule__Rule__Group__12__Impl"
    // InternalRules.g:1568:1: rule__Rule__Group__12__Impl : ( ( rule__Rule__BindingsAssignment_12 )* ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1572:1: ( ( ( rule__Rule__BindingsAssignment_12 )* ) )
            // InternalRules.g:1573:1: ( ( rule__Rule__BindingsAssignment_12 )* )
            {
            // InternalRules.g:1573:1: ( ( rule__Rule__BindingsAssignment_12 )* )
            // InternalRules.g:1574:2: ( rule__Rule__BindingsAssignment_12 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_12()); 
            // InternalRules.g:1575:2: ( rule__Rule__BindingsAssignment_12 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRules.g:1575:3: rule__Rule__BindingsAssignment_12
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Rule__BindingsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBindingsAssignment_12()); 

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
    // $ANTLR end "rule__Rule__Group__12__Impl"


    // $ANTLR start "rule__Rule__Group__13"
    // InternalRules.g:1583:1: rule__Rule__Group__13 : rule__Rule__Group__13__Impl rule__Rule__Group__14 ;
    public final void rule__Rule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1587:1: ( rule__Rule__Group__13__Impl rule__Rule__Group__14 )
            // InternalRules.g:1588:2: rule__Rule__Group__13__Impl rule__Rule__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__14();

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
    // $ANTLR end "rule__Rule__Group__13"


    // $ANTLR start "rule__Rule__Group__13__Impl"
    // InternalRules.g:1595:1: rule__Rule__Group__13__Impl : ( '}' ) ;
    public final void rule__Rule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1599:1: ( ( '}' ) )
            // InternalRules.g:1600:1: ( '}' )
            {
            // InternalRules.g:1600:1: ( '}' )
            // InternalRules.g:1601:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Rule__Group__13__Impl"


    // $ANTLR start "rule__Rule__Group__14"
    // InternalRules.g:1610:1: rule__Rule__Group__14 : rule__Rule__Group__14__Impl ;
    public final void rule__Rule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1614:1: ( rule__Rule__Group__14__Impl )
            // InternalRules.g:1615:2: rule__Rule__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__14__Impl();

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
    // $ANTLR end "rule__Rule__Group__14"


    // $ANTLR start "rule__Rule__Group__14__Impl"
    // InternalRules.g:1621:1: rule__Rule__Group__14__Impl : ( ( rule__Rule__Group_14__0 )? ) ;
    public final void rule__Rule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1625:1: ( ( ( rule__Rule__Group_14__0 )? ) )
            // InternalRules.g:1626:1: ( ( rule__Rule__Group_14__0 )? )
            {
            // InternalRules.g:1626:1: ( ( rule__Rule__Group_14__0 )? )
            // InternalRules.g:1627:2: ( rule__Rule__Group_14__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_14()); 
            // InternalRules.g:1628:2: ( rule__Rule__Group_14__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRules.g:1628:3: rule__Rule__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_14()); 

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
    // $ANTLR end "rule__Rule__Group__14__Impl"


    // $ANTLR start "rule__Rule__Group_5__0"
    // InternalRules.g:1637:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1641:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalRules.g:1642:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1649:1: rule__Rule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1653:1: ( ( ',' ) )
            // InternalRules.g:1654:1: ( ',' )
            {
            // InternalRules.g:1654:1: ( ',' )
            // InternalRules.g:1655:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRules.g:1664:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1668:1: ( rule__Rule__Group_5__1__Impl )
            // InternalRules.g:1669:2: rule__Rule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1675:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__RolesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1679:1: ( ( ( rule__Rule__RolesAssignment_5_1 ) ) )
            // InternalRules.g:1680:1: ( ( rule__Rule__RolesAssignment_5_1 ) )
            {
            // InternalRules.g:1680:1: ( ( rule__Rule__RolesAssignment_5_1 ) )
            // InternalRules.g:1681:2: ( rule__Rule__RolesAssignment_5_1 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_5_1()); 
            // InternalRules.g:1682:2: ( rule__Rule__RolesAssignment_5_1 )
            // InternalRules.g:1682:3: rule__Rule__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Rule__Group_14__0"
    // InternalRules.g:1691:1: rule__Rule__Group_14__0 : rule__Rule__Group_14__0__Impl rule__Rule__Group_14__1 ;
    public final void rule__Rule__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1695:1: ( rule__Rule__Group_14__0__Impl rule__Rule__Group_14__1 )
            // InternalRules.g:1696:2: rule__Rule__Group_14__0__Impl rule__Rule__Group_14__1
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_14__1();

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
    // $ANTLR end "rule__Rule__Group_14__0"


    // $ANTLR start "rule__Rule__Group_14__0__Impl"
    // InternalRules.g:1703:1: rule__Rule__Group_14__0__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1707:1: ( ( 'with' ) )
            // InternalRules.g:1708:1: ( 'with' )
            {
            // InternalRules.g:1708:1: ( 'with' )
            // InternalRules.g:1709:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_14_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_14_0()); 

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
    // $ANTLR end "rule__Rule__Group_14__0__Impl"


    // $ANTLR start "rule__Rule__Group_14__1"
    // InternalRules.g:1718:1: rule__Rule__Group_14__1 : rule__Rule__Group_14__1__Impl rule__Rule__Group_14__2 ;
    public final void rule__Rule__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1722:1: ( rule__Rule__Group_14__1__Impl rule__Rule__Group_14__2 )
            // InternalRules.g:1723:2: rule__Rule__Group_14__1__Impl rule__Rule__Group_14__2
            {
            pushFollow(FOLLOW_29);
            rule__Rule__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_14__2();

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
    // $ANTLR end "rule__Rule__Group_14__1"


    // $ANTLR start "rule__Rule__Group_14__1__Impl"
    // InternalRules.g:1730:1: rule__Rule__Group_14__1__Impl : ( ( rule__Rule__PriorityAssignment_14_1 ) ) ;
    public final void rule__Rule__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1734:1: ( ( ( rule__Rule__PriorityAssignment_14_1 ) ) )
            // InternalRules.g:1735:1: ( ( rule__Rule__PriorityAssignment_14_1 ) )
            {
            // InternalRules.g:1735:1: ( ( rule__Rule__PriorityAssignment_14_1 ) )
            // InternalRules.g:1736:2: ( rule__Rule__PriorityAssignment_14_1 )
            {
             before(grammarAccess.getRuleAccess().getPriorityAssignment_14_1()); 
            // InternalRules.g:1737:2: ( rule__Rule__PriorityAssignment_14_1 )
            // InternalRules.g:1737:3: rule__Rule__PriorityAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PriorityAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPriorityAssignment_14_1()); 

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
    // $ANTLR end "rule__Rule__Group_14__1__Impl"


    // $ANTLR start "rule__Rule__Group_14__2"
    // InternalRules.g:1745:1: rule__Rule__Group_14__2 : rule__Rule__Group_14__2__Impl ;
    public final void rule__Rule__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1749:1: ( rule__Rule__Group_14__2__Impl )
            // InternalRules.g:1750:2: rule__Rule__Group_14__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_14__2__Impl();

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
    // $ANTLR end "rule__Rule__Group_14__2"


    // $ANTLR start "rule__Rule__Group_14__2__Impl"
    // InternalRules.g:1756:1: rule__Rule__Group_14__2__Impl : ( 'priority' ) ;
    public final void rule__Rule__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1760:1: ( ( 'priority' ) )
            // InternalRules.g:1761:1: ( 'priority' )
            {
            // InternalRules.g:1761:1: ( 'priority' )
            // InternalRules.g:1762:2: 'priority'
            {
             before(grammarAccess.getRuleAccess().getPriorityKeyword_14_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityKeyword_14_2()); 

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
    // $ANTLR end "rule__Rule__Group_14__2__Impl"


    // $ANTLR start "rule__RuleConstraint__Group_0__0"
    // InternalRules.g:1772:1: rule__RuleConstraint__Group_0__0 : rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1 ;
    public final void rule__RuleConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1776:1: ( rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1 )
            // InternalRules.g:1777:2: rule__RuleConstraint__Group_0__0__Impl rule__RuleConstraint__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__RuleConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1784:1: rule__RuleConstraint__Group_0__0__Impl : ( ( rule__RuleConstraint__AccessAssignment_0_0 ) ) ;
    public final void rule__RuleConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1788:1: ( ( ( rule__RuleConstraint__AccessAssignment_0_0 ) ) )
            // InternalRules.g:1789:1: ( ( rule__RuleConstraint__AccessAssignment_0_0 ) )
            {
            // InternalRules.g:1789:1: ( ( rule__RuleConstraint__AccessAssignment_0_0 ) )
            // InternalRules.g:1790:2: ( rule__RuleConstraint__AccessAssignment_0_0 )
            {
             before(grammarAccess.getRuleConstraintAccess().getAccessAssignment_0_0()); 
            // InternalRules.g:1791:2: ( rule__RuleConstraint__AccessAssignment_0_0 )
            // InternalRules.g:1791:3: rule__RuleConstraint__AccessAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleConstraint__AccessAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleConstraintAccess().getAccessAssignment_0_0()); 

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
    // InternalRules.g:1799:1: rule__RuleConstraint__Group_0__1 : rule__RuleConstraint__Group_0__1__Impl ;
    public final void rule__RuleConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1803:1: ( rule__RuleConstraint__Group_0__1__Impl )
            // InternalRules.g:1804:2: rule__RuleConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRules.g:1810:1: rule__RuleConstraint__Group_0__1__Impl : ( ( rule__RuleConstraint__OperationAssignment_0_1 ) ) ;
    public final void rule__RuleConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1814:1: ( ( ( rule__RuleConstraint__OperationAssignment_0_1 ) ) )
            // InternalRules.g:1815:1: ( ( rule__RuleConstraint__OperationAssignment_0_1 ) )
            {
            // InternalRules.g:1815:1: ( ( rule__RuleConstraint__OperationAssignment_0_1 ) )
            // InternalRules.g:1816:2: ( rule__RuleConstraint__OperationAssignment_0_1 )
            {
             before(grammarAccess.getRuleConstraintAccess().getOperationAssignment_0_1()); 
            // InternalRules.g:1817:2: ( rule__RuleConstraint__OperationAssignment_0_1 )
            // InternalRules.g:1817:3: rule__RuleConstraint__OperationAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleConstraint__OperationAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleConstraintAccess().getOperationAssignment_0_1()); 

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


    // $ANTLR start "rule__RuleConstraint__Group_1__0"
    // InternalRules.g:1826:1: rule__RuleConstraint__Group_1__0 : rule__RuleConstraint__Group_1__0__Impl rule__RuleConstraint__Group_1__1 ;
    public final void rule__RuleConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1830:1: ( rule__RuleConstraint__Group_1__0__Impl rule__RuleConstraint__Group_1__1 )
            // InternalRules.g:1831:2: rule__RuleConstraint__Group_1__0__Impl rule__RuleConstraint__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__RuleConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConstraint__Group_1__1();

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
    // $ANTLR end "rule__RuleConstraint__Group_1__0"


    // $ANTLR start "rule__RuleConstraint__Group_1__0__Impl"
    // InternalRules.g:1838:1: rule__RuleConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__RuleConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1842:1: ( ( () ) )
            // InternalRules.g:1843:1: ( () )
            {
            // InternalRules.g:1843:1: ( () )
            // InternalRules.g:1844:2: ()
            {
             before(grammarAccess.getRuleConstraintAccess().getRuleConstraintAction_1_0()); 
            // InternalRules.g:1845:2: ()
            // InternalRules.g:1845:3: 
            {
            }

             after(grammarAccess.getRuleConstraintAccess().getRuleConstraintAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__RuleConstraint__Group_1__1"
    // InternalRules.g:1853:1: rule__RuleConstraint__Group_1__1 : rule__RuleConstraint__Group_1__1__Impl ;
    public final void rule__RuleConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1857:1: ( rule__RuleConstraint__Group_1__1__Impl )
            // InternalRules.g:1858:2: rule__RuleConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleConstraint__Group_1__1__Impl();

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
    // $ANTLR end "rule__RuleConstraint__Group_1__1"


    // $ANTLR start "rule__RuleConstraint__Group_1__1__Impl"
    // InternalRules.g:1864:1: rule__RuleConstraint__Group_1__1__Impl : ( 'obfuscate' ) ;
    public final void rule__RuleConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1868:1: ( ( 'obfuscate' ) )
            // InternalRules.g:1869:1: ( 'obfuscate' )
            {
            // InternalRules.g:1869:1: ( 'obfuscate' )
            // InternalRules.g:1870:2: 'obfuscate'
            {
             before(grammarAccess.getRuleConstraintAccess().getObfuscateKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleConstraintAccess().getObfuscateKeyword_1_1()); 

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
    // $ANTLR end "rule__RuleConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__ObjectFact__Group__0"
    // InternalRules.g:1880:1: rule__ObjectFact__Group__0 : rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 ;
    public final void rule__ObjectFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1884:1: ( rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 )
            // InternalRules.g:1885:2: rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ObjectFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__1();

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
    // $ANTLR end "rule__ObjectFact__Group__0"


    // $ANTLR start "rule__ObjectFact__Group__0__Impl"
    // InternalRules.g:1892:1: rule__ObjectFact__Group__0__Impl : ( 'obj' ) ;
    public final void rule__ObjectFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1896:1: ( ( 'obj' ) )
            // InternalRules.g:1897:1: ( 'obj' )
            {
            // InternalRules.g:1897:1: ( 'obj' )
            // InternalRules.g:1898:2: 'obj'
            {
             before(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 

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
    // $ANTLR end "rule__ObjectFact__Group__0__Impl"


    // $ANTLR start "rule__ObjectFact__Group__1"
    // InternalRules.g:1907:1: rule__ObjectFact__Group__1 : rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 ;
    public final void rule__ObjectFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1911:1: ( rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 )
            // InternalRules.g:1912:2: rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ObjectFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__2();

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
    // $ANTLR end "rule__ObjectFact__Group__1"


    // $ANTLR start "rule__ObjectFact__Group__1__Impl"
    // InternalRules.g:1919:1: rule__ObjectFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ObjectFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1923:1: ( ( '(' ) )
            // InternalRules.g:1924:1: ( '(' )
            {
            // InternalRules.g:1924:1: ( '(' )
            // InternalRules.g:1925:2: '('
            {
             before(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ObjectFact__Group__1__Impl"


    // $ANTLR start "rule__ObjectFact__Group__2"
    // InternalRules.g:1934:1: rule__ObjectFact__Group__2 : rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 ;
    public final void rule__ObjectFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1938:1: ( rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 )
            // InternalRules.g:1939:2: rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ObjectFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__3();

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
    // $ANTLR end "rule__ObjectFact__Group__2"


    // $ANTLR start "rule__ObjectFact__Group__2__Impl"
    // InternalRules.g:1946:1: rule__ObjectFact__Group__2__Impl : ( ( rule__ObjectFact__VariableAssignment_2 ) ) ;
    public final void rule__ObjectFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1950:1: ( ( ( rule__ObjectFact__VariableAssignment_2 ) ) )
            // InternalRules.g:1951:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            {
            // InternalRules.g:1951:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            // InternalRules.g:1952:2: ( rule__ObjectFact__VariableAssignment_2 )
            {
             before(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 
            // InternalRules.g:1953:2: ( rule__ObjectFact__VariableAssignment_2 )
            // InternalRules.g:1953:3: rule__ObjectFact__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 

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
    // $ANTLR end "rule__ObjectFact__Group__2__Impl"


    // $ANTLR start "rule__ObjectFact__Group__3"
    // InternalRules.g:1961:1: rule__ObjectFact__Group__3 : rule__ObjectFact__Group__3__Impl ;
    public final void rule__ObjectFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1965:1: ( rule__ObjectFact__Group__3__Impl )
            // InternalRules.g:1966:2: rule__ObjectFact__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__3__Impl();

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
    // $ANTLR end "rule__ObjectFact__Group__3"


    // $ANTLR start "rule__ObjectFact__Group__3__Impl"
    // InternalRules.g:1972:1: rule__ObjectFact__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1976:1: ( ( ')' ) )
            // InternalRules.g:1977:1: ( ')' )
            {
            // InternalRules.g:1977:1: ( ')' )
            // InternalRules.g:1978:2: ')'
            {
             before(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ObjectFact__Group__3__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__0"
    // InternalRules.g:1988:1: rule__ReferenceFact__Group__0 : rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 ;
    public final void rule__ReferenceFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1992:1: ( rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 )
            // InternalRules.g:1993:2: rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ReferenceFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__1();

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
    // $ANTLR end "rule__ReferenceFact__Group__0"


    // $ANTLR start "rule__ReferenceFact__Group__0__Impl"
    // InternalRules.g:2000:1: rule__ReferenceFact__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2004:1: ( ( 'ref' ) )
            // InternalRules.g:2005:1: ( 'ref' )
            {
            // InternalRules.g:2005:1: ( 'ref' )
            // InternalRules.g:2006:2: 'ref'
            {
             before(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__0__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__1"
    // InternalRules.g:2015:1: rule__ReferenceFact__Group__1 : rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 ;
    public final void rule__ReferenceFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2019:1: ( rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 )
            // InternalRules.g:2020:2: rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__2();

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
    // $ANTLR end "rule__ReferenceFact__Group__1"


    // $ANTLR start "rule__ReferenceFact__Group__1__Impl"
    // InternalRules.g:2027:1: rule__ReferenceFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ReferenceFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2031:1: ( ( '(' ) )
            // InternalRules.g:2032:1: ( '(' )
            {
            // InternalRules.g:2032:1: ( '(' )
            // InternalRules.g:2033:2: '('
            {
             before(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__1__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__2"
    // InternalRules.g:2042:1: rule__ReferenceFact__Group__2 : rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 ;
    public final void rule__ReferenceFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2046:1: ( rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 )
            // InternalRules.g:2047:2: rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ReferenceFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__3();

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
    // $ANTLR end "rule__ReferenceFact__Group__2"


    // $ANTLR start "rule__ReferenceFact__Group__2__Impl"
    // InternalRules.g:2054:1: rule__ReferenceFact__Group__2__Impl : ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) ;
    public final void rule__ReferenceFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2058:1: ( ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) )
            // InternalRules.g:2059:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            {
            // InternalRules.g:2059:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            // InternalRules.g:2060:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 
            // InternalRules.g:2061:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            // InternalRules.g:2061:3: rule__ReferenceFact__SourceVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__SourceVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__2__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__3"
    // InternalRules.g:2069:1: rule__ReferenceFact__Group__3 : rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 ;
    public final void rule__ReferenceFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2073:1: ( rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 )
            // InternalRules.g:2074:2: rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceFact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__4();

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
    // $ANTLR end "rule__ReferenceFact__Group__3"


    // $ANTLR start "rule__ReferenceFact__Group__3__Impl"
    // InternalRules.g:2081:1: rule__ReferenceFact__Group__3__Impl : ( '->' ) ;
    public final void rule__ReferenceFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2085:1: ( ( '->' ) )
            // InternalRules.g:2086:1: ( '->' )
            {
            // InternalRules.g:2086:1: ( '->' )
            // InternalRules.g:2087:2: '->'
            {
             before(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__3__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__4"
    // InternalRules.g:2096:1: rule__ReferenceFact__Group__4 : rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 ;
    public final void rule__ReferenceFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2100:1: ( rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 )
            // InternalRules.g:2101:2: rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__ReferenceFact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__5();

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
    // $ANTLR end "rule__ReferenceFact__Group__4"


    // $ANTLR start "rule__ReferenceFact__Group__4__Impl"
    // InternalRules.g:2108:1: rule__ReferenceFact__Group__4__Impl : ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) ;
    public final void rule__ReferenceFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2112:1: ( ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) )
            // InternalRules.g:2113:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            {
            // InternalRules.g:2113:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            // InternalRules.g:2114:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 
            // InternalRules.g:2115:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            // InternalRules.g:2115:3: rule__ReferenceFact__TargetVarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__TargetVarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__4__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__5"
    // InternalRules.g:2123:1: rule__ReferenceFact__Group__5 : rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 ;
    public final void rule__ReferenceFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2127:1: ( rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 )
            // InternalRules.g:2128:2: rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceFact__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__6();

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
    // $ANTLR end "rule__ReferenceFact__Group__5"


    // $ANTLR start "rule__ReferenceFact__Group__5__Impl"
    // InternalRules.g:2135:1: rule__ReferenceFact__Group__5__Impl : ( ':' ) ;
    public final void rule__ReferenceFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2139:1: ( ( ':' ) )
            // InternalRules.g:2140:1: ( ':' )
            {
            // InternalRules.g:2140:1: ( ':' )
            // InternalRules.g:2141:2: ':'
            {
             before(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__5__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__6"
    // InternalRules.g:2150:1: rule__ReferenceFact__Group__6 : rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 ;
    public final void rule__ReferenceFact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2154:1: ( rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 )
            // InternalRules.g:2155:2: rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__ReferenceFact__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__7();

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
    // $ANTLR end "rule__ReferenceFact__Group__6"


    // $ANTLR start "rule__ReferenceFact__Group__6__Impl"
    // InternalRules.g:2162:1: rule__ReferenceFact__Group__6__Impl : ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) ;
    public final void rule__ReferenceFact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2166:1: ( ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) )
            // InternalRules.g:2167:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            {
            // InternalRules.g:2167:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            // InternalRules.g:2168:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 
            // InternalRules.g:2169:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            // InternalRules.g:2169:3: rule__ReferenceFact__ReferenceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__ReferenceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__6__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__7"
    // InternalRules.g:2177:1: rule__ReferenceFact__Group__7 : rule__ReferenceFact__Group__7__Impl ;
    public final void rule__ReferenceFact__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2181:1: ( rule__ReferenceFact__Group__7__Impl )
            // InternalRules.g:2182:2: rule__ReferenceFact__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__7__Impl();

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
    // $ANTLR end "rule__ReferenceFact__Group__7"


    // $ANTLR start "rule__ReferenceFact__Group__7__Impl"
    // InternalRules.g:2188:1: rule__ReferenceFact__Group__7__Impl : ( ')' ) ;
    public final void rule__ReferenceFact__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2192:1: ( ( ')' ) )
            // InternalRules.g:2193:1: ( ')' )
            {
            // InternalRules.g:2193:1: ( ')' )
            // InternalRules.g:2194:2: ')'
            {
             before(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__7__Impl"


    // $ANTLR start "rule__AttributeFact__Group__0"
    // InternalRules.g:2204:1: rule__AttributeFact__Group__0 : rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 ;
    public final void rule__AttributeFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2208:1: ( rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 )
            // InternalRules.g:2209:2: rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__AttributeFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__1();

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
    // $ANTLR end "rule__AttributeFact__Group__0"


    // $ANTLR start "rule__AttributeFact__Group__0__Impl"
    // InternalRules.g:2216:1: rule__AttributeFact__Group__0__Impl : ( 'attr' ) ;
    public final void rule__AttributeFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2220:1: ( ( 'attr' ) )
            // InternalRules.g:2221:1: ( 'attr' )
            {
            // InternalRules.g:2221:1: ( 'attr' )
            // InternalRules.g:2222:2: 'attr'
            {
             before(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 

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
    // $ANTLR end "rule__AttributeFact__Group__0__Impl"


    // $ANTLR start "rule__AttributeFact__Group__1"
    // InternalRules.g:2231:1: rule__AttributeFact__Group__1 : rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 ;
    public final void rule__AttributeFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2235:1: ( rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 )
            // InternalRules.g:2236:2: rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AttributeFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__2();

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
    // $ANTLR end "rule__AttributeFact__Group__1"


    // $ANTLR start "rule__AttributeFact__Group__1__Impl"
    // InternalRules.g:2243:1: rule__AttributeFact__Group__1__Impl : ( '(' ) ;
    public final void rule__AttributeFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2247:1: ( ( '(' ) )
            // InternalRules.g:2248:1: ( '(' )
            {
            // InternalRules.g:2248:1: ( '(' )
            // InternalRules.g:2249:2: '('
            {
             before(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AttributeFact__Group__1__Impl"


    // $ANTLR start "rule__AttributeFact__Group__2"
    // InternalRules.g:2258:1: rule__AttributeFact__Group__2 : rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 ;
    public final void rule__AttributeFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2262:1: ( rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 )
            // InternalRules.g:2263:2: rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__AttributeFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__3();

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
    // $ANTLR end "rule__AttributeFact__Group__2"


    // $ANTLR start "rule__AttributeFact__Group__2__Impl"
    // InternalRules.g:2270:1: rule__AttributeFact__Group__2__Impl : ( ( rule__AttributeFact__VariableAssignment_2 ) ) ;
    public final void rule__AttributeFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2274:1: ( ( ( rule__AttributeFact__VariableAssignment_2 ) ) )
            // InternalRules.g:2275:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            {
            // InternalRules.g:2275:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            // InternalRules.g:2276:2: ( rule__AttributeFact__VariableAssignment_2 )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 
            // InternalRules.g:2277:2: ( rule__AttributeFact__VariableAssignment_2 )
            // InternalRules.g:2277:3: rule__AttributeFact__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 

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
    // $ANTLR end "rule__AttributeFact__Group__2__Impl"


    // $ANTLR start "rule__AttributeFact__Group__3"
    // InternalRules.g:2285:1: rule__AttributeFact__Group__3 : rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 ;
    public final void rule__AttributeFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2289:1: ( rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 )
            // InternalRules.g:2290:2: rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__AttributeFact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__4();

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
    // $ANTLR end "rule__AttributeFact__Group__3"


    // $ANTLR start "rule__AttributeFact__Group__3__Impl"
    // InternalRules.g:2297:1: rule__AttributeFact__Group__3__Impl : ( ':' ) ;
    public final void rule__AttributeFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2301:1: ( ( ':' ) )
            // InternalRules.g:2302:1: ( ':' )
            {
            // InternalRules.g:2302:1: ( ':' )
            // InternalRules.g:2303:2: ':'
            {
             before(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__AttributeFact__Group__3__Impl"


    // $ANTLR start "rule__AttributeFact__Group__4"
    // InternalRules.g:2312:1: rule__AttributeFact__Group__4 : rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 ;
    public final void rule__AttributeFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2316:1: ( rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 )
            // InternalRules.g:2317:2: rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__AttributeFact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__5();

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
    // $ANTLR end "rule__AttributeFact__Group__4"


    // $ANTLR start "rule__AttributeFact__Group__4__Impl"
    // InternalRules.g:2324:1: rule__AttributeFact__Group__4__Impl : ( ( rule__AttributeFact__AttributeAssignment_4 ) ) ;
    public final void rule__AttributeFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2328:1: ( ( ( rule__AttributeFact__AttributeAssignment_4 ) ) )
            // InternalRules.g:2329:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            {
            // InternalRules.g:2329:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            // InternalRules.g:2330:2: ( rule__AttributeFact__AttributeAssignment_4 )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 
            // InternalRules.g:2331:2: ( rule__AttributeFact__AttributeAssignment_4 )
            // InternalRules.g:2331:3: rule__AttributeFact__AttributeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__AttributeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 

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
    // $ANTLR end "rule__AttributeFact__Group__4__Impl"


    // $ANTLR start "rule__AttributeFact__Group__5"
    // InternalRules.g:2339:1: rule__AttributeFact__Group__5 : rule__AttributeFact__Group__5__Impl ;
    public final void rule__AttributeFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2343:1: ( rule__AttributeFact__Group__5__Impl )
            // InternalRules.g:2344:2: rule__AttributeFact__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__5__Impl();

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
    // $ANTLR end "rule__AttributeFact__Group__5"


    // $ANTLR start "rule__AttributeFact__Group__5__Impl"
    // InternalRules.g:2350:1: rule__AttributeFact__Group__5__Impl : ( ')' ) ;
    public final void rule__AttributeFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2354:1: ( ( ')' ) )
            // InternalRules.g:2355:1: ( ')' )
            {
            // InternalRules.g:2355:1: ( ')' )
            // InternalRules.g:2356:2: ')'
            {
             before(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__AttributeFact__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalRules.g:2366:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2370:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalRules.g:2371:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:2378:1: rule__Binding__Group__0__Impl : ( 'where' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2382:1: ( ( 'where' ) )
            // InternalRules.g:2383:1: ( 'where' )
            {
            // InternalRules.g:2383:1: ( 'where' )
            // InternalRules.g:2384:2: 'where'
            {
             before(grammarAccess.getBindingAccess().getWhereKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getWhereKeyword_0()); 

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
    // InternalRules.g:2393:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2397:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalRules.g:2398:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:2405:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__VariableAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2409:1: ( ( ( rule__Binding__VariableAssignment_1 ) ) )
            // InternalRules.g:2410:1: ( ( rule__Binding__VariableAssignment_1 ) )
            {
            // InternalRules.g:2410:1: ( ( rule__Binding__VariableAssignment_1 ) )
            // InternalRules.g:2411:2: ( rule__Binding__VariableAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getVariableAssignment_1()); 
            // InternalRules.g:2412:2: ( rule__Binding__VariableAssignment_1 )
            // InternalRules.g:2412:3: rule__Binding__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getVariableAssignment_1()); 

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
    // InternalRules.g:2420:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2424:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalRules.g:2425:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalRules.g:2432:1: rule__Binding__Group__2__Impl : ( 'is' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2436:1: ( ( 'is' ) )
            // InternalRules.g:2437:1: ( 'is' )
            {
            // InternalRules.g:2437:1: ( 'is' )
            // InternalRules.g:2438:2: 'is'
            {
             before(grammarAccess.getBindingAccess().getIsKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getIsKeyword_2()); 

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
    // InternalRules.g:2447:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2451:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalRules.g:2452:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

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
    // InternalRules.g:2459:1: rule__Binding__Group__3__Impl : ( 'bound' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2463:1: ( ( 'bound' ) )
            // InternalRules.g:2464:1: ( 'bound' )
            {
            // InternalRules.g:2464:1: ( 'bound' )
            // InternalRules.g:2465:2: 'bound'
            {
             before(grammarAccess.getBindingAccess().getBoundKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getBoundKeyword_3()); 

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


    // $ANTLR start "rule__Binding__Group__4"
    // InternalRules.g:2474:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2478:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalRules.g:2479:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__5();

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
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalRules.g:2486:1: rule__Binding__Group__4__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2490:1: ( ( 'to' ) )
            // InternalRules.g:2491:1: ( 'to' )
            {
            // InternalRules.g:2491:1: ( 'to' )
            // InternalRules.g:2492:2: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Binding__Group__5"
    // InternalRules.g:2501:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2505:1: ( rule__Binding__Group__5__Impl )
            // InternalRules.g:2506:2: rule__Binding__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__5__Impl();

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
    // $ANTLR end "rule__Binding__Group__5"


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalRules.g:2512:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__BindAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2516:1: ( ( ( rule__Binding__BindAssignment_5 ) ) )
            // InternalRules.g:2517:1: ( ( rule__Binding__BindAssignment_5 ) )
            {
            // InternalRules.g:2517:1: ( ( rule__Binding__BindAssignment_5 ) )
            // InternalRules.g:2518:2: ( rule__Binding__BindAssignment_5 )
            {
             before(grammarAccess.getBindingAccess().getBindAssignment_5()); 
            // InternalRules.g:2519:2: ( rule__Binding__BindAssignment_5 )
            // InternalRules.g:2519:3: rule__Binding__BindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getBindAssignment_5()); 

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
    // $ANTLR end "rule__Binding__Group__5__Impl"


    // $ANTLR start "rule__Model__RolesAssignment_0"
    // InternalRules.g:2528:1: rule__Model__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2532:1: ( ( ruleRole ) )
            // InternalRules.g:2533:2: ( ruleRole )
            {
            // InternalRules.g:2533:2: ( ruleRole )
            // InternalRules.g:2534:3: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__RolesAssignment_0"


    // $ANTLR start "rule__Model__PolicyAssignment_1"
    // InternalRules.g:2543:1: rule__Model__PolicyAssignment_1 : ( rulePolicy ) ;
    public final void rule__Model__PolicyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2547:1: ( ( rulePolicy ) )
            // InternalRules.g:2548:2: ( rulePolicy )
            {
            // InternalRules.g:2548:2: ( rulePolicy )
            // InternalRules.g:2549:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__PolicyAssignment_1"


    // $ANTLR start "rule__User__NameAssignment_1"
    // InternalRules.g:2558:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2562:1: ( ( RULE_ID ) )
            // InternalRules.g:2563:2: ( RULE_ID )
            {
            // InternalRules.g:2563:2: ( RULE_ID )
            // InternalRules.g:2564:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalRules.g:2573:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2577:1: ( ( RULE_ID ) )
            // InternalRules.g:2578:2: ( RULE_ID )
            {
            // InternalRules.g:2578:2: ( RULE_ID )
            // InternalRules.g:2579:3: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalRules.g:2588:1: rule__Group__UsersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2592:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2593:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2593:2: ( ( RULE_ID ) )
            // InternalRules.g:2594:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 
            // InternalRules.g:2595:3: ( RULE_ID )
            // InternalRules.g:2596:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalRules.g:2607:1: rule__Group__UsersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2611:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2612:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2612:2: ( ( RULE_ID ) )
            // InternalRules.g:2613:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0()); 
            // InternalRules.g:2614:3: ( RULE_ID )
            // InternalRules.g:2615:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalRules.g:2626:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2630:1: ( ( RULE_ID ) )
            // InternalRules.g:2631:2: ( RULE_ID )
            {
            // InternalRules.g:2631:2: ( RULE_ID )
            // InternalRules.g:2632:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Policy__AccessAssignment_2"
    // InternalRules.g:2641:1: rule__Policy__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Policy__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2645:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2646:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2646:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2647:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Policy__AccessAssignment_2"


    // $ANTLR start "rule__Policy__OperationAssignment_3"
    // InternalRules.g:2656:1: rule__Policy__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Policy__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2660:1: ( ( ruleOperationType ) )
            // InternalRules.g:2661:2: ( ruleOperationType )
            {
            // InternalRules.g:2661:2: ( ruleOperationType )
            // InternalRules.g:2662:3: ruleOperationType
            {
             before(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Policy__OperationAssignment_3"


    // $ANTLR start "rule__Policy__RulesAssignment_7"
    // InternalRules.g:2671:1: rule__Policy__RulesAssignment_7 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2675:1: ( ( ruleRule ) )
            // InternalRules.g:2676:2: ( ruleRule )
            {
            // InternalRules.g:2676:2: ( ruleRule )
            // InternalRules.g:2677:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Policy__RulesAssignment_7"


    // $ANTLR start "rule__Policy__ResolutionAssignment_10"
    // InternalRules.g:2686:1: rule__Policy__ResolutionAssignment_10 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2690:1: ( ( ruleResolutionType ) )
            // InternalRules.g:2691:2: ( ruleResolutionType )
            {
            // InternalRules.g:2691:2: ( ruleResolutionType )
            // InternalRules.g:2692:3: ruleResolutionType
            {
             before(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleResolutionType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0()); 

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
    // $ANTLR end "rule__Policy__ResolutionAssignment_10"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalRules.g:2701:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2705:1: ( ( RULE_ID ) )
            // InternalRules.g:2706:2: ( RULE_ID )
            {
            // InternalRules.g:2706:2: ( RULE_ID )
            // InternalRules.g:2707:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Rule__ConstraintAssignment_2"
    // InternalRules.g:2716:1: rule__Rule__ConstraintAssignment_2 : ( ruleRuleConstraint ) ;
    public final void rule__Rule__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2720:1: ( ( ruleRuleConstraint ) )
            // InternalRules.g:2721:2: ( ruleRuleConstraint )
            {
            // InternalRules.g:2721:2: ( ruleRuleConstraint )
            // InternalRules.g:2722:3: ruleRuleConstraint
            {
             before(grammarAccess.getRuleAccess().getConstraintRuleConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleConstraint();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConstraintRuleConstraintParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rule__ConstraintAssignment_2"


    // $ANTLR start "rule__Rule__RolesAssignment_4"
    // InternalRules.g:2731:1: rule__Rule__RolesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2735:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2736:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2736:2: ( ( RULE_ID ) )
            // InternalRules.g:2737:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_4_0()); 
            // InternalRules.g:2738:3: ( RULE_ID )
            // InternalRules.g:2739:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalRules.g:2750:1: rule__Rule__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2754:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2755:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2755:2: ( ( RULE_ID ) )
            // InternalRules.g:2756:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_1_0()); 
            // InternalRules.g:2757:3: ( RULE_ID )
            // InternalRules.g:2758:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Rule__PatternAssignment_9"
    // InternalRules.g:2769:1: rule__Rule__PatternAssignment_9 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2773:1: ( ( ( RULE_STRING ) ) )
            // InternalRules.g:2774:2: ( ( RULE_STRING ) )
            {
            // InternalRules.g:2774:2: ( ( RULE_STRING ) )
            // InternalRules.g:2775:3: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_9_0()); 
            // InternalRules.g:2776:3: ( RULE_STRING )
            // InternalRules.g:2777:4: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_9_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPatternPatternCrossReference_9_0()); 

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
    // $ANTLR end "rule__Rule__PatternAssignment_9"


    // $ANTLR start "rule__Rule__AssetAssignment_11"
    // InternalRules.g:2788:1: rule__Rule__AssetAssignment_11 : ( ruleAsset ) ;
    public final void rule__Rule__AssetAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2792:1: ( ( ruleAsset ) )
            // InternalRules.g:2793:2: ( ruleAsset )
            {
            // InternalRules.g:2793:2: ( ruleAsset )
            // InternalRules.g:2794:3: ruleAsset
            {
             before(grammarAccess.getRuleAccess().getAssetAssetParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAsset();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssetAssetParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Rule__AssetAssignment_11"


    // $ANTLR start "rule__Rule__BindingsAssignment_12"
    // InternalRules.g:2803:1: rule__Rule__BindingsAssignment_12 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2807:1: ( ( ruleBinding ) )
            // InternalRules.g:2808:2: ( ruleBinding )
            {
            // InternalRules.g:2808:2: ( ruleBinding )
            // InternalRules.g:2809:3: ruleBinding
            {
             before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Rule__BindingsAssignment_12"


    // $ANTLR start "rule__Rule__PriorityAssignment_14_1"
    // InternalRules.g:2818:1: rule__Rule__PriorityAssignment_14_1 : ( RULE_INT ) ;
    public final void rule__Rule__PriorityAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2822:1: ( ( RULE_INT ) )
            // InternalRules.g:2823:2: ( RULE_INT )
            {
            // InternalRules.g:2823:2: ( RULE_INT )
            // InternalRules.g:2824:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_14_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__Rule__PriorityAssignment_14_1"


    // $ANTLR start "rule__RuleConstraint__AccessAssignment_0_0"
    // InternalRules.g:2833:1: rule__RuleConstraint__AccessAssignment_0_0 : ( ruleAccessibilityLevel ) ;
    public final void rule__RuleConstraint__AccessAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2837:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2838:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2838:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2839:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getRuleConstraintAccess().getAccessAccessibilityLevelEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getRuleConstraintAccess().getAccessAccessibilityLevelEnumRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__RuleConstraint__AccessAssignment_0_0"


    // $ANTLR start "rule__RuleConstraint__OperationAssignment_0_1"
    // InternalRules.g:2848:1: rule__RuleConstraint__OperationAssignment_0_1 : ( ruleOperationType ) ;
    public final void rule__RuleConstraint__OperationAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2852:1: ( ( ruleOperationType ) )
            // InternalRules.g:2853:2: ( ruleOperationType )
            {
            // InternalRules.g:2853:2: ( ruleOperationType )
            // InternalRules.g:2854:3: ruleOperationType
            {
             before(grammarAccess.getRuleConstraintAccess().getOperationOperationTypeEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getRuleConstraintAccess().getOperationOperationTypeEnumRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__RuleConstraint__OperationAssignment_0_1"


    // $ANTLR start "rule__ObjectFact__VariableAssignment_2"
    // InternalRules.g:2863:1: rule__ObjectFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2867:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2868:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2868:2: ( ( RULE_ID ) )
            // InternalRules.g:2869:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalRules.g:2870:3: ( RULE_ID )
            // InternalRules.g:2871:4: RULE_ID
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 

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
    // $ANTLR end "rule__ObjectFact__VariableAssignment_2"


    // $ANTLR start "rule__ReferenceFact__SourceVarAssignment_2"
    // InternalRules.g:2882:1: rule__ReferenceFact__SourceVarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__SourceVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2886:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2887:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2887:2: ( ( RULE_ID ) )
            // InternalRules.g:2888:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 
            // InternalRules.g:2889:3: ( RULE_ID )
            // InternalRules.g:2890:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 

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
    // $ANTLR end "rule__ReferenceFact__SourceVarAssignment_2"


    // $ANTLR start "rule__ReferenceFact__TargetVarAssignment_4"
    // InternalRules.g:2901:1: rule__ReferenceFact__TargetVarAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__TargetVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2905:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2906:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2906:2: ( ( RULE_ID ) )
            // InternalRules.g:2907:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 
            // InternalRules.g:2908:3: ( RULE_ID )
            // InternalRules.g:2909:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 

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
    // $ANTLR end "rule__ReferenceFact__TargetVarAssignment_4"


    // $ANTLR start "rule__ReferenceFact__ReferenceAssignment_6"
    // InternalRules.g:2920:1: rule__ReferenceFact__ReferenceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2924:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2925:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2925:2: ( ( RULE_ID ) )
            // InternalRules.g:2926:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 
            // InternalRules.g:2927:3: ( RULE_ID )
            // InternalRules.g:2928:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 

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
    // $ANTLR end "rule__ReferenceFact__ReferenceAssignment_6"


    // $ANTLR start "rule__AttributeFact__VariableAssignment_2"
    // InternalRules.g:2939:1: rule__AttributeFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2943:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2944:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2944:2: ( ( RULE_ID ) )
            // InternalRules.g:2945:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalRules.g:2946:3: ( RULE_ID )
            // InternalRules.g:2947:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 

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
    // $ANTLR end "rule__AttributeFact__VariableAssignment_2"


    // $ANTLR start "rule__AttributeFact__AttributeAssignment_4"
    // InternalRules.g:2958:1: rule__AttributeFact__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2962:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2963:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2963:2: ( ( RULE_ID ) )
            // InternalRules.g:2964:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 
            // InternalRules.g:2965:3: ( RULE_ID )
            // InternalRules.g:2966:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getAttributeEAttributeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 

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
    // $ANTLR end "rule__AttributeFact__AttributeAssignment_4"


    // $ANTLR start "rule__Binding__VariableAssignment_1"
    // InternalRules.g:2977:1: rule__Binding__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2981:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2982:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2982:2: ( ( RULE_ID ) )
            // InternalRules.g:2983:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 
            // InternalRules.g:2984:3: ( RULE_ID )
            // InternalRules.g:2985:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 

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
    // $ANTLR end "rule__Binding__VariableAssignment_1"


    // $ANTLR start "rule__Binding__BindAssignment_5"
    // InternalRules.g:2996:1: rule__Binding__BindAssignment_5 : ( ruleBind ) ;
    public final void rule__Binding__BindAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:3000:1: ( ( ruleBind ) )
            // InternalRules.g:3001:2: ( ruleBind )
            {
            // InternalRules.g:3001:2: ( ruleBind )
            // InternalRules.g:3002:3: ruleBind
            {
             before(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Binding__BindAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000024800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000030L});

}