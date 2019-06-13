package DS.StackAndQueue;

/**
 * QueueUsingStack
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class QueueUsingStack {
    public static void main(String[] args) {
        QueueUsingStack test = new QueueUsingStack();
        
        test.enqueue(4);
        test.enqueue(32);
        test.enqueue(456);
        System.out.println(test.toString());

        System.out.println("Dequeued element: "+ test.dequeue());
        System.out.println(test.toString());
        System.out.println("Dequeued element: "+ test.dequeue());
        System.out.println(test.toString());
        test.enqueue(45);
        System.out.println(test.toString());
    }
    
    private LinkedStack mainStack;
    private LinkedStack auxStack;

    public QueueUsingStack() {
        mainStack = new LinkedStack();
        auxStack = new LinkedStack();    
    }

    public void enqueue(Integer x) {
        mainStack.push(x);
    }

    public Integer dequeue() {
        Integer getFirst;
        while (!mainStack.isEmpty()) {
            auxStack.push(mainStack.pop());
        }

        getFirst = auxStack.pop();

        while (!auxStack.isEmpty()) {
            mainStack.push(auxStack.pop());
        }
        return getFirst;
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    // Very inefficient but justified given the constraints
    public String toString() {
        while (!mainStack.isEmpty()) {
            auxStack.push(mainStack.pop());
        }
        StringBuilder sb = new StringBuilder();
        if (!auxStack.isEmpty()) {
            int first = auxStack.pop();
            mainStack.push(first);

            sb.append(first);

            while (!auxStack.isEmpty()) {
                first = auxStack.pop();
                mainStack.push(first);
                sb.append(" <- "+first);
            }
        }
        return sb.toString();
    }
}