package p3;

/**
 * Created by Eric on 4/7/2017.
 */
public class GenericStack <T> {
    private int maxSize;
    private T[] genericArray;
    private int top;

    public GenericStack(int maxSize){
        this.maxSize = maxSize;
        genericArray = (T[]) new Object[maxSize];
        top = -1;
    }
    public void push(T j) { // add
        genericArray[++top] = j;
    }

    public T pop() { // remove
        return genericArray[top--];
    }

    public T peek() { // return the next item on the stack w/o removing it
        return genericArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
