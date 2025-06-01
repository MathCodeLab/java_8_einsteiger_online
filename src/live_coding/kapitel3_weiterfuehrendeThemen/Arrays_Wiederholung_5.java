package live_coding.kapitel3_weiterfuehrendeThemen;

public class Arrays_Wiederholung_5 {
    public static void main(String[] args) {
        // arrays
        int x = 5;
        int[] yArr = {3, 5, 7, 9};
        System.out.println(yArr[0]); // 3
        System.out.println(yArr[1]); // 5
        System.out.println(yArr[2]); // 7
        System.out.println(yArr[3]); // 9
//        System.out.println(y[4]); // error

        yArr[2] = 100; // Inhalt vom yArr an der Stelle 3 wird umgeschrieben. Anstelle von 7 werden wir 100 haben.
        System.out.println(yArr[2]); // 100




        int [] myArr = new int[7];

        myArr[0] = 5; // umschreiben, initialisieren
        myArr[1] = 345;
        //
        // ...
        System.out.println(myArr[0]);//5


    }
}
