package live_coding.kapitel3_weiterfuehrendeThemen;

public class MethodenClass_7 {
    // methode erstellen (Definition)
    public static void printHallo(){
        System.out.println("Hallo World");
    }

    public static void printGoodbye(){
        System.out.println("Goodbye World");
    }

    public static void printTschuess(){
        System.out.println("Tschuess World");
    }

    public static void printServus(){
        System.out.println("Servus World");
    }

    public static void printEtwas(String text){
        System.out.println(text);
    }


    public static void main(String[] args) {
        printEtwas("hallo World");
        printEtwas("tschuess World");
        printEtwas("hi hi World");
        printEtwas("hi");
        printEtwas("ich bin ein roboter");
        printEtwas("ich liebe java");




        System.out.println(5);






        // Verwenden (Aufruf) der von uns definierten Methoden
        printHallo();
        printHallo();
        int x = 6;
        printGoodbye();
        printGoodbye();

        printHallo();
        printGoodbye();

        for (int i=0; i<7; i++){
            printGoodbye();
        }

        printServus();
        printTschuess();


    }

}
