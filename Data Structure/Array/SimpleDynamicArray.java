import java.lang.reflect.Array;
import java.util.Arrays;

class SimpleDynamicArray<T> implements SimpleDynamicArrayInterface<T> {
	private T array[];
	private int currentSize;
	
	SimpleDynamicArray(Class<T> c) {
		//Declaration size of array default by 100. 
		final T[] array = (T[]) Array.newInstance(c, 100);
		this.array = array;
		currentSize = 0;
	}
	
	SimpleDynamicArray(Class<T> c, int initSize) {
		//Declaration size of array by parameter initSize.
		final T[] array = (T[]) Array.newInstance(c, initSize);
		this.array = array;
		currentSize = 0;
	}
	
	@Override
	public boolean add(T data) {
		if(currentSize < array.length) {
			array[currentSize++] = data;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean addByIndex(int index, T data) {
		if(index <= currentSize) {
			for(int i=currentSize; i>index; i--) {
				array[i] = array[i-1];
			}
			array[index] = data;
			currentSize++;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public T remove() {
		if(currentSize > 0) {
			T removeItem = array[--currentSize];
			array[currentSize] = null;
			return removeItem;
		} else {
			return null;
		}
	}
	
	@Override
	public T removeByIndex(int index) {
		if(index < currentSize) {
			T removeItem = array[index];
			for(int i=index; i<currentSize-1; i++) {
				array[i] = array[i+1];
			}
			array[--currentSize] = null;
			return removeItem;
		} else {
			return null;
		}
		
	}
	
	@Override
	public T removeByKey(T key) {
		for(int i=0; i<currentSize; i++) {
			if(key.equals(array[i])) {
				for(int j = i; j<currentSize-1; j++) {
					array[j] = array[j+1];
				}
				array[--currentSize] = null;
				return key;
			}
		}
		return null;
	}
	
	@Override
	public T getData(int index) {
		if(index < currentSize) {
			return array[index];
		} else {
			return null;
		}
	}
	
	@Override
	public int search(T key) {
		for(int i=0; i<currentSize; i++) {
			if(key.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public boolean edit(int index, T data) {
		if(currentSize > index) {
			array[index] = data;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean editByKey(T key, T data) {
		for(int i=0; i<currentSize; i++) {
			if(key.equals(array[i])) {
				array[i] = data;
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	@Override
	public int getSize() {
		return currentSize;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	@Override
	public int getSpace() {
		return array.length - currentSize;
	}

	@Override
	public void display() {
		for(int i = 0; i<currentSize; i++) {
			if((i+1) % 5 == 0 || i == currentSize-1) 
				System.out.println("index " + i + ": '" + array[i] + "'");
			else
				System.out.print("index " + i + ": '" + array[i] + "', ");
		}
	}
}
