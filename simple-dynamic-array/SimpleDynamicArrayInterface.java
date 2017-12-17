interface SimpleDynamicArrayInterface<T> {
	//Add value to the last element of array.
	public void addValue(T value);
	
	//Add value to specific index of array.
	public void addValueByIndex(int index, T value);
	
	//Remove the last element of array.
	public void remove();
	
	//Remove the element of array by specific index.
	public void removeByIndex(int index);
	
	//Get value from array by specific index.
	public T getValueByIndex(int index);
	
	//Searching value in array.
	public int searchByValue(T value);
	
	//Edit value to specific index of array.
	public void editByIndex(int index, T value);
	
	//Check that is an empty array.
	public boolean isEmpty();
	
	//Get the current size of array.
	public int getSize();
	
	//Display all data of array.
	public String toString();
}
