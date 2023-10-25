package ex_1023.quiz_re;

public class Quiz2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 10;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("모든 정수의 합은 " + sum);
    }
}
