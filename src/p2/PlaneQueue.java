package p2;

/**
 * Created by Eric on 4/7/2017.
 */
public class PlaneQueue {
    private int maxSize;
    private Plane[] planeArray;
    private int front;
    private int rear;
    private int nItems;

    public PlaneQueue(int maxSize) {
        this.maxSize = maxSize;
        planeArray = new Plane[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void takeoff(Plane plane) {
        int j;
        if (nItems == 0) {
            planeArray[nItems++] = plane;
        } else {
            for(j = 0; j < nItems; j++){
                if(planeArray[j].isLanding()){ //if theres a plane landing
                    planeArray[j+1] = planeArray[j];
                }else{
                    break;
                }
            }
            planeArray[j+1] = plane;
            nItems++;
            plane.setLanding(false);
        }
    }
    public void land(Plane plane) {
        int j;
        if (nItems == 0) {
            planeArray[nItems++] = plane;
        } else {
            for (j = 0; j < nItems; j++) {
                if (planeArray[j].isLanding()) { //if theres a plane landing
                    planeArray[j + 1] = planeArray[j];
                } else {
                    break;
                }
            }
            planeArray[j + 1] = plane;
            nItems++;
            plane.setLanding(true);
        }
    }

    public Plane next() {
        System.out.print("The plane going to " + planeArray[nItems].getDestination()+ "is ");
        if(planeArray[nItems].isLanding()){
            System.out.println("landing.");
        }else{
            System.out.println("taking off.");
        }
        return planeArray[--nItems];
    }

    public Plane peekFront() {
        return planeArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

}


