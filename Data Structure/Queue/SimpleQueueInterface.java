
public interface SimpleQueueInterface<T> {
	//Add data to last of queue.
	public boolean add(T data);
	
	//Remove data from first of queue.
	public T remove();
	
	//Get data from first of queue.
	public T getFirstQueue();
	
	//Get data from last of queue.
	public T getLastQueue();
	
	//Check is an empty queue.
	public boolean isEmpty();
	
	//Get size of queue.
	public int getSize();
	
	//Get space available of queue.
	public int getSpace();
}
