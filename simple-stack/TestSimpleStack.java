
public class TestSimpleStack {

	public static void main(String[] args) {
		SimpleStack<Integer> testIntStack = new SimpleStack<>(Integer.class);
		SimpleStack<String> websiteStack = new SimpleStack<>(String.class, 3);
		System.out.println("Size of stack is " + websiteStack.getSize() + ".");
		System.out.println("The stack is empty? " + websiteStack.isEmpty() + ".");
		System.out.println("The stack have " + websiteStack.getSpace() + " space.");
		websiteStack.peek();
		websiteStack.pop();
		System.out.println();
		
		websiteStack.push("www.youtube.com");
		websiteStack.push("www.facebook.com");
		websiteStack.push("www.google.com");
		System.out.println("The stack have " + websiteStack.getSpace() + " space.");
		websiteStack.push("www.amazon.com");
		websiteStack.peek();
		websiteStack.pop();
		System.out.println("Size of stack is " + websiteStack.getSize() + ".");
		System.out.println("The stack is empty? " + websiteStack.isEmpty() + ".");
	}

}
