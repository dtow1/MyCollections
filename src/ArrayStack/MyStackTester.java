package ArrayStack;

public class MyStackTester {

	public static void main(String[] args) {
		ArrayStack<String> testStack = new ArrayStack<String>();
		
		System.out.println("Test if is empty, should be true : " + testStack.isEmpty());
		System.out.println("Test if can pop off of the empty stack, should be null: " + testStack.pop());
		System.out.println("Test to see if can peek at an empty stack, should be null: " + testStack.peek());
		
		fillStack(testStack);
		
		System.out.println("Test if is empty, should be false: " + testStack.isEmpty());
		
		System.out.println("**********************Check pop and peek until stack is empty**********************");
		
		System.out.println("Peeking at top of stack, should be Boromir: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Boromir: " + testStack.pop());
		System.out.println("Peeking at top of stack, should be Gimli: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Gimli: " + testStack.pop());
		System.out.println("Peeking at top of stack, should be Legolas: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Legolas: " + testStack.pop());
		System.out.println("Peeking at top of stack, should be Stryder: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Stryder: " + testStack.pop());
		System.out.println("Peeking at top of stack, should be Gandalf: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Gandalf: " + testStack.pop());
		System.out.println("Peeking at top of stack, should be Pippin: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Pippin: " + testStack.pop());
		System.out.println("Peeking at top of stack, should be Merry: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Merry: " + testStack.pop());
		System.out.println("Peeking at top of stack, should be Sam: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Sam: " + testStack.pop());
		System.out.println("Peeking at top of stack, should be Frodo: " + testStack.peek());
		System.out.println("Popping from top of stack, should be Frodo: " + testStack.pop());
		
		fillStack(testStack);
		System.out.println("Test if is empty, should be false : " + testStack.isEmpty());
		System.out.println("Clearing the stack");
		testStack.clear();
		System.out.println("Test if is empty, should be true : " + testStack.isEmpty());

		
		
	}
	
	public static void fillStack(ArrayStack toFill){
		System.out.println("Building the fellowship");
		System.out.println("Adding Frodo to stack: " + toFill.push("Frodo"));
		System.out.println("Adding Sam to stack: " + toFill.push("Sam"));
		System.out.println("Adding Merry to stack: " + toFill.push("Merry"));
		System.out.println("Adding Pippin to stack: " + toFill.push("Pippin"));
		System.out.println("Adding Gandalf to stack: " + toFill.push("Gandalf"));
		System.out.println("Adding Stryder to stack: " + toFill.push("Stryder"));
		System.out.println("Adding Legolas to stack: " + toFill.push("Legolas"));
		System.out.println("Adding Gimli to stack: " + toFill.push("Gimli"));
		System.out.println("Adding Boromir to stack: " + toFill.push("Boromir"));
	}

}

