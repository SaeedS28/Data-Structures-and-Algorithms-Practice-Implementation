package DS.BinaryTree;

public class BinaryTree<V> implements BinaryTreeInterface<V> {
	private int numberOfElements;
	private Entry<V> root;
	
	public void addEntry(Entry<V> entry) {
		if(root==null) {
			root=entry;
		} else {
			Entry<V> parent=root;
			Entry<V> current=root;
			
			while(true) {
				parent=current;
				if(entry.getKey()<=current.getKey()) {
					current=current.getLeftChild();
					if(current==null) {
						parent.setLeftChild(entry);
						return;
					}
				} else {
					current=current.getRightChild();
					if(current==null) {
						parent.setRightChild(entry);
						return;
					}
				}
			}
		}
	}

	public V findValue(int key) {
		return null;
	}

	public void postOrderTraversal() {
		
	}

	public void preOrderTraversal() {
		
	}

	public void inOrderTraversal() {
		
	}

	public Entry<V> removeEntry(int key) {
		return null;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

}