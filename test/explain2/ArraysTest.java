package explain2;

import java.util.Arrays;

public class ArraysTest<E> {
	
	private int capacity;
	private E[] array;
	private int length;
	
	public void ArraysTest() {
		this.capacity = 10;
	}
	
	public ArraysTest(int capacity) {
		this.capacity = capacity;
		array = (E[])new Object[this.capacity];
	}
	
	public void add(E e) {
		E[] newArray = this.array;
		if(length >= capacity) {
			newArray = Arrays.copyOf(this.array, array.length+1);
			newArray[array.length] = e;
			length++;
		}else {
		for(int i=0; i<array.length; i++) {
			if(array[i] == null) {
				array[i] = e;
				length++;
				break;
			}
		}
		}
		this.array = newArray;
	}
	
	public void remove(E e) {
		E[] newArray = this.array;
		for(int i=0; i<array.length; i++) {
			if(array[i] != null && array[i].equals(e)) {
				if(length >= capacity) {
					newArray = Arrays.copyOf(this.array, array.length-1);
									//원본  	    시작인덱스  복제배열 복제인덱스  복제할 크기
					System.arraycopy(this.array, i+1, newArray, i, newArray.length-i);
					length--;
					break;
					/*
					for(int j=i; j<newArray.length; j++) {
						newArray[j] = array[j+1];
						length--;
					}
					*/
				}
			}
		}
		this.array = newArray;
	}
	
	public int size() {
		return this.length;
	}

	public String toString() {
		return Arrays.toString(this.array);
	}
	
	public static void main(String[] args) {
		ArraysTest<String> array = new ArraysTest<>(3);
		System.out.println(array.toString());
		System.out.println(array);
		System.out.println(array.size());
		
		array.add("배민구");
		System.out.println(array);
		System.out.println(array.size());
		
		array.add("오정만");
		System.out.println(array);
		System.out.println(array.size());
		
		array.add("홍재관");
		System.out.println(array);
		System.out.println(array.size());
		
		array.add("배민구");
		System.out.println(array);
		System.out.println(array.size());
		
		array.remove("배민구");
		System.out.println(array);
		System.out.println(array.size());
		
		
	}
}
	


