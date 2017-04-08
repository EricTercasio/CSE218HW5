package p1;

/**
 * Created by Eric on 4/7/2017.
 */
public class StudentPriorityQueue {
    private int maxSize;
    private Student[] studentArray;
    private int nItems;

    public StudentPriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        studentArray = new Student[maxSize];
        nItems = 0;
    }

    public void insert(Student s) {
        int j;
        if(nItems == 0) {
            studentArray[nItems++] = s;
        } else {
            for(j = nItems-1; j >= 0; j--) {
                if(s.getId() > studentArray[j].getId()) { // if id of student is larger than the id of student in the queue
                    studentArray[j+1] = studentArray[j]; // shift student upward
                } else {
                    break;
                }
            }
            studentArray[j+1] = s;
            nItems++;
        }
    }

    public Student remove() {
        return studentArray[--nItems];
    }

    public Student peekMin() {
        return studentArray[nItems - 1];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}
