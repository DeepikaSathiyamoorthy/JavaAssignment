package Assignments;

public class CommonElementsArray {

	public void commonElementsIn3Array() {
	//	int[] ArrayValueOne = new int[]{ 1, 4, 6, 10, 7, 8 };
		
		int ArrayValueOne[] = { 1, 4, 6, 10, 7, 8 };
		int ArrayValueTwo[] = { 2, 3, 6, 9, 10 };
		int ArrayValueThree[] = { 6, 4, 9, 1, 10 };

		int intIndex = 0, intIndexArray_1 = 0, intIndexArray_2 = 0, intIndexArray_3 = 0;
		System.out.println("Array One:");
		for (intIndex = 0; intIndex < ArrayValueOne.length; intIndex++)
		//	System.out.println(Arrays.toString(ArrayValueOne[intIndexArray_1])); 
			System.out.print(ArrayValueOne[intIndex] + " ");
		System.out.println("\nArray Two");
		for (intIndex = 0; intIndex < ArrayValueTwo.length; intIndex++)
			System.out.print(ArrayValueTwo[intIndex] + " ");
		System.out.println("\nArray Three");
		for (intIndex = 0; intIndex < ArrayValueThree.length; intIndex++)
			System.out.print(ArrayValueThree[intIndex] + " ");

		System.out.println("\nCommon elements in 3 Array");
		while (intIndexArray_1 < ArrayValueOne.length && intIndexArray_2 < ArrayValueTwo.length
				&& intIndexArray_3 < ArrayValueThree.length) {
			if (ArrayValueOne[intIndexArray_1] == ArrayValueTwo[intIndexArray_2]
					&& ArrayValueTwo[intIndexArray_2] == ArrayValueThree[intIndexArray_3]) {
				System.out.print(ArrayValueOne[intIndexArray_1] + " ");
				intIndexArray_1++;
				intIndexArray_2++;
				intIndexArray_3++;
			} else if (ArrayValueOne[intIndexArray_1] < ArrayValueTwo[intIndexArray_2]) {
				intIndexArray_1++;
			} else if (ArrayValueTwo[intIndexArray_2] < ArrayValueThree[intIndexArray_3]) {
				intIndexArray_2++;
			} else
				intIndexArray_3++;
		}
	}
}
