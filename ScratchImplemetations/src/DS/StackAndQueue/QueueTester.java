package DS.StackAndQueue;

/**
 * QueueTester
 */
public class QueueTester {

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        System.out.println(queue.size()); // 0
        System.out.println(queue.poll()); // mull
        System.out.println(queue.dequeue()); // null

        queue.enqueue(25);
        queue.enqueue(44);
        System.out.println(queue.toString());

        System.out.println(queue.dequeue()); // 25
        System.out.println(queue.toString());
        
        queue.enqueue(28);
        queue.enqueue(50);
        queue.enqueue(99);

        System.out.println(queue.dequeue()); // 44
        System.out.println(queue.poll()); // 28
        System.out.println(queue.toString());
    }
}