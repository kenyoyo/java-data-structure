import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleStackProgram {
	static SimpleStack<String> simpleStack;
	
	public static void createStack(int spaceAvailable) {
		simpleStack = new SimpleStack(String.class, spaceAvailable);
		System.out.println("Declare the stack by " + spaceAvailable + " reserve spaces.");
	}
	
	public static void addData(String data) {
		if(simpleStack.push(data)) {
			System.out.println("Add '" + data + "' to the top of stack.");
		} else {
			System.out.println("The stack is full can't add '" + data + "' to stack.");
		}
	}
	
	public static void removeData() {
		String removeData = simpleStack.pop();
		if(removeData != null) {
			System.out.println("'" + removeData + "'" + " has pop out of the stack.");
		} else {
			System.out.println("The stack is empty can't pop out any value on top of stack.");
		}
	}
	
	public static void showTopData() {
		String topData = simpleStack.peek();
		if(topData != null) {
			System.out.println("The top of stack is '" + topData + "'.");
		} else {
			System.out.println("The stack is empty can't peek any value on top of stack.");
		}
	}
	
	public static void showAmount() {
		System.out.println("The amount of data in stack is " + simpleStack.getSize() + ".");
	}
	
	public static void showSpace() {
		System.out.println("The stack have " +  simpleStack.getSpace() + " space available.");
	}
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		byte userInput;
		System.out.println("#Welcome to Simple Stack Data Management Program#");
		System.out.println("Type stack spaces available and enter to declare the stack.");
		userInput = (byte) Integer.parseInt(in.readLine());
		createStack(userInput);
		System.out.println();
		
		while(true) {
			System.out.println("Type number of order and enter to do expression.");
			System.out.println("1: Add data to the stack.");
			System.out.println("2: Remove data from the stack.");
			System.out.println("3: Show data is on top of the stack");
			System.out.println("4: Show the amount of data in stack");
			System.out.println("5: Show space available of the stack.");
			System.out.println("99: Exit Simple Stack Data Management Program.");
			userInput = (byte) Integer.parseInt(in.readLine());
			
			if(userInput == 1) {
				System.out.println();
				System.out.println("Type data and enter to add to the stack.");
				addData(in.readLine());
			} else if(userInput == 2) {
				removeData();
			} else if(userInput == 3) {
				showTopData();
			} else if (userInput == 4) {
				showAmount();
			} else if (userInput == 5) {
				showSpace();
			} else if (userInput == 99) {
				return;
			}
			System.out.println("Enter to continue...");
			in.readLine();
		}
	}
}
