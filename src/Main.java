/**
 * This class demonstrates a simple airport simulation with multiple planes.
 */
class TestAeroport {

    /**
     * The main method creates several planes and starts them on their respective airports.
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Avion v1 = new Avion("Avion 1");
        Avion v2 = new Avion("Avion 2");
        Avion v3 = new Avion("Avion 3");
        Avion v4 = new Avion("Avion 4");

        v1.start(v1);
        v2.start(v2);
        v3.start(v3);
        v4.start(v4);
    }

}





