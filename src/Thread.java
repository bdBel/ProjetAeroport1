
/**
 * Represents a basic thread with sleep functionality.
 */
public class Thread {

    /**
     * Static method to make the thread sleep for a specified amount of time.
     * @param i The time to sleep in milliseconds.
     */
    protected static void sleep(int i) {
        try {
            java.lang.Thread.sleep(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Starts the given plane and prints its status on the associated airport.
     * @param a The plane to start.
     */
    public void start(Avion a) {
        System.out.println("Je suis avion " + a.getNom() + " sur aeroport " + a.getNom());
    }
}
