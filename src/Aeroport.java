/**
 * Represents an airport singleton instance.
 */
public class Aeroport {


        private static Aeroport instance;
        String nom;

        /**
         * Private constructor to initialize the airport with a name.
         * @param nom The name of the airport.
         */
        private Aeroport(String nom) {
            this.nom = nom;
        }

        /**
         * Returns the string representation of the airport object.
         * @return A string representation of the airport.
         */
        @Override
        public String toString() {
            return "Aeroport{" +
                    "nom='" + nom + '\'' +
                    '}';
        }

        /**
         * Gets the name of the airport.
         * @return The name of the airport.
         */
        public String getNom() {
            return nom;
        }

        /**
         * Sets the name of the airport.
         * @param nom The new name of the airport.
         */
        public void setNom(String nom) {
            this.nom = nom;
        }

        /**
         * Returns the singleton instance of the airport.
         * @return The singleton instance of the airport.
         */
        public static Aeroport getInstance() {
            if (instance == null) {
                instance = new Aeroport("Trudeau");
            }
            return instance;
        }
    }

