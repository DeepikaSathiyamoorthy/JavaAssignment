package Assignments;

public class RemoveSpaceBothEnd {
	
	public void removeSpaceFromString() {
		
		String strData = "  White Space can be removed from the string both front and end using Trim Method  ";
		System.out.println(strData.trim());
	}

	public void splitString() {
		String strData = "Split/the/String/Using/RegEx";
		String[] strArray = strData.split("/", 5);
		for(String strLoop : strArray)
			System.out.println(strLoop);
	}
	
	public void stringToLowerCase() {
		
		String strData = "CHANGE THE STRING DATA INTO LOWERCASE USING TOLOWERCASE METHOD";
		System.out.println(strData);
		System.out.println(strData.toLowerCase());
	}
}
