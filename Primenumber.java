package Assignments;

public class Primenumber {
	
	public void primeNumbers1To100() {
		int IntCount=0, intIndexOne=1, intIndexTwo=1, intNum =0;
	
	while(intNum<25) {
		intIndexTwo=1;
		IntCount=0;
		while(intIndexTwo<=intIndexOne) {
			
			if(intIndexOne%intIndexTwo==0)
				IntCount++;
			intIndexTwo++;
				
		} if(IntCount==2)
		{
			System.out.print( intIndexOne + " ");
		intNum++;
		}
		intIndexOne++;
		
	}
	}

}
