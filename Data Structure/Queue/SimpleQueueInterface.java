
public interface SimpleQueueInterface<T> {
	//Add value to the last of queue.
	public boolean add(T value);
	
	//Remove value from the first of queue.
	public T remove();
	
	//Get value from the first of queue.
	public T getFirstQueue();
	
	//Get value from the last of queue.
	public T getLastQueue();
	
	//Check the queue is empty.
	public boolean isEmpty();
	
	//Get size of queue.
	public int getSize();
	
	//Get total space of queue.
	public int getSpace();
}
