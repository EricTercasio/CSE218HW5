package p1;

/**
 * Created by Eric on 4/7/2017.
 */
public class StudentStack {
    private int maxSize;
    private Student[] stackArray;
    private int top;

    public StudentStack(int maxSize){
        this.maxSize = maxSize;
        stackArray = new Student[maxSize];
        top = -1;
    }
    public void push(Student s){
        stackArray[++top] = s;
    }
    public Student pop(){
        return stackArray[top--];
    }
    public Student peep(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
}
