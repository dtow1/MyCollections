package ArrayStack;

/**
 * Stack interface for practicing data structures and algorithms
 * 
 * @author jasonboyer
 *
 * @param <T>
 * 
 * Date 6/29/2016
 * 
 */
public interface MyStackInterface <T> {

	/**
	 * Push an item onto the stack.
	 * 
	 * @param newItem - The item to be pushed onto the stack
	 * 
	 */
	public void push(T newItem);
	
	/**
	 * Pop an element off the top of the stack, item is removed from the stack.
	 * 
	 * @return Returns the object at the top of the stack or null if empty
	 */
	public T pop();
	
	
	/**
	 * Returns the top item on the stack, but does not remove it from the stack.
	 * 
	 * @return Returns the object at the top of the stack or null if empty
	 */
	public T peek();
	
	/**
	 * Test to see if the stack is empty
	 * 
	 * @return true if the stack is empty, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Empty the entire stack
	 */
	public void clear();
	
}
