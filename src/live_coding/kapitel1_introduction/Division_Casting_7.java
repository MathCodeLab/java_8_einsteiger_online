package live_coding.kapitel1_introduction;

public class Division_Casting_7 {
    public static void main(String[] args) {

        int x = 10;
        int y = 2;

        double doubleDivisionErgebnis = x / y;
        int intDivisionErgebnis = x / y;

        System.out.println(doubleDivisionErgebnis); // 5.0
        System.out.println(intDivisionErgebnis); // 5



        System.out.println(10 / 2); // 5
        System.out.println(10.6 / 2); // 5.3
        System.out.println(10 / 2.6); // 3.846153846153846
        System.out.println(10.6 / 2.2); // 3.8181818181818175


//        --------
        // type casting: Typumwandlung

        // EASY: byte -> short -> int -> long -> float -> double
        // CASTING: double -> float -> long -> int -> short -> byte
        // Casting: double x = (double) y

        System.out.println("--------------------------");
        int intZahl = 5;
        System.out.println(intZahl); // 5

        double Sidra_double_zahl = intZahl;
        System.out.println(Sidra_double_zahl); // 5.0


        double double_Zahl = 3.4;
        System.out.println(double_Zahl); // 3.9

        int sidra_Int_Zahl = (int) double_Zahl;
        System.out.println(sidra_Int_Zahl); // 3

//----------------------
        float floatZahl = 8.9f;
        System.out.println(floatZahl); // 8.900000

        double doubleZahl = floatZahl;
        System.out.println(doubleZahl); // 8.899999618530273

        floatZahl =  (float) doubleZahl;

    }


}
