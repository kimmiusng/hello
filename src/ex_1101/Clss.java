package ex_1101;

public class Clss {
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) ;
            {
                System.out.print(" ");


            }
            for (int k = 4; k >= 0; k--) {
                System.out.print("*");

            }
        }

    }
}
