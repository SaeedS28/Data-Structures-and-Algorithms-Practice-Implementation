package DS.StackAndQueue;

/**
 * Queue
 */
public interface Queue<E> {
    public void enqueue(E element);

    public E dequeue();

    public boolean isEmpty();

    public E poll();

    public int size();
}