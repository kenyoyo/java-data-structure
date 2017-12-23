import java.util.Arrays;

public class TestSortMethod {
	public static void generateData(int dataList[]) {
		for(int i=0; i<10; i++) {
			dataList[i] = (int) (Math.random() * 101);
		}
	}
	
	public static void main(String[] args) {
		int []dataList = new int[10];
	
		System.out.println("#Test Selection Sort");
		generateData(dataList);
		System.out.println("Before sorting data list = " + Arrays.toString(dataList));
		SortMethod.selectionSort(dataList);
		System.out.println("After sorting data list = " + Arrays.toString(dataList));
		System.out.println();
		
		System.out.println("#Test Bubble Sort");
		generateData(dataList);
		System.out.println("Before sorting data list = " + Arrays.toString(dataList));
		SortMethod.bubbleSort(dataList);
		System.out.println("After sorting data list = " + Arrays.toString(dataList));
		System.out.println();
		
		System.out.println("#Test Insertion Sort");
		generateData(dataList);
		System.out.println("Before sorting data list = " + Arrays.toString(dataList));
		SortMethod.insertionSort(dataList);
		System.out.println("After sorting data list = " + Arrays.toString(dataList));
		System.out.println();
	}

}
