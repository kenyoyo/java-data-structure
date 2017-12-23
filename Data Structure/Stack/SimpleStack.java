import java.lang.reflect.Array;

public class SimpleStack<T> implements SimpleStackInterface<T> {
	private T stackArray[];
	private int topOfStack;
	
	public SimpleStack(Class<T> c) {
		final T[] array = (T[]) Array.newInstance(c, 100);
		stackArray = array;
		topOfStack = -1;
		System.out.println("Declare simple stack of " + c.getSimpleName() + " by 100 reserve spaces.");
	}
	
	public SimpleStack(Class<T> c, int initSize) {
		final T[] array = (T[]) Array.newInstance(c, initSize);
		stackArray = array;
		topOfStack = -1;
		System.out.println("Declare simple stack of " + c.getSimpleName() + " by " + initSize + " reserve space.");
	}
	
	@Override
	public void push(T value) {
		if(topOfStack+1 < stackArray.length) {
			stackArray[++topOfStack] = value;
			System.out.println("Add '" + value + "' to top of stack.");
		} else {
			System.out.println("The stack is full can't add '" + value + "' to stack.");
		}
	}

	@Override
	public T pop() {
		if(topOfStack != -1) {
			System.out.println("'" + stackArray[topOfStack] + "' " + "has pop out of stack.");
			return stackArray[topOfStack--];
		} else {
			System.out.println("The stack is empty can't pop out any value on top of stack.");
			return null;
		}
	}

	@Override
	public T peek() {
		if(topOfStack != -1) {
			System.out.println("The top of stack is '" + stackArray[topOfStack] + "'.");
			return stackArray[topOfStack];
		} else {
			System.out.println("The stack is empty can't peek any value on top of stack.");
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		if(topOfStack == -1)
			return true;
		else
			return false;
	}

	@Override
	public int getSize() {
		return topOfStack+1;
	}

	@Override
	public int getSpace() {
		return stackArray.length - (topOfStack+1);
	}

}
