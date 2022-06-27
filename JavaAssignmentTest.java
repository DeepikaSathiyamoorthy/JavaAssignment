package AssignmentTest;

import Assignments.ArmStrongNumber;
import Assignments.CommonElementsArray;
import Assignments.Factorial;
import Assignments.Primenumber;
import Assignments.RemoveSpaceBothEnd;
import Assignments.ReverseString;
import Assignments.SwapTwoNumbers;

public class JavaAssignmentTest {

	public static void main(String[] args) {

		ReverseString objReverseString = new ReverseString();
		SwapTwoNumbers objSwapTwoNumbers = new SwapTwoNumbers();
		CommonElementsArray objCommonElementsArray = new CommonElementsArray();
		Primenumber objPrimenumber = new Primenumber();
		Factorial objFactorial = new Factorial();
		RemoveSpaceBothEnd objRemoveSpaceBothEnd = new RemoveSpaceBothEnd();
		ArmStrongNumber objArmStrongNumber = new ArmStrongNumber();

		System.out.println("-----REVERSE STRING----------------------------------");
		objReverseString.reverseStringUsingStringBuilder();
		objReverseString.reverseStringUsingIteration();
		
		System.out.println("\n\n------SWAPPING OF TWO NUMBERS WITHOUT THIRD VARIABLE----------------------");
		objSwapTwoNumbers.swapTwoNumbersWithoutThirdVariable();
		
		System.out.println("\n\n------SWAPPING OF TWO NUMBERS WITH THIRD VARIABLE----------------------");
		objSwapTwoNumbers.swapTwoNumberWithThirdVariable();

		System.out.println("\n\n------COMMON ELEMENTS IN 3 ARRAY----------------------");
		objCommonElementsArray.commonElementsIn3Array();

		System.out.println("\n\n------PRIME NUMBERS FROM 1 to 100----------------------");
		objPrimenumber.primeNumbers1To100();

		System.out.println("\n\n------FACTORIAL----------------------");
		objFactorial.loopFactorial(7);
		objFactorial.recursionFactorial(5);
	
		System.out.println("\n\n------STRING TRIM----------------------");
		objRemoveSpaceBothEnd.removeSpaceFromString();
		System.out.println("\n\n------STRING SPLIT----------------------");
		objRemoveSpaceBothEnd.splitString();
		System.out.println("\n\n------STRING LOWERCASE----------------------");
		objRemoveSpaceBothEnd.stringToLowerCase();
		
		System.out.println("\n\n------CHECK FOR ARMSTRONG NUMBER----------------------");
		objArmStrongNumber.checkNumberIsArmStrongOrNot(153);
		
	}

}
