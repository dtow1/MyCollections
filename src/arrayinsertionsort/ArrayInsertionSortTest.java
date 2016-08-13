package arrayinsertionsort;

import java.util.Arrays;

public class ArrayInsertionSortTest {

	public static void main(String[] args) {
		
		Integer[] intArray1 = {10,13,4,8,232,1,2,382,81,1};
		Integer[] intArray2 = {10,13,4,8,232,1,2,382,81,1};
		Integer[] intArray = {3,1,2,5,3};
		
		ArrayInsertionSort<Integer> test = new ArrayInsertionSort<Integer>();
		
		System.out.println("Testing selection sort Forward");
		test.insertionSort(intArray,true);
		System.out.println("Sorted Array: " + Arrays.toString(intArray));
		

		System.out.println("Testing selection sort backward");
		test.insertionSort(intArray,true,true);
		System.out.println("Sorted Array: " + Arrays.toString(intArray));
	}

}
