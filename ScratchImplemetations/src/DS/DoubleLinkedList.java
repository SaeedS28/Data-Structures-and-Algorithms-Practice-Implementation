package DS;

public class DoubleLinkedList<E> implements LinkedListInterface<E> {

	private int size;
	private Node<E> header;
	private Node<E> trailer;

	public DoubleLinkedList() {
		this.size = 0;
		this.header = new Node<E>(null, null, null);
		this.trailer = new Node<E>(header, null, null);
		this.header.setNext(trailer);
	}

	public int length() {
		return this.size;
	}

	public E getValue(int index) {
		return null;
	}

	public void set(int index, E element) {
		// TODO Auto-generated method stub

	}

	public void addFirst(E element) {

		// setting the new node connections
		Node<E> existing = header.getNext();
		Node<E> newNode = new Node<>(null, existing, element);
		newNode.setPrevious(header);

		existing.setPrevious(newNode);
		header.setNext(newNode);
		size++;
	}

	public void addLast(E element) {
		// setting the new node connections
		Node<E> existing = trailer.getPrevious();
		Node<E> newNode = new Node<>(existing, null, element);
		newNode.setNext(trailer);
		
		existing.setNext(newNode);
		trailer.setPrevious(newNode);
		size++;

	}

	public void addBetween(int index, E element) {
		// TODO Auto-generated method stub

	}

	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(E element) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");

		Node<E> placeHolder = header.getNext();

		while (placeHolder != trailer) {
			sb.append(placeHolder.getElement().toString() + " ");
			placeHolder = placeHolder.getNext();
		}
		sb.append("]");
		return sb.toString();
	}

	private void checkBounds(int index) {
		if (index < 0 || index > this.length() - 1)
			throw new IndexOutOfBoundsException("Index out of bounds!");
	}

	private static class Node<E> {
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
