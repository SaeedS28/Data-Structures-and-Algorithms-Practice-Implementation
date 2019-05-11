package DS.BinaryTree;

public interface BinaryTreeInterface<V> {
	public void addEntry(Entry<V> entry);
	
	public V findValue(int key);
	
	public void postOrderTraversal();
	
	public void preOrderTraversal();
	
	public void inOrderTraversal();
	
	public Entry<V> removeEntry(int key);
}
