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
public class MyLinkedBag<T> implements MyBagInterface<T>{
	private Node first;
	private Node last;
	private int itemCount;
	
	/**
	 * Default constructor. Set initial conditions and generate first bag array
	 */
	MyLinkedBag(){
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
				itemCount++;
			}else{
				last.setNextNode(tempNode);
				tempNode.setPrevNode(last);
				last=tempNode;
				itemCount++;
			}
			result=true;
		}
		return result;
	}

	
	@Override
	public T remove() {
		T item=(T) last.getData();
		last=last.getPrevNode();
		last.setNextNode(null);
		itemCount--;
		return item;
	}

	@Override
	public boolean remove(T anEntry) {
		return false;
	}
	

	@Override
	public void clear() {

		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int count=-1;
		if(anEntry != null&&first!=null){
			count=0;
			Node tempNode=first;
			while(tempNode.getNextNode()!=null){
				if(tempNode.getData().equals(anEntry)){
					count++;
				}
				tempNode=tempNode.getNextNode();
			}
		}
		return count;
	}

	@Override
	public boolean contains(T anEntry) {
		boolean result = false;
		if(anEntry!=null &&first!=null){
			Node tempNode=first;
			while(tempNode.getNextNode()!=null){
				if(tempNode.getData().equals(anEntry)){
					result = true;
				}
				tempNode=tempNode.getNextNode();
			}
		}
		
		return result;
	}

	@Override
	public T[] toArray() {
		return null;
	}


}
