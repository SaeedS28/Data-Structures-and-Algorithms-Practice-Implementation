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
			} else if(leftChild) {
				parent.setLeftChild(null);
			} else {
				parent.setRightChild(null);
			}
		} 
		// case where the node has a left child
		else if(current.getRightChild()==null) {
			if(current==root) {
				root=current.getLeftChild();
			} else if(leftChild) {
				parent.setLeftChild(current.getLeftChild());
			} else {
				parent.setRightChild(current.getLeftChild());
			}
		}
		// case where the node has right child
		else if(current.getLeftChild()==null) {
			if(current==root) {
				root=current.getRightChild();
			} else if(leftChild) {
				parent.setLeftChild(current.getRightChild());
			} else {
				parent.setRightChild(current.getRightChild());
			}
		}
		// case where the node has both children
		else {
			Entry<V> replace=replacementFound(current);
			
			if(current==root) {
				root=replace;
			} else if(leftChild) {
				parent.setLeftChild(replace);
			} else {
				parent.setRightChild(replace);
			}
			replace.setLeftChild(current.getLeftChild());
		}
		numberOfElements--;
		return true;
	}

	private Entry<V> replacementFound(Entry<V> current) {
		Entry<V> replaceParent = current;
		Entry<V> replace = current;
		Entry<V> now = current.getRightChild();
		
		while(now!=null) {
			replaceParent=replace;
			replace=now;
			now=now.getLeftChild();
		}
		if(replace!=current.getRightChild()) {
			replaceParent.setLeftChild(replace.getRightChild());
			replace.setRightChild(current.getRightChild());
		}
		return replace;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

}
