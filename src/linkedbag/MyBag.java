package linkedbag;

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
	private Node first;
	private Node last;
	private int itemCount;
	
	/**
	 * Default constructor. Set initial conditions and generate first bag array
	 */
	MyBag(){
		itemCount=0;
		first=null;
		last=null;
	}

	@Override
	public int getCurrentSize() {
		return itemCount;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return itemCount==0;
	}

	@Override
	public boolean add(T newEntry) {
		boolean result = false;
		if(newEntry != null){
			Node tempNode = new Node(newEntry);
			if(itemCount==0){
				first=tempNode;
				last=tempNode;
				first.setData(newEntry);
				result=false;
			}else{
				last.setNextNode(tempNode);
				tempNode.setPrevNode(last);
				last=tempNode;
				result=false;
			}
		}
		return result;
	}

	
	@Override
	public T remove() {

	}

	@Override
	public boolean remove(T anEntry) {

	}
	

	@Override
	public void clear() {

		
	}

	@Override
	public int getFrequencyOf(T anEntry) {

	}

	@Override
	public boolean contains(T anEntry) {

	}

	@Override
	public T[] toArray() {

	}


}
