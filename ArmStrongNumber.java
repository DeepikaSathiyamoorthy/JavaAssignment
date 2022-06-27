package Assignments;

public class ArmStrongNumber {

	public void checkNumberIsArmStrongOrNot(int intNumber) {
		int intTemp, intTempNumber, intTotal = 0;
		intTempNumber = intNumber;

		while (intTempNumber != 0) {
			intTemp = intTempNumber % 10;
			intTotal = intTotal + intTemp*intTemp*intTemp;
			intTempNumber = intTempNumber/10;
		}
		if(intTotal == intNumber)
			System.out.println(intNumber + " is an Armstrong Number");
		else
			System.out.println(intNumber + " is not an Armstrong Number");
	}
}
