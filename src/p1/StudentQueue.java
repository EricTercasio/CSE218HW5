package p1;

/**
 * Created by Eric on 4/7/2017.
 */
public class StudentQueue {
    private int maxSize;
    private Student[] studentArray;
    private int front;
    private int rear;
    private int nItems;

    public StudentQueue(int maxSize) {
        this.maxSize = maxSize;
        studentArray = new Student[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(Student s){
        if(rear == maxSize - 1) {
            rear = -1;
        }
        studentArray[++rear] = s;
        nItems++;
    }

    public Student remove() {
        Student temp = studentArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public Student peekFront() {
        return studentArray[front];
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
