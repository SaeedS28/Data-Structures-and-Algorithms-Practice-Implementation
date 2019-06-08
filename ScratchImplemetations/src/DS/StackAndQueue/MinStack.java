package DS.StackAndQueue;

import DS.LinkedList.DoubleLinkedList;

/**
 * MinStack
 */
public class MinStack extends AbstractStack {

    public static void main(String[] args) {
        MinStack stack = new MinStack();
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
    
    private DoubleLinkedList<Integer> minVals;
    private DoubleLinkedList<Integer> stack;

    public MinStack() {
        super();
        stack = returnStack();
        minVals = new DoubleLinkedList<>();
    }

    public void push(Integer element) {
        int tempElement = element;
        stack.addFirst(element);

        if (minVals.length() == 0) {
            minVals.addFirst(tempElement);
        } else if (tempElement <= minVals.element(0)) {
            minVals.addFirst(element);
        }
    }

    public Integer pop() {
        Integer parentCall = super.pop();
        if (minVals.length() > 0 && parentCall == minVals.element(0)) {
            minVals.remove(0);
        }
        return parentCall;
    }

    public Integer min() {
        if (minVals.length() > 0) {
            return minVals.element(0);
        }
        return null;
    }

    public String toString() {
        StringBuilder toStr = new StringBuilder();
        toStr.append(super.toString());

        if (minVals.length() > 0) {
            toStr.append("    Minimum values: "+minVals.element(0));
        }
        return toStr.toString();
    }
}