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
	
	public boolean add(T value) {
		if(numberOfItems == 0) {
			queueArray[front] = value;
			numberOfItems++;
			return true;
		} else {
			if((rear+1) % queueArray.length == front) {
				return false;
			} else {
				rear = (rear+1) % queueArray.length;
				queueArray[rear] = value;
				numberOfItems++;
				return true;
			}
		}
	}
	
	public T remove() {
		if(numberOfItems == 0) {
			return null;
		} else {
			if(numberOfItems == 1) {
				numberOfItems--;
				return queueArray[front];
			} else {
				T removeItem = queueArray[front];
				front = (front+1) % queueArray.length;
				numberOfItems--;
				return removeItem;
			}
		}
	}
	
	public T getFirstQueue() {
		if(numberOfItems == 0) {
			return null;
		}
		return queueArray[front];
	}
	
	public T getLastQueue() {
		if(numberOfItems == 0) {
			return null;
		}
		return queueArray[rear];
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
