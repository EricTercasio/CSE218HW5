package p2;

/**
 * Created by Eric on 4/7/2017.
 */
public class Plane {
    private String destination;
    private boolean landing;

    public Plane( String destination) {

        this.destination = destination;

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isLanding() {
        return landing;
    }

    public void setLanding(boolean landing) {
        this.landing = landing;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "destination='" + destination + '\'' +
                ", landing=" + landing +
                '}';
    }
}
