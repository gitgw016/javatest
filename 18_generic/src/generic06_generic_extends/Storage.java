package generic06_generic_extends;

public interface Storage<T> {
	void add(T item, int index);
	T get(int index);
}
