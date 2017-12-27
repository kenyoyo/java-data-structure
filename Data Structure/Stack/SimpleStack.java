import java.lang.reflect.Array;

public class SimpleStack<T> implements SimpleStackInterface<T> {
	private T stackArray[];
	private int topOfStack;
	
	public SimpleStack(Class<T> c) {
		final T[] array = (T[]) Array.newInstance(c, 100);
		stackArray = array;
		topOfStack = -1;
	}
	
	public SimpleStack(Class<T> c, int initSize) {
		final T[] array = (T[]) Array.newInstance(c, initSize);
		stackArray = array;
		topOfStack = -1;
	}
	
	@Override
	public boolean push(T data) {
		if(topOfStack+1 < stackArray.length) {
			stackArray[++topOfStack] = data;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public T pop() {
		if(topOfStack > -1) {
			return stackArray[topOfStack--];
		} else {;
			return null;
		}
	}

	@Override
	public T peek() {
		if(topOfStack > -1) {
			return stackArray[topOfStack];
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		return topOfStack == -1;
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