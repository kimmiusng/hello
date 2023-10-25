package ex_1023.quiz;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {

        // Q. 3개의 정수값 가운데 최댓값을 구하여 출력하는
        //int max3(int a, int b, int c) 메소드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a값 입력: ");
        int a = sc.nextInt();
        System.out.print("정수 b값 입력: ");
        int b = sc.nextInt();
        System.out.print("정수 c값 입력: ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("세 개의 정수 값 중 최대값은 " + max);
    }
}

