package linkedbag;

public class Node<T> {
	private T data;
	private Node nextNode;
	private Node prevNode;
	
	public Node(){
		data=null;
		nextNode=null;
		prevNode=null;
	}
	
	private Node(T data, Node nextNode){
		this.data=data;
		this.nextNode=nextNode;
		prevNode=null;
	}
	
	private Node(T data, Node nextNode, Node prevNode){
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
