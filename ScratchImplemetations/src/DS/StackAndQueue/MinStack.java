package DS.StackAndQueue;
import DS.LinkedList.*;
/**
 * MinStack
 */
public class MinStack<T> {
    public static void main(String[] args) {
        MinStack<Integer> stack = new MinStack<>();
        stack.push(5);
        stack.push(45);
        stack.push(9);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.toString()+"\tLength: "+stack.size());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.toString()+"\tLength: "+stack.size());
    }

    private DoubleLinkedList<T> stack;

    public MinStack() {
        stack = new DoubleLinkedList<>();
    }

    public int size(){
        return stack.length();
    }

    public boolean isEmpty() {
        return stack.length() == 0;
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop(){
        if (stack.length() > 0) {
            return stack.remove(0);
        }
        return null;
    }

    public String toString() {
        return stack.toString();
    }

    public T peek() {
        return stack.element(0);
    }
}