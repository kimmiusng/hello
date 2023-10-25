package ex_1023.quiz;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a값 입력> ");
        int a = sc.nextInt();
        System.out.print("정수 b값 입력> ");
        int b = sc.nextInt();
        System.out.print("정수 c값 입력> ");
        int c = sc.nextInt();

        // 1 2 3

        int med3 = a;
        if (b > a) {
            if (b < c) {
                med3 = b;
            }
        }
        System.out.println("세 정수 중 중앙값은 :" + med3);
    }
}
