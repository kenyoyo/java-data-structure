
public class SearchMethod {
	
	public static int sequentialSearch(int[] dataList, int key) {
		for(int i=0; i<dataList.length; i++) {
			//If found an element match the key return index of an element. 
			if(dataList[i] == key)
				return i;
		}
		//If not found any element match the key return -1.
		return -1;
	}
	
	public static int binarySearch(int[] dataList, int key) {
		//need sorted information of data list
		int left = 0, right = dataList.length-1, mid;
		
		while(left <= right) {
			mid = (left+right)/2;	
			
			//Match key element will present in half right area.
			if(dataList[mid] > key) {
				right = mid-1;
			
			//Match key element will present in half left area.
			} else if(dataList[mid] < key) {
				left = mid+1;
				
			//Found an element match the key return index of an element.	
			} else if(dataList[mid] == key) {
				return mid;
			}
			
		}
		//If not found any element match the key return -1.
		return -1;
	}
}
