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
						numberOfElements++;
						return;
					}
				} else {
					current=current.getRightChild();
					if(current==null) {
						parent.setRightChild(entry);
						numberOfElements++;
						return;
					}
				}
			}
		}
	}

	public V findValue(int key) {
		if(root==null) {
			return null;
		}
		Entry<V> current=root;
		
		while(current!=null) {
			if(current.getKey()==key) {
				return current.getValue();
			} else if(key<=current.getKey()) {
				current=current.getLeftChild();
			} else {
				current=current.getRightChild();
			}
		}
		return null;
	}

	public void postOrderTraversal(Entry<V> start) {
		if(start!=null) {
			inOrderTraversal(start.getLeftChild());
			inOrderTraversal(start.getRightChild());
			System.out.println(start.toString());
		}
	}

	public void preOrderTraversal(Entry<V> start) {
		if(start!=null) {
			System.out.println(start.toString());
			inOrderTraversal(start.getLeftChild());
			inOrderTraversal(start.getRightChild());
		}
	}

	public void inOrderTraversal(Entry<V> start) {
		if(start!=null) {
			inOrderTraversal(start.getLeftChild());
			System.out.println(start.toString());
			inOrderTraversal(start.getRightChild());
		}
	}

	public boolean removeEntry(int key) {
		if(root==null) {
			return false;
		}
		boolean leftChild=false;
		
		Entry<V> parent = root;
		Entry<V> current = root;
		
		while(current!=null) {
			parent=current;
			if(key<=current.getKey()) {
				leftChild=true;
				current=current.getLeftChild();
			} else {
				leftChild=false;
				current=current.getRightChild();
			}
			if(current==null) {
				return false;
			}
		}
		
		// case where the node is a leaf
		if(current.getLeftChild()==null && current.getRightChild()==null) {
			if(current==root) {
				root=null;
				return true;
			}
			if(leftChild) {
				parent.setLeftChild(null);
				return true;
			} else {
				parent.setRightChild(null);
				return true;
			}
		}
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

}
