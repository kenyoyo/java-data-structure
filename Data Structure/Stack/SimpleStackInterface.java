
public interface SimpleStackInterface<T> {
	//push data to top of stack.
	public boolean push(T value);
	
	//pop out data that on top of stack.
	public T pop();
	
	//peek data on top of stack.
	public T peek();
	
	//Check a stack is empty.
	public boolean isEmpty();
	
	//Get size of stack.
	public int getSize();
	
	//Get space available of stack.
	public int getSpace();
}
