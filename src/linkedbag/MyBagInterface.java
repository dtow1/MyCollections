package linkedbag;

/**
 * Bag Interface
 * This interface describes a bag data structure. The data structure behaves as a physical bag would, unstructured/unordered access, etc.
 * @author Jason Boyer
 *
 * Date: 6/20/2016
 *
 */
public interface MyBagInterface<T> {

	
	/**
	 * This method gets the current number of items in the bag.
	 * 
	 * @return An integer that represents the number of items in the bag.
	 */
	public int getCurrentSize();
	
	/**
	 * This method checks to see if the bag is full or not.
	 * 
	 * @return true if the bag is full, false otherwise.
	 */
	public boolean isFull();
	
	/**
	 * This method checks to see if the bag is empty or not.
	 * 
	 * @return true if the bag is empty, false otherwise.
	 */
	public boolean isEmpty();
	
	/**
	 * This method adds an object to the bag.
	 * 
	 * @param newEntry - this is the object that is added to the bag.
	 * @return true if the object is added successfully, false otherwise.
	 */
	public boolean add(T newEntry);
	
	/**
	 * This method removes one object from the bag. It is important to note that this is
	 * a "random" object. No order is required for this access.
	 * 
	 * @return the removed object is returned, null if empty
	 */
	public T remove();
	
	/**
	 * This method removes a specific type of object from the bag. It is important to note that the object
	 * is not returned.
	 * 
	 * @param anEntry the type of object to be removed.
	 * @return true if an object was removed, false otherwise.
	 */
	public boolean remove(T anEntry);
	
	/**
	 * This method empties the bag.
	 * 
	 * 
	 */
	public void clear();
	
	/**
	 * This method counts how many of type of object are included in the bag.
	 * 
	 * @param anEntry the type of object to count.
	 * @return an integer representing the object count.
	 */
	public int getFrequencyOf(T anEntry);
	
	/**
	 * This method checks to see if an object of anEntry is in the bag.
	 * 
	 * @param anEntry the object to check
	 * @return true if the object is in the bag, false otherwise
	 */
	public boolean contains(T anEntry);
	
	/**
	 * This method creates an array of all the objects in the bag and returns it.
	 * 
	 * @return the array of all objects in the bag is returned.
	 */
	public T[] toArray();
	
}
