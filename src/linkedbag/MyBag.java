package linkedbag;

import java.util.Arrays;

/**
 * This is my Bag class it is implemented using a linked list.
 * 
 *  6/25/2016
 * 
 * @author jasonboyer
 *
 * @param <T>
 */
public class MyBag<T> implements MyBagInterface<T>{
	private T[] bagArray;
	private int capacity;
	private int itemCount;
	
	/**
	 * Default constructor. Set initial conditions and generate first bag array
	 */
	MyBag(){
		itemCount=0;
		capacity=5;
		//Clear sets bagArray to a new empty array of size "capacity"
		clear();
	}

	@Override
	public int getCurrentSize() {
		return itemCount;
	}

	@Override
	public boolean isFull() {
		return itemCount==capacity;
	}

	@Override
	public boolean isEmpty() {
		return itemCount==0;
	}

	@Override
	public boolean add(T newEntry) {
		boolean result = false;
		if(newEntry != null){
			if(isFull()){
				biggerBag();
			}
			bagArray[itemCount]=newEntry;
			itemCount++;
			result=true;
			
		}


		return result;
	}

	/**
	 *  This method multiplies the current bag size by two and returns the new larger bag. The contents of the
	 *  first bag are copied into the new bag.
	 */
	public void biggerBag(){
		capacity *= 2;
		T[] tempBag = Arrays.copyOf(bagArray, capacity);
		bagArray = tempBag;
	}
	
	@Override
	public T remove() {
		T tempItem = null;
		if(itemCount>0){
			tempItem = bagArray[itemCount-1];
			bagArray[--itemCount]=null;
		}

		return tempItem;
	}

	@Override
	public boolean remove(T anEntry) {
		boolean status = false;
		if(itemCount>0 && contains(anEntry)){
			T tempItem = bagArray[itemCount-1];
			bagArray[--itemCount]=null;
			status=true;
		}
		return status;
	}
	

	@Override
	public void clear() {
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[]) new Object[capacity];
		bagArray = tempBag;
		itemCount=0;
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int count = 0;
		
		for(int i=0;i<itemCount; i++){
			System.out.println(i);
			if(bagArray[i].equals(anEntry)){
				count++;
			}
		}
		
		return count;
	}

	@Override
	public boolean contains(T anEntry) {
		boolean found = false;
		if(itemCount>0){
			for(int i=0;i<itemCount;i++){
				if(bagArray[i].equals(anEntry)){
					found=true;
				}
			}
		}
		return found;
	}

	@Override
	public T[] toArray() {
		return Arrays.copyOf(bagArray, itemCount);
	}


}
