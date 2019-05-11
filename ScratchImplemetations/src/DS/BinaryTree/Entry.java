package DS.BinaryTree;

public class Entry<V> {
	private int key;
	private V value;
	private Entry<V> leftChild;
	private Entry<V> rightChild;
	
	public Entry(int key, V value) {
		this.setKey(key);
		this.setValue(value);
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public Entry<V> getLeftChild() {
		return leftChild;
	}
	
	public void setLeftChild(Entry<V> leftChild) {
		this.leftChild = leftChild;
	}
	
	public Entry<V> getRightChild() {
		return rightChild;
	}
	
	public void setRightChild(Entry<V> rightChild) {
		this.rightChild = rightChild;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public String toString() {
		return ("("+this.getKey()+","+this.getValue()+")");
	}
	
}
