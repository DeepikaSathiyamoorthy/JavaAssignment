package Assignments;

public class ReverseString {

	public  void reverseStringUsingStringBuilder() {
		
		String strToReverse = "Happy Monday";
		StringBuilder sbReverseValue = new StringBuilder(strToReverse);
		sbReverseValue.reverse();
		System.out.println("Reversed String using String Builder for Happy Monday is : " +sbReverseValue);
		}

public void  reverseStringUsingIteration() {
	
	String strToReverse = "Happy Monday";
	char chToReverse[] = strToReverse.toCharArray();
	String strReverse = "";
	for(int intindex = chToReverse.length-1; intindex>=0; intindex--) {
		strReverse+=chToReverse[intindex];
	}
	System.out.println("Reversed String using Iteration for Happy Monday is : " +strReverse);
	}
}
