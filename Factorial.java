package Assignments;

public class Factorial {

	public void loopFactorial(int intNumber) {
		int intIndex, intFact = 1;
		for (intIndex = 1; intIndex <= intNumber; intIndex++)
			intFact = intFact * intIndex;
		System.out.println("Factorial of " + intNumber + " using loop is : " + intFact);

	}

	public int factorial(int intNumber) {
		if (intNumber == 0)
			return 1;
		else
			return (intNumber * factorial(intNumber - 1));
	}

	public void recursionFactorial(int intNumber) {
		int intFact = 1;
		intFact = factorial(intNumber);
		System.out.println("Factorial of " + intNumber + " using Recursion is : " + intFact);
	}

}
