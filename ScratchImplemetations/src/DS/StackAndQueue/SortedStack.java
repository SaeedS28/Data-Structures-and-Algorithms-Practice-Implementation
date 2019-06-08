package DS.StackAndQueue;
import DS.LinkedList.*;
/**
 * SortedStack
 */
public class SortedStack extends AbstractStack {
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
        super();
        stack = returnStack();
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
    
}