/**
 * Represents a plane that runs on a separate thread.
 */
public class Avion extends Thread {
        String nom;
        Aeroport a;

        /**
         * Constructs a plane with a given name and assigns it to an airport.
         * @param s The name of the plane.
         */
        public Avion(String s) {
            nom = s;
            a = Aeroport.getInstance();
        }

        /**
         * Returns the name of the plane.
         * @return The name of the plane.
         */
        public String getNom() {
            return nom;
        }

        /**
         * Returns the airport associated with the plane.
         * @return The airport associated with the plane.
         */
        public Aeroport getA() {
            return a;
        }

        /**
         * Executes the thread's operations, including sleeping and printing the plane's status.
         */
        public void run() {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Aeroport a = Aeroport.getInstance();

            System.out.println("Je suis avion " + nom + " sur aeroport " + a);
        }

        /**
         * Returns a string representation of the plane, including its name and associated airport.
         * @return A string representation of the plane.
         */
        @Override
        public String toString() {
            return "Avion{" +
                    "nom='" + getNom() + '\'' +
                    ", a=" + a.getNom() +
                    '}';
        }
    }


