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
		numElements=0;
	}
	
	public void add(int index, E element) {
		checkBounds(index,this.numElements+1);
		//resize if the bounds are reached
		if(this.numElements==array.length) {
			E array2[]=(E[])new Object[2*array.length];
			for(int i=0;i<numElements;i++) {
				array[i]=array2[i];
			}
			array = array2;
		}
		for(int i=this.numElements-1;i<=index;i--) {
			array[i+1]=array[i];
		}
		array[index]=element;
		numElements++;
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

	private void checkBounds(int i,int j) {
		if(i<0||i>j) {
			throw new IndexOutOfBoundsException("Out of bounds m8! Not a good look");
		}
	}
}
