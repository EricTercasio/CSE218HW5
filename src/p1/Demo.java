package p1;

/**
 * Created by Eric on 4/7/2017.
 */
public class Demo {
    public static void main(String[] args){
        System.out.println("-------Demo for stack---------");
        Student s = new Student("John",0,4.0);
        Student s2 = new Student("Phil",1,3.0);
        Student s3 = new Student("Lisa",2,3.0);
        Student s4 = new Student("Peter",3,1.0);
        StudentStack studentStack = new StudentStack(4);
        studentStack.push(s);
        studentStack.push(s2);
        studentStack.push(s3);
        studentStack.push(s4);
        System.out.println(studentStack.peep());
        System.out.println(studentStack.isEmpty());
        System.out.println(studentStack.isFull());
        System.out.println(studentStack.pop());
        System.out.println(studentStack.pop());
        System.out.println(studentStack.pop());
        System.out.println(studentStack.pop());
        System.out.println(studentStack.isEmpty());
        System.out.println("-------Demo for queue---------");
        StudentQueue studentQueue = new StudentQueue(4);
        studentQueue.insert(s);
        studentQueue.insert(s2);
        studentQueue.insert(s3);
        studentQueue.insert(s4);
        System.out.println(studentQueue.peekFront());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.size());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.size());
        System.out.println("---------Demo for Priority Queue----------");
        System.out.println("Students will be sorted by ID");
        StudentPriorityQueue studentPriorityQueue = new StudentPriorityQueue(4);
        studentPriorityQueue.insert(s3);
        studentPriorityQueue.insert(s4);
        studentPriorityQueue.insert(s2);
        studentPriorityQueue.insert(s);
        System.out.println(studentPriorityQueue.peekMin());
        System.out.println(studentPriorityQueue.remove());
        System.out.println(studentPriorityQueue.remove());
        System.out.println(studentPriorityQueue.remove());
        System.out.println(studentPriorityQueue.remove());

    }
}
