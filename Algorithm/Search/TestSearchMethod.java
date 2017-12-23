
public class TestSearchMethod {
	
	public static void main(String[] args) {
		
		int dataList[] = { 0, 1, 34, 54, 88 };
		int foundIndex;

		System.out.println("#Test Linear Search");
		foundIndex = SearchMethod.sequentialSearch(dataList, 34);

		if (foundIndex != -1) {
			System.out.println("Found 34 at index " + foundIndex + ".");
			System.out.println();
		}

		System.out.println("#Test Binary Search");
		foundIndex = SearchMethod.binarySearch(dataList, 1);

		if (foundIndex != -1) {
			System.out.println("Found 1 at index " + foundIndex + ".");
			System.out.println();
		}	
	}
}
