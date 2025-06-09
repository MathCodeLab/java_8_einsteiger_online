package live_coding.kapitel2_flusskontrolle;

public class ForSchleifeWiederholung {
    public static void main(String[] args) {
        // for schleife -- while schleife

        // Hala: 1,2...., 10: inkrementieren
        // Moumena: print gerade Zahlen: 0, 2, 4, 6 ,...10

        for (int zahl = 1; zahl<=10; zahl++){
//            System.out.println(zahl); // hala

            if (zahl % 2 == 0){
                System.out.println("Diese Zahl ist gerade: " + zahl);
            }
            else {
                System.out.println("Diese Zahl ist UNgerade: " + zahl);
            }
        }

        // Sara: print 10, 9, ..., 1 (deinkrementieren)
        // Sidra: erstelle ein array und print inhalt rueckwaerts
        int[] yArr= {2,4,6,8,1000,453,14,16,18,20}; // 10 Elemente (index: [0], [9])
        // hard coding
//        System.out.println(yArr[0]);
//        System.out.println(yArr[1]);
//        System.out.println(yArr[2]);
//        System.out.println(yArr[3]);
//        System.out.println(yArr[4]);

        // vorwaerts: inhalt: 2, 4, 6, ... 18, 20
        //          position: 0, 1, ..., 9
        for (int nummer = 0; nummer <= 9; nummer++) {
            System.out.println(yArr[nummer]); // 2, 4, 6, ... 18, 20
        }


        // rueckwaerts: inhalt: 20, 18, ..., 6, 4, 2
        //          position: 9, 8, .. 2, 1, 0
        for (int nummer = 9; nummer >= 0; nummer--) {
            System.out.println(yArr[nummer]);
        }

        // rueckwaerts: Ausnahmsweie
        for (int nummer = 10; nummer >= 1; nummer--) {
            System.out.println(nummer); // Sara: 10, 9, ..
            System.out.println(   yArr[nummer-1]   ); // sedra: 20, 18, 16, ... ,4, 2
        }

    }
}
