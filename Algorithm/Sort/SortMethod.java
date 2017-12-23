
public class SortMethod {

	public static void selectionSort(int[] dataList) {
		int maxValue, selectIndex;

		for (int i = dataList.length - 1; i > 0; i--) {
			maxValue = dataList[0];
			selectIndex = 0;

			for (int j = 0; j <= i; j++) {
				if (dataList[j] > maxValue) { // if require descending order change comparison operator > to <.
					maxValue = dataList[j];
					selectIndex = j;
				}
			}
			swapValues(dataList, i, selectIndex);
		}
	}

	public static void bubbleSort(int[] dataList) {
		boolean normalize;

		for (int i = dataList.length - 1; i > 0; i--) {
			normalize = true;
			
			for (int j = 0; j < i; j++) {
				if (dataList[j] > dataList[j + 1]) { // if require descending order change comparison operator > to <.
					swapValues(dataList, j, j + 1);
					normalize = false;
				}
			}
			if(normalize)
				break;
		}
	}

	public static void insertionSort(int[] dataList) {
		int toInsert, insertIndex;

		for (int i = 1; i < dataList.length; i++) {
			toInsert = dataList[i];
			insertIndex = i;

			while (insertIndex > 0) {
				if (toInsert < dataList[insertIndex - 1]) { // if require descending order change comparison operator <
															// to >.
					dataList[insertIndex] = dataList[insertIndex - 1];
					insertIndex--;
				} else {
					break;
				}
			}
			dataList[insertIndex] = toInsert;
		}
	}

	public static void swapValues(int[] dataList, int index1, int index2) {
		if (index1 != index2) {
			dataList[index1] = dataList[index2] - dataList[index1];
			dataList[index2] = dataList[index2] - dataList[index1];
			dataList[index1] = dataList[index1] + dataList[index2];
		}
	}
}
