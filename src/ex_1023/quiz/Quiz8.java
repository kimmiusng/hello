package ex_1023.quiz;

public class Quiz8 {
    public static void main(String[] args) {

        int n;
        int w;
        n = 14;
        w = 5;

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            if (i % w == 0) {
                System.out.println();
            }
        }
    }
}
