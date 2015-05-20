package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui.contentassist.antlr.internal; 

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
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.services.PolicyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolicyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UNSET'", "'DENY'", "'ALLOW'", "'GROUP'", "'USER'", "'Policy'", "'{'", "'}'", "'permission'", "';'", "'query'", "'pattern'", "'Association'", "'defaultPermission'", "'override'", "'target'", "'.'", "'policies'", "','"
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
    public String getGrammarFileName() { return "../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g"; }


     
     	private PolicyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PolicyGrammarAccess grammarAccess) {
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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:61:1: ( ruleModel EOF )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:73:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:75:1: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:76:1: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:76:2: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePolicy"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:88:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:89:1: ( rulePolicy EOF )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:90:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy122);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy129); 

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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:97:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:101:2: ( ( ( rule__Policy__Group__0 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:102:1: ( ( rule__Policy__Group__0 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:102:1: ( ( rule__Policy__Group__0 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:103:1: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:104:1: ( rule__Policy__Group__0 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:104:2: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_rule__Policy__Group__0_in_rulePolicy155);
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


    // $ANTLR start "entryRuleAssociation"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:116:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:117:1: ( ruleAssociation EOF )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:118:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation182);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation189); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:125:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:129:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:130:1: ( ( rule__Association__Group__0 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:130:1: ( ( rule__Association__Group__0 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:131:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:132:1: ( rule__Association__Group__0 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:132:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation215);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleElements"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:144:1: entryRuleElements : ruleElements EOF ;
    public final void entryRuleElements() throws RecognitionException {
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:145:1: ( ruleElements EOF )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:146:1: ruleElements EOF
            {
             before(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_ruleElements_in_entryRuleElements242);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getElementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElements249); 

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
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:153:1: ruleElements : ( ( rule__Elements__Alternatives ) ) ;
    public final void ruleElements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:157:2: ( ( ( rule__Elements__Alternatives ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:158:1: ( ( rule__Elements__Alternatives ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:158:1: ( ( rule__Elements__Alternatives ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:159:1: ( rule__Elements__Alternatives )
            {
             before(grammarAccess.getElementsAccess().getAlternatives()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:160:1: ( rule__Elements__Alternatives )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:160:2: rule__Elements__Alternatives
            {
            pushFollow(FOLLOW_rule__Elements__Alternatives_in_ruleElements275);
            rule__Elements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElements"


    // $ANTLR start "rulePermissionType"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:173:1: rulePermissionType : ( ( rule__PermissionType__Alternatives ) ) ;
    public final void rulePermissionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:177:1: ( ( ( rule__PermissionType__Alternatives ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:178:1: ( ( rule__PermissionType__Alternatives ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:178:1: ( ( rule__PermissionType__Alternatives ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:179:1: ( rule__PermissionType__Alternatives )
            {
             before(grammarAccess.getPermissionTypeAccess().getAlternatives()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:180:1: ( rule__PermissionType__Alternatives )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:180:2: rule__PermissionType__Alternatives
            {
            pushFollow(FOLLOW_rule__PermissionType__Alternatives_in_rulePermissionType312);
            rule__PermissionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPermissionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissionType"


    // $ANTLR start "ruleTargetType"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:192:1: ruleTargetType : ( ( rule__TargetType__Alternatives ) ) ;
    public final void ruleTargetType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:196:1: ( ( ( rule__TargetType__Alternatives ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:197:1: ( ( rule__TargetType__Alternatives ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:197:1: ( ( rule__TargetType__Alternatives ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:198:1: ( rule__TargetType__Alternatives )
            {
             before(grammarAccess.getTargetTypeAccess().getAlternatives()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:199:1: ( rule__TargetType__Alternatives )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:199:2: rule__TargetType__Alternatives
            {
            pushFollow(FOLLOW_rule__TargetType__Alternatives_in_ruleTargetType348);
            rule__TargetType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetType"


    // $ANTLR start "rule__Elements__Alternatives"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:210:1: rule__Elements__Alternatives : ( ( rulePolicy ) | ( ruleAssociation ) );
    public final void rule__Elements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:214:1: ( ( rulePolicy ) | ( ruleAssociation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:215:1: ( rulePolicy )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:215:1: ( rulePolicy )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:216:1: rulePolicy
                    {
                     before(grammarAccess.getElementsAccess().getPolicyParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePolicy_in_rule__Elements__Alternatives383);
                    rulePolicy();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getPolicyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:221:6: ( ruleAssociation )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:221:6: ( ruleAssociation )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:222:1: ruleAssociation
                    {
                     before(grammarAccess.getElementsAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Elements__Alternatives400);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getElementsAccess().getAssociationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Elements__Alternatives"


    // $ANTLR start "rule__PermissionType__Alternatives"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:232:1: rule__PermissionType__Alternatives : ( ( ( 'UNSET' ) ) | ( ( 'DENY' ) ) | ( ( 'ALLOW' ) ) );
    public final void rule__PermissionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:236:1: ( ( ( 'UNSET' ) ) | ( ( 'DENY' ) ) | ( ( 'ALLOW' ) ) )
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
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:237:1: ( ( 'UNSET' ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:237:1: ( ( 'UNSET' ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:238:1: ( 'UNSET' )
                    {
                     before(grammarAccess.getPermissionTypeAccess().getUNSETEnumLiteralDeclaration_0()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:239:1: ( 'UNSET' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:239:3: 'UNSET'
                    {
                    match(input,11,FOLLOW_11_in_rule__PermissionType__Alternatives433); 

                    }

                     after(grammarAccess.getPermissionTypeAccess().getUNSETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:244:6: ( ( 'DENY' ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:244:6: ( ( 'DENY' ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:245:1: ( 'DENY' )
                    {
                     before(grammarAccess.getPermissionTypeAccess().getDENYEnumLiteralDeclaration_1()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:246:1: ( 'DENY' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:246:3: 'DENY'
                    {
                    match(input,12,FOLLOW_12_in_rule__PermissionType__Alternatives454); 

                    }

                     after(grammarAccess.getPermissionTypeAccess().getDENYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:251:6: ( ( 'ALLOW' ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:251:6: ( ( 'ALLOW' ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:252:1: ( 'ALLOW' )
                    {
                     before(grammarAccess.getPermissionTypeAccess().getALLOWEnumLiteralDeclaration_2()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:253:1: ( 'ALLOW' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:253:3: 'ALLOW'
                    {
                    match(input,13,FOLLOW_13_in_rule__PermissionType__Alternatives475); 

                    }

                     after(grammarAccess.getPermissionTypeAccess().getALLOWEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__PermissionType__Alternatives"


    // $ANTLR start "rule__TargetType__Alternatives"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:263:1: rule__TargetType__Alternatives : ( ( ( 'GROUP' ) ) | ( ( 'USER' ) ) );
    public final void rule__TargetType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:267:1: ( ( ( 'GROUP' ) ) | ( ( 'USER' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:268:1: ( ( 'GROUP' ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:268:1: ( ( 'GROUP' ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:269:1: ( 'GROUP' )
                    {
                     before(grammarAccess.getTargetTypeAccess().getGROUPEnumLiteralDeclaration_0()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:270:1: ( 'GROUP' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:270:3: 'GROUP'
                    {
                    match(input,14,FOLLOW_14_in_rule__TargetType__Alternatives511); 

                    }

                     after(grammarAccess.getTargetTypeAccess().getGROUPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:275:6: ( ( 'USER' ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:275:6: ( ( 'USER' ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:276:1: ( 'USER' )
                    {
                     before(grammarAccess.getTargetTypeAccess().getUSEREnumLiteralDeclaration_1()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:277:1: ( 'USER' )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:277:3: 'USER'
                    {
                    match(input,15,FOLLOW_15_in_rule__TargetType__Alternatives532); 

                    }

                     after(grammarAccess.getTargetTypeAccess().getUSEREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__TargetType__Alternatives"


    // $ANTLR start "rule__Policy__Group__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:289:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:293:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:294:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__0565);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__0568);
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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:301:1: rule__Policy__Group__0__Impl : ( 'Policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:305:1: ( ( 'Policy' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:306:1: ( 'Policy' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:306:1: ( 'Policy' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:307:1: 'Policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Policy__Group__0__Impl596); 
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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:320:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:324:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:325:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__1627);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__1630);
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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:332:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:336:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:337:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:337:1: ( ( rule__Policy__NameAssignment_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:338:1: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:339:1: ( rule__Policy__NameAssignment_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:339:2: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Policy__NameAssignment_1_in_rule__Policy__Group__1__Impl657);
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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:349:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:353:1: ( rule__Policy__Group__2__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:354:2: rule__Policy__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__2687);
            rule__Policy__Group__2__Impl();

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
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:360:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__Group_2__0 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:364:1: ( ( ( rule__Policy__Group_2__0 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:365:1: ( ( rule__Policy__Group_2__0 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:365:1: ( ( rule__Policy__Group_2__0 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:366:1: ( rule__Policy__Group_2__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup_2()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:367:1: ( rule__Policy__Group_2__0 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:367:2: rule__Policy__Group_2__0
            {
            pushFollow(FOLLOW_rule__Policy__Group_2__0_in_rule__Policy__Group__2__Impl714);
            rule__Policy__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Policy__Group_2__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:383:1: rule__Policy__Group_2__0 : rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1 ;
    public final void rule__Policy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:387:1: ( rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:388:2: rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1
            {
            pushFollow(FOLLOW_rule__Policy__Group_2__0__Impl_in_rule__Policy__Group_2__0750);
            rule__Policy__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group_2__1_in_rule__Policy__Group_2__0753);
            rule__Policy__Group_2__1();

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
    // $ANTLR end "rule__Policy__Group_2__0"


    // $ANTLR start "rule__Policy__Group_2__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:395:1: rule__Policy__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Policy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:399:1: ( ( '{' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:400:1: ( '{' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:400:1: ( '{' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:401:1: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Policy__Group_2__0__Impl781); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__0__Impl"


    // $ANTLR start "rule__Policy__Group_2__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:414:1: rule__Policy__Group_2__1 : rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2 ;
    public final void rule__Policy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:418:1: ( rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:419:2: rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2
            {
            pushFollow(FOLLOW_rule__Policy__Group_2__1__Impl_in_rule__Policy__Group_2__1812);
            rule__Policy__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group_2__2_in_rule__Policy__Group_2__1815);
            rule__Policy__Group_2__2();

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
    // $ANTLR end "rule__Policy__Group_2__1"


    // $ANTLR start "rule__Policy__Group_2__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:426:1: rule__Policy__Group_2__1__Impl : ( ( rule__Policy__UnorderedGroup_2_1 ) ) ;
    public final void rule__Policy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:430:1: ( ( ( rule__Policy__UnorderedGroup_2_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:431:1: ( ( rule__Policy__UnorderedGroup_2_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:431:1: ( ( rule__Policy__UnorderedGroup_2_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:432:1: ( rule__Policy__UnorderedGroup_2_1 )
            {
             before(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:433:1: ( rule__Policy__UnorderedGroup_2_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:433:2: rule__Policy__UnorderedGroup_2_1
            {
            pushFollow(FOLLOW_rule__Policy__UnorderedGroup_2_1_in_rule__Policy__Group_2__1__Impl842);
            rule__Policy__UnorderedGroup_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__1__Impl"


    // $ANTLR start "rule__Policy__Group_2__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:443:1: rule__Policy__Group_2__2 : rule__Policy__Group_2__2__Impl ;
    public final void rule__Policy__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:447:1: ( rule__Policy__Group_2__2__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:448:2: rule__Policy__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group_2__2__Impl_in_rule__Policy__Group_2__2872);
            rule__Policy__Group_2__2__Impl();

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
    // $ANTLR end "rule__Policy__Group_2__2"


    // $ANTLR start "rule__Policy__Group_2__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:454:1: rule__Policy__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Policy__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:458:1: ( ( '}' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:459:1: ( '}' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:459:1: ( '}' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:460:1: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__Policy__Group_2__2__Impl900); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__2__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_0__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:479:1: rule__Policy__Group_2_1_0__0 : rule__Policy__Group_2_1_0__0__Impl rule__Policy__Group_2_1_0__1 ;
    public final void rule__Policy__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:483:1: ( rule__Policy__Group_2_1_0__0__Impl rule__Policy__Group_2_1_0__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:484:2: rule__Policy__Group_2_1_0__0__Impl rule__Policy__Group_2_1_0__1
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_0__0__Impl_in_rule__Policy__Group_2_1_0__0937);
            rule__Policy__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group_2_1_0__1_in_rule__Policy__Group_2_1_0__0940);
            rule__Policy__Group_2_1_0__1();

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
    // $ANTLR end "rule__Policy__Group_2_1_0__0"


    // $ANTLR start "rule__Policy__Group_2_1_0__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:491:1: rule__Policy__Group_2_1_0__0__Impl : ( 'permission' ) ;
    public final void rule__Policy__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:495:1: ( ( 'permission' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:496:1: ( 'permission' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:496:1: ( 'permission' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:497:1: 'permission'
            {
             before(grammarAccess.getPolicyAccess().getPermissionKeyword_2_1_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Policy__Group_2_1_0__0__Impl968); 
             after(grammarAccess.getPolicyAccess().getPermissionKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_0__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:510:1: rule__Policy__Group_2_1_0__1 : rule__Policy__Group_2_1_0__1__Impl rule__Policy__Group_2_1_0__2 ;
    public final void rule__Policy__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:514:1: ( rule__Policy__Group_2_1_0__1__Impl rule__Policy__Group_2_1_0__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:515:2: rule__Policy__Group_2_1_0__1__Impl rule__Policy__Group_2_1_0__2
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_0__1__Impl_in_rule__Policy__Group_2_1_0__1999);
            rule__Policy__Group_2_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group_2_1_0__2_in_rule__Policy__Group_2_1_0__11002);
            rule__Policy__Group_2_1_0__2();

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
    // $ANTLR end "rule__Policy__Group_2_1_0__1"


    // $ANTLR start "rule__Policy__Group_2_1_0__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:522:1: rule__Policy__Group_2_1_0__1__Impl : ( ( rule__Policy__PermissionAssignment_2_1_0_1 ) ) ;
    public final void rule__Policy__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:526:1: ( ( ( rule__Policy__PermissionAssignment_2_1_0_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:527:1: ( ( rule__Policy__PermissionAssignment_2_1_0_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:527:1: ( ( rule__Policy__PermissionAssignment_2_1_0_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:528:1: ( rule__Policy__PermissionAssignment_2_1_0_1 )
            {
             before(grammarAccess.getPolicyAccess().getPermissionAssignment_2_1_0_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:529:1: ( rule__Policy__PermissionAssignment_2_1_0_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:529:2: rule__Policy__PermissionAssignment_2_1_0_1
            {
            pushFollow(FOLLOW_rule__Policy__PermissionAssignment_2_1_0_1_in_rule__Policy__Group_2_1_0__1__Impl1029);
            rule__Policy__PermissionAssignment_2_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getPermissionAssignment_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_0__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:539:1: rule__Policy__Group_2_1_0__2 : rule__Policy__Group_2_1_0__2__Impl ;
    public final void rule__Policy__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:543:1: ( rule__Policy__Group_2_1_0__2__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:544:2: rule__Policy__Group_2_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_0__2__Impl_in_rule__Policy__Group_2_1_0__21059);
            rule__Policy__Group_2_1_0__2__Impl();

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
    // $ANTLR end "rule__Policy__Group_2_1_0__2"


    // $ANTLR start "rule__Policy__Group_2_1_0__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:550:1: rule__Policy__Group_2_1_0__2__Impl : ( ';' ) ;
    public final void rule__Policy__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:554:1: ( ( ';' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:555:1: ( ';' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:555:1: ( ';' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:556:1: ';'
            {
             before(grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Policy__Group_2_1_0__2__Impl1087); 
             after(grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_0__2__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_1__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:575:1: rule__Policy__Group_2_1_1__0 : rule__Policy__Group_2_1_1__0__Impl rule__Policy__Group_2_1_1__1 ;
    public final void rule__Policy__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:579:1: ( rule__Policy__Group_2_1_1__0__Impl rule__Policy__Group_2_1_1__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:580:2: rule__Policy__Group_2_1_1__0__Impl rule__Policy__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_1__0__Impl_in_rule__Policy__Group_2_1_1__01124);
            rule__Policy__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group_2_1_1__1_in_rule__Policy__Group_2_1_1__01127);
            rule__Policy__Group_2_1_1__1();

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
    // $ANTLR end "rule__Policy__Group_2_1_1__0"


    // $ANTLR start "rule__Policy__Group_2_1_1__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:587:1: rule__Policy__Group_2_1_1__0__Impl : ( 'query' ) ;
    public final void rule__Policy__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:591:1: ( ( 'query' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:592:1: ( 'query' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:592:1: ( 'query' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:593:1: 'query'
            {
             before(grammarAccess.getPolicyAccess().getQueryKeyword_2_1_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Policy__Group_2_1_1__0__Impl1155); 
             after(grammarAccess.getPolicyAccess().getQueryKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_1__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:606:1: rule__Policy__Group_2_1_1__1 : rule__Policy__Group_2_1_1__1__Impl rule__Policy__Group_2_1_1__2 ;
    public final void rule__Policy__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:610:1: ( rule__Policy__Group_2_1_1__1__Impl rule__Policy__Group_2_1_1__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:611:2: rule__Policy__Group_2_1_1__1__Impl rule__Policy__Group_2_1_1__2
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_1__1__Impl_in_rule__Policy__Group_2_1_1__11186);
            rule__Policy__Group_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group_2_1_1__2_in_rule__Policy__Group_2_1_1__11189);
            rule__Policy__Group_2_1_1__2();

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
    // $ANTLR end "rule__Policy__Group_2_1_1__1"


    // $ANTLR start "rule__Policy__Group_2_1_1__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:618:1: rule__Policy__Group_2_1_1__1__Impl : ( ( rule__Policy__QueryAssignment_2_1_1_1 ) ) ;
    public final void rule__Policy__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:622:1: ( ( ( rule__Policy__QueryAssignment_2_1_1_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:623:1: ( ( rule__Policy__QueryAssignment_2_1_1_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:623:1: ( ( rule__Policy__QueryAssignment_2_1_1_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:624:1: ( rule__Policy__QueryAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPolicyAccess().getQueryAssignment_2_1_1_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:625:1: ( rule__Policy__QueryAssignment_2_1_1_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:625:2: rule__Policy__QueryAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__Policy__QueryAssignment_2_1_1_1_in_rule__Policy__Group_2_1_1__1__Impl1216);
            rule__Policy__QueryAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getQueryAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_1__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:635:1: rule__Policy__Group_2_1_1__2 : rule__Policy__Group_2_1_1__2__Impl ;
    public final void rule__Policy__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:639:1: ( rule__Policy__Group_2_1_1__2__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:640:2: rule__Policy__Group_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_1__2__Impl_in_rule__Policy__Group_2_1_1__21246);
            rule__Policy__Group_2_1_1__2__Impl();

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
    // $ANTLR end "rule__Policy__Group_2_1_1__2"


    // $ANTLR start "rule__Policy__Group_2_1_1__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:646:1: rule__Policy__Group_2_1_1__2__Impl : ( ';' ) ;
    public final void rule__Policy__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:650:1: ( ( ';' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:651:1: ( ';' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:651:1: ( ';' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:652:1: ';'
            {
             before(grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_1_2()); 
            match(input,20,FOLLOW_20_in_rule__Policy__Group_2_1_1__2__Impl1274); 
             after(grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_1__2__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_2__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:671:1: rule__Policy__Group_2_1_2__0 : rule__Policy__Group_2_1_2__0__Impl rule__Policy__Group_2_1_2__1 ;
    public final void rule__Policy__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:675:1: ( rule__Policy__Group_2_1_2__0__Impl rule__Policy__Group_2_1_2__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:676:2: rule__Policy__Group_2_1_2__0__Impl rule__Policy__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_2__0__Impl_in_rule__Policy__Group_2_1_2__01311);
            rule__Policy__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group_2_1_2__1_in_rule__Policy__Group_2_1_2__01314);
            rule__Policy__Group_2_1_2__1();

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
    // $ANTLR end "rule__Policy__Group_2_1_2__0"


    // $ANTLR start "rule__Policy__Group_2_1_2__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:683:1: rule__Policy__Group_2_1_2__0__Impl : ( 'pattern' ) ;
    public final void rule__Policy__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:687:1: ( ( 'pattern' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:688:1: ( 'pattern' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:688:1: ( 'pattern' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:689:1: 'pattern'
            {
             before(grammarAccess.getPolicyAccess().getPatternKeyword_2_1_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Policy__Group_2_1_2__0__Impl1342); 
             after(grammarAccess.getPolicyAccess().getPatternKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_2__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:702:1: rule__Policy__Group_2_1_2__1 : rule__Policy__Group_2_1_2__1__Impl rule__Policy__Group_2_1_2__2 ;
    public final void rule__Policy__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:706:1: ( rule__Policy__Group_2_1_2__1__Impl rule__Policy__Group_2_1_2__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:707:2: rule__Policy__Group_2_1_2__1__Impl rule__Policy__Group_2_1_2__2
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_2__1__Impl_in_rule__Policy__Group_2_1_2__11373);
            rule__Policy__Group_2_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group_2_1_2__2_in_rule__Policy__Group_2_1_2__11376);
            rule__Policy__Group_2_1_2__2();

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
    // $ANTLR end "rule__Policy__Group_2_1_2__1"


    // $ANTLR start "rule__Policy__Group_2_1_2__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:714:1: rule__Policy__Group_2_1_2__1__Impl : ( ( rule__Policy__PatternAssignment_2_1_2_1 ) ) ;
    public final void rule__Policy__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:718:1: ( ( ( rule__Policy__PatternAssignment_2_1_2_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:719:1: ( ( rule__Policy__PatternAssignment_2_1_2_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:719:1: ( ( rule__Policy__PatternAssignment_2_1_2_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:720:1: ( rule__Policy__PatternAssignment_2_1_2_1 )
            {
             before(grammarAccess.getPolicyAccess().getPatternAssignment_2_1_2_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:721:1: ( rule__Policy__PatternAssignment_2_1_2_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:721:2: rule__Policy__PatternAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__Policy__PatternAssignment_2_1_2_1_in_rule__Policy__Group_2_1_2__1__Impl1403);
            rule__Policy__PatternAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getPatternAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__Policy__Group_2_1_2__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:731:1: rule__Policy__Group_2_1_2__2 : rule__Policy__Group_2_1_2__2__Impl ;
    public final void rule__Policy__Group_2_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:735:1: ( rule__Policy__Group_2_1_2__2__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:736:2: rule__Policy__Group_2_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group_2_1_2__2__Impl_in_rule__Policy__Group_2_1_2__21433);
            rule__Policy__Group_2_1_2__2__Impl();

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
    // $ANTLR end "rule__Policy__Group_2_1_2__2"


    // $ANTLR start "rule__Policy__Group_2_1_2__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:742:1: rule__Policy__Group_2_1_2__2__Impl : ( ';' ) ;
    public final void rule__Policy__Group_2_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:746:1: ( ( ';' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:747:1: ( ';' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:747:1: ( ';' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:748:1: ';'
            {
             before(grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_2_2()); 
            match(input,20,FOLLOW_20_in_rule__Policy__Group_2_1_2__2__Impl1461); 
             after(grammarAccess.getPolicyAccess().getSemicolonKeyword_2_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2_1_2__2__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:767:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:771:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:772:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__01498);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01501);
            rule__Association__Group__1();

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
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:779:1: rule__Association__Group__0__Impl : ( 'Association' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:783:1: ( ( 'Association' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:784:1: ( 'Association' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:784:1: ( 'Association' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:785:1: 'Association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Association__Group__0__Impl1529); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:798:1: rule__Association__Group__1 : rule__Association__Group__1__Impl ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:802:1: ( rule__Association__Group__1__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:803:2: rule__Association__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__11560);
            rule__Association__Group__1__Impl();

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
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:809:1: rule__Association__Group__1__Impl : ( ( rule__Association__Group_1__0 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:813:1: ( ( ( rule__Association__Group_1__0 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:814:1: ( ( rule__Association__Group_1__0 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:814:1: ( ( rule__Association__Group_1__0 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:815:1: ( rule__Association__Group_1__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:816:1: ( rule__Association__Group_1__0 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:816:2: rule__Association__Group_1__0
            {
            pushFollow(FOLLOW_rule__Association__Group_1__0_in_rule__Association__Group__1__Impl1587);
            rule__Association__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group_1__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:830:1: rule__Association__Group_1__0 : rule__Association__Group_1__0__Impl rule__Association__Group_1__1 ;
    public final void rule__Association__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:834:1: ( rule__Association__Group_1__0__Impl rule__Association__Group_1__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:835:2: rule__Association__Group_1__0__Impl rule__Association__Group_1__1
            {
            pushFollow(FOLLOW_rule__Association__Group_1__0__Impl_in_rule__Association__Group_1__01621);
            rule__Association__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1__1_in_rule__Association__Group_1__01624);
            rule__Association__Group_1__1();

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
    // $ANTLR end "rule__Association__Group_1__0"


    // $ANTLR start "rule__Association__Group_1__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:842:1: rule__Association__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Association__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:846:1: ( ( '{' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:847:1: ( '{' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:847:1: ( '{' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:848:1: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Association__Group_1__0__Impl1652); 
             after(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1__0__Impl"


    // $ANTLR start "rule__Association__Group_1__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:861:1: rule__Association__Group_1__1 : rule__Association__Group_1__1__Impl rule__Association__Group_1__2 ;
    public final void rule__Association__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:865:1: ( rule__Association__Group_1__1__Impl rule__Association__Group_1__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:866:2: rule__Association__Group_1__1__Impl rule__Association__Group_1__2
            {
            pushFollow(FOLLOW_rule__Association__Group_1__1__Impl_in_rule__Association__Group_1__11683);
            rule__Association__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1__2_in_rule__Association__Group_1__11686);
            rule__Association__Group_1__2();

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
    // $ANTLR end "rule__Association__Group_1__1"


    // $ANTLR start "rule__Association__Group_1__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:873:1: rule__Association__Group_1__1__Impl : ( ( rule__Association__TesztAssignment_1_1 )? ) ;
    public final void rule__Association__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:877:1: ( ( ( rule__Association__TesztAssignment_1_1 )? ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:878:1: ( ( rule__Association__TesztAssignment_1_1 )? )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:878:1: ( ( rule__Association__TesztAssignment_1_1 )? )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:879:1: ( rule__Association__TesztAssignment_1_1 )?
            {
             before(grammarAccess.getAssociationAccess().getTesztAssignment_1_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:880:1: ( rule__Association__TesztAssignment_1_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:880:2: rule__Association__TesztAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Association__TesztAssignment_1_1_in_rule__Association__Group_1__1__Impl1713);
                    rule__Association__TesztAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getTesztAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1__1__Impl"


    // $ANTLR start "rule__Association__Group_1__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:890:1: rule__Association__Group_1__2 : rule__Association__Group_1__2__Impl rule__Association__Group_1__3 ;
    public final void rule__Association__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:894:1: ( rule__Association__Group_1__2__Impl rule__Association__Group_1__3 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:895:2: rule__Association__Group_1__2__Impl rule__Association__Group_1__3
            {
            pushFollow(FOLLOW_rule__Association__Group_1__2__Impl_in_rule__Association__Group_1__21744);
            rule__Association__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1__3_in_rule__Association__Group_1__21747);
            rule__Association__Group_1__3();

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
    // $ANTLR end "rule__Association__Group_1__2"


    // $ANTLR start "rule__Association__Group_1__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:902:1: rule__Association__Group_1__2__Impl : ( ( rule__Association__UnorderedGroup_1_2 ) ) ;
    public final void rule__Association__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:906:1: ( ( ( rule__Association__UnorderedGroup_1_2 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:907:1: ( ( rule__Association__UnorderedGroup_1_2 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:907:1: ( ( rule__Association__UnorderedGroup_1_2 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:908:1: ( rule__Association__UnorderedGroup_1_2 )
            {
             before(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:909:1: ( rule__Association__UnorderedGroup_1_2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:909:2: rule__Association__UnorderedGroup_1_2
            {
            pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2_in_rule__Association__Group_1__2__Impl1774);
            rule__Association__UnorderedGroup_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1__2__Impl"


    // $ANTLR start "rule__Association__Group_1__3"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:919:1: rule__Association__Group_1__3 : rule__Association__Group_1__3__Impl ;
    public final void rule__Association__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:923:1: ( rule__Association__Group_1__3__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:924:2: rule__Association__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group_1__3__Impl_in_rule__Association__Group_1__31804);
            rule__Association__Group_1__3__Impl();

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
    // $ANTLR end "rule__Association__Group_1__3"


    // $ANTLR start "rule__Association__Group_1__3__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:930:1: rule__Association__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Association__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:934:1: ( ( '}' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:935:1: ( '}' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:935:1: ( '}' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:936:1: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,18,FOLLOW_18_in_rule__Association__Group_1__3__Impl1832); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1__3__Impl"


    // $ANTLR start "rule__Association__Group_1_2_0__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:957:1: rule__Association__Group_1_2_0__0 : rule__Association__Group_1_2_0__0__Impl rule__Association__Group_1_2_0__1 ;
    public final void rule__Association__Group_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:961:1: ( rule__Association__Group_1_2_0__0__Impl rule__Association__Group_1_2_0__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:962:2: rule__Association__Group_1_2_0__0__Impl rule__Association__Group_1_2_0__1
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_0__0__Impl_in_rule__Association__Group_1_2_0__01871);
            rule__Association__Group_1_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_0__1_in_rule__Association__Group_1_2_0__01874);
            rule__Association__Group_1_2_0__1();

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
    // $ANTLR end "rule__Association__Group_1_2_0__0"


    // $ANTLR start "rule__Association__Group_1_2_0__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:969:1: rule__Association__Group_1_2_0__0__Impl : ( 'defaultPermission' ) ;
    public final void rule__Association__Group_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:973:1: ( ( 'defaultPermission' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:974:1: ( 'defaultPermission' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:974:1: ( 'defaultPermission' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:975:1: 'defaultPermission'
            {
             before(grammarAccess.getAssociationAccess().getDefaultPermissionKeyword_1_2_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Association__Group_1_2_0__0__Impl1902); 
             after(grammarAccess.getAssociationAccess().getDefaultPermissionKeyword_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_0__0__Impl"


    // $ANTLR start "rule__Association__Group_1_2_0__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:988:1: rule__Association__Group_1_2_0__1 : rule__Association__Group_1_2_0__1__Impl rule__Association__Group_1_2_0__2 ;
    public final void rule__Association__Group_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:992:1: ( rule__Association__Group_1_2_0__1__Impl rule__Association__Group_1_2_0__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:993:2: rule__Association__Group_1_2_0__1__Impl rule__Association__Group_1_2_0__2
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_0__1__Impl_in_rule__Association__Group_1_2_0__11933);
            rule__Association__Group_1_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_0__2_in_rule__Association__Group_1_2_0__11936);
            rule__Association__Group_1_2_0__2();

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
    // $ANTLR end "rule__Association__Group_1_2_0__1"


    // $ANTLR start "rule__Association__Group_1_2_0__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1000:1: rule__Association__Group_1_2_0__1__Impl : ( ( rule__Association__DefaultPermissionAssignment_1_2_0_1 ) ) ;
    public final void rule__Association__Group_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1004:1: ( ( ( rule__Association__DefaultPermissionAssignment_1_2_0_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1005:1: ( ( rule__Association__DefaultPermissionAssignment_1_2_0_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1005:1: ( ( rule__Association__DefaultPermissionAssignment_1_2_0_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1006:1: ( rule__Association__DefaultPermissionAssignment_1_2_0_1 )
            {
             before(grammarAccess.getAssociationAccess().getDefaultPermissionAssignment_1_2_0_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1007:1: ( rule__Association__DefaultPermissionAssignment_1_2_0_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1007:2: rule__Association__DefaultPermissionAssignment_1_2_0_1
            {
            pushFollow(FOLLOW_rule__Association__DefaultPermissionAssignment_1_2_0_1_in_rule__Association__Group_1_2_0__1__Impl1963);
            rule__Association__DefaultPermissionAssignment_1_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getDefaultPermissionAssignment_1_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_0__1__Impl"


    // $ANTLR start "rule__Association__Group_1_2_0__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1017:1: rule__Association__Group_1_2_0__2 : rule__Association__Group_1_2_0__2__Impl ;
    public final void rule__Association__Group_1_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1021:1: ( rule__Association__Group_1_2_0__2__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1022:2: rule__Association__Group_1_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_0__2__Impl_in_rule__Association__Group_1_2_0__21993);
            rule__Association__Group_1_2_0__2__Impl();

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
    // $ANTLR end "rule__Association__Group_1_2_0__2"


    // $ANTLR start "rule__Association__Group_1_2_0__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1028:1: rule__Association__Group_1_2_0__2__Impl : ( ';' ) ;
    public final void rule__Association__Group_1_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1032:1: ( ( ';' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1033:1: ( ';' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1033:1: ( ';' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1034:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Association__Group_1_2_0__2__Impl2021); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_0__2__Impl"


    // $ANTLR start "rule__Association__Group_1_2_1__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1053:1: rule__Association__Group_1_2_1__0 : rule__Association__Group_1_2_1__0__Impl rule__Association__Group_1_2_1__1 ;
    public final void rule__Association__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1057:1: ( rule__Association__Group_1_2_1__0__Impl rule__Association__Group_1_2_1__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1058:2: rule__Association__Group_1_2_1__0__Impl rule__Association__Group_1_2_1__1
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_1__0__Impl_in_rule__Association__Group_1_2_1__02058);
            rule__Association__Group_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_1__1_in_rule__Association__Group_1_2_1__02061);
            rule__Association__Group_1_2_1__1();

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
    // $ANTLR end "rule__Association__Group_1_2_1__0"


    // $ANTLR start "rule__Association__Group_1_2_1__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1065:1: rule__Association__Group_1_2_1__0__Impl : ( 'override' ) ;
    public final void rule__Association__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1069:1: ( ( 'override' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1070:1: ( 'override' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1070:1: ( 'override' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1071:1: 'override'
            {
             before(grammarAccess.getAssociationAccess().getOverrideKeyword_1_2_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Association__Group_1_2_1__0__Impl2089); 
             after(grammarAccess.getAssociationAccess().getOverrideKeyword_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__Association__Group_1_2_1__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1084:1: rule__Association__Group_1_2_1__1 : rule__Association__Group_1_2_1__1__Impl rule__Association__Group_1_2_1__2 ;
    public final void rule__Association__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1088:1: ( rule__Association__Group_1_2_1__1__Impl rule__Association__Group_1_2_1__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1089:2: rule__Association__Group_1_2_1__1__Impl rule__Association__Group_1_2_1__2
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_1__1__Impl_in_rule__Association__Group_1_2_1__12120);
            rule__Association__Group_1_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_1__2_in_rule__Association__Group_1_2_1__12123);
            rule__Association__Group_1_2_1__2();

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
    // $ANTLR end "rule__Association__Group_1_2_1__1"


    // $ANTLR start "rule__Association__Group_1_2_1__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1096:1: rule__Association__Group_1_2_1__1__Impl : ( ( rule__Association__OverrideAssignment_1_2_1_1 ) ) ;
    public final void rule__Association__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1100:1: ( ( ( rule__Association__OverrideAssignment_1_2_1_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1101:1: ( ( rule__Association__OverrideAssignment_1_2_1_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1101:1: ( ( rule__Association__OverrideAssignment_1_2_1_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1102:1: ( rule__Association__OverrideAssignment_1_2_1_1 )
            {
             before(grammarAccess.getAssociationAccess().getOverrideAssignment_1_2_1_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1103:1: ( rule__Association__OverrideAssignment_1_2_1_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1103:2: rule__Association__OverrideAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_rule__Association__OverrideAssignment_1_2_1_1_in_rule__Association__Group_1_2_1__1__Impl2150);
            rule__Association__OverrideAssignment_1_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getOverrideAssignment_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__Association__Group_1_2_1__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1113:1: rule__Association__Group_1_2_1__2 : rule__Association__Group_1_2_1__2__Impl ;
    public final void rule__Association__Group_1_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1117:1: ( rule__Association__Group_1_2_1__2__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1118:2: rule__Association__Group_1_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_1__2__Impl_in_rule__Association__Group_1_2_1__22180);
            rule__Association__Group_1_2_1__2__Impl();

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
    // $ANTLR end "rule__Association__Group_1_2_1__2"


    // $ANTLR start "rule__Association__Group_1_2_1__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1124:1: rule__Association__Group_1_2_1__2__Impl : ( ';' ) ;
    public final void rule__Association__Group_1_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1128:1: ( ( ';' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1129:1: ( ';' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1129:1: ( ';' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1130:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_1_2()); 
            match(input,20,FOLLOW_20_in_rule__Association__Group_1_2_1__2__Impl2208); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_1__2__Impl"


    // $ANTLR start "rule__Association__Group_1_2_2__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1149:1: rule__Association__Group_1_2_2__0 : rule__Association__Group_1_2_2__0__Impl rule__Association__Group_1_2_2__1 ;
    public final void rule__Association__Group_1_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1153:1: ( rule__Association__Group_1_2_2__0__Impl rule__Association__Group_1_2_2__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1154:2: rule__Association__Group_1_2_2__0__Impl rule__Association__Group_1_2_2__1
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_2__0__Impl_in_rule__Association__Group_1_2_2__02245);
            rule__Association__Group_1_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_2__1_in_rule__Association__Group_1_2_2__02248);
            rule__Association__Group_1_2_2__1();

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
    // $ANTLR end "rule__Association__Group_1_2_2__0"


    // $ANTLR start "rule__Association__Group_1_2_2__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1161:1: rule__Association__Group_1_2_2__0__Impl : ( 'target' ) ;
    public final void rule__Association__Group_1_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1165:1: ( ( 'target' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1166:1: ( 'target' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1166:1: ( 'target' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1167:1: 'target'
            {
             before(grammarAccess.getAssociationAccess().getTargetKeyword_1_2_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Association__Group_1_2_2__0__Impl2276); 
             after(grammarAccess.getAssociationAccess().getTargetKeyword_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_2__0__Impl"


    // $ANTLR start "rule__Association__Group_1_2_2__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1180:1: rule__Association__Group_1_2_2__1 : rule__Association__Group_1_2_2__1__Impl rule__Association__Group_1_2_2__2 ;
    public final void rule__Association__Group_1_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1184:1: ( rule__Association__Group_1_2_2__1__Impl rule__Association__Group_1_2_2__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1185:2: rule__Association__Group_1_2_2__1__Impl rule__Association__Group_1_2_2__2
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_2__1__Impl_in_rule__Association__Group_1_2_2__12307);
            rule__Association__Group_1_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_2__2_in_rule__Association__Group_1_2_2__12310);
            rule__Association__Group_1_2_2__2();

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
    // $ANTLR end "rule__Association__Group_1_2_2__1"


    // $ANTLR start "rule__Association__Group_1_2_2__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1192:1: rule__Association__Group_1_2_2__1__Impl : ( ( rule__Association__TargetAssignment_1_2_2_1 ) ) ;
    public final void rule__Association__Group_1_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1196:1: ( ( ( rule__Association__TargetAssignment_1_2_2_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1197:1: ( ( rule__Association__TargetAssignment_1_2_2_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1197:1: ( ( rule__Association__TargetAssignment_1_2_2_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1198:1: ( rule__Association__TargetAssignment_1_2_2_1 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_1_2_2_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1199:1: ( rule__Association__TargetAssignment_1_2_2_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1199:2: rule__Association__TargetAssignment_1_2_2_1
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_1_2_2_1_in_rule__Association__Group_1_2_2__1__Impl2337);
            rule__Association__TargetAssignment_1_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_1_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_2__1__Impl"


    // $ANTLR start "rule__Association__Group_1_2_2__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1209:1: rule__Association__Group_1_2_2__2 : rule__Association__Group_1_2_2__2__Impl rule__Association__Group_1_2_2__3 ;
    public final void rule__Association__Group_1_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1213:1: ( rule__Association__Group_1_2_2__2__Impl rule__Association__Group_1_2_2__3 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1214:2: rule__Association__Group_1_2_2__2__Impl rule__Association__Group_1_2_2__3
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_2__2__Impl_in_rule__Association__Group_1_2_2__22367);
            rule__Association__Group_1_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_2__3_in_rule__Association__Group_1_2_2__22370);
            rule__Association__Group_1_2_2__3();

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
    // $ANTLR end "rule__Association__Group_1_2_2__2"


    // $ANTLR start "rule__Association__Group_1_2_2__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1221:1: rule__Association__Group_1_2_2__2__Impl : ( '.' ) ;
    public final void rule__Association__Group_1_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1225:1: ( ( '.' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1226:1: ( '.' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1226:1: ( '.' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1227:1: '.'
            {
             before(grammarAccess.getAssociationAccess().getFullStopKeyword_1_2_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Association__Group_1_2_2__2__Impl2398); 
             after(grammarAccess.getAssociationAccess().getFullStopKeyword_1_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_2__2__Impl"


    // $ANTLR start "rule__Association__Group_1_2_2__3"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1240:1: rule__Association__Group_1_2_2__3 : rule__Association__Group_1_2_2__3__Impl rule__Association__Group_1_2_2__4 ;
    public final void rule__Association__Group_1_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1244:1: ( rule__Association__Group_1_2_2__3__Impl rule__Association__Group_1_2_2__4 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1245:2: rule__Association__Group_1_2_2__3__Impl rule__Association__Group_1_2_2__4
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_2__3__Impl_in_rule__Association__Group_1_2_2__32429);
            rule__Association__Group_1_2_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_2__4_in_rule__Association__Group_1_2_2__32432);
            rule__Association__Group_1_2_2__4();

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
    // $ANTLR end "rule__Association__Group_1_2_2__3"


    // $ANTLR start "rule__Association__Group_1_2_2__3__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1252:1: rule__Association__Group_1_2_2__3__Impl : ( ( rule__Association__Target_idAssignment_1_2_2_3 ) ) ;
    public final void rule__Association__Group_1_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1256:1: ( ( ( rule__Association__Target_idAssignment_1_2_2_3 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1257:1: ( ( rule__Association__Target_idAssignment_1_2_2_3 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1257:1: ( ( rule__Association__Target_idAssignment_1_2_2_3 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1258:1: ( rule__Association__Target_idAssignment_1_2_2_3 )
            {
             before(grammarAccess.getAssociationAccess().getTarget_idAssignment_1_2_2_3()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1259:1: ( rule__Association__Target_idAssignment_1_2_2_3 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1259:2: rule__Association__Target_idAssignment_1_2_2_3
            {
            pushFollow(FOLLOW_rule__Association__Target_idAssignment_1_2_2_3_in_rule__Association__Group_1_2_2__3__Impl2459);
            rule__Association__Target_idAssignment_1_2_2_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTarget_idAssignment_1_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_2__3__Impl"


    // $ANTLR start "rule__Association__Group_1_2_2__4"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1269:1: rule__Association__Group_1_2_2__4 : rule__Association__Group_1_2_2__4__Impl ;
    public final void rule__Association__Group_1_2_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1273:1: ( rule__Association__Group_1_2_2__4__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1274:2: rule__Association__Group_1_2_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_2__4__Impl_in_rule__Association__Group_1_2_2__42489);
            rule__Association__Group_1_2_2__4__Impl();

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
    // $ANTLR end "rule__Association__Group_1_2_2__4"


    // $ANTLR start "rule__Association__Group_1_2_2__4__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1280:1: rule__Association__Group_1_2_2__4__Impl : ( ';' ) ;
    public final void rule__Association__Group_1_2_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1284:1: ( ( ';' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1285:1: ( ';' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1285:1: ( ';' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1286:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_2_4()); 
            match(input,20,FOLLOW_20_in_rule__Association__Group_1_2_2__4__Impl2517); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_2__4__Impl"


    // $ANTLR start "rule__Association__Group_1_2_3__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1309:1: rule__Association__Group_1_2_3__0 : rule__Association__Group_1_2_3__0__Impl rule__Association__Group_1_2_3__1 ;
    public final void rule__Association__Group_1_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1313:1: ( rule__Association__Group_1_2_3__0__Impl rule__Association__Group_1_2_3__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1314:2: rule__Association__Group_1_2_3__0__Impl rule__Association__Group_1_2_3__1
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_3__0__Impl_in_rule__Association__Group_1_2_3__02558);
            rule__Association__Group_1_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_3__1_in_rule__Association__Group_1_2_3__02561);
            rule__Association__Group_1_2_3__1();

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
    // $ANTLR end "rule__Association__Group_1_2_3__0"


    // $ANTLR start "rule__Association__Group_1_2_3__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1321:1: rule__Association__Group_1_2_3__0__Impl : ( 'policies' ) ;
    public final void rule__Association__Group_1_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1325:1: ( ( 'policies' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1326:1: ( 'policies' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1326:1: ( 'policies' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1327:1: 'policies'
            {
             before(grammarAccess.getAssociationAccess().getPoliciesKeyword_1_2_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Association__Group_1_2_3__0__Impl2589); 
             after(grammarAccess.getAssociationAccess().getPoliciesKeyword_1_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_3__0__Impl"


    // $ANTLR start "rule__Association__Group_1_2_3__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1340:1: rule__Association__Group_1_2_3__1 : rule__Association__Group_1_2_3__1__Impl rule__Association__Group_1_2_3__2 ;
    public final void rule__Association__Group_1_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1344:1: ( rule__Association__Group_1_2_3__1__Impl rule__Association__Group_1_2_3__2 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1345:2: rule__Association__Group_1_2_3__1__Impl rule__Association__Group_1_2_3__2
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_3__1__Impl_in_rule__Association__Group_1_2_3__12620);
            rule__Association__Group_1_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_3__2_in_rule__Association__Group_1_2_3__12623);
            rule__Association__Group_1_2_3__2();

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
    // $ANTLR end "rule__Association__Group_1_2_3__1"


    // $ANTLR start "rule__Association__Group_1_2_3__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1352:1: rule__Association__Group_1_2_3__1__Impl : ( ( rule__Association__PoliciesAssignment_1_2_3_1 ) ) ;
    public final void rule__Association__Group_1_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1356:1: ( ( ( rule__Association__PoliciesAssignment_1_2_3_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1357:1: ( ( rule__Association__PoliciesAssignment_1_2_3_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1357:1: ( ( rule__Association__PoliciesAssignment_1_2_3_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1358:1: ( rule__Association__PoliciesAssignment_1_2_3_1 )
            {
             before(grammarAccess.getAssociationAccess().getPoliciesAssignment_1_2_3_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1359:1: ( rule__Association__PoliciesAssignment_1_2_3_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1359:2: rule__Association__PoliciesAssignment_1_2_3_1
            {
            pushFollow(FOLLOW_rule__Association__PoliciesAssignment_1_2_3_1_in_rule__Association__Group_1_2_3__1__Impl2650);
            rule__Association__PoliciesAssignment_1_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getPoliciesAssignment_1_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_3__1__Impl"


    // $ANTLR start "rule__Association__Group_1_2_3__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1369:1: rule__Association__Group_1_2_3__2 : rule__Association__Group_1_2_3__2__Impl rule__Association__Group_1_2_3__3 ;
    public final void rule__Association__Group_1_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1373:1: ( rule__Association__Group_1_2_3__2__Impl rule__Association__Group_1_2_3__3 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1374:2: rule__Association__Group_1_2_3__2__Impl rule__Association__Group_1_2_3__3
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_3__2__Impl_in_rule__Association__Group_1_2_3__22680);
            rule__Association__Group_1_2_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_3__3_in_rule__Association__Group_1_2_3__22683);
            rule__Association__Group_1_2_3__3();

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
    // $ANTLR end "rule__Association__Group_1_2_3__2"


    // $ANTLR start "rule__Association__Group_1_2_3__2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1381:1: rule__Association__Group_1_2_3__2__Impl : ( ( rule__Association__Group_1_2_3_2__0 )* ) ;
    public final void rule__Association__Group_1_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1385:1: ( ( ( rule__Association__Group_1_2_3_2__0 )* ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1386:1: ( ( rule__Association__Group_1_2_3_2__0 )* )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1386:1: ( ( rule__Association__Group_1_2_3_2__0 )* )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1387:1: ( rule__Association__Group_1_2_3_2__0 )*
            {
             before(grammarAccess.getAssociationAccess().getGroup_1_2_3_2()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1388:1: ( rule__Association__Group_1_2_3_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1388:2: rule__Association__Group_1_2_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Association__Group_1_2_3_2__0_in_rule__Association__Group_1_2_3__2__Impl2710);
            	    rule__Association__Group_1_2_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAssociationAccess().getGroup_1_2_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_3__2__Impl"


    // $ANTLR start "rule__Association__Group_1_2_3__3"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1398:1: rule__Association__Group_1_2_3__3 : rule__Association__Group_1_2_3__3__Impl ;
    public final void rule__Association__Group_1_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1402:1: ( rule__Association__Group_1_2_3__3__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1403:2: rule__Association__Group_1_2_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_3__3__Impl_in_rule__Association__Group_1_2_3__32741);
            rule__Association__Group_1_2_3__3__Impl();

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
    // $ANTLR end "rule__Association__Group_1_2_3__3"


    // $ANTLR start "rule__Association__Group_1_2_3__3__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1409:1: rule__Association__Group_1_2_3__3__Impl : ( ';' ) ;
    public final void rule__Association__Group_1_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1413:1: ( ( ';' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1414:1: ( ';' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1414:1: ( ';' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1415:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_3_3()); 
            match(input,20,FOLLOW_20_in_rule__Association__Group_1_2_3__3__Impl2769); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_1_2_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_3__3__Impl"


    // $ANTLR start "rule__Association__Group_1_2_3_2__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1436:1: rule__Association__Group_1_2_3_2__0 : rule__Association__Group_1_2_3_2__0__Impl rule__Association__Group_1_2_3_2__1 ;
    public final void rule__Association__Group_1_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1440:1: ( rule__Association__Group_1_2_3_2__0__Impl rule__Association__Group_1_2_3_2__1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1441:2: rule__Association__Group_1_2_3_2__0__Impl rule__Association__Group_1_2_3_2__1
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_3_2__0__Impl_in_rule__Association__Group_1_2_3_2__02808);
            rule__Association__Group_1_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_1_2_3_2__1_in_rule__Association__Group_1_2_3_2__02811);
            rule__Association__Group_1_2_3_2__1();

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
    // $ANTLR end "rule__Association__Group_1_2_3_2__0"


    // $ANTLR start "rule__Association__Group_1_2_3_2__0__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1448:1: rule__Association__Group_1_2_3_2__0__Impl : ( ',' ) ;
    public final void rule__Association__Group_1_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1452:1: ( ( ',' ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1453:1: ( ',' )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1453:1: ( ',' )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1454:1: ','
            {
             before(grammarAccess.getAssociationAccess().getCommaKeyword_1_2_3_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Association__Group_1_2_3_2__0__Impl2839); 
             after(grammarAccess.getAssociationAccess().getCommaKeyword_1_2_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_3_2__0__Impl"


    // $ANTLR start "rule__Association__Group_1_2_3_2__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1467:1: rule__Association__Group_1_2_3_2__1 : rule__Association__Group_1_2_3_2__1__Impl ;
    public final void rule__Association__Group_1_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1471:1: ( rule__Association__Group_1_2_3_2__1__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1472:2: rule__Association__Group_1_2_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group_1_2_3_2__1__Impl_in_rule__Association__Group_1_2_3_2__12870);
            rule__Association__Group_1_2_3_2__1__Impl();

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
    // $ANTLR end "rule__Association__Group_1_2_3_2__1"


    // $ANTLR start "rule__Association__Group_1_2_3_2__1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1478:1: rule__Association__Group_1_2_3_2__1__Impl : ( ( rule__Association__PoliciesAssignment_1_2_3_2_1 ) ) ;
    public final void rule__Association__Group_1_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1482:1: ( ( ( rule__Association__PoliciesAssignment_1_2_3_2_1 ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1483:1: ( ( rule__Association__PoliciesAssignment_1_2_3_2_1 ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1483:1: ( ( rule__Association__PoliciesAssignment_1_2_3_2_1 ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1484:1: ( rule__Association__PoliciesAssignment_1_2_3_2_1 )
            {
             before(grammarAccess.getAssociationAccess().getPoliciesAssignment_1_2_3_2_1()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1485:1: ( rule__Association__PoliciesAssignment_1_2_3_2_1 )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1485:2: rule__Association__PoliciesAssignment_1_2_3_2_1
            {
            pushFollow(FOLLOW_rule__Association__PoliciesAssignment_1_2_3_2_1_in_rule__Association__Group_1_2_3_2__1__Impl2897);
            rule__Association__PoliciesAssignment_1_2_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getPoliciesAssignment_1_2_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_1_2_3_2__1__Impl"


    // $ANTLR start "rule__Policy__UnorderedGroup_2_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1500:1: rule__Policy__UnorderedGroup_2_1 : rule__Policy__UnorderedGroup_2_1__0 {...}?;
    public final void rule__Policy__UnorderedGroup_2_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1());
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1505:1: ( rule__Policy__UnorderedGroup_2_1__0 {...}?)
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1506:2: rule__Policy__UnorderedGroup_2_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__Policy__UnorderedGroup_2_1__0_in_rule__Policy__UnorderedGroup_2_12932);
            rule__Policy__UnorderedGroup_2_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1()) ) {
                throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup_2_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup_2_1"


    // $ANTLR start "rule__Policy__UnorderedGroup_2_1__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1517:1: rule__Policy__UnorderedGroup_2_1__Impl : ( ({...}? => ( ( ( rule__Policy__Group_2_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2_1_2__0 ) ) ) ) ) ;
    public final void rule__Policy__UnorderedGroup_2_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1522:1: ( ( ({...}? => ( ( ( rule__Policy__Group_2_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2_1_2__0 ) ) ) ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1523:3: ( ({...}? => ( ( ( rule__Policy__Group_2_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2_1_2__0 ) ) ) ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1523:3: ( ({...}? => ( ( ( rule__Policy__Group_2_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2_1_2__0 ) ) ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( LA7_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1) ) {
                alt7=2;
            }
            else if ( LA7_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1525:4: ({...}? => ( ( ( rule__Policy__Group_2_1_0__0 ) ) ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1525:4: ({...}? => ( ( ( rule__Policy__Group_2_1_0__0 ) ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1526:5: {...}? => ( ( ( rule__Policy__Group_2_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup_2_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0)");
                    }
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1526:105: ( ( ( rule__Policy__Group_2_1_0__0 ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1527:6: ( ( rule__Policy__Group_2_1_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1533:6: ( ( rule__Policy__Group_2_1_0__0 ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1535:7: ( rule__Policy__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getPolicyAccess().getGroup_2_1_0()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1536:7: ( rule__Policy__Group_2_1_0__0 )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1536:8: rule__Policy__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Policy__Group_2_1_0__0_in_rule__Policy__UnorderedGroup_2_1__Impl3021);
                    rule__Policy__Group_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolicyAccess().getGroup_2_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1542:4: ({...}? => ( ( ( rule__Policy__Group_2_1_1__0 ) ) ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1542:4: ({...}? => ( ( ( rule__Policy__Group_2_1_1__0 ) ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1543:5: {...}? => ( ( ( rule__Policy__Group_2_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup_2_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1)");
                    }
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1543:105: ( ( ( rule__Policy__Group_2_1_1__0 ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1544:6: ( ( rule__Policy__Group_2_1_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1550:6: ( ( rule__Policy__Group_2_1_1__0 ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1552:7: ( rule__Policy__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getPolicyAccess().getGroup_2_1_1()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1553:7: ( rule__Policy__Group_2_1_1__0 )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1553:8: rule__Policy__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Policy__Group_2_1_1__0_in_rule__Policy__UnorderedGroup_2_1__Impl3112);
                    rule__Policy__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolicyAccess().getGroup_2_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1559:4: ({...}? => ( ( ( rule__Policy__Group_2_1_2__0 ) ) ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1559:4: ({...}? => ( ( ( rule__Policy__Group_2_1_2__0 ) ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1560:5: {...}? => ( ( ( rule__Policy__Group_2_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup_2_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2)");
                    }
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1560:105: ( ( ( rule__Policy__Group_2_1_2__0 ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1561:6: ( ( rule__Policy__Group_2_1_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1567:6: ( ( rule__Policy__Group_2_1_2__0 ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1569:7: ( rule__Policy__Group_2_1_2__0 )
                    {
                     before(grammarAccess.getPolicyAccess().getGroup_2_1_2()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1570:7: ( rule__Policy__Group_2_1_2__0 )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1570:8: rule__Policy__Group_2_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Policy__Group_2_1_2__0_in_rule__Policy__UnorderedGroup_2_1__Impl3203);
                    rule__Policy__Group_2_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolicyAccess().getGroup_2_1_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup_2_1__Impl"


    // $ANTLR start "rule__Policy__UnorderedGroup_2_1__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1585:1: rule__Policy__UnorderedGroup_2_1__0 : rule__Policy__UnorderedGroup_2_1__Impl ( rule__Policy__UnorderedGroup_2_1__1 )? ;
    public final void rule__Policy__UnorderedGroup_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1589:1: ( rule__Policy__UnorderedGroup_2_1__Impl ( rule__Policy__UnorderedGroup_2_1__1 )? )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1590:2: rule__Policy__UnorderedGroup_2_1__Impl ( rule__Policy__UnorderedGroup_2_1__1 )?
            {
            pushFollow(FOLLOW_rule__Policy__UnorderedGroup_2_1__Impl_in_rule__Policy__UnorderedGroup_2_1__03262);
            rule__Policy__UnorderedGroup_2_1__Impl();

            state._fsp--;

            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1591:2: ( rule__Policy__UnorderedGroup_2_1__1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( LA8_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1) ) {
                alt8=1;
            }
            else if ( LA8_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1591:2: rule__Policy__UnorderedGroup_2_1__1
                    {
                    pushFollow(FOLLOW_rule__Policy__UnorderedGroup_2_1__1_in_rule__Policy__UnorderedGroup_2_1__03265);
                    rule__Policy__UnorderedGroup_2_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup_2_1__0"


    // $ANTLR start "rule__Policy__UnorderedGroup_2_1__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1598:1: rule__Policy__UnorderedGroup_2_1__1 : rule__Policy__UnorderedGroup_2_1__Impl ( rule__Policy__UnorderedGroup_2_1__2 )? ;
    public final void rule__Policy__UnorderedGroup_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1602:1: ( rule__Policy__UnorderedGroup_2_1__Impl ( rule__Policy__UnorderedGroup_2_1__2 )? )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1603:2: rule__Policy__UnorderedGroup_2_1__Impl ( rule__Policy__UnorderedGroup_2_1__2 )?
            {
            pushFollow(FOLLOW_rule__Policy__UnorderedGroup_2_1__Impl_in_rule__Policy__UnorderedGroup_2_1__13290);
            rule__Policy__UnorderedGroup_2_1__Impl();

            state._fsp--;

            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1604:2: ( rule__Policy__UnorderedGroup_2_1__2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( LA9_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 1) ) {
                alt9=1;
            }
            else if ( LA9_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup_2_1(), 2) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1604:2: rule__Policy__UnorderedGroup_2_1__2
                    {
                    pushFollow(FOLLOW_rule__Policy__UnorderedGroup_2_1__2_in_rule__Policy__UnorderedGroup_2_1__13293);
                    rule__Policy__UnorderedGroup_2_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup_2_1__1"


    // $ANTLR start "rule__Policy__UnorderedGroup_2_1__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1611:1: rule__Policy__UnorderedGroup_2_1__2 : rule__Policy__UnorderedGroup_2_1__Impl ;
    public final void rule__Policy__UnorderedGroup_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1615:1: ( rule__Policy__UnorderedGroup_2_1__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1616:2: rule__Policy__UnorderedGroup_2_1__Impl
            {
            pushFollow(FOLLOW_rule__Policy__UnorderedGroup_2_1__Impl_in_rule__Policy__UnorderedGroup_2_1__23318);
            rule__Policy__UnorderedGroup_2_1__Impl();

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
    // $ANTLR end "rule__Policy__UnorderedGroup_2_1__2"


    // $ANTLR start "rule__Association__UnorderedGroup_1_2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1629:1: rule__Association__UnorderedGroup_1_2 : rule__Association__UnorderedGroup_1_2__0 {...}?;
    public final void rule__Association__UnorderedGroup_1_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1634:1: ( rule__Association__UnorderedGroup_1_2__0 {...}?)
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1635:2: rule__Association__UnorderedGroup_1_2__0 {...}?
            {
            pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2__0_in_rule__Association__UnorderedGroup_1_23348);
            rule__Association__UnorderedGroup_1_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2()) ) {
                throw new FailedPredicateException(input, "rule__Association__UnorderedGroup_1_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__UnorderedGroup_1_2"


    // $ANTLR start "rule__Association__UnorderedGroup_1_2__Impl"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1646:1: rule__Association__UnorderedGroup_1_2__Impl : ( ({...}? => ( ( ( rule__Association__Group_1_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_3__0 ) ) ) ) ) ;
    public final void rule__Association__UnorderedGroup_1_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1651:1: ( ( ({...}? => ( ( ( rule__Association__Group_1_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_3__0 ) ) ) ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1652:3: ( ({...}? => ( ( ( rule__Association__Group_1_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_3__0 ) ) ) ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1652:3: ( ({...}? => ( ( ( rule__Association__Group_1_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Association__Group_1_2_3__0 ) ) ) ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( LA10_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1) ) {
                alt10=2;
            }
            else if ( LA10_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2) ) {
                alt10=3;
            }
            else if ( LA10_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3) ) {
                alt10=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1654:4: ({...}? => ( ( ( rule__Association__Group_1_2_0__0 ) ) ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1654:4: ({...}? => ( ( ( rule__Association__Group_1_2_0__0 ) ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1655:5: {...}? => ( ( ( rule__Association__Group_1_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Association__UnorderedGroup_1_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0)");
                    }
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1655:110: ( ( ( rule__Association__Group_1_2_0__0 ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1656:6: ( ( rule__Association__Group_1_2_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1662:6: ( ( rule__Association__Group_1_2_0__0 ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1664:7: ( rule__Association__Group_1_2_0__0 )
                    {
                     before(grammarAccess.getAssociationAccess().getGroup_1_2_0()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1665:7: ( rule__Association__Group_1_2_0__0 )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1665:8: rule__Association__Group_1_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_1_2_0__0_in_rule__Association__UnorderedGroup_1_2__Impl3437);
                    rule__Association__Group_1_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getGroup_1_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1671:4: ({...}? => ( ( ( rule__Association__Group_1_2_1__0 ) ) ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1671:4: ({...}? => ( ( ( rule__Association__Group_1_2_1__0 ) ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1672:5: {...}? => ( ( ( rule__Association__Group_1_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Association__UnorderedGroup_1_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1)");
                    }
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1672:110: ( ( ( rule__Association__Group_1_2_1__0 ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1673:6: ( ( rule__Association__Group_1_2_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1679:6: ( ( rule__Association__Group_1_2_1__0 ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1681:7: ( rule__Association__Group_1_2_1__0 )
                    {
                     before(grammarAccess.getAssociationAccess().getGroup_1_2_1()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1682:7: ( rule__Association__Group_1_2_1__0 )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1682:8: rule__Association__Group_1_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_1_2_1__0_in_rule__Association__UnorderedGroup_1_2__Impl3528);
                    rule__Association__Group_1_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getGroup_1_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1688:4: ({...}? => ( ( ( rule__Association__Group_1_2_2__0 ) ) ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1688:4: ({...}? => ( ( ( rule__Association__Group_1_2_2__0 ) ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1689:5: {...}? => ( ( ( rule__Association__Group_1_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Association__UnorderedGroup_1_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2)");
                    }
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1689:110: ( ( ( rule__Association__Group_1_2_2__0 ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1690:6: ( ( rule__Association__Group_1_2_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1696:6: ( ( rule__Association__Group_1_2_2__0 ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1698:7: ( rule__Association__Group_1_2_2__0 )
                    {
                     before(grammarAccess.getAssociationAccess().getGroup_1_2_2()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1699:7: ( rule__Association__Group_1_2_2__0 )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1699:8: rule__Association__Group_1_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_1_2_2__0_in_rule__Association__UnorderedGroup_1_2__Impl3619);
                    rule__Association__Group_1_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getGroup_1_2_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1705:4: ({...}? => ( ( ( rule__Association__Group_1_2_3__0 ) ) ) )
                    {
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1705:4: ({...}? => ( ( ( rule__Association__Group_1_2_3__0 ) ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1706:5: {...}? => ( ( ( rule__Association__Group_1_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Association__UnorderedGroup_1_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3)");
                    }
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1706:110: ( ( ( rule__Association__Group_1_2_3__0 ) ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1707:6: ( ( rule__Association__Group_1_2_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1713:6: ( ( rule__Association__Group_1_2_3__0 ) )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1715:7: ( rule__Association__Group_1_2_3__0 )
                    {
                     before(grammarAccess.getAssociationAccess().getGroup_1_2_3()); 
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1716:7: ( rule__Association__Group_1_2_3__0 )
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1716:8: rule__Association__Group_1_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_1_2_3__0_in_rule__Association__UnorderedGroup_1_2__Impl3710);
                    rule__Association__Group_1_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getGroup_1_2_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__UnorderedGroup_1_2__Impl"


    // $ANTLR start "rule__Association__UnorderedGroup_1_2__0"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1731:1: rule__Association__UnorderedGroup_1_2__0 : rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__1 )? ;
    public final void rule__Association__UnorderedGroup_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1735:1: ( rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__1 )? )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1736:2: rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__1 )?
            {
            pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2__Impl_in_rule__Association__UnorderedGroup_1_2__03769);
            rule__Association__UnorderedGroup_1_2__Impl();

            state._fsp--;

            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1737:2: ( rule__Association__UnorderedGroup_1_2__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2) ) {
                alt11=1;
            }
            else if ( LA11_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1737:2: rule__Association__UnorderedGroup_1_2__1
                    {
                    pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2__1_in_rule__Association__UnorderedGroup_1_2__03772);
                    rule__Association__UnorderedGroup_1_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__UnorderedGroup_1_2__0"


    // $ANTLR start "rule__Association__UnorderedGroup_1_2__1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1744:1: rule__Association__UnorderedGroup_1_2__1 : rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__2 )? ;
    public final void rule__Association__UnorderedGroup_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1748:1: ( rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__2 )? )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1749:2: rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__2 )?
            {
            pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2__Impl_in_rule__Association__UnorderedGroup_1_2__13797);
            rule__Association__UnorderedGroup_1_2__Impl();

            state._fsp--;

            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1750:2: ( rule__Association__UnorderedGroup_1_2__2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2) ) {
                alt12=1;
            }
            else if ( LA12_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1750:2: rule__Association__UnorderedGroup_1_2__2
                    {
                    pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2__2_in_rule__Association__UnorderedGroup_1_2__13800);
                    rule__Association__UnorderedGroup_1_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__UnorderedGroup_1_2__1"


    // $ANTLR start "rule__Association__UnorderedGroup_1_2__2"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1757:1: rule__Association__UnorderedGroup_1_2__2 : rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__3 )? ;
    public final void rule__Association__UnorderedGroup_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1761:1: ( rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__3 )? )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1762:2: rule__Association__UnorderedGroup_1_2__Impl ( rule__Association__UnorderedGroup_1_2__3 )?
            {
            pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2__Impl_in_rule__Association__UnorderedGroup_1_2__23825);
            rule__Association__UnorderedGroup_1_2__Impl();

            state._fsp--;

            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1763:2: ( rule__Association__UnorderedGroup_1_2__3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_1_2(), 3) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1763:2: rule__Association__UnorderedGroup_1_2__3
                    {
                    pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2__3_in_rule__Association__UnorderedGroup_1_2__23828);
                    rule__Association__UnorderedGroup_1_2__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__UnorderedGroup_1_2__2"


    // $ANTLR start "rule__Association__UnorderedGroup_1_2__3"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1770:1: rule__Association__UnorderedGroup_1_2__3 : rule__Association__UnorderedGroup_1_2__Impl ;
    public final void rule__Association__UnorderedGroup_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1774:1: ( rule__Association__UnorderedGroup_1_2__Impl )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1775:2: rule__Association__UnorderedGroup_1_2__Impl
            {
            pushFollow(FOLLOW_rule__Association__UnorderedGroup_1_2__Impl_in_rule__Association__UnorderedGroup_1_2__33853);
            rule__Association__UnorderedGroup_1_2__Impl();

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
    // $ANTLR end "rule__Association__UnorderedGroup_1_2__3"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1790:1: rule__Model__ElementsAssignment : ( ruleElements ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1794:1: ( ( ruleElements ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1795:1: ( ruleElements )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1795:1: ( ruleElements )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1796:1: ruleElements
            {
             before(grammarAccess.getModelAccess().getElementsElementsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElements_in_rule__Model__ElementsAssignment3889);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1805:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1809:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1810:1: ( RULE_ID )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1810:1: ( RULE_ID )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1811:1: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Policy__NameAssignment_13920); 
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


    // $ANTLR start "rule__Policy__PermissionAssignment_2_1_0_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1820:1: rule__Policy__PermissionAssignment_2_1_0_1 : ( rulePermissionType ) ;
    public final void rule__Policy__PermissionAssignment_2_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1824:1: ( ( rulePermissionType ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1825:1: ( rulePermissionType )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1825:1: ( rulePermissionType )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1826:1: rulePermissionType
            {
             before(grammarAccess.getPolicyAccess().getPermissionPermissionTypeEnumRuleCall_2_1_0_1_0()); 
            pushFollow(FOLLOW_rulePermissionType_in_rule__Policy__PermissionAssignment_2_1_0_13951);
            rulePermissionType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getPermissionPermissionTypeEnumRuleCall_2_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__PermissionAssignment_2_1_0_1"


    // $ANTLR start "rule__Policy__QueryAssignment_2_1_1_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1835:1: rule__Policy__QueryAssignment_2_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Policy__QueryAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1839:1: ( ( RULE_STRING ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1840:1: ( RULE_STRING )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1840:1: ( RULE_STRING )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1841:1: RULE_STRING
            {
             before(grammarAccess.getPolicyAccess().getQuerySTRINGTerminalRuleCall_2_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Policy__QueryAssignment_2_1_1_13982); 
             after(grammarAccess.getPolicyAccess().getQuerySTRINGTerminalRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__QueryAssignment_2_1_1_1"


    // $ANTLR start "rule__Policy__PatternAssignment_2_1_2_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1850:1: rule__Policy__PatternAssignment_2_1_2_1 : ( RULE_STRING ) ;
    public final void rule__Policy__PatternAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1854:1: ( ( RULE_STRING ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1855:1: ( RULE_STRING )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1855:1: ( RULE_STRING )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1856:1: RULE_STRING
            {
             before(grammarAccess.getPolicyAccess().getPatternSTRINGTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Policy__PatternAssignment_2_1_2_14013); 
             after(grammarAccess.getPolicyAccess().getPatternSTRINGTerminalRuleCall_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__PatternAssignment_2_1_2_1"


    // $ANTLR start "rule__Association__TesztAssignment_1_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1865:1: rule__Association__TesztAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Association__TesztAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1869:1: ( ( RULE_STRING ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1870:1: ( RULE_STRING )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1870:1: ( RULE_STRING )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1871:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getTesztSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__TesztAssignment_1_14044); 
             after(grammarAccess.getAssociationAccess().getTesztSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__TesztAssignment_1_1"


    // $ANTLR start "rule__Association__DefaultPermissionAssignment_1_2_0_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1880:1: rule__Association__DefaultPermissionAssignment_1_2_0_1 : ( rulePermissionType ) ;
    public final void rule__Association__DefaultPermissionAssignment_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1884:1: ( ( rulePermissionType ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1885:1: ( rulePermissionType )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1885:1: ( rulePermissionType )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1886:1: rulePermissionType
            {
             before(grammarAccess.getAssociationAccess().getDefaultPermissionPermissionTypeEnumRuleCall_1_2_0_1_0()); 
            pushFollow(FOLLOW_rulePermissionType_in_rule__Association__DefaultPermissionAssignment_1_2_0_14075);
            rulePermissionType();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getDefaultPermissionPermissionTypeEnumRuleCall_1_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__DefaultPermissionAssignment_1_2_0_1"


    // $ANTLR start "rule__Association__OverrideAssignment_1_2_1_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1895:1: rule__Association__OverrideAssignment_1_2_1_1 : ( rulePermissionType ) ;
    public final void rule__Association__OverrideAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1899:1: ( ( rulePermissionType ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1900:1: ( rulePermissionType )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1900:1: ( rulePermissionType )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1901:1: rulePermissionType
            {
             before(grammarAccess.getAssociationAccess().getOverridePermissionTypeEnumRuleCall_1_2_1_1_0()); 
            pushFollow(FOLLOW_rulePermissionType_in_rule__Association__OverrideAssignment_1_2_1_14106);
            rulePermissionType();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getOverridePermissionTypeEnumRuleCall_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__OverrideAssignment_1_2_1_1"


    // $ANTLR start "rule__Association__TargetAssignment_1_2_2_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1910:1: rule__Association__TargetAssignment_1_2_2_1 : ( ruleTargetType ) ;
    public final void rule__Association__TargetAssignment_1_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1914:1: ( ( ruleTargetType ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1915:1: ( ruleTargetType )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1915:1: ( ruleTargetType )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1916:1: ruleTargetType
            {
             before(grammarAccess.getAssociationAccess().getTargetTargetTypeEnumRuleCall_1_2_2_1_0()); 
            pushFollow(FOLLOW_ruleTargetType_in_rule__Association__TargetAssignment_1_2_2_14137);
            ruleTargetType();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getTargetTargetTypeEnumRuleCall_1_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__TargetAssignment_1_2_2_1"


    // $ANTLR start "rule__Association__Target_idAssignment_1_2_2_3"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1925:1: rule__Association__Target_idAssignment_1_2_2_3 : ( RULE_STRING ) ;
    public final void rule__Association__Target_idAssignment_1_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1929:1: ( ( RULE_STRING ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1930:1: ( RULE_STRING )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1930:1: ( RULE_STRING )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1931:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getTarget_idSTRINGTerminalRuleCall_1_2_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__Target_idAssignment_1_2_2_34168); 
             after(grammarAccess.getAssociationAccess().getTarget_idSTRINGTerminalRuleCall_1_2_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Target_idAssignment_1_2_2_3"


    // $ANTLR start "rule__Association__PoliciesAssignment_1_2_3_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1940:1: rule__Association__PoliciesAssignment_1_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Association__PoliciesAssignment_1_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1944:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1945:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1945:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1946:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getPoliciesPolicyCrossReference_1_2_3_1_0()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1947:1: ( RULE_ID )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1948:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getPoliciesPolicyIDTerminalRuleCall_1_2_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__PoliciesAssignment_1_2_3_14203); 
             after(grammarAccess.getAssociationAccess().getPoliciesPolicyIDTerminalRuleCall_1_2_3_1_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getPoliciesPolicyCrossReference_1_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__PoliciesAssignment_1_2_3_1"


    // $ANTLR start "rule__Association__PoliciesAssignment_1_2_3_2_1"
    // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1959:1: rule__Association__PoliciesAssignment_1_2_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Association__PoliciesAssignment_1_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1963:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1964:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1964:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1965:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getPoliciesPolicyCrossReference_1_2_3_2_1_0()); 
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1966:1: ( RULE_ID )
            // ../hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.ui/src-gen/hu/bme/mit/ftsrg/mondo/accesscontrol/policydsl/ui/contentassist/antlr/internal/InternalPolicy.g:1967:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getPoliciesPolicyIDTerminalRuleCall_1_2_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__PoliciesAssignment_1_2_3_2_14242); 
             after(grammarAccess.getAssociationAccess().getPoliciesPolicyIDTerminalRuleCall_1_2_3_2_1_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getPoliciesPolicyCrossReference_1_2_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__PoliciesAssignment_1_2_3_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000810002L});
    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0_in_rulePolicy155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElements_in_entryRuleElements242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElements249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elements__Alternatives_in_ruleElements275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PermissionType__Alternatives_in_rulePermissionType312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetType__Alternatives_in_ruleTargetType348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_rule__Elements__Alternatives383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Elements__Alternatives400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PermissionType__Alternatives433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PermissionType__Alternatives454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PermissionType__Alternatives475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TargetType__Alternatives511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TargetType__Alternatives532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__0565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__0568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Policy__Group__0__Impl596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__1627 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__NameAssignment_1_in_rule__Policy__Group__1__Impl657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2__0_in_rule__Policy__Group__2__Impl714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2__0__Impl_in_rule__Policy__Group_2__0750 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_rule__Policy__Group_2__1_in_rule__Policy__Group_2__0753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Policy__Group_2__0__Impl781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2__1__Impl_in_rule__Policy__Group_2__1812 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Policy__Group_2__2_in_rule__Policy__Group_2__1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__UnorderedGroup_2_1_in_rule__Policy__Group_2__1__Impl842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2__2__Impl_in_rule__Policy__Group_2__2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Policy__Group_2__2__Impl900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_0__0__Impl_in_rule__Policy__Group_2_1_0__0937 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_0__1_in_rule__Policy__Group_2_1_0__0940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Policy__Group_2_1_0__0__Impl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_0__1__Impl_in_rule__Policy__Group_2_1_0__1999 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_0__2_in_rule__Policy__Group_2_1_0__11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__PermissionAssignment_2_1_0_1_in_rule__Policy__Group_2_1_0__1__Impl1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_0__2__Impl_in_rule__Policy__Group_2_1_0__21059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Policy__Group_2_1_0__2__Impl1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_1__0__Impl_in_rule__Policy__Group_2_1_1__01124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_1__1_in_rule__Policy__Group_2_1_1__01127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Policy__Group_2_1_1__0__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_1__1__Impl_in_rule__Policy__Group_2_1_1__11186 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_1__2_in_rule__Policy__Group_2_1_1__11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__QueryAssignment_2_1_1_1_in_rule__Policy__Group_2_1_1__1__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_1__2__Impl_in_rule__Policy__Group_2_1_1__21246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Policy__Group_2_1_1__2__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_2__0__Impl_in_rule__Policy__Group_2_1_2__01311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_2__1_in_rule__Policy__Group_2_1_2__01314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Policy__Group_2_1_2__0__Impl1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_2__1__Impl_in_rule__Policy__Group_2_1_2__11373 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_2__2_in_rule__Policy__Group_2_1_2__11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__PatternAssignment_2_1_2_1_in_rule__Policy__Group_2_1_2__1__Impl1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_2__2__Impl_in_rule__Policy__Group_2_1_2__21433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Policy__Group_2_1_2__2__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__01498 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Association__Group__0__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__11560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1__0_in_rule__Association__Group__1__Impl1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1__0__Impl_in_rule__Association__Group_1__01621 = new BitSet(new long[]{0x0000000017000020L});
    public static final BitSet FOLLOW_rule__Association__Group_1__1_in_rule__Association__Group_1__01624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Association__Group_1__0__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1__1__Impl_in_rule__Association__Group_1__11683 = new BitSet(new long[]{0x0000000017000020L});
    public static final BitSet FOLLOW_rule__Association__Group_1__2_in_rule__Association__Group_1__11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TesztAssignment_1_1_in_rule__Association__Group_1__1__Impl1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1__2__Impl_in_rule__Association__Group_1__21744 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Association__Group_1__3_in_rule__Association__Group_1__21747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2_in_rule__Association__Group_1__2__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1__3__Impl_in_rule__Association__Group_1__31804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Association__Group_1__3__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_0__0__Impl_in_rule__Association__Group_1_2_0__01871 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_0__1_in_rule__Association__Group_1_2_0__01874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Association__Group_1_2_0__0__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_0__1__Impl_in_rule__Association__Group_1_2_0__11933 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_0__2_in_rule__Association__Group_1_2_0__11936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__DefaultPermissionAssignment_1_2_0_1_in_rule__Association__Group_1_2_0__1__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_0__2__Impl_in_rule__Association__Group_1_2_0__21993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Association__Group_1_2_0__2__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_1__0__Impl_in_rule__Association__Group_1_2_1__02058 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_1__1_in_rule__Association__Group_1_2_1__02061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Association__Group_1_2_1__0__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_1__1__Impl_in_rule__Association__Group_1_2_1__12120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_1__2_in_rule__Association__Group_1_2_1__12123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__OverrideAssignment_1_2_1_1_in_rule__Association__Group_1_2_1__1__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_1__2__Impl_in_rule__Association__Group_1_2_1__22180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Association__Group_1_2_1__2__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__0__Impl_in_rule__Association__Group_1_2_2__02245 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__1_in_rule__Association__Group_1_2_2__02248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Association__Group_1_2_2__0__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__1__Impl_in_rule__Association__Group_1_2_2__12307 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__2_in_rule__Association__Group_1_2_2__12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_1_2_2_1_in_rule__Association__Group_1_2_2__1__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__2__Impl_in_rule__Association__Group_1_2_2__22367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__3_in_rule__Association__Group_1_2_2__22370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Association__Group_1_2_2__2__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__3__Impl_in_rule__Association__Group_1_2_2__32429 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__4_in_rule__Association__Group_1_2_2__32432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Target_idAssignment_1_2_2_3_in_rule__Association__Group_1_2_2__3__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__4__Impl_in_rule__Association__Group_1_2_2__42489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Association__Group_1_2_2__4__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3__0__Impl_in_rule__Association__Group_1_2_3__02558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3__1_in_rule__Association__Group_1_2_3__02561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Association__Group_1_2_3__0__Impl2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3__1__Impl_in_rule__Association__Group_1_2_3__12620 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3__2_in_rule__Association__Group_1_2_3__12623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__PoliciesAssignment_1_2_3_1_in_rule__Association__Group_1_2_3__1__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3__2__Impl_in_rule__Association__Group_1_2_3__22680 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3__3_in_rule__Association__Group_1_2_3__22683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3_2__0_in_rule__Association__Group_1_2_3__2__Impl2710 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3__3__Impl_in_rule__Association__Group_1_2_3__32741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Association__Group_1_2_3__3__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3_2__0__Impl_in_rule__Association__Group_1_2_3_2__02808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3_2__1_in_rule__Association__Group_1_2_3_2__02811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Association__Group_1_2_3_2__0__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3_2__1__Impl_in_rule__Association__Group_1_2_3_2__12870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__PoliciesAssignment_1_2_3_2_1_in_rule__Association__Group_1_2_3_2__1__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__UnorderedGroup_2_1__0_in_rule__Policy__UnorderedGroup_2_12932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_0__0_in_rule__Policy__UnorderedGroup_2_1__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_1__0_in_rule__Policy__UnorderedGroup_2_1__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group_2_1_2__0_in_rule__Policy__UnorderedGroup_2_1__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__UnorderedGroup_2_1__Impl_in_rule__Policy__UnorderedGroup_2_1__03262 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_rule__Policy__UnorderedGroup_2_1__1_in_rule__Policy__UnorderedGroup_2_1__03265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__UnorderedGroup_2_1__Impl_in_rule__Policy__UnorderedGroup_2_1__13290 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_rule__Policy__UnorderedGroup_2_1__2_in_rule__Policy__UnorderedGroup_2_1__13293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__UnorderedGroup_2_1__Impl_in_rule__Policy__UnorderedGroup_2_1__23318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2__0_in_rule__Association__UnorderedGroup_1_23348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_0__0_in_rule__Association__UnorderedGroup_1_2__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_1__0_in_rule__Association__UnorderedGroup_1_2__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_2__0_in_rule__Association__UnorderedGroup_1_2__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_1_2_3__0_in_rule__Association__UnorderedGroup_1_2__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2__Impl_in_rule__Association__UnorderedGroup_1_2__03769 = new BitSet(new long[]{0x0000000017000022L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2__1_in_rule__Association__UnorderedGroup_1_2__03772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2__Impl_in_rule__Association__UnorderedGroup_1_2__13797 = new BitSet(new long[]{0x0000000017000022L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2__2_in_rule__Association__UnorderedGroup_1_2__13800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2__Impl_in_rule__Association__UnorderedGroup_1_2__23825 = new BitSet(new long[]{0x0000000017000022L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2__3_in_rule__Association__UnorderedGroup_1_2__23828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__UnorderedGroup_1_2__Impl_in_rule__Association__UnorderedGroup_1_2__33853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElements_in_rule__Model__ElementsAssignment3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Policy__NameAssignment_13920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermissionType_in_rule__Policy__PermissionAssignment_2_1_0_13951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Policy__QueryAssignment_2_1_1_13982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Policy__PatternAssignment_2_1_2_14013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__TesztAssignment_1_14044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermissionType_in_rule__Association__DefaultPermissionAssignment_1_2_0_14075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermissionType_in_rule__Association__OverrideAssignment_1_2_1_14106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetType_in_rule__Association__TargetAssignment_1_2_2_14137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__Target_idAssignment_1_2_2_34168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__PoliciesAssignment_1_2_3_14203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__PoliciesAssignment_1_2_3_2_14242 = new BitSet(new long[]{0x0000000000000002L});

}
