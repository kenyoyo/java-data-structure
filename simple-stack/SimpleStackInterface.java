
public interface SimpleStackInterface<T> {
	//push value to the top of stack.
	public void push(T value);
	
	//pop out the value on the top of stack.
	public T pop();
	
	//peek the value on the top of stack.
	public T peek();
	
	//Check that stack is empty.
	public boolean isEmpty();
	
	//Get size of stack.
	public int getSize();
	
	//Get total space of stack.
	public int getSpace();
}
