package bag;

import java.util.Arrays;

public class MyBag<T> implements MyBagInterface<T>{
	private T[] bagArray;
	private int capacity;
	private int itemCount;
	
	MyBag(){
		itemCount=0;
		capacity=5;
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
		if(newEntry != null && itemCount<capacity){
			bagArray[itemCount]=newEntry;
			itemCount++;
			result=true;
		}

		return result;
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
		// TODO Auto-generated method stub
		return 0;
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
