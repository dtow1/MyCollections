package ArraySort;

import java.util.Arrays;

public class ArraySort<T>{

	public <T extends Comparable <? super T>> void selectionSort(T[] array){
		selectionSort(array,false);
	}
	
	public <T extends Comparable <? super T>> void selectionSort(T[] array, boolean verbose){
		selectionSort(array,verbose,false);
	}
	
	public <T extends Comparable <? super T>> void selectionSort(T[] array, boolean verbose, boolean reverse){
		if(array.length>1){
			if(verbose){
				System.out.println(Arrays.toString(array));
			}
			
			for(int i=0;i<array.length-1;i++){
				int smallestlocation=i;
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
				T temp=array[i];
				array[i]=array[smallestlocation];
				array[smallestlocation]=temp;
				if(verbose){
					System.out.println(Arrays.toString(array));
				}
			}
		}
	}
	
}
