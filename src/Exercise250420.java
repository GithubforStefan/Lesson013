public class Exercise250420 {

    public String farbe = "blau";
    public int groesse = 186;


    Exercise250420 (String farbe) {
        this.farbe = farbe;


    }

    public static void main(String[] args) {
        Exercise250420 mensch = new Exercise250420("Grün");
        System.out.println(mensch.farbe);


    }
}
