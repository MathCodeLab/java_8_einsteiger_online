package live_coding.kapitel1_introduction;

public class Operatoren_5 {

    public static void main(String[] args) {

        // Variablen
        // =========

        // deklarieren (definieren): darf nur einmal pro Variable passieren
        int z;

        // intialisieren (einen Wert zum ersten Mal zuweisen/geben)
        z = 7;
        System.out.println(z); // 7

        // ueberschreiben (den vorherigen Wert mit einem Neuen ersetzen)
        z = 4;
        System.out.println(z); // 4









        // deklariere und intialisere auf einmal
        int x = 5;
        int y = 200;
        System.out.println(x); // 5
        System.out.println(y); // 100


        x = 10; // ueberschreiben
        x = 20;
        System.out.println(x); // 20

        x = 50;
        x = 70;
        System.out.println(x); // 70
        x = y; // x=200

        int laenge = 5;
        int breite = 2;






        x = y; // Ab jetzt soll x den Wert von y haben.
        System.out.println(x); // 100
        System.out.println(y); // 100



        // Operatoren:
        // 1. Arithemtische Operatoren: + - * /
        // 2. Zuweisungsoperatoren: = += -= *= /= ++ --
        // 3. Relationale Operatoren: < > <= >= == !=
        // 4. Logische Operatoren: &&   ||  !
        x = 3 + 7; // 10
        y = x + 4; // 14

        laenge = 3334;
        breite = 232;

        int flaeche = laenge * breite;
        int umfang = 2 * (laenge + breite);

        int ergebnis = flaeche + umfang;




        System.out.println(4); // 4
        System.out.println(4 + 1); // 5
        System.out.println("4"); // 4
        System.out.println("4 + 1"); // 4 + 1

        System.out.println(x); // 10
        System.out.println(y); // 14
        System.out.println(x + 1); // 11
        System.out.println("x + 1"); // x + 1
        System.out.println(x + y); // 10 + 14 = 24


        // ----------
        // 2. Zuweisungsoperatoren
        // =
        int zahl = 5;
        int a = 4;

        zahl = 5 + 4; // 9
        zahl = 5 + a; // 5 + 4 -> 9
        zahl = a + a; // 4 + 4 -> 8


        zahl = 5;
        a = 4;

        System.out.println(zahl); // 5
        System.out.println(a); // 4

        zahl = zahl + a; // 5 + 4 --->>> 9

        System.out.println(zahl); // 9
        System.out.println(a); // 4



        zahl = 5;
        a = 4;


        zahl += a;   // zahl = zahl + a; --->>> 9

        System.out.println(zahl); // 9
        System.out.println(a); // 4



        zahl = 5;
        a = 4;

        zahl += 4; // zahl = zahl + 4  ---->>>> 9
        zahl = 5;
        a = 4;

        zahl *= a; // zahl = zahl * a  ---->>>> 5*4=20

        // -------------

        zahl = 5;
        a = 1;

        zahl = zahl + a; //6
        zahl += a; // 6 + 1 = 7

        zahl += 1; // 7 + 1 = 8



        zahl = 5;

        // inkrementieren (deinkrementieren): den Wert einer Variable um 1 erhoehen.
        zahl++; // zahl += 1  --->> zahl = zahl + 1
        zahl--;  // zahl -= 1  --->> zahl = zahl - 1


        System.out.println("=======================");
        // 3. Relationale Operatoren: < > <= >= == !=

        int ergebnis1 = 3 + 2;
        System.out.println(ergebnis1); // 5

        //true: wahr,        false: falsch
        boolean ergebnis2 = 3 > 2;
        System.out.println(ergebnis2); // true



        zahl = 5;
        a = 4;

        boolean vergleichErgebnis = zahl < a; // false
        System.out.println(vergleichErgebnis); // false


        System.out.println(5 <= 7); // true
        System.out.println(7 <= 5); // false
        System.out.println(7 >= 5); // true
        System.out.println(5 >= 7); // false

        // >=:  groesser ODER gleich
        System.out.println(7 >= 6); // true
        System.out.println(7 >= 7); // true
        System.out.println(7 >= 8); // false

        System.out.println(7 <= 6); // false
        System.out.println(7 <= 7); // true
        System.out.println(7 <= 8); // true


        System.out.println(7 == 6);//ist 7 gleich 6? false
        System.out.println(7 == 7);//ist 7 gleich 7? true

        System.out.println(7 != 6);//ist 7 ungleich 6? true

        System.out.println("********");

        System.out.println(3 == 3);  // true
        System.out.println(3 != 3);  // false

        System.out.println(4 != 3);  // 4 ungleich 3:true
        System.out.println(4 != 4);  // 4 ungleich 4:false
        System.out.println(234234 != 234236);



        System.out.println("%%%%%%%%%%%%%%%%%%%%%");
        // 4. Logische Operatoren: &&   ||   !

        System.out.println(  false || false ); // false
        System.out.println(  false || true ); // true
        System.out.println(  true || false ); // true
        System.out.println(  true || true ); // true

        System.out.println(  false && false ); // false
        System.out.println(  false && true ); // false
        System.out.println(  true && false ); // false
        System.out.println(  true && true); // true

        System.out.println(  !true  ); // false
        System.out.println(  !false  ); // true

        System.out.println(  !(5<100)  ); // false
        System.out.println((true || true) && (false || true));  // true && true
        // true

        System.out.println(true || true && false || true);  // true || false || true
        //  true || true
        // true


        // (3+1) * (4+2)
        // =4 * 6
        // =24
        // ----------------
        // 3+1 * 4+2
        // =3+ 4 + 2
        // =9
        // --------

        // &&: *
        // ||: +
        // true: 1
        // false: 0

        // true && false -->> false
        //   1  *   0    -->>   0



    }
}
