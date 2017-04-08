package p3;

/**
 * Created by Eric on 4/7/2017.
 */
public class Demo {
    public static void main(String[] args){
        GenericQueue genericQueue = new GenericQueue(5);
        GenericStack genericStack = new GenericStack(5);
        Cat c1 = new Cat("Captain Snibbles", "Long Haired","50lb",5);
        Cat c2 = new Cat("Franky Loggens", "Short Haired","20lb",1);
        Dog d1 = new Dog("Jack", "German Shepherd","100lb",3);
        Dog d2 = new Dog("Jeff", "Yorkie","10lb",2);
        Dog d3 = new Dog("Pebbles", "Pitbull","70lb",10);
        System.out.println("-------Generic Queue-------");
        genericQueue.insert(c1);
        genericQueue.insert(d1);
        genericQueue.insert(c2);
        genericQueue.insert(d2);
        genericQueue.insert(d3);
        System.out.println(genericQueue.remove());
        System.out.println(genericQueue.remove());
        System.out.println(genericQueue.remove());
        System.out.println(genericQueue.remove());
        System.out.println(genericQueue.remove());
        System.out.println("-------Generic Stack-------");
        genericStack.push(c1);
        genericStack.push(d1);
        genericStack.push(c2);
        genericStack.push(d2);
        genericStack.push(d3);
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
    }
}
