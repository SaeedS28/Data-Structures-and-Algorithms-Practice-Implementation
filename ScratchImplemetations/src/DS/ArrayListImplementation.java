package DS;

public class ArrayListImplementation<E> implements ArrayedListInterface<E> {

	private static final int DEFAULT_CAPACITY = 15;
	private int numElements;
	private E array[];
	
	
	public ArrayListImplementation() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayListImplementation(int size) {
		array=(E[])new Object[size];
	}
	
	public void add(int index, E element) {
		// TODO Auto-generated method stub
	}

	
	public E get(int index) {
		return array[index];
	}

	public void set(int index, E element) {
		array[index]=element;

	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numElements==0;
	}

	
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		return 0;
	}

	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int numberOfElements() {
		// TODO Auto-generated method stub
		return this.numElements;
	}

}
