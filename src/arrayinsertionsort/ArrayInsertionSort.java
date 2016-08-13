package arrayinsertionsort;

import java.util.Arrays;

/**
 * @author jasonboyer
 * 
 * This class is an implementation of the selection sort. It is an exercise in using Java, generics, and refreshing my memory of
 * Algorithms and data structures.
 *
 * @param <T>
 */

public class ArrayInsertionSort<T> {
	public <T extends Comparable <? super T>> void insertionSort(T[] array){
		insertionSort(array,false, false);
	}
	
	public <T extends Comparable <? super T>> void insertionSort(T[] array, boolean verbose){
		insertionSort(array,verbose,false);
	}
	
	public <T extends Comparable <? super T>> void insertionSort(T[] array, boolean verbose, boolean reverse){
		/* If the array has one or less elements, there is no point in sorting it */
		if(array.length>1){
			T temp = null;
			int j;
			for(int i=1;i<array.length;i++){
				/* Check against the last sorted element, then work backward toward the first element
				 * and shift elements up until you find the spot where the temp value is larger.
				 */
				j=i-1;
				temp = array[i];
				
				while(j>=0 && temp.compareTo(array[j])<0){
					array[j+1] = array[j];
					j--;
				}
				array[j+1]=temp;
			}
			
		}
		
	}
}
