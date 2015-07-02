package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Model;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.services.PolicyGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PolicySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PolicyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PolicyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PolicyPackage.ASSOCIATION:
				if(context == grammarAccess.getAssociationRule() ||
				   context == grammarAccess.getElementsRule()) {
					sequence_Association(context, (Association) semanticObject); 
					return; 
				}
				else break;
			case PolicyPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PolicyPackage.POLICY:
				if(context == grammarAccess.getElementsRule() ||
				   context == grammarAccess.getPolicyRule()) {
					sequence_Policy(context, (Policy) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         teszt=STRING? 
	 *         defaultPermission=PermissionType? 
	 *         override=PermissionType 
	 *         target=TargetType 
	 *         target_id=STRING 
	 *         policies+=[Policy|ID] 
	 *         policies+=[Policy|ID]*
	 *     )
	 */
	protected void sequence_Association(EObject context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Elements*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID permission=PermissionType query=STRING pattern=STRING)
	 */
	protected void sequence_Policy(EObject context, Policy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PolicyPackage.Literals.POLICY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolicyPackage.Literals.POLICY__NAME));
			if(transientValues.isValueTransient(semanticObject, PolicyPackage.Literals.POLICY__PERMISSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolicyPackage.Literals.POLICY__PERMISSION));
			if(transientValues.isValueTransient(semanticObject, PolicyPackage.Literals.POLICY__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolicyPackage.Literals.POLICY__QUERY));
			if(transientValues.isValueTransient(semanticObject, PolicyPackage.Literals.POLICY__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolicyPackage.Literals.POLICY__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPolicyAccess().getPermissionPermissionTypeEnumRuleCall_2_1_0_1_0(), semanticObject.getPermission());
		feeder.accept(grammarAccess.getPolicyAccess().getQuerySTRINGTerminalRuleCall_2_1_1_1_0(), semanticObject.getQuery());
		feeder.accept(grammarAccess.getPolicyAccess().getPatternSTRINGTerminalRuleCall_2_1_2_1_0(), semanticObject.getPattern());
		feeder.finish();
	}
}
