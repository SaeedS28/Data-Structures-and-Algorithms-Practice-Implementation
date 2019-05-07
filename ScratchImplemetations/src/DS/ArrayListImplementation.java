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
		int placeOf=-1;
		for(int i=0;i<this.numElements;i++) {
			if(array[i]==element) {
				placeOf=i;
				break;
			}
		}
		return placeOf;
	}

	public E remove(int index) {
		checkBounds(index,this.numElements);
		
		E retVal=array[index];
		for(int i=index;i<this.numElements;i++) {
			array[i]=array[i+1];
		}
		array[this.numElements]=null;
		numElements--;
		
		// shrink arrayList if size goes below a certain threshold
		
		int threshold=(int) (0.25*array.length);
		
		if(numElements<threshold) {
			E array2[] =(E[]) new Object[(int)(0.5*array.length)]; 
			for(int i=0;i<this.numElements;i++) {
				array2[i]=array[i];
			}
			array=array2;
		}
		
		return retVal;
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
