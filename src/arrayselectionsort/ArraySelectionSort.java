package arrayselectionsort;

import java.util.Arrays;

/**
 * @author jasonboyer
 * 
 * This class is an implementation of the selection sort. It is an exercise in using Java, generics, and refreshing my memory of
 * Algorithms and data structures.
 *
 * @param <T>
 */
public class ArraySelectionSort<T>{

	public <T extends Comparable <? super T>> void selectionSort(T[] array){
		selectionSort(array,false, false);
	}
	
	public <T extends Comparable <? super T>> void selectionSort(T[] array, boolean verbose){
		selectionSort(array,verbose,false);
	}
	
	public <T extends Comparable <? super T>> void selectionSort(T[] array, boolean verbose, boolean reverse){
		/* Make sure there is something in the array */
		if(array.length>1){
			if(verbose){
				System.out.println(Arrays.toString(array));
			}
			
			/*Begin the sort by setting the location of the first unsorted element to be the first element in the array, after each
			 * pass of the sort, increment the location of the first unsorted element(i) and set it as the location of the smallest unsorted
			 * element.
			 */
			for(int i=0;i<array.length-1;i++){
				int smallestlocation=i;
				/*Iterate through the array and if an element is smaller than the value at the current "smallestlocation" then
				 * set smallestlocation to the current location.
				 * 
				 * If reverse is set it is finding the largest.
				 * 
				 */
				if(!reverse){
					for(int j= i+1;j<array.length;j++){
						if(array[j].compareTo(array[smallestlocation])<0){
							smallestlocation=j;
						}
					}
				} else {
					for(int j= i+1;j<array.length;j++){
						if(array[j].compareTo(array[smallestlocation])>0){
							smallestlocation=j;
						}
					}	
				}
				
				/*
				 * Swap the item at the smallestlocation with the first unsorted element(i)
				 */
				T temp=array[i];
				array[i]=array[smallestlocation];
				array[smallestlocation]=temp;
				if(verbose){
					System.out.println(Arrays.toString(array));
				}
			}
		}
	}
	
	/*
	 * The recursive solution to the selection sort will track the array, the first unsorted element and the last unsorted element.
	 * Each recursive call will find the smallest element, place it in the correct position and then make another call that will 
	 * deal with an unsorted array of one element smaller.
	 */
	
	
	public <T extends Comparable <? super T>> void recursiveSelectionSort(T[] array){
		selectionSort(array,false);
	}
	
	public <T extends Comparable <? super T>> void recursiveSelectionSort(T[] array, boolean verbose){
		selectionSort(array,verbose,false);
	}
	
	public <T extends Comparable <? super T>> void recursiveSelectionSort(T[] array, boolean verbose, boolean reverse){
		if(array.length>1){
			if(!reverse)
				recursiveHelper(array,verbose,reverse,0);
			else
				recursiveHelper(array,verbose,reverse,array.length-1);
		}
	}
	
	private <T extends Comparable<? super T>> void recursiveHelper(T[]array, boolean verbose, boolean reverse,int first){
		if(verbose){
			System.out.println(Arrays.toString(array));
		}
		if(!reverse){
			if(first<array.length){
				T tempObject = null;
				int smallestLoc = first;
				for(int i = 0;i<0; i++){
					if(array[i].compareTo(array[smallestLoc])<0){
						smallestLoc=i;
					}
				}
				tempObject = array[first];
				array[first] = array[smallestLoc];
				array[smallestLoc] = tempObject;
				recursiveHelper(array,verbose,reverse,first+1);			
			} else {
			}
		}else{
			//Sort in reverse
			if(first>0){
				T tempObject = null;
				int smallestLoc = first;
				for(int i = first;i>=0; i--){
					if(array[i].compareTo(array[smallestLoc])<0){
						smallestLoc=i;
					}
				}
				tempObject = array[first];
				array[first] = array[smallestLoc];
				array[smallestLoc] = tempObject;
				recursiveHelper(array,verbose,reverse,first-1);
			} else {
			}

		}
	}
	
}
