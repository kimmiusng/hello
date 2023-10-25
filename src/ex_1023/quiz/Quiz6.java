package ex_1023.quiz;

public class Quiz6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 4-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}