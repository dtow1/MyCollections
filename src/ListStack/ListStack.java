package ListStack;

import ArrayStack.MyStackInterface;

public class ListStack<T> implements MyStackInterface<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;
	
	public ListStack(){
		clear();
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
		T data = null;
		
		if(size>0){
			data = last.getData();
			if(size==1){
				last=null;
				first=null;
			}else{
				last=last.getPrevNode();
			}
			size--;
		}
		
		return data;
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
		last=null;
		first=null;
		size=0;
	}

}
