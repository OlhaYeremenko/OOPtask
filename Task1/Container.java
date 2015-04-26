package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

import Task0_variant10_Train.Train;

public class Container<T extends Product> {

	private Product[] arr;
	private int cursor;
	private int count = 1;

	public Container() {

		if (count > 0) {
			arr = new Product[count];

		} else {
			throw new IllegalArgumentException("Illegal count: " + count);
		}

	}

	public void add(T obj) {
		try {
			if (arr.length < count) {
				arr = Arrays.copyOf(arr, arr.length + 1);
			}
			arr[cursor] = obj;
			cursor++;
			count++;
			

		} catch (IndexOutOfBoundsException ex) {
			throw new ConcurrentModificationException();
		}

	}

	public int count() {
		try {
			return cursor;

		} catch (IndexOutOfBoundsException ex) {
			throw new ConcurrentModificationException();
		}

	}

	@SuppressWarnings("unchecked")
	T arr(int index) {
		return (T) arr[index];
	}

	public T get(int index) {
		if (index >= arr.length)
			throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
		return arr(index);
	}

	public void sortPrice() {
		for (int i = 1; i < arr.length; i++) {
            Product newElement = arr[i];
            int location = i - 1;
            while (location >= 0 && arr[location].getPrice() > newElement.getPrice()) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }      
		
	}

	public void print() {
		for (Product p : arr) {
			System.out.println(p.toString());
		}

	}

}
