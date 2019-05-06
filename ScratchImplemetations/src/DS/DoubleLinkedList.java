package DS;

public class DoubleLinkedList<E> implements LinkedListInterface<E> {

	private int size;
	private Node<E> header;
	private Node<E> trailer;
	
	
	public DoubleLinkedList() {
		this.size=0;
		this.header=new Node<E>(null, null, null);
		this.trailer=new Node<E>(header, null, null);
		this.header.setNext(trailer);
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFirst(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBetween(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void checkBounds(int index) {
		if (index<0 || index >this.length()-1)
			throw new IndexOutOfBoundsException("Index out of bounds!");
	}
	
	private static class Node<E>{
		private Node<E> previous;
		private Node<E> next;
		private E element;
		
		public Node(Node<E> previous, Node<E> next, E element) {
			this.setPrevious(previous);
			this.setNext(next);
			this.setElement(element);
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public Node<E> getPrevious() {
			return previous;
		}

		public void setPrevious(Node<E> previous) {
			this.previous = previous;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}
	}
}
