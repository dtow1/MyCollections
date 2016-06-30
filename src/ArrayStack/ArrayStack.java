package ArrayStack;

import java.util.Arrays;

/**
 * A stack implementation that uses an Array
 * 
 * @author jasonboyer
 *
 *Date: 6/29/2016
 *
 */
public class ArrayStack<T> implements MyStackInterface<T>{

	private T[] stackArray;
	private int size;
	private int count;
	
	public ArrayStack(){
		this(5);
	}
	
	public ArrayStack(int size){
		this.size=size;
		count=0;
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Object[size];
		stackArray=tempArray;
	}
	
	@Override
	public void push(T newItem) {
		if(isFull()){
			doubleSize();
		}
		stackArray[count++]=(T)newItem;  
	}

	private void doubleSize(){
		size *= 2;
		T[]tempArray = Arrays.copyOf(stackArray, size);
		stackArray=tempArray;
	}
	
	private boolean isFull(){
		return size==count;
	}
	
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		T temp = null;
		if(count>0){
			temp=stackArray[count-1];
		}
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
