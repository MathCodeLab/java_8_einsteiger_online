package live_coding.kapitel3_weiterfuehrendeThemen;

// Methoden:
// 1. ohne parameter (nichts bekommen), ohne rueckgabe (void) (nichts zueruecksenden)
// 2. mit parameter, ohne rueckgabe (void)
// 3. ohne parameter, mit rueckgabe (return)
// 4. mit parameter, mit rueckgabe (return)


public class Methoden_klasse_8 {
    // 1. ohne parameter, ohne rueckgabe (void) // Sidra
    public static void printName(){
        System.out.println("sidra");
    }

    // 2. mit parameter, ohne rueckgabe (void) // Hala
    public static void printText(String text){
        System.out.println("Hallo " + text);
    }

    // 3. ohne parameter, mit rueckgabe (return) // Moumena
    public static int berechneFlaeche(){
        int breite = 5;
        int laenge = 6;
        int ergebnisFlaeche = breite * laenge;
//        System.out.println(ergebnisFlaeche);
        return ergebnisFlaeche;
    }

    // 4. mit parameter, mit rueckgabe (return) // Darin
    public static int berechneSpezielleFlaeche(int laenge, int breite){
        int flaeche = laenge * breite;
        return flaeche;
    }

    public static void main(String[] args) {
        printName();
        printName();
        printText("hi"); // hallo hi
        System.out.println("hi"); // hi
        printText("Hala"); // hallo hala
        printText("darin, karim, hala, moumena"); // hallo darin ...

        int EndErgebnis1 = berechneFlaeche();
        System.out.println(EndErgebnis1); // 30

        int EndErgebnis2 = berechneFlaeche();
        System.out.println(EndErgebnis2); // 30


        int Endflaeche1 = berechneSpezielleFlaeche(7, 3);
        System.out.println(Endflaeche1); // 21

        int Endflaeche2 = berechneSpezielleFlaeche(10, 2);
        System.out.println(Endflaeche2); // 20

    }
}
