package linkedbag;

/**
 * This class creates a node to be used in a linked list
 * 
 * 6/25/2016
 * 
 * @author jasonboyer
 *
 * @param <T>
 */
public class Node<T> {
	private T data;
	private Node nextNode;
	private Node prevNode;
	
	/**
	 *  Default constructor, set all to null
	 */
	public Node(){
		data=null;
		nextNode=null;
		prevNode=null;
	}
	
	/** 
	 * Default constructor for just starting with data
	 * @param data this is the data that will be added to the node
	 */
	public Node(T data) {
		this.data=data;
		nextNode=null;
		prevNode=null;
	}
	
	
	/**
	 * Constructor to initialize data and next node
	 * 
	 * @param data - data to be stored in the node
	 * @param prevNode - pointer to the previous node
	 */
	private Node(T data, Node prevNode){
		this.data=data;
		this.nextNode=nextNode;
		prevNode=null;
	}
	
	/**
	 * Constructor to create and initialize all values
	 * 
	 * @param data - data to be stored in the node
	 * @param nextNode - pointer to the next node
	 * @param prevNode - pointer to the previous node
	 */
	private Node(T data, Node prevNode, Node nextNode){
		this.data=data;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
		
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	
	

}
