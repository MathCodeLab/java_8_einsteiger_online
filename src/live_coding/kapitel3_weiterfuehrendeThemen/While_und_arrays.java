package live_coding.kapitel3_weiterfuehrendeThemen;

public class While_und_arrays {
    public static void main(String[] args) {
        System.out.println("anfang des programms");
        // Aufgabe: erstelle irgendein array, das 10 elemente hat und print es aus.
        // Hinweis: du kannst eine while schleife nutzen

        String[] namenArr = {"Sara", "Laila", "Nichts", "Marwa" , "moumena", "lamea", "sara", "hala", "mohammad", "Darin"};
        int position = 0; // das konnten wir auch counter oder index oder i benennen.

        while (position < 10) { // (position <= 9)
            System.out.println(namenArr[position]); // 7, 8,
            position++;
            
            if (position == 3) {
                break;
            }
        }

        System.out.println("ende des programms");


//        System.out.println(namenArr[0]);
//        System.out.println(namenArr[1]);
//        System.out.println(namenArr[2]);
//        System.out.println(namenArr[3]);
//        System.out.println(namenArr[4]);
//        System.out.println(namenArr[5]);
//        System.out.println(namenArr[6]);
//        System.out.println(namenArr[7]);
//        System.out.println(namenArr[8]);
//        System.out.println(namenArr[9]);

    }
}
