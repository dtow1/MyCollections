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
		if(newItem!=null){
			Node<T> nextNode=new Node<T>();
			nextNode.setData(newItem);
			
			if(size==0){
				first=nextNode;
			}else{
				last.setNextNode(nextNode);
				nextNode.setPrevNode(last);
			}
			
			last=nextNode;
			size++;
		}
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		T data= null;
		if(size>0){
			data = last.getData();
		}
		return data; 
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public void clear() {
		
	}

}
