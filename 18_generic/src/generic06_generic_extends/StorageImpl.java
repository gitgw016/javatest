package generic06_generic_extends;

public class StorageImpl<T> implements Storage<T>{
	
	private T[] array;
	
	public StorageImpl(int capacity) {
		Object o = new Object[capacity];
		this.array = (T[])o;
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
