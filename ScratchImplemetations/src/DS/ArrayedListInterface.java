package DS;

public interface ArrayedListInterface<E> {

	public void length();
	
	public void add(int index, E element);
	
	public E get(int index);
	
	public void set(int index);
	
	public boolean isEmpty();
	
	public int indexOf(E element);
	
}
