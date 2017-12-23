import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleQueueProgram {
	static SimpleQueue<String> q;
	
	public static void createQueue(int spaceAvailable) {
		q = new SimpleQueue(String.class, spaceAvailable);
		System.out.println("Declare simple queue by " + spaceAvailable + " reserve spaces.");
	}
	
	public static void addData(String data) {
		if(q.add(data)) {
			System.out.println("Add '" + data + "' to the last of queue.");
		} else {
			System.out.println("The queue is full can't add '" + data + "' to queue.");
		}
	}
	
	public static void removeData() {
		if(q.isEmpty()) {
			System.out.println("The queue is empty can't remove any data.");
		} else {
			System.out.println("'" + q.remove() + "'" + " has remove out of queue.");
		}
	}
	
	public static void showFirstData() {
		if(q.isEmpty()) {
			System.out.println("The queue is empty can't get any data");
		} else {
			System.out.println("The first data of queue is " + q.getFirstQueue() + ".");
		}
	}
	
	public static void showLastData() {
		if(q.isEmpty()) {
			System.out.println("The queue is empty can't get any data");
	    } else {
			System.out.println("The last data of queue is " + q.getLastQueue() + ".");
		}
	}
	
	public static void removeAll() {
		while(!q.isEmpty()) {
			q.remove();
		}
		System.out.println();
	}
	
	public static void showAmount() {
		System.out.println("Amount of data in queue is " + q.getSize() + ".");
	}
	
	public static void showSpace() {
		System.out.println("The queue have " +  q.getSpace() + " space available.");
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		byte userInput;
		System.out.println("#Welcome to Simple Queue Data Management Program#");
		System.out.println("Type your queue spaces available and enter to declare your queue.");
		userInput = (byte) Integer.parseInt(in.readLine());
		createQueue(userInput);
		System.out.println();
		
		do{
			System.out.println("Type number of order and enter to do expression.");
			System.out.println("1: Add data to queue.");
			System.out.println("2: Remove data from queue.");
			System.out.println("3: Show the first data of queue");
			System.out.println("4: Show the last data of queue");
			System.out.println("5: Show amount of data in queue");
			System.out.println("6: Show space available of queue.");
			System.out.println("99: Exit Simple Queue Data Management Program.");
			userInput = (byte) Integer.parseInt(in.readLine());
			
			if(userInput == 1) {
				System.out.println();
				System.out.println("Type data and enter to add to your queue.");
				addData(in.readLine());
				System.out.println();
			} else if(userInput == 2) {
				removeData();
				System.out.println();
			} else if(userInput == 3) {
				showFirstData();
				System.out.println();
			} else if(userInput == 4) {
				showLastData();
				System.out.println();
			} else if (userInput == 5) {
				showAmount();
				System.out.println();
			} else if (userInput == 6) {
				showSpace();
				System.out.println();
			} else if (userInput == 99) {
				break;
			}
		} while(userInput != 99);
	}
}
