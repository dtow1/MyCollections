package arraybag;

import java.util.Arrays;

public class MyBagTester {

	public static void main(String[] args) {
		
		//Instantiate using the default constructor
		MyBag<String> bag = new MyBag<String>();
		
		//Empty bag
		System.out.println("Should be 0(0 elements in bag): " + bag.getCurrentSize());
		System.out.println("Should be False(not full): " + bag.isFull());
		System.out.println("Should be True (empty): " + bag.isEmpty() + "\n");
		
		//Add data to bag
		System.out.println("Add dog: " + bag.add("dog"));
		System.out.println("Add wolf: " + bag.add("wolf"));
		System.out.println("Add coyote: " + bag.add("coyote"));
		System.out.println("Add dingo: " + bag.add("dingo"));
		System.out.println("Add coyote: " + bag.add("coyote") + "\n");
		
		//Bag with 5 elements
		System.out.println("Should be 5(5 elements in bag): " + bag.getCurrentSize());
		System.out.println("Should be True(full): " + bag.isFull());
		System.out.println("Should be False (empty): " + bag.isEmpty() + "\n");		
		
		//Add data to a full bag
		System.out.println("Add wolf to full bag, should be false: " + bag.add("wolf"));
		System.out.println("Should be 5(5 elements in bag): " + bag.getCurrentSize() + "\n");	

		//Check count of object type
		System.out.println("Number of coyote, should be 2: " + bag.getFrequencyOf("coyote"));
		System.out.println("Number of dingo, should be 1: " + bag.getFrequencyOf("dingo") + "\n");
		
		//Check contains
		System.out.println("Contains dingo? Should be true: " + bag.contains("dingo"));
		System.out.println("Contains warg? Should be false: " + bag.contains("warg") + "\n");
		
		//Check toArray
		System.out.println("Test toArray. Should contain coyote, coyote, dingo, wolf, and dog, but in any order. \n" + Arrays.toString(bag.toArray()) + "\n");

		
		//check remove(anObject)
		System.out.println("Remove a coyote, should be true: " + bag.remove("coyote"));
		System.out.println("Test toArray. Should contain coyote, coyote, dingo, wolf, and dog, but in any order. \n" + Arrays.toString(bag.toArray()));
		System.out.println("Should be 4(4 elements in bag): " + bag.getCurrentSize()  + "\n");

		//check remove()
		System.out.println("Remove a random object, should be some object from the bag: " + bag.remove());
		System.out.println("Should be 3(3 elements in bag): " + bag.getCurrentSize() +  "\n");
		
		//check clear
		System.out.println("Clear the bag");
		bag.clear();
		System.out.println("Should be 0(0 elements in bag): " + bag.getCurrentSize() +  "\n");
		
		//check remove on an empty bag()
		System.out.println("Try to remove an object from an empty bag, should be null: " + bag.remove());
		System.out.println("Try to remove a warg from an empty bag, should be false: " + bag.remove("warg"));
		System.out.println("Should be False(not full): " + bag.isFull());
		System.out.println("Should be true (empty): " + bag.isEmpty() + "\n");	
		
		
	}

}
