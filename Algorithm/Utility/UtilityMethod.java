
public class UtilityMethod {
	//Swap the value between specified index of data list.
	public static<T> void swapValues(T[] dataList, int index1, int index2) {
		T temp = dataList[index1];
		dataList[index1] = dataList[index2];
		dataList[index2] = temp;
	}
	
	//Finding minimum value in the data list.
	public static double findMin(double[] dataList) {
		double minValue = dataList[0];
		
		for(int i=0; i<dataList.length; i++) {
			if(dataList[i] < minValue) {
				minValue = dataList[i];
			}
		}
		return minValue;
	}
	
	//Finding maximum value in the data list.
	public static double findMax(double[] dataList) {
		double maxValue = dataList[0];
		
		for(int i=0; i<dataList.length; i++) {
			if(dataList[i] > maxValue) {
				maxValue = dataList[i];
			}
		}
		return maxValue;
	}

}
