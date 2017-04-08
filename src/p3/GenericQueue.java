package p3;

/**
 * Created by Eric on 4/7/2017.
 */
public class GenericQueue <T> {
    private int maxSize;
    private T[] genericArray;
    private int front;
    private int rear;
    private int nItems;

    public GenericQueue(int maxSize){
        this.maxSize = maxSize;
        genericArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(T j){
        if(rear == maxSize - 1) {
            rear = -1;
        }
        genericArray[++rear] = j;
        nItems++;
    }

    public T remove() {
        T temp = genericArray[front++];
        if(front == maxSize) { // deal with wrap around
            front = 0;
        }
        nItems--;
        return temp;
    }

    public T peekFront() {
        return genericArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }
}
