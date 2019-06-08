package DS.StackAndQueue;

import DS.LinkedList.DoubleLinkedList;

/**
 * MinStack
 */
public class MinStack extends SortedStack {

    public static void main(String[] args) {
        
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
            toStr.append("\t\tMinimum value: "+minVals.element(0));
        }
        return toStr.toString();
    }
}