package live_coding.kapitel2_flusskontrolle;

import java.util.Random;
import java.util.Scanner;

// if - else beispiel.
public class If_Else_2 {
    public static void main(String[] args) {

        System.out.println("Anfangs des Spiels");
        System.out.println("==================");

        // generiere eine zufaellige Zahl
        Random r = new Random(); // erstelle ein random objekt namens r
        int zufaelligeZahl =  r.nextInt(0, 10); // nutze dieses objekt (r) um ein integer zufaellige Zahl zu erstellen

        System.out.println("Ich bin java. Ich habe eine zufaellige Zahl im Kopf zwischen 0 und 10.");
        System.out.print("Rate diese integer Zahl hier: ");

        // Nimm eine integer Zahl vom user entgegen.
        Scanner s = new Scanner(System.in);
        int ratenZahl = s.nextInt();

        if (ratenZahl == zufaelligeZahl) {
            System.out.println("Du hast gewonnen!!!!!!!!");
            System.out.println("Die zufaellige Zahl ist: " + zufaelligeZahl);
            System.out.println("Die Ratenzahl ist: " + ratenZahl);
        }

        else {
            System.out.println("Du hast verloren!!!!!!!!!");
            System.out.println("Die zufaellige Zahl ist: " + zufaelligeZahl);
            System.out.println("Die Ratenzahl ist: " + ratenZahl);

            if (ratenZahl < zufaelligeZahl) {
                System.out.println("Deine eingegebene Zahl ist zu klein");
            }
            else {
                System.out.println("Deine eingegebene Zahl ist zu gross");
            }

        }

        System.out.println("==================");
        System.out.println("Ende des Spiels");
    }
}


