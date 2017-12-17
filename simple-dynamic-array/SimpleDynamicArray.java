import java.lang.reflect.Array;
import java.util.Arrays;

class SimpleDynamicArray<T> implements SimpleDynamicArrayInterface<T> {
	private T array[];
	private int currentSize;	//This is a size of value in array.
	
	SimpleDynamicArray(Class<T> c) {
		//Declaration size of array default by 100. 
		final T[] array = (T[]) Array.newInstance(c, 100);
		this.array = array;
		currentSize = 0;
		System.out.println("Declare simple dynamic array of 100 reserve space");
	}
	
	SimpleDynamicArray(Class<T> c, int initSize) {
		//Declaration size of array by parameter initSize.
		final T[] array = (T[]) Array.newInstance(c, initSize);
		this.array = array;
		currentSize = 0;
		System.out.println("Declare simple dynamic array of " + initSize + " reserve space.");
	}
	
	public void addValue(T value) {
		if(currentSize < array.length) {
			array[currentSize] = value;
			System.out.println("Add '" + value + "' to index " + currentSize + ".");
			currentSize++;
		} else {
			System.out.println("The array is full can't add '" + value + "' to array.");
		}
		
	}
	
	public void addValueByIndex(int index, T value) {
		if(currentSize < array.length) {
			for(int i=currentSize; i>index; i--) {
				array[i] = array[i-1];
			}
			array[index] = value;
			currentSize++;
			System.out.println("Add '" + value + "' to index " + index + ".");
		} else {
			System.out.println("The array is full can't add '" + value + "' to array.");
		}
	}
	
	public void remove() {
		if(currentSize == 0) {
			System.out.println("The array is empty can't remove any value.");
		} else {
			System.out.println("'" + array[--currentSize] + "' has remove from array.");
			array[currentSize] = null;
		}
	}
	
	public void removeByIndex(int index) {
		if(currentSize == 0) {
			System.out.println("The array is empty can't remove any value.");
		} else if(currentSize <= index) {
			System.out.print("The size of array is " + currentSize + " can't remove value at index " + index + ".");
		} else {
			System.out.println("'" + array[index] + "' at index " + index + " has remove from array.");
			for(int i=index; i<currentSize-1; i++) {
				array[i] = array[i+1];
			}
			array[--currentSize] = null;
		}
	}
	
	public T getValueByIndex(int index) {
		if(currentSize == 0) {
			System.out.println("The array is empty can't get any value.");
			return null;
		} else if(currentSize <= index) {
			System.out.println("The size of array is " + currentSize + " can't get value at index " + index + ".");
			return null;
		} else {
			System.out.println("The value of index " + index + " is '" + array[index] + "'.");
			return array[index];
		}
	}
	
	public int searchByValue(T value) {
		for(int i=0; i<currentSize; i++) {
			if(value.equals(array[i])) {
				System.out.println("Found '" + value + "' at index " + i + ".");
				return i;
			}
		}
		System.out.println("Can't find '" + value + "'" + " in array.");
		return -1;
	}
	
	public void editByIndex(int index, T value) {
		if(currentSize <= index) {
			System.out.println("The size of array is " + currentSize + " can't edit value at index " + index + ".");
		} else {
			array[index] = value;
			System.out.println("Edit '" + value + "' to index " + index + ".");
		}
	}
	
	public boolean isEmpty() {
		if(currentSize == 0)
			return true;
		else
			return false;
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public String toString() {
		return Arrays.toString(array);
	}
}
