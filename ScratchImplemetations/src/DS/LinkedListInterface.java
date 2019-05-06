/**
 * 
 */
package DS;

/**
 * @author Saad
 *
 */
public interface LinkedListInterface<E> {
	
	public int length();
	
	public E get();
	
	public void set(int index, E element);
	
	public void addFirst(E element);
	
	public void addLast(E element);
	
	public void addBetween(int index, E element);
	
	public E remove(int index);
	
	public int indexOf(E element);
}
