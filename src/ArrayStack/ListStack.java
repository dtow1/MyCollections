package ArrayStack;

public class ListStack<T> implements MyStackInterface<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;
	
	public ListStack(){
		size=0;
		first=null;
		last=null;
	}
	
	@Override
	public void push(T newItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		return last.getData();
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public void clear() {
		
	}

}
