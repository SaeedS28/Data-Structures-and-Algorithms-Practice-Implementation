package DS.ArrayList;

public interface ArrayedListInterface<E> {

	public int numberOfElements();
	
	public void add(int index, E element);
	
	public E get(int index);
	
	public void set(int index, E element);
	
	public boolean isEmpty();
	
	public int indexOf(E element);
	
	public E remove(int index);
	
}
