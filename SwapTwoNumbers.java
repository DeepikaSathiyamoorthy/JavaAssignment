package Assignments;

public class SwapTwoNumbers {

	 int intFirstNumber = 5;
	  int intSecondNumber = 10;

	public void swapTwoNumbersWithoutThirdVariable() {

		System.out.println("Before Swapping \n First Number : " + intFirstNumber + "\n Second Number : " + intSecondNumber);
		intFirstNumber = intFirstNumber + intSecondNumber;
		intSecondNumber = intFirstNumber - intSecondNumber;
		intFirstNumber = intFirstNumber - intSecondNumber;
		System.out.println("After Swapping without third variable \n First Number : " + intFirstNumber
				+ "\n Second Number : " + intSecondNumber);
	}

	public void swapTwoNumberWithThirdVariable() {

		int intTempVariable;
		System.out.println("Before Swapping \n First Number : " + intFirstNumber + "\n Second Number : " + intSecondNumber);
		 intTempVariable = intFirstNumber;
		 intFirstNumber = intSecondNumber;
		 intSecondNumber = intTempVariable;
			System.out.println("Before Swapping with Third Variable \n First Number : " + intFirstNumber + "\n Second Number : " + intSecondNumber); 
	}
}
