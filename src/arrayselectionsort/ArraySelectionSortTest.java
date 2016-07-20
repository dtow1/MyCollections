package arrayselectionsort;

import java.util.Arrays;

public class ArraySelectionSortTest {

	public static void main(String[] args) {
		
		Integer[] intArray = {10,13,4,8,232,1,2,382,81,1};
		Integer[] intArray2 = {10,13,4,8,232,1,2,382,81,1};
		
		
		ArraySelectionSort<Integer> test = new ArraySelectionSort<Integer>();
		
		System.out.println("Testing selection sort Forward");
		test.selectionSort(intArray,true);
		System.out.println("Sorted Array: " + Arrays.toString(intArray));
		
		
		System.out.println("Testing selection sort backward");
		test.selectionSort(intArray,true,true);
		System.out.println("Sorted Array: " + Arrays.toString(intArray));

		System.out.println("Testing recursive selection sort Forward");
		test.recursiveSelectionSort(intArray2,true);
		System.out.println("Sorted Array: " + Arrays.toString(intArray2));
		
		
		System.out.println("Testing recursive selection sort backward");
		test.recursiveSelectionSort(intArray2,true,true);
		System.out.println("Sorted Array: " + Arrays.toString(intArray2));
		
	}

}
