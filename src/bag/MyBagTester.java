package bag;

public class MyBagTester {

	public static void main(String[] args) {
		
		//Instantiate using the default constructor
		MyBag<String> bag = new MyBag<String>();
		
		//Empty bag
		System.out.println("Should be 0(0 elements in bag): " + bag.getCurrentSize());
		System.out.println("Should be False(not full): " + bag.isFull());
		System.out.println("Should be True (empty): " + bag.isEmpty());
		
		//Add data to bag
		System.out.println("Add dog: " + bag.add("dog"));
		System.out.println("Add wolf: " + bag.add("wolf"));
		System.out.println("Add coyote: " + bag.add("coyote"));
		
		//Bag with 3 elements
		System.out.println("Should be 3(3 elements in bag): " + bag.getCurrentSize());
		System.out.println("Should be False(not full): " + bag.isFull());
		System.out.println("Should be False (empty): " + bag.isEmpty());		
		
		
		
		

	}

}
