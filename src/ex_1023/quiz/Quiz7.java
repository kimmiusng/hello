package ex_1023.quiz;

public class Quiz7 {
    public static void main(String[] args) {

        int n;
        n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
