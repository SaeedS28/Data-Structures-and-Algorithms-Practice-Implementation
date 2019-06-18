package DS.Graphs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Node
 */
public class Node <T> {
    private T data;
    private ArrayList<Node<T>> neighbours;
    private boolean isVisited;  // Used for BFS/DFS algorithm

    public Node(T data) {
        this.setData(data);
        neighbours = new ArrayList<>();
        this.setIsVisited(false);
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void addNeighbours(Node<T> node) {
        neighbours.add(node);
    }

    public Iterator<Node<T>> iterate(){
        return neighbours.iterator();
    }

    public void setIsVisited(boolean bln) {
        isVisited = bln;
    }

    public boolean getIsVisited() {
        return isVisited;
    }
}