package DS.StackAndQueue;

/**
 * ArrayedStack
 */
public class ArrayedStack<E> implements Stack<E> {

    private static final int DEFAULT_SIZE = 16;
    private int front = -1;
    private E[] array;
    private int size = 0;

    /**
     * Initializes a stack with a default size
     */
    public ArrayedStack() {
        this(DEFAULT_SIZE);
    }

    /**
     * returns the number of elements in the stack
     * @return number of elements
     */
    public int getSize() {
        return size;
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
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        
        for (int i = 0; i < size; i++) {
            sb.append(array[i].toString()+" ");
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * returns whether the stack is empty
     */
    public boolean isEmpty() {
        return this.size==0;
    }
    
    /**
     * Returns the latest element pushed on the stack
     */
    public E peek() {
        if(isEmpty()){
            return null;
        } else{
            return array[front];
        }
    }

    /**
     * Returns and deletes the top-most element on the stack
     */
    public E pop() {
        if(isEmpty()){
            return null;
        }

        if ((size < (int) 0.5*array.length) && (array.length>=1)) {
            resize((int) 0.5*array.length);
        }
        E retVal=array[front--];
        size--;
        return retVal;
    }

    /**
     * Pushes the element in the top-most slot of the stack
     */
    public void push(E element) {
        if(size>=array.length){
            resize(2*array.length);
        }
        size++;
        array[++front]=element;
    }

    /**
     * returns the placement of the latest occurence of an element with respect to the top of the stack
     */
    public int search(E element) {

        for (int i = size-1; i >= 0; i--) {
            if(array[i]==element){
                return (size-i);
            }
        }
        return -1;
    }

    private void resize(int newSize){
        E[] array2= (E[]) new Object[newSize];
        
        for(int i=0;i<this.size;i++){
            array2[i]=array[i];
        }
        array=array2;
    }
    
}