package live_coding.kapitel1_introduction;

public class operatoren_3 {
    public static void main(String[] args) {

        // Operatoren
        // +, -, *, /, =, <, >, <=, >=, %,

        // ich deklariere (defineire) eine Variable, dann ich gebe diese Variable eine Wert (initisaliser, Wert zuweusein)

        int x; // nur (einmal) deklarieren (defineiren): Name & Datentype
        x = 5; // initialisieren (initial)
        System.out.println(x);

        x = 7; // ich aendere den intialwert und weise einen neuen Wert zu. also ich ueberschreibe den Wert von x.
        System.out.println(x); // 7


        int y = 5; // einaml deklarieren und initialiserein auf einmal in einer zeile.
        System.out.println(y); // 5
        y = 6;
        y = 45;
        System.out.println(y); // 45
        System.out.println(x); // 7

        x = y; // x = 45;
        System.out.println(y); // 45
        System.out.println(x); // 45

        x = 3;
        y = x;
        System.out.println(y); //
        System.out.println(x); //

        // arithmethische operatoren

        int a = 4;
        int b = 20;
        System.out.println("2 + 4"); // 2 + 4
        System.out.println(2 + 4); // 6

        System.out.println("a + b"); // a + b

        int summe = a + b;
        System.out.println(a + b); // 24
        System.out.println(summe); // 24

        int laenge = 4;
        int breite = 2;
        int flaeche = laenge * breite; // 8

        // -----
        // relationale Operatoren
        System.out.println("---------");
        System.out.println("3 +    2");
        System.out.println(3 + 2); // 5

        // <, >, <=, >=, ==, !=
        System.out.println(3 == 3); // true
        System.out.println(4 != 3); // true

        boolean vergleichErgebnis = breite >= laenge; // false

        boolean ergebnis = (6 == 4); // false
        System.out.println(ergebnis); // false
    }
}
