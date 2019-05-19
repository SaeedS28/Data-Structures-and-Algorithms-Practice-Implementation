package DS.StackAndQueue;

/**
 * ArrayedStack
 */
public class ArrayedStack<E> implements Stack<E> {

    private static final int DEFAULT_SIZE = 16;
    private int front = -1;
    private E[] array;

    /**
     * Initializes a stack with a default size
     */
    public ArrayedStack(){
        this(DEFAULT_SIZE);
    }

    /**
     * initializes a stack with a custom size
     * 
     * @param size the size of the stack
     * @throws Exception
     */
    public ArrayedStack(int size)  {
        if(size<1){
            throw new IllegalArgumentException("Enter a size > 0 fam.");
        }
        array= (E[]) new Object[size];
    }
    
    public String toString() {
        return super.toString();
    }

    public boolean isEmpty() {
        return this.front==-1;
    }

    public E peek() {
        if(isEmpty()){
            return null;
        } else{
            return array[front];
        }
    }

    public E pop() {
        return null;
    }

    public void push() {

    }

    public int search() {
        return 0;
    }

    protected ArrayedStack<E> clone()  {
        return null;
    }

    private ArrayedStack<E> resize(){
        return null;
    }
    
}