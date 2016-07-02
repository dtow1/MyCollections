package ArraySort;

public class ArraySort {

	public <T extends Comparable <? super T>> void selectionSort(T[] array){
		selectionSort(array,false);
	}
	
	public <T extends Comparable <? super T>> void selectionSort(T[] array, boolean verbose){
		if(verbose){
			System.out.println(array.toString());
		}
	}
}
