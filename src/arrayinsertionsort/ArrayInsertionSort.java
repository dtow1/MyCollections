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
			if(!reverse){
				for(int i=1;i<array.length;i++){
					/* Check against the last sorted element, then work backward toward the first element
					 * and shift elements up until you find the spot where the temp value is larger.
					 */
					j=i-1;
					temp = array[i];
					
					/* Compare the current unsorted element until you finish the list or find an element that is smaller
					 * then the current unsorted element
					 */
					while(j>=0 && temp.compareTo(array[j])<0){
						array[j+1] = array[j];
						j--;
						
						/* Display the current status of the array */
						if(verbose){
							System.out.print("[");
							for(int printlcv=0;printlcv<array.length-1;printlcv++){
								System.out.print(array[printlcv] + " , ");
							}
							System.out.println(array[array.length-1] + "]");
						}
					}
					array[j+1]=temp;
				}
			}else{
				for(int i=array.length-1;i>=0;i--){
					/* 
					 * Reverse the algorithm.
					 */
					j=i+1;
					temp = array[i];
					while(j<=array.length-1 && temp.compareTo(array[j])<0){
						array[j-1] = array[j];
						j++;
						if(verbose){
							System.out.print("[");
							for(int printlcv=0;printlcv<array.length-1;printlcv++){
								System.out.print(array[printlcv] + " , ");
							}
							System.out.println(array[array.length-1] + "]");
						}
					}
					array[j-1]=temp;
				}
			}
		}
		
	}
}
