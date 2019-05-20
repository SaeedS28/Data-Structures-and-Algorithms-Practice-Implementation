package DS.StackAndQueue;

/**
 * StackTester
 */
public class StackTester {
    public static void main(String[] args) {
        ArrayedStack<Integer> stack = new ArrayedStack<>(2);
        System.out.println(stack.getSize()); // returns 0

        System.out.println(stack.pop()); // returns null

        stack.push(12);
        stack.push(13);
        stack.push(120); // resizes the stack by doubling

        System.out.println(stack.peek()); // returns 120

        System.out.println(stack.pop()); // returns 120

        System.out.println(stack.peek()); // returns 13

        stack.push(48);
        stack.push(32);
        stack.push(40);
        stack.push(82);
        System.out.println(stack.toString());

        System.out.println(stack.pop()); // returns 82

        System.out.println(stack.toString());

        System.out.println(stack.search(13));
    }
}