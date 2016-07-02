package ArraySort;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		
		Integer[] intArray = {10,13,4,8,232,1,2,382,81,1};
		
		ArraySort<Integer> test = new ArraySort<Integer>();
		
		System.out.println("Testing selction sort Forward");
		test.selectionSort(intArray,true);
		System.out.println("Sorted Array: " + Arrays.toString(intArray));
		
		
		System.out.println("Testing selection sort backward");
		test.selectionSort(intArray,true,true);
		System.out.println("Sorted Array: " + Arrays.toString(intArray));

	}

}
