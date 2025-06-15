package live_coding.kapitel3_weiterfuehrendeThemen;

public class MethodenKlasse_wiederholung_8 {

    // definition
    static void printLine(){
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
    }

    static void printSymbol(char s){
        System.out.print(s);
        System.out.print(s);
        System.out.print(s);
        System.out.print(s);
        System.out.print(s);
        System.out.print(s);
        System.out.println(s);

//        int ergebnis = rechtEckFlaeche * 10;
//        System.out.println(rechtEckFlaeche);

        String name = "moumena";
        System.out.println(name);
    }



    static int berechneRechtEckFlaeche(){
        int laenge = 3;
        int breite = 4;
        int rechtEckFlaeche = laenge * breite;
        return rechtEckFlaeche;
    }


    public static void main(String[] args) {

        int ergebnis = berechneRechtEckFlaeche();

        System.out.println("hi");
        printLine();
        System.out.println("bye");

        printSymbol('%'); // %%%%%%
//        System.out.println(name);
//        System.out.println(rechtEckFlaeche);





        printSymbol('#'); // #####
        printSymbol('&'); // &&&&&
        printSymbol('£');



    }
}
