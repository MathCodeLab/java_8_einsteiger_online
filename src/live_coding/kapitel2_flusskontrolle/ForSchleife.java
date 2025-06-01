package live_coding.kapitel2_flusskontrolle;

public class ForSchleife {
    public static void main(String[] args) {
        // for schleife

        // while schleife wiederholung
        System.out.println("Anfang des Programms");








        int meinZaehler = 0; // einmal ausgefuehrt

        while (meinZaehler < 5){ // (counter < 5) wird wiederholt
            System.out.println("Hallo"); // wird wiederholt
            meinZaehler++; // counter+=1; // counter = counter + 1; // wird wiederholt
        }

        //        --------------

        for (int zaehler = 0; zaehler < 5; zaehler++){
            System.out.println("Hi");
        }




        System.out.println("Ende des Programms"); // eimal ausgefuehrt
    }
}
