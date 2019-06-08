package DS.StackAndQueue;
import DS.LinkedList.*;
/**
 * SortedStack
 */
public class SortedStack {
    public static void main(String[] args) {
        SortedStack stack = new SortedStack();
        stack.push(5);
        stack.push(45);
        stack.push(9);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.toString()+"\tLength: "+stack.size());

        System.out.println(stack.peek());
        stack.pop();
        stack.push(4);
        stack.push(88);
        System.out.println(stack.toString()+"\tLength: "+stack.size());
    }

    private DoubleLinkedList<Integer> stack;

    public SortedStack() {
        stack = new DoubleLinkedList<>();
    }

    public int size(){
        return stack.length();
    }

    public boolean isEmpty() {
        return stack.length() == 0;
    }

    public void push(Integer element) {
        if (stack.length()==0) {
            stack.addFirst(element);
        } else {
            DoubleLinkedList<Integer> tempStack = new DoubleLinkedList<>();

            while (stack.length() !=0 && stack.element(0) < element) {
                tempStack.addFirst(stack.remove(0));
            }
            stack.addFirst(element);

            while (tempStack.length() != 0) {
                stack.addFirst(tempStack.remove(0));
            }
        }
    }

    public Integer pop(){
        if (stack.length() > 0) {
            return stack.remove(0);
        }
        return null;
    }

    public String toString() {
        return stack.toString();
    }

    public Integer peek() {
        return stack.element(0);
    }

    protected DoubleLinkedList<Integer> returnStack() {
        return this.stack;
    }
}