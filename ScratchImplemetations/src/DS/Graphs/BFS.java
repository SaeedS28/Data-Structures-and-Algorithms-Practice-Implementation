package DS.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * BFS
 */
public class BFS<T> {
    public static void main(String[] args) {

        // Initialized nodes
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> subGraph1 = new Node<>(25);
        // Creating the actual graph structure
        node2.addNeighbours(node5);
        node3.addNeighbours(node5);
        node4.addNeighbours(node5);
        node1.addNeighbours(node2);
        node1.addNeighbours(node3);
        node1.addNeighbours(node4);

        Graph<Integer> graph = new Graph<>();
        graph.addComponent(node1);
        graph.addComponent(subGraph1);

        BFS<Integer> test = new BFS<>();

        test.BreadthFirstSearch(graph);
    }

    public void BreadthFirstSearch(Graph<T> graph) {
        LinkedList<Node<T>> queue = new LinkedList<>(); // Will act as a Queue for BFS

        Iterator<Node<T>> subComponents = graph.getSubComporents();

        while (subComponents.hasNext()) {
            Node<T> component = subComponents.next();
            component.setIsVisited(true);
            queue.addLast(component);

            while(!queue.isEmpty()){
                Node<T> at = queue.remove();
                System.out.println("Visited: "+at.getData());
                
                Iterator<Node<T>> neighbours = at.iterate();
                
                while (neighbours.hasNext()) {
                    Node<T> nbr = neighbours.next();
                    if (nbr.getIsVisited() == false) {
                        nbr.setIsVisited(true);
                        queue.addLast(nbr);
                    }
                }
            }
        }
    }
}