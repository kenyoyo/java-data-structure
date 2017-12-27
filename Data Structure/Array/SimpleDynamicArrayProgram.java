import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleDynamicArrayProgram {
static SimpleDynamicArray<String> simpleArray;
	
	public static void createArray(int spaceAvailable) {
		simpleArray = new SimpleDynamicArray(String.class, spaceAvailable);
		System.out.println("Declare the array by " + spaceAvailable + " reserve space.");
	}
	
	public static void addData(String data) {
		if(simpleArray.add(data)) {
			System.out.println("Add '" + data + "' to index " + (simpleArray.getSize()-1) + ".");
		} else {
			System.out.println("The array is full can't add '" + data + "' to array.");
		}
	}
	
	public static void addDataByIndex(int index, String data) {
		if(simpleArray.addByIndex(index, data)) {
			System.out.println("Add '" + data + "' to index " + index + ".");
		} 
		else {
			System.out.println("The amount of data in the array is " + simpleArray.getSize() + " can't add data at index " + index + ".");
		}
	}
	
	public static void removeData() {
		String removeData = simpleArray.remove();
		if(removeData != null) {
			System.out.println("'" + removeData + "' has remove from the array.");
		} else {
			System.out.println("The array is empty can't remove any data.");
		}
	}
	
	public static void removeDataByKey(String key) {
		String removeData = simpleArray.removeByKey(key);
		if(removeData != null) {
			System.out.println("'" + removeData + "' has remove from the array.");
		} else {
			System.out.println("Can't found '"+ key +"' in the array.");
		}
	}
	
	public static void removeDataByIndex(int index) {
		String removeData = simpleArray.removeByIndex(index);
		if(removeData != null) {
			System.out.println("'" + removeData + "' at index " + index + " has remove from the array.");
		} else {
			System.out.println("The amount of data in the array is " + simpleArray.getSize() + " can't remove data at index " + index + ".");
		}
	}
	
	public static void showDataByIndex(int index) {
		String data = simpleArray.getData(index);
		if(data != null) {
			System.out.println("The data of index " + index + " is '" + data + "'.");
		} else {
			System.out.println("The amount of data in the array is " + simpleArray.getSize() + " can't get data at index " + index + ".");
		}
	}
	
	public static void searchData(String data) {
		int dataIndex = simpleArray.search(data);
		if(dataIndex > -1) {
			System.out.println("Found '" + data + "' at index " + dataIndex + ".");
		} else {
			System.out.println("Can't found '" + data + "'" + " in the array.");
		}
	}
	
	public static void editData(int index, String data) {
		if(simpleArray.edit(index, data)) {
			System.out.println("Edit '" + data + "' to index " + index + ".");
		} else {
			System.out.println("The amount of data in the array is " + simpleArray.getSize() + " can't edit data at index " + index + ".");
		}
	}
	
	public static void editDataByKey(String key, String data) {
		if(simpleArray.editByKey(key, data)) {
			System.out.println("Replace '" + data + "' instead of '" + key + "'.");
		} else {
			System.out.println("Can't found '" + key + "'" + " in the array.");
		}
	}
	
	public static void displayArray() {
		simpleArray.display();
	}
	
	public static void showAmount() {
		System.out.println("The amount of data in the array is " + simpleArray.getSize() + ".");
	}
	
	public static void showSpace() {
		System.out.println("The array have " +  simpleArray.getSpace() + " space available.");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		byte userInput;
		System.out.println("#Welcome to Simple Dynamic Array Data Management Program#");
		System.out.println("Type array spaces available and enter to declare the array.");
		userInput = (byte) Integer.parseInt(in.readLine());
		createArray(userInput);
		System.out.println();
		
		while(true) {
			System.out.println("Type number of order and enter to do expression.");
			System.out.println("1: Add data to the array.");
			System.out.println("2: Add data to the array at specified index.");
			System.out.println("3: Edit data in the array at specified index.");
			System.out.println("4: Edit data in the array at specified key.");
			System.out.println("5: Search data in the array.");
			System.out.println("6: Remove data from the array.");
			System.out.println("7: Remove data from the array at specified index.");
			System.out.println("8: Remove data from the array at specified key.");
			System.out.println("9: Show all data in the array.");
			System.out.println("10: Show data in the array at specified index.");
			System.out.println("11: Show amount of data in the array.");
			System.out.println("12: Show space available in the array.");
			System.out.println("99: Exit Simple Dynamic Array Data Management Program.");
			userInput = (byte) Integer.parseInt(in.readLine());
			
			if(userInput == 1) {
				System.out.println();
				System.out.println("Type data and enter to add data to the array.");
				addData(in.readLine());
			} else if(userInput == 2) {
				System.out.println();
				System.out.println("Type index number and enter.");
				int index = Integer.parseInt(in.readLine());
				System.out.println("Type data and enter to add data to the array.");
				addDataByIndex(index, in.readLine());
			} else if(userInput == 3) {
				System.out.println();
				System.out.println("Type index number and enter.");
				int index = Integer.parseInt(in.readLine());
				System.out.println("Type new data and enter to replace old data in the array.");
				editData(index, in.readLine());
			} else if(userInput == 4) {
				System.out.println();
				System.out.println("Type key and enter.");
				String key = in.readLine();
				System.out.println("Type new data and enter to replace old data in the array.");
				editDataByKey(key, in.readLine()); 
			} else if(userInput == 5) {
				System.out.println();
				System.out.println("Type data and enter to search data in the array.");
				searchData(in.readLine());
			} else if(userInput == 6) {
				removeData();
			} else if(userInput == 7) {
				System.out.println();
				System.out.println("Type index number and enter to remove data at specified index of the array.");
				removeDataByIndex(Integer.parseInt(in.readLine()));
			} else if(userInput == 8) {
				System.out.println();
				System.out.println("Type key and enter to remove data that match the key in the array.");
				removeDataByKey(in.readLine());
			} else if (userInput == 9) {
				displayArray();
			} else if(userInput == 10) {
				System.out.println();
				System.out.println("Type index number and enter to show data at specified index of the array.");
				showDataByIndex(Integer.parseInt(in.readLine()));
			} else if(userInput ==11) {
				showAmount();
			} else if(userInput == 12) {
				showSpace();
			} else if(userInput == 99) {
				return;
			}
			System.out.println("Enter to continue...");
			in.readLine();
		}
	}		
}
