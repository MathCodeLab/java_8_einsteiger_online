package live_coding.kapitel3_weiterfuehrendeThemen;

// Methonden:
// ohne parameters & ohne rueckgabe
// mit parameters & ohne rueckgabe (printHallo_name_z_ma)
// ohne parameters & mit rueckgabe
// mit parameters & mit rueckgabe (berechneFlaeche)


public class MethodenKlasse_10 {

    public static void printHallo_name_z_mal(int z, String name){
        for (int i = 0; i < z; i++){
            System.out.println("Hallo " + name);
        }
        System.out.println("-------------------");
    }

    public static int berechneFlaeche(int laenge, int breite){
        int flaeche = laenge * breite;
        return flaeche;
    }

    public static void main(String[] args) {
        // Aufruf
        MethodenKlasse_10.printHallo_name_z_mal(6, "sedra"); // print name z mal
        MethodenKlasse_10.printHallo_name_z_mal(2, "sedra");
        MethodenKlasse_10.printHallo_name_z_mal(4, "Moumena");
        MethodenKlasse_10.printHallo_name_z_mal(5, "Abd Alrahman");

        int flaeche1 = MethodenKlasse_10.berechneFlaeche(5, 3); // 15
        int flaeche2 = MethodenKlasse_10.berechneFlaeche(7, 2); // 14
        int flaeche3 = MethodenKlasse_10.berechneFlaeche(4, 3); // 12

        double alleflaechen = (flaeche3 + flaeche2 + flaeche1) / 3;
        System.out.println(alleflaechen);
    }
}
