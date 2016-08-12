package arrayinsertionsort;

public class ArrayInsertionSort<T> {
	public <T extends Comparable <? super T>> void insertionSort(T[] array){
		insertionSort(array,false, false);
	}
	
	public <T extends Comparable <? super T>> void insertionSort(T[] array, boolean verbose){
		insertionSort(array,verbose,false);
	}
	
	public <T extends Comparable <? super T>> void insertionSort(T[] array, boolean verbose, boolean reverse){

	}
}
