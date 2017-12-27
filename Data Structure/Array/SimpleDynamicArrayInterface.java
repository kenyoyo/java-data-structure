
interface SimpleDynamicArrayInterface<T> {
	//Add data to available space element of array.
	//Return true if success add data, otherwise return false;
	public boolean add(T data);
	
	//Add data to specified index of array.
	//Return true if success add data, otherwise return false;
	public boolean addByIndex(int index, T data);
	
	//Remove the last data item in an array.
	//Return remove data if success remove.
	public T remove();
	
	//Remove data item from specified index of array.
	//Return remove data if success remove.
	public T removeByIndex(int index);
	
	//Remove data item that match the key in an array.
	//Return remove data if success remove. 
	public T removeByKey(T key);
	
	//Get data from specified index of array.
	public T getData(int index);
	
	//Search data that match the key in an array.
	//Return index of match key data item, but if not found any match key return -1.
	public int search(T key);
	
	//Edit data at specified index of data item in an array.
	//Return true if success edit, otherwise return false.
	public boolean edit(int index, T data);
	
	//Edit data that match the key in an array.
	//Return true if success edit, otherwise return false.
	public boolean editByKey(T key, T data);
	
	//Return true if is an empty array, otherwise return false.
	public boolean isEmpty();
	
	//Return number of element data item in an array.
	public int getSize();
	
	//Return number of space available element in an array.
	public int getSpace();
	
	//Display all data item in an array.
	public void display();
}
