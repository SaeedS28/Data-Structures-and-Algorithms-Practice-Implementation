package DS.Graphs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Graph
 */
public class Graph <T> {
    private ArrayList<Node<T>> subGraphs;

    public Graph() {
        subGraphs = new ArrayList<>();
    }

    public void addComponent(Node<T> node){
        subGraphs.add(node);
    }

    public Iterator<Node<T>> getSubComporents() {
        return subGraphs.iterator();
    }

}