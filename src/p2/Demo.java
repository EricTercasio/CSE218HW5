package p2;

import java.util.Scanner;

/**
 * Created by Eric on 4/7/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Plane plane;
        String destination;
        Scanner kbd = new Scanner(System.in);
        System.out.println("How many planes will be in the queue?");
        int maxSize = kbd.nextInt();
        PlaneQueue planeQueue = new PlaneQueue(maxSize);
        do{
            System.out.println("Enter the destination of the plane.");
            destination = kbd.nextLine();
            plane = new Plane(destination);
            System.out.println("Is this plane taking off or landing? (t for takeoff l for landing)");
            System.out.println(plane.getDestination());
            if (kbd.nextLine().equals("t")) {
                planeQueue.takeoff(plane);
            }
            if (kbd.nextLine().equals("k")) {
                planeQueue.land(plane);
            }


        }while(!planeQueue.isFull());
        System.out.println("The queue is full, type next");
    }
}
