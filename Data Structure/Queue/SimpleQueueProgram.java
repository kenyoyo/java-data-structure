import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleQueueProgram {
	static SimpleQueue<String> simpleQueue;
	
	public static void createQueue(int spaceAvailable) {
		simpleQueue = new SimpleQueue(String.class, spaceAvailable);
		System.out.println("Declare the queue by " + spaceAvailable + " reserve spaces.");
	}
	
	public static void addData(String data) {
		if(simpleQueue.add(data)) {
			System.out.println("Add '" + data + "' to the last of queue.");
		} else {
			System.out.println("The queue is full can't add '" + data + "' to queue.");
		}
	}
	
	public static void removeData() {
		String removeData = simpleQueue.remove();
		if(removeData != null) {
			System.out.println("'" + removeData + "'" + " has remove out of the queue.");
		} else {
			System.out.println("The queue is empty can't remove any data.");
		}
	}
	
	public static void showFirstData() {
		String firstData = simpleQueue.getFirstQueue();
		if(firstData != null) {
			System.out.println("The first data of queue is " + firstData + ".");
		} else {
			System.out.println("The queue is empty can't get any data");
		}
	}
	
	public static void showLastData() {
		String lastData = simpleQueue.getLastQueue();
		if(lastData != null) {
			System.out.println("The last data of queue is " + lastData + ".");
	    } else {
			System.out.println("The queue is empty can't get any data");
		}
	}
	
	public static void showAmount() {
		System.out.println("The amount of data in the queue is " + simpleQueue.getSize() + ".");
	}
	
	public static void showSpace() {
		System.out.println("The queue have " +  simpleQueue.getSpace() + " space available.");
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		byte userInput;
		System.out.println("#Welcome to Simple Queue Data Management Program#");
		System.out.println("Type queue spaces available and enter to declare the queue.");
		userInput = (byte) Integer.parseInt(in.readLine());
		createQueue(userInput);
		System.out.println();
		
		while(true) {
			System.out.println("Type number of order and enter to do expression.");
			System.out.println("1: Add data to the queue.");
			System.out.println("2: Remove data from the queue.");
			System.out.println("3: Show the first data of queue");
			System.out.println("4: Show the last data of queue");
			System.out.println("5: Show the amount of data in the queue");
			System.out.println("6: Show space available in the queue.");
			System.out.println("99: Exit Simple Queue Data Management Program.");
			userInput = (byte) Integer.parseInt(in.readLine());
			
			if(userInput == 1) {
				System.out.println();
				System.out.println("Type data and enter to add to the queue.");
				addData(in.readLine());
			} else if(userInput == 2) {
				removeData();
			} else if(userInput == 3) {
				showFirstData();
			} else if(userInput == 4) {
				showLastData();
			} else if (userInput == 5) {
				showAmount();
			} else if (userInput == 6) {
				showSpace();
			} else if (userInput == 99) {
				return;
			}
			System.out.println("Enter to continue...");
			in.readLine();
		}
	}
}
