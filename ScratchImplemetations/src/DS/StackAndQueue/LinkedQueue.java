package DS.StackAndQueue;

import DS.LinkedList.DoubleLinkedList;

/**
 * LinkedQueue
 */
public class LinkedQueue<E> implements Queue<E> {

    private DoubleLinkedList<E> queue;
    
    public LinkedQueue(){
        queue=new DoubleLinkedList<>();
    }
    
    public void enqueue(E element) {
        queue.addFirst(element);
    }

    public E dequeue() {
        if (size()==0) {
            return null;
        }
        return queue.remove(size()-1);
    }

    public boolean isEmpty() {
        return queue.length()==0;
    }

    public E poll() {
        if(queue.length()==0){
            return null;
        } else{
            return queue.element(0);
        }
    }

    public int size() {
        return queue.length();
    }

    @Override
    public String toString() {
        return (queue.toString()+ " <-- Front");
    }
}