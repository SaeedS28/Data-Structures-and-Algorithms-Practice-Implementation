package DS.BinaryTree;

public interface BinaryTreeInterface<V> {
	public void addEntry(Entry<V> entry);
	
	public V findValue(int key);
	
	public void postOrderTraversal(Entry<V> root);
	
	public void preOrderTraversal(Entry<V> root);
	
	public void inOrderTraversal(Entry<V> root);
	
	public Entry<V> removeEntry(int key);
}
