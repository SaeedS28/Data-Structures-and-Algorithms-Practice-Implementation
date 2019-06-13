package DS.StackAndQueue;

import DS.LinkedList.DoubleLinkedList;

/**
 * LinkedStack
 */
public class LinkedStack extends AbstractStack {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
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

    public LinkedStack() {
        stack = returnStack();
    }

    @Override
    public void push(Integer element) {
        stack.addFirst(element);
    }

    
}