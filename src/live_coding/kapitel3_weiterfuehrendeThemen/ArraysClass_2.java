package live_coding.kapitel3_weiterfuehrendeThemen;

public class ArraysClass_2 {
    public static void main(String[] args) {
        // arrays: Spezielle Variablen.
        // sie speichern mehere Elemente

        // 1. deklarieren und initialsiseren
        int x = 6; // normale Variable
        System.out.println(x);

        int y; // deklarieren

        // ...

        // ten thousend line of code later
        y = 8; // initialiseren
        y = 6; // ueberschreiben
        System.out.println(y);

        int z; // deklarieren
        z = 7; // initialiseren

        // deklarieren und intialisieren
        int z1 = 7;



//        String name1 = "darin";
//        String name2 = "moumena";
//        String name3 = "sara";
//        String name4 = "hala";

//        int note1 = 29;
//        int note2 = 9;
//        int note3 = 19;
//        int note4 = 27;

        String[] namenArr = {"darin", "moumena", "sara", "hala", "ahmad", "ali", "khaled", "lona", "sara2", "lamea"};
        int[] notenArr = {29, 9, 19, 99, 56,6,567,456,7,456,8,67,8,657,8,67,9,6789,678,96,78,9,56,8,567,8,6,8,567,8,568,56,78,56,78,5,768,567,8,657,8,67,8,56,745674,74,56,7,5467,45,6,7465,7};
        System.out.println(namenArr[0]); // position (index) 0 -> darin
        System.out.println(namenArr[1]); // position (index) 1 -> moumena
        System.out.println(namenArr[2]); // position (index) 2 -> sara
        System.out.println(namenArr[3]); // position (index) 3 -> hala
//        System.out.println(namenArr[4]); // position (index) 4 -> ERORR!!!!!!!!
        notenArr[3] = 100; // ueberschreiben





        // 1. deklarieren (datentyp und name)
        int[] gehaltArr1;

        // 1.5 Speicherplatz allozieren (reservieren)
        gehaltArr1 = new int[4]; // reserviere speicherplatz fuer 4 elementa

        System.out.println(gehaltArr1[0]); // print inhalt an der stelle (position/index) 0
        System.out.println(gehaltArr1[1]);
        System.out.println(gehaltArr1[2]);
        System.out.println(gehaltArr1[3]);

        // 2. initialisieren
        gehaltArr1[0] = 1200;
        gehaltArr1[1] = 1500;
        gehaltArr1[2] = 1800;
        gehaltArr1[3] = 1700;

        System.out.println(gehaltArr1[0]);
        System.out.println(gehaltArr1[1]);
        System.out.println(gehaltArr1[2]);
        System.out.println(gehaltArr1[3]);


// --- ankeuerzung

        int z2; // deklarieren
        z2 = 345345; // init

        int z3 = 234234; // dekl und init

        //        --------------

        int[] gehaltArr2; // dekl

        // 1.5 Speicherplatz allozieren (reservieren)
        gehaltArr2 = new int[4]; // reserviere speicherplatz fuer 4 elementa

        int[] gehaltArr3 = new int[4]; // dekl und allozieren

    }
}
