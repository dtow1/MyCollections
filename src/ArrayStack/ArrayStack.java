package ArrayStack;

/**
 * A stack implementation that uses an Array
 * 
 * @author jasonboyer
 *
 *Date: 6/29/2016
 *
 */
public class ArrayStack<T> implements MyStackInterface{

	private T[] stackArray;
	private int size;
	private int count;
	
	public ArrayStack(){
		this(5);
	}
	
	public ArrayStack(int size){
		this.size=size;
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Object[size];
		stackArray=tempArray;
	}
	
	@Override
	public boolean push(Object newItem) {
		
		return false;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
