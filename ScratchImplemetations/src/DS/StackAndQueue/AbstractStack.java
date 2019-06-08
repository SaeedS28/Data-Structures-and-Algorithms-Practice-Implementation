package DS.StackAndQueue;

import DS.LinkedList.DoubleLinkedList;

abstract class AbstractStack {

    private DoubleLinkedList<Integer> stack;

    public AbstractStack() {
        stack = new DoubleLinkedList<>();
    }
    
    public int size(){
        return stack.length();
    }

    public boolean isEmpty() {
        return stack.length() == 0;
    }

    public abstract void push(Integer element);

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