package live_coding.kapitel4_collections;

public class WhileSchleife {
    public static void main(String[] args) {

        System.out.println("anfangs des programmes");


        int x = 0;
        while (x < 100) {
            System.out.println("HelloWorld");
            x++; // x=x+1;  x+=1;
        }

        System.out.println(x); // 100


        int count = 0;


        while (count <= 10) {
            System.out.println(count); // 0, ..., 10
            count++;
        }

        System.out.println("ende des programmes");

    }
}
