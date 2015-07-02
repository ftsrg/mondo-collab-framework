/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage
 * @generated
 */
public class WTSpecSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WTSpecPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSpecSwitch() {
		if (modelPackage == null) {
			modelPackage = WTSpecPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WTSpecPackage.WT: {
				WT wt = (WT)theEObject;
				T result = caseWT(wt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.SYSTEM_INPUT: {
				SystemInput systemInput = (SystemInput)theEObject;
				T result = caseSystemInput(systemInput);
				if (result == null) result = caseWTCInput(systemInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.SYSTEM_OUTPUT: {
				SystemOutput systemOutput = (SystemOutput)theEObject;
				T result = caseSystemOutput(systemOutput);
				if (result == null) result = caseWTCOutput(systemOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.SYSTEM_FAULT: {
				SystemFault systemFault = (SystemFault)theEObject;
				T result = caseSystemFault(systemFault);
				if (result == null) result = caseWTCFault(systemFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.SYSTEM_PARAM: {
				SystemParam systemParam = (SystemParam)theEObject;
				T result = caseSystemParam(systemParam);
				if (result == null) result = caseWTCParam(systemParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.SYSTEM_TIMER: {
				SystemTimer systemTimer = (SystemTimer)theEObject;
				T result = caseSystemTimer(systemTimer);
				if (result == null) result = caseWTCTimer(systemTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.SYSTEM_VARIABLE: {
				SystemVariable systemVariable = (SystemVariable)theEObject;
				T result = caseSystemVariable(systemVariable);
				if (result == null) result = caseWTCInput(systemVariable);
				if (result == null) result = caseWTCOutput(systemVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.SYSTEM_ERROR_REACTION: {
				SystemErrorReaction systemErrorReaction = (SystemErrorReaction)theEObject;
				T result = caseSystemErrorReaction(systemErrorReaction);
				if (result == null) result = caseWTCErrorReaction(systemErrorReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.WTC_INPUT: {
				WTCInput wtcInput = (WTCInput)theEObject;
				T result = caseWTCInput(wtcInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.WTC_OUTPUT: {
				WTCOutput wtcOutput = (WTCOutput)theEObject;
				T result = caseWTCOutput(wtcOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.WTC_PARAM: {
				WTCParam wtcParam = (WTCParam)theEObject;
				T result = caseWTCParam(wtcParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.WTC_TIMER: {
				WTCTimer wtcTimer = (WTCTimer)theEObject;
				T result = caseWTCTimer(wtcTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.WTC_FAULT: {
				WTCFault wtcFault = (WTCFault)theEObject;
				T result = caseWTCFault(wtcFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.WTC_ERROR_REACTION: {
				WTCErrorReaction wtcErrorReaction = (WTCErrorReaction)theEObject;
				T result = caseWTCErrorReaction(wtcErrorReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.SUBSYSTEM: {
				Subsystem subsystem = (Subsystem)theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.WTC: {
				wtc wtc = (wtc)theEObject;
				T result = casewtc(wtc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT1: {
				CtrlUnit1 ctrlUnit1 = (CtrlUnit1)theEObject;
				T result = caseCtrlUnit1(ctrlUnit1);
				if (result == null) result = casewtc(ctrlUnit1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT2: {
				CtrlUnit2 ctrlUnit2 = (CtrlUnit2)theEObject;
				T result = caseCtrlUnit2(ctrlUnit2);
				if (result == null) result = casewtc(ctrlUnit2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT3: {
				CtrlUnit3 ctrlUnit3 = (CtrlUnit3)theEObject;
				T result = caseCtrlUnit3(ctrlUnit3);
				if (result == null) result = casewtc(ctrlUnit3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT4: {
				CtrlUnit4 ctrlUnit4 = (CtrlUnit4)theEObject;
				T result = caseCtrlUnit4(ctrlUnit4);
				if (result == null) result = casewtc(ctrlUnit4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT5: {
				CtrlUnit5 ctrlUnit5 = (CtrlUnit5)theEObject;
				T result = caseCtrlUnit5(ctrlUnit5);
				if (result == null) result = casewtc(ctrlUnit5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT6: {
				CtrlUnit6 ctrlUnit6 = (CtrlUnit6)theEObject;
				T result = caseCtrlUnit6(ctrlUnit6);
				if (result == null) result = casewtc(ctrlUnit6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT7: {
				CtrlUnit7 ctrlUnit7 = (CtrlUnit7)theEObject;
				T result = caseCtrlUnit7(ctrlUnit7);
				if (result == null) result = casewtc(ctrlUnit7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT8: {
				CtrlUnit8 ctrlUnit8 = (CtrlUnit8)theEObject;
				T result = caseCtrlUnit8(ctrlUnit8);
				if (result == null) result = casewtc(ctrlUnit8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT9: {
				CtrlUnit9 ctrlUnit9 = (CtrlUnit9)theEObject;
				T result = caseCtrlUnit9(ctrlUnit9);
				if (result == null) result = casewtc(ctrlUnit9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT10: {
				CtrlUnit10 ctrlUnit10 = (CtrlUnit10)theEObject;
				T result = caseCtrlUnit10(ctrlUnit10);
				if (result == null) result = casewtc(ctrlUnit10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT11: {
				CtrlUnit11 ctrlUnit11 = (CtrlUnit11)theEObject;
				T result = caseCtrlUnit11(ctrlUnit11);
				if (result == null) result = casewtc(ctrlUnit11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT12: {
				CtrlUnit12 ctrlUnit12 = (CtrlUnit12)theEObject;
				T result = caseCtrlUnit12(ctrlUnit12);
				if (result == null) result = casewtc(ctrlUnit12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT13: {
				CtrlUnit13 ctrlUnit13 = (CtrlUnit13)theEObject;
				T result = caseCtrlUnit13(ctrlUnit13);
				if (result == null) result = casewtc(ctrlUnit13);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT14: {
				CtrlUnit14 ctrlUnit14 = (CtrlUnit14)theEObject;
				T result = caseCtrlUnit14(ctrlUnit14);
				if (result == null) result = casewtc(ctrlUnit14);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT15: {
				CtrlUnit15 ctrlUnit15 = (CtrlUnit15)theEObject;
				T result = caseCtrlUnit15(ctrlUnit15);
				if (result == null) result = casewtc(ctrlUnit15);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT16: {
				CtrlUnit16 ctrlUnit16 = (CtrlUnit16)theEObject;
				T result = caseCtrlUnit16(ctrlUnit16);
				if (result == null) result = casewtc(ctrlUnit16);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT17: {
				CtrlUnit17 ctrlUnit17 = (CtrlUnit17)theEObject;
				T result = caseCtrlUnit17(ctrlUnit17);
				if (result == null) result = casewtc(ctrlUnit17);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT18: {
				CtrlUnit18 ctrlUnit18 = (CtrlUnit18)theEObject;
				T result = caseCtrlUnit18(ctrlUnit18);
				if (result == null) result = casewtc(ctrlUnit18);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT19: {
				CtrlUnit19 ctrlUnit19 = (CtrlUnit19)theEObject;
				T result = caseCtrlUnit19(ctrlUnit19);
				if (result == null) result = casewtc(ctrlUnit19);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT20: {
				CtrlUnit20 ctrlUnit20 = (CtrlUnit20)theEObject;
				T result = caseCtrlUnit20(ctrlUnit20);
				if (result == null) result = casewtc(ctrlUnit20);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT21: {
				CtrlUnit21 ctrlUnit21 = (CtrlUnit21)theEObject;
				T result = caseCtrlUnit21(ctrlUnit21);
				if (result == null) result = casewtc(ctrlUnit21);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT22: {
				CtrlUnit22 ctrlUnit22 = (CtrlUnit22)theEObject;
				T result = caseCtrlUnit22(ctrlUnit22);
				if (result == null) result = casewtc(ctrlUnit22);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT23: {
				CtrlUnit23 ctrlUnit23 = (CtrlUnit23)theEObject;
				T result = caseCtrlUnit23(ctrlUnit23);
				if (result == null) result = casewtc(ctrlUnit23);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT24: {
				CtrlUnit24 ctrlUnit24 = (CtrlUnit24)theEObject;
				T result = caseCtrlUnit24(ctrlUnit24);
				if (result == null) result = casewtc(ctrlUnit24);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT25: {
				CtrlUnit25 ctrlUnit25 = (CtrlUnit25)theEObject;
				T result = caseCtrlUnit25(ctrlUnit25);
				if (result == null) result = casewtc(ctrlUnit25);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT26: {
				CtrlUnit26 ctrlUnit26 = (CtrlUnit26)theEObject;
				T result = caseCtrlUnit26(ctrlUnit26);
				if (result == null) result = casewtc(ctrlUnit26);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT27: {
				CtrlUnit27 ctrlUnit27 = (CtrlUnit27)theEObject;
				T result = caseCtrlUnit27(ctrlUnit27);
				if (result == null) result = casewtc(ctrlUnit27);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT28: {
				CtrlUnit28 ctrlUnit28 = (CtrlUnit28)theEObject;
				T result = caseCtrlUnit28(ctrlUnit28);
				if (result == null) result = casewtc(ctrlUnit28);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT29: {
				CtrlUnit29 ctrlUnit29 = (CtrlUnit29)theEObject;
				T result = caseCtrlUnit29(ctrlUnit29);
				if (result == null) result = casewtc(ctrlUnit29);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT30: {
				CtrlUnit30 ctrlUnit30 = (CtrlUnit30)theEObject;
				T result = caseCtrlUnit30(ctrlUnit30);
				if (result == null) result = casewtc(ctrlUnit30);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT31: {
				CtrlUnit31 ctrlUnit31 = (CtrlUnit31)theEObject;
				T result = caseCtrlUnit31(ctrlUnit31);
				if (result == null) result = casewtc(ctrlUnit31);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT32: {
				CtrlUnit32 ctrlUnit32 = (CtrlUnit32)theEObject;
				T result = caseCtrlUnit32(ctrlUnit32);
				if (result == null) result = casewtc(ctrlUnit32);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT33: {
				CtrlUnit33 ctrlUnit33 = (CtrlUnit33)theEObject;
				T result = caseCtrlUnit33(ctrlUnit33);
				if (result == null) result = casewtc(ctrlUnit33);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT34: {
				CtrlUnit34 ctrlUnit34 = (CtrlUnit34)theEObject;
				T result = caseCtrlUnit34(ctrlUnit34);
				if (result == null) result = casewtc(ctrlUnit34);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT35: {
				CtrlUnit35 ctrlUnit35 = (CtrlUnit35)theEObject;
				T result = caseCtrlUnit35(ctrlUnit35);
				if (result == null) result = casewtc(ctrlUnit35);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT36: {
				CtrlUnit36 ctrlUnit36 = (CtrlUnit36)theEObject;
				T result = caseCtrlUnit36(ctrlUnit36);
				if (result == null) result = casewtc(ctrlUnit36);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT37: {
				CtrlUnit37 ctrlUnit37 = (CtrlUnit37)theEObject;
				T result = caseCtrlUnit37(ctrlUnit37);
				if (result == null) result = casewtc(ctrlUnit37);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT38: {
				CtrlUnit38 ctrlUnit38 = (CtrlUnit38)theEObject;
				T result = caseCtrlUnit38(ctrlUnit38);
				if (result == null) result = casewtc(ctrlUnit38);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT39: {
				CtrlUnit39 ctrlUnit39 = (CtrlUnit39)theEObject;
				T result = caseCtrlUnit39(ctrlUnit39);
				if (result == null) result = casewtc(ctrlUnit39);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT40: {
				CtrlUnit40 ctrlUnit40 = (CtrlUnit40)theEObject;
				T result = caseCtrlUnit40(ctrlUnit40);
				if (result == null) result = casewtc(ctrlUnit40);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT41: {
				CtrlUnit41 ctrlUnit41 = (CtrlUnit41)theEObject;
				T result = caseCtrlUnit41(ctrlUnit41);
				if (result == null) result = casewtc(ctrlUnit41);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT42: {
				CtrlUnit42 ctrlUnit42 = (CtrlUnit42)theEObject;
				T result = caseCtrlUnit42(ctrlUnit42);
				if (result == null) result = casewtc(ctrlUnit42);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT43: {
				CtrlUnit43 ctrlUnit43 = (CtrlUnit43)theEObject;
				T result = caseCtrlUnit43(ctrlUnit43);
				if (result == null) result = casewtc(ctrlUnit43);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT44: {
				CtrlUnit44 ctrlUnit44 = (CtrlUnit44)theEObject;
				T result = caseCtrlUnit44(ctrlUnit44);
				if (result == null) result = casewtc(ctrlUnit44);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT45: {
				CtrlUnit45 ctrlUnit45 = (CtrlUnit45)theEObject;
				T result = caseCtrlUnit45(ctrlUnit45);
				if (result == null) result = casewtc(ctrlUnit45);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT46: {
				CtrlUnit46 ctrlUnit46 = (CtrlUnit46)theEObject;
				T result = caseCtrlUnit46(ctrlUnit46);
				if (result == null) result = casewtc(ctrlUnit46);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT47: {
				CtrlUnit47 ctrlUnit47 = (CtrlUnit47)theEObject;
				T result = caseCtrlUnit47(ctrlUnit47);
				if (result == null) result = casewtc(ctrlUnit47);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT48: {
				CtrlUnit48 ctrlUnit48 = (CtrlUnit48)theEObject;
				T result = caseCtrlUnit48(ctrlUnit48);
				if (result == null) result = casewtc(ctrlUnit48);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT49: {
				CtrlUnit49 ctrlUnit49 = (CtrlUnit49)theEObject;
				T result = caseCtrlUnit49(ctrlUnit49);
				if (result == null) result = casewtc(ctrlUnit49);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT50: {
				CtrlUnit50 ctrlUnit50 = (CtrlUnit50)theEObject;
				T result = caseCtrlUnit50(ctrlUnit50);
				if (result == null) result = casewtc(ctrlUnit50);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT51: {
				CtrlUnit51 ctrlUnit51 = (CtrlUnit51)theEObject;
				T result = caseCtrlUnit51(ctrlUnit51);
				if (result == null) result = casewtc(ctrlUnit51);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT52: {
				CtrlUnit52 ctrlUnit52 = (CtrlUnit52)theEObject;
				T result = caseCtrlUnit52(ctrlUnit52);
				if (result == null) result = casewtc(ctrlUnit52);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT53: {
				CtrlUnit53 ctrlUnit53 = (CtrlUnit53)theEObject;
				T result = caseCtrlUnit53(ctrlUnit53);
				if (result == null) result = casewtc(ctrlUnit53);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT54: {
				CtrlUnit54 ctrlUnit54 = (CtrlUnit54)theEObject;
				T result = caseCtrlUnit54(ctrlUnit54);
				if (result == null) result = casewtc(ctrlUnit54);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT55: {
				CtrlUnit55 ctrlUnit55 = (CtrlUnit55)theEObject;
				T result = caseCtrlUnit55(ctrlUnit55);
				if (result == null) result = casewtc(ctrlUnit55);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT56: {
				CtrlUnit56 ctrlUnit56 = (CtrlUnit56)theEObject;
				T result = caseCtrlUnit56(ctrlUnit56);
				if (result == null) result = casewtc(ctrlUnit56);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT57: {
				CtrlUnit57 ctrlUnit57 = (CtrlUnit57)theEObject;
				T result = caseCtrlUnit57(ctrlUnit57);
				if (result == null) result = casewtc(ctrlUnit57);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT58: {
				CtrlUnit58 ctrlUnit58 = (CtrlUnit58)theEObject;
				T result = caseCtrlUnit58(ctrlUnit58);
				if (result == null) result = casewtc(ctrlUnit58);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT59: {
				CtrlUnit59 ctrlUnit59 = (CtrlUnit59)theEObject;
				T result = caseCtrlUnit59(ctrlUnit59);
				if (result == null) result = casewtc(ctrlUnit59);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT60: {
				CtrlUnit60 ctrlUnit60 = (CtrlUnit60)theEObject;
				T result = caseCtrlUnit60(ctrlUnit60);
				if (result == null) result = casewtc(ctrlUnit60);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT61: {
				CtrlUnit61 ctrlUnit61 = (CtrlUnit61)theEObject;
				T result = caseCtrlUnit61(ctrlUnit61);
				if (result == null) result = casewtc(ctrlUnit61);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT62: {
				CtrlUnit62 ctrlUnit62 = (CtrlUnit62)theEObject;
				T result = caseCtrlUnit62(ctrlUnit62);
				if (result == null) result = casewtc(ctrlUnit62);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT63: {
				CtrlUnit63 ctrlUnit63 = (CtrlUnit63)theEObject;
				T result = caseCtrlUnit63(ctrlUnit63);
				if (result == null) result = casewtc(ctrlUnit63);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT64: {
				CtrlUnit64 ctrlUnit64 = (CtrlUnit64)theEObject;
				T result = caseCtrlUnit64(ctrlUnit64);
				if (result == null) result = casewtc(ctrlUnit64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT65: {
				CtrlUnit65 ctrlUnit65 = (CtrlUnit65)theEObject;
				T result = caseCtrlUnit65(ctrlUnit65);
				if (result == null) result = casewtc(ctrlUnit65);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT66: {
				CtrlUnit66 ctrlUnit66 = (CtrlUnit66)theEObject;
				T result = caseCtrlUnit66(ctrlUnit66);
				if (result == null) result = casewtc(ctrlUnit66);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT67: {
				CtrlUnit67 ctrlUnit67 = (CtrlUnit67)theEObject;
				T result = caseCtrlUnit67(ctrlUnit67);
				if (result == null) result = casewtc(ctrlUnit67);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT68: {
				CtrlUnit68 ctrlUnit68 = (CtrlUnit68)theEObject;
				T result = caseCtrlUnit68(ctrlUnit68);
				if (result == null) result = casewtc(ctrlUnit68);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT69: {
				CtrlUnit69 ctrlUnit69 = (CtrlUnit69)theEObject;
				T result = caseCtrlUnit69(ctrlUnit69);
				if (result == null) result = casewtc(ctrlUnit69);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT70: {
				CtrlUnit70 ctrlUnit70 = (CtrlUnit70)theEObject;
				T result = caseCtrlUnit70(ctrlUnit70);
				if (result == null) result = casewtc(ctrlUnit70);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT71: {
				CtrlUnit71 ctrlUnit71 = (CtrlUnit71)theEObject;
				T result = caseCtrlUnit71(ctrlUnit71);
				if (result == null) result = casewtc(ctrlUnit71);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT72: {
				CtrlUnit72 ctrlUnit72 = (CtrlUnit72)theEObject;
				T result = caseCtrlUnit72(ctrlUnit72);
				if (result == null) result = casewtc(ctrlUnit72);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT73: {
				CtrlUnit73 ctrlUnit73 = (CtrlUnit73)theEObject;
				T result = caseCtrlUnit73(ctrlUnit73);
				if (result == null) result = casewtc(ctrlUnit73);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT74: {
				CtrlUnit74 ctrlUnit74 = (CtrlUnit74)theEObject;
				T result = caseCtrlUnit74(ctrlUnit74);
				if (result == null) result = casewtc(ctrlUnit74);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT75: {
				CtrlUnit75 ctrlUnit75 = (CtrlUnit75)theEObject;
				T result = caseCtrlUnit75(ctrlUnit75);
				if (result == null) result = casewtc(ctrlUnit75);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT76: {
				CtrlUnit76 ctrlUnit76 = (CtrlUnit76)theEObject;
				T result = caseCtrlUnit76(ctrlUnit76);
				if (result == null) result = casewtc(ctrlUnit76);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT77: {
				CtrlUnit77 ctrlUnit77 = (CtrlUnit77)theEObject;
				T result = caseCtrlUnit77(ctrlUnit77);
				if (result == null) result = casewtc(ctrlUnit77);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT78: {
				CtrlUnit78 ctrlUnit78 = (CtrlUnit78)theEObject;
				T result = caseCtrlUnit78(ctrlUnit78);
				if (result == null) result = casewtc(ctrlUnit78);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT79: {
				CtrlUnit79 ctrlUnit79 = (CtrlUnit79)theEObject;
				T result = caseCtrlUnit79(ctrlUnit79);
				if (result == null) result = casewtc(ctrlUnit79);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT80: {
				CtrlUnit80 ctrlUnit80 = (CtrlUnit80)theEObject;
				T result = caseCtrlUnit80(ctrlUnit80);
				if (result == null) result = casewtc(ctrlUnit80);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT81: {
				CtrlUnit81 ctrlUnit81 = (CtrlUnit81)theEObject;
				T result = caseCtrlUnit81(ctrlUnit81);
				if (result == null) result = casewtc(ctrlUnit81);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT82: {
				CtrlUnit82 ctrlUnit82 = (CtrlUnit82)theEObject;
				T result = caseCtrlUnit82(ctrlUnit82);
				if (result == null) result = casewtc(ctrlUnit82);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT83: {
				CtrlUnit83 ctrlUnit83 = (CtrlUnit83)theEObject;
				T result = caseCtrlUnit83(ctrlUnit83);
				if (result == null) result = casewtc(ctrlUnit83);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT84: {
				CtrlUnit84 ctrlUnit84 = (CtrlUnit84)theEObject;
				T result = caseCtrlUnit84(ctrlUnit84);
				if (result == null) result = casewtc(ctrlUnit84);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT85: {
				CtrlUnit85 ctrlUnit85 = (CtrlUnit85)theEObject;
				T result = caseCtrlUnit85(ctrlUnit85);
				if (result == null) result = casewtc(ctrlUnit85);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT86: {
				CtrlUnit86 ctrlUnit86 = (CtrlUnit86)theEObject;
				T result = caseCtrlUnit86(ctrlUnit86);
				if (result == null) result = casewtc(ctrlUnit86);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT87: {
				CtrlUnit87 ctrlUnit87 = (CtrlUnit87)theEObject;
				T result = caseCtrlUnit87(ctrlUnit87);
				if (result == null) result = casewtc(ctrlUnit87);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT88: {
				CtrlUnit88 ctrlUnit88 = (CtrlUnit88)theEObject;
				T result = caseCtrlUnit88(ctrlUnit88);
				if (result == null) result = casewtc(ctrlUnit88);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT89: {
				CtrlUnit89 ctrlUnit89 = (CtrlUnit89)theEObject;
				T result = caseCtrlUnit89(ctrlUnit89);
				if (result == null) result = casewtc(ctrlUnit89);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT90: {
				CtrlUnit90 ctrlUnit90 = (CtrlUnit90)theEObject;
				T result = caseCtrlUnit90(ctrlUnit90);
				if (result == null) result = casewtc(ctrlUnit90);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT91: {
				CtrlUnit91 ctrlUnit91 = (CtrlUnit91)theEObject;
				T result = caseCtrlUnit91(ctrlUnit91);
				if (result == null) result = casewtc(ctrlUnit91);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT92: {
				CtrlUnit92 ctrlUnit92 = (CtrlUnit92)theEObject;
				T result = caseCtrlUnit92(ctrlUnit92);
				if (result == null) result = casewtc(ctrlUnit92);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT93: {
				CtrlUnit93 ctrlUnit93 = (CtrlUnit93)theEObject;
				T result = caseCtrlUnit93(ctrlUnit93);
				if (result == null) result = casewtc(ctrlUnit93);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT94: {
				CtrlUnit94 ctrlUnit94 = (CtrlUnit94)theEObject;
				T result = caseCtrlUnit94(ctrlUnit94);
				if (result == null) result = casewtc(ctrlUnit94);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT95: {
				CtrlUnit95 ctrlUnit95 = (CtrlUnit95)theEObject;
				T result = caseCtrlUnit95(ctrlUnit95);
				if (result == null) result = casewtc(ctrlUnit95);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT96: {
				CtrlUnit96 ctrlUnit96 = (CtrlUnit96)theEObject;
				T result = caseCtrlUnit96(ctrlUnit96);
				if (result == null) result = casewtc(ctrlUnit96);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT97: {
				CtrlUnit97 ctrlUnit97 = (CtrlUnit97)theEObject;
				T result = caseCtrlUnit97(ctrlUnit97);
				if (result == null) result = casewtc(ctrlUnit97);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT98: {
				CtrlUnit98 ctrlUnit98 = (CtrlUnit98)theEObject;
				T result = caseCtrlUnit98(ctrlUnit98);
				if (result == null) result = casewtc(ctrlUnit98);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT99: {
				CtrlUnit99 ctrlUnit99 = (CtrlUnit99)theEObject;
				T result = caseCtrlUnit99(ctrlUnit99);
				if (result == null) result = casewtc(ctrlUnit99);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT100: {
				CtrlUnit100 ctrlUnit100 = (CtrlUnit100)theEObject;
				T result = caseCtrlUnit100(ctrlUnit100);
				if (result == null) result = casewtc(ctrlUnit100);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT101: {
				CtrlUnit101 ctrlUnit101 = (CtrlUnit101)theEObject;
				T result = caseCtrlUnit101(ctrlUnit101);
				if (result == null) result = casewtc(ctrlUnit101);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT102: {
				CtrlUnit102 ctrlUnit102 = (CtrlUnit102)theEObject;
				T result = caseCtrlUnit102(ctrlUnit102);
				if (result == null) result = casewtc(ctrlUnit102);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT103: {
				CtrlUnit103 ctrlUnit103 = (CtrlUnit103)theEObject;
				T result = caseCtrlUnit103(ctrlUnit103);
				if (result == null) result = casewtc(ctrlUnit103);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT104: {
				CtrlUnit104 ctrlUnit104 = (CtrlUnit104)theEObject;
				T result = caseCtrlUnit104(ctrlUnit104);
				if (result == null) result = casewtc(ctrlUnit104);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT105: {
				CtrlUnit105 ctrlUnit105 = (CtrlUnit105)theEObject;
				T result = caseCtrlUnit105(ctrlUnit105);
				if (result == null) result = casewtc(ctrlUnit105);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT106: {
				CtrlUnit106 ctrlUnit106 = (CtrlUnit106)theEObject;
				T result = caseCtrlUnit106(ctrlUnit106);
				if (result == null) result = casewtc(ctrlUnit106);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT107: {
				CtrlUnit107 ctrlUnit107 = (CtrlUnit107)theEObject;
				T result = caseCtrlUnit107(ctrlUnit107);
				if (result == null) result = casewtc(ctrlUnit107);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT108: {
				CtrlUnit108 ctrlUnit108 = (CtrlUnit108)theEObject;
				T result = caseCtrlUnit108(ctrlUnit108);
				if (result == null) result = casewtc(ctrlUnit108);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT109: {
				CtrlUnit109 ctrlUnit109 = (CtrlUnit109)theEObject;
				T result = caseCtrlUnit109(ctrlUnit109);
				if (result == null) result = casewtc(ctrlUnit109);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT110: {
				CtrlUnit110 ctrlUnit110 = (CtrlUnit110)theEObject;
				T result = caseCtrlUnit110(ctrlUnit110);
				if (result == null) result = casewtc(ctrlUnit110);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT111: {
				CtrlUnit111 ctrlUnit111 = (CtrlUnit111)theEObject;
				T result = caseCtrlUnit111(ctrlUnit111);
				if (result == null) result = casewtc(ctrlUnit111);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT112: {
				CtrlUnit112 ctrlUnit112 = (CtrlUnit112)theEObject;
				T result = caseCtrlUnit112(ctrlUnit112);
				if (result == null) result = casewtc(ctrlUnit112);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT113: {
				CtrlUnit113 ctrlUnit113 = (CtrlUnit113)theEObject;
				T result = caseCtrlUnit113(ctrlUnit113);
				if (result == null) result = casewtc(ctrlUnit113);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT114: {
				CtrlUnit114 ctrlUnit114 = (CtrlUnit114)theEObject;
				T result = caseCtrlUnit114(ctrlUnit114);
				if (result == null) result = casewtc(ctrlUnit114);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT115: {
				CtrlUnit115 ctrlUnit115 = (CtrlUnit115)theEObject;
				T result = caseCtrlUnit115(ctrlUnit115);
				if (result == null) result = casewtc(ctrlUnit115);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT116: {
				CtrlUnit116 ctrlUnit116 = (CtrlUnit116)theEObject;
				T result = caseCtrlUnit116(ctrlUnit116);
				if (result == null) result = casewtc(ctrlUnit116);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT117: {
				CtrlUnit117 ctrlUnit117 = (CtrlUnit117)theEObject;
				T result = caseCtrlUnit117(ctrlUnit117);
				if (result == null) result = casewtc(ctrlUnit117);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT118: {
				CtrlUnit118 ctrlUnit118 = (CtrlUnit118)theEObject;
				T result = caseCtrlUnit118(ctrlUnit118);
				if (result == null) result = casewtc(ctrlUnit118);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT119: {
				CtrlUnit119 ctrlUnit119 = (CtrlUnit119)theEObject;
				T result = caseCtrlUnit119(ctrlUnit119);
				if (result == null) result = casewtc(ctrlUnit119);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT120: {
				CtrlUnit120 ctrlUnit120 = (CtrlUnit120)theEObject;
				T result = caseCtrlUnit120(ctrlUnit120);
				if (result == null) result = casewtc(ctrlUnit120);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT121: {
				CtrlUnit121 ctrlUnit121 = (CtrlUnit121)theEObject;
				T result = caseCtrlUnit121(ctrlUnit121);
				if (result == null) result = casewtc(ctrlUnit121);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT122: {
				CtrlUnit122 ctrlUnit122 = (CtrlUnit122)theEObject;
				T result = caseCtrlUnit122(ctrlUnit122);
				if (result == null) result = casewtc(ctrlUnit122);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT123: {
				CtrlUnit123 ctrlUnit123 = (CtrlUnit123)theEObject;
				T result = caseCtrlUnit123(ctrlUnit123);
				if (result == null) result = casewtc(ctrlUnit123);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT124: {
				CtrlUnit124 ctrlUnit124 = (CtrlUnit124)theEObject;
				T result = caseCtrlUnit124(ctrlUnit124);
				if (result == null) result = casewtc(ctrlUnit124);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT125: {
				CtrlUnit125 ctrlUnit125 = (CtrlUnit125)theEObject;
				T result = caseCtrlUnit125(ctrlUnit125);
				if (result == null) result = casewtc(ctrlUnit125);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT126: {
				CtrlUnit126 ctrlUnit126 = (CtrlUnit126)theEObject;
				T result = caseCtrlUnit126(ctrlUnit126);
				if (result == null) result = casewtc(ctrlUnit126);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT127: {
				CtrlUnit127 ctrlUnit127 = (CtrlUnit127)theEObject;
				T result = caseCtrlUnit127(ctrlUnit127);
				if (result == null) result = casewtc(ctrlUnit127);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT128: {
				CtrlUnit128 ctrlUnit128 = (CtrlUnit128)theEObject;
				T result = caseCtrlUnit128(ctrlUnit128);
				if (result == null) result = casewtc(ctrlUnit128);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT129: {
				CtrlUnit129 ctrlUnit129 = (CtrlUnit129)theEObject;
				T result = caseCtrlUnit129(ctrlUnit129);
				if (result == null) result = casewtc(ctrlUnit129);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT130: {
				CtrlUnit130 ctrlUnit130 = (CtrlUnit130)theEObject;
				T result = caseCtrlUnit130(ctrlUnit130);
				if (result == null) result = casewtc(ctrlUnit130);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT131: {
				CtrlUnit131 ctrlUnit131 = (CtrlUnit131)theEObject;
				T result = caseCtrlUnit131(ctrlUnit131);
				if (result == null) result = casewtc(ctrlUnit131);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT132: {
				CtrlUnit132 ctrlUnit132 = (CtrlUnit132)theEObject;
				T result = caseCtrlUnit132(ctrlUnit132);
				if (result == null) result = casewtc(ctrlUnit132);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpecPackage.CTRL_UNIT133: {
				CtrlUnit133 ctrlUnit133 = (CtrlUnit133)theEObject;
				T result = caseCtrlUnit133(ctrlUnit133);
				if (result == null) result = casewtc(ctrlUnit133);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWT(WT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemInput(SystemInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemOutput(SystemOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemFault(SystemFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemParam(SystemParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemTimer(SystemTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemVariable(SystemVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Error Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Error Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemErrorReaction(SystemErrorReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCInput(WTCInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCOutput(WTCOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCParam(WTCParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCTimer(WTCTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCFault(WTCFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Error Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Error Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCErrorReaction(WTCErrorReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>wtc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>wtc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewtc(wtc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit1(CtrlUnit1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit2(CtrlUnit2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit3(CtrlUnit3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit4(CtrlUnit4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit5(CtrlUnit5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit6(CtrlUnit6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit7(CtrlUnit7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit8(CtrlUnit8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit9(CtrlUnit9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit10(CtrlUnit10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit11(CtrlUnit11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit12(CtrlUnit12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit13(CtrlUnit13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit14</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit14</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit14(CtrlUnit14 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit15</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit15</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit15(CtrlUnit15 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit16(CtrlUnit16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit17</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit17</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit17(CtrlUnit17 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit18</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit18</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit18(CtrlUnit18 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit19</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit19</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit19(CtrlUnit19 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit20</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit20</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit20(CtrlUnit20 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit21</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit21</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit21(CtrlUnit21 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit22</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit22</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit22(CtrlUnit22 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit23</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit23</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit23(CtrlUnit23 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit24</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit24</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit24(CtrlUnit24 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit25</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit25</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit25(CtrlUnit25 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit26</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit26</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit26(CtrlUnit26 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit27</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit27</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit27(CtrlUnit27 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit28</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit28</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit28(CtrlUnit28 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit29</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit29</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit29(CtrlUnit29 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit30</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit30</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit30(CtrlUnit30 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit31</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit31</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit31(CtrlUnit31 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit32</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit32</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit32(CtrlUnit32 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit33</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit33</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit33(CtrlUnit33 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit34</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit34</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit34(CtrlUnit34 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit35</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit35</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit35(CtrlUnit35 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit36</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit36</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit36(CtrlUnit36 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit37</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit37</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit37(CtrlUnit37 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit38</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit38</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit38(CtrlUnit38 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit39</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit39</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit39(CtrlUnit39 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit40</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit40</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit40(CtrlUnit40 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit41</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit41</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit41(CtrlUnit41 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit42</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit42</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit42(CtrlUnit42 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit43</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit43</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit43(CtrlUnit43 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit44</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit44</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit44(CtrlUnit44 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit45</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit45</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit45(CtrlUnit45 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit46</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit46</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit46(CtrlUnit46 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit47</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit47</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit47(CtrlUnit47 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit48</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit48</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit48(CtrlUnit48 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit49</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit49</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit49(CtrlUnit49 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit50</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit50</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit50(CtrlUnit50 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit51</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit51</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit51(CtrlUnit51 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit52</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit52</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit52(CtrlUnit52 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit53</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit53</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit53(CtrlUnit53 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit54</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit54</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit54(CtrlUnit54 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit55</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit55</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit55(CtrlUnit55 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit56</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit56</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit56(CtrlUnit56 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit57</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit57</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit57(CtrlUnit57 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit58</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit58</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit58(CtrlUnit58 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit59</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit59</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit59(CtrlUnit59 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit60</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit60</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit60(CtrlUnit60 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit61</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit61</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit61(CtrlUnit61 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit62</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit62</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit62(CtrlUnit62 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit63</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit63</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit63(CtrlUnit63 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit64(CtrlUnit64 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit65</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit65</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit65(CtrlUnit65 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit66</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit66</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit66(CtrlUnit66 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit67</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit67</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit67(CtrlUnit67 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit68</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit68</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit68(CtrlUnit68 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit69</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit69</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit69(CtrlUnit69 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit70</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit70</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit70(CtrlUnit70 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit71</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit71</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit71(CtrlUnit71 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit72</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit72</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit72(CtrlUnit72 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit73</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit73</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit73(CtrlUnit73 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit74</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit74</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit74(CtrlUnit74 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit75</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit75</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit75(CtrlUnit75 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit76</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit76</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit76(CtrlUnit76 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit77</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit77</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit77(CtrlUnit77 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit78</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit78</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit78(CtrlUnit78 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit79</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit79</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit79(CtrlUnit79 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit80</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit80</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit80(CtrlUnit80 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit81</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit81</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit81(CtrlUnit81 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit82</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit82</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit82(CtrlUnit82 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit83</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit83</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit83(CtrlUnit83 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit84</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit84</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit84(CtrlUnit84 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit85</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit85</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit85(CtrlUnit85 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit86</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit86</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit86(CtrlUnit86 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit87</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit87</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit87(CtrlUnit87 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit88</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit88</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit88(CtrlUnit88 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit89</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit89</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit89(CtrlUnit89 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit90</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit90</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit90(CtrlUnit90 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit91</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit91</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit91(CtrlUnit91 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit92</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit92</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit92(CtrlUnit92 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit93</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit93</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit93(CtrlUnit93 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit94</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit94</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit94(CtrlUnit94 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit95</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit95</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit95(CtrlUnit95 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit96</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit96</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit96(CtrlUnit96 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit97</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit97</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit97(CtrlUnit97 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit98</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit98</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit98(CtrlUnit98 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit99</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit99</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit99(CtrlUnit99 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit100</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit100</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit100(CtrlUnit100 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit101</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit101</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit101(CtrlUnit101 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit102</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit102</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit102(CtrlUnit102 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit103</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit103</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit103(CtrlUnit103 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit104</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit104</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit104(CtrlUnit104 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit105</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit105</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit105(CtrlUnit105 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit106</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit106</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit106(CtrlUnit106 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit107</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit107</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit107(CtrlUnit107 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit108</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit108</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit108(CtrlUnit108 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit109</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit109</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit109(CtrlUnit109 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit110</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit110</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit110(CtrlUnit110 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit111</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit111</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit111(CtrlUnit111 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit112</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit112</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit112(CtrlUnit112 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit113</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit113</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit113(CtrlUnit113 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit114</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit114</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit114(CtrlUnit114 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit115</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit115</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit115(CtrlUnit115 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit116</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit116</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit116(CtrlUnit116 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit117</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit117</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit117(CtrlUnit117 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit118</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit118</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit118(CtrlUnit118 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit119</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit119</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit119(CtrlUnit119 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit120</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit120</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit120(CtrlUnit120 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit121</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit121</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit121(CtrlUnit121 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit122</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit122</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit122(CtrlUnit122 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit123</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit123</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit123(CtrlUnit123 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit124</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit124</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit124(CtrlUnit124 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit125</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit125</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit125(CtrlUnit125 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit126</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit126</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit126(CtrlUnit126 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit127</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit127</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit127(CtrlUnit127 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit128</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit128</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit128(CtrlUnit128 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit129</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit129</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit129(CtrlUnit129 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit130</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit130</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit130(CtrlUnit130 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit131</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit131</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit131(CtrlUnit131 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit132</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit132</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit132(CtrlUnit132 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit133</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit133</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit133(CtrlUnit133 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WTSpecSwitch
