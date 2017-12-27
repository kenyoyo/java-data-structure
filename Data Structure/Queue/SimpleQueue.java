import java.lang.reflect.Array;

public class SimpleQueue<T> implements SimpleQueueInterface<T> {
	private T queueArray[];
	private int front, rear, numberOfItems;
	
	SimpleQueue(Class<T> c) {
		//Declaration size of queue default by 100. 
		final T[] array = (T[]) Array.newInstance(c, 100);
		queueArray = array;
		front = 0;
		rear = 0;
		numberOfItems = 0;
	}
	
	SimpleQueue(Class<T> c, int initSize) {
		final T[] array = (T[]) Array.newInstance(c, initSize);
		queueArray = array;
		front = 0;
		rear = 0;
		numberOfItems = 0;
	}
	
	public boolean add(T data) {
		if(numberOfItems == 0) {
			queueArray[front] = data;
			numberOfItems++;
			return true;
		} else {
			if((rear+1) % queueArray.length != front) {
				rear = (rear+1) % queueArray.length;
				queueArray[rear] = data;
				numberOfItems++;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public T remove() {
		if(numberOfItems > 0) {
			if(numberOfItems == 1) {
				numberOfItems--;
				return queueArray[front];
			} else {
				T removeItem = queueArray[front];
				front = (front+1) % queueArray.length;
				numberOfItems--;
				return removeItem;
			}
		} else {
			return null;
		}
	}
	
	public T getFirstQueue() {
		if(numberOfItems > 0) {
			return queueArray[front];
		} else {
			return null;
		}
	}
	
	public T getLastQueue() {
		if(numberOfItems > 0) {
			return queueArray[rear];
		} else {
			return null;
		}
	}
	
	public boolean isEmpty() {
		return numberOfItems == 0;
	}
	
	public int getSize() {
		return numberOfItems;
	}

	public int getSpace() {
		return queueArray.length - numberOfItems;
	}
}
