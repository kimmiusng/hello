package ex_1023.quiz;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        // Q. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메소드를 작성하세요.

        int a = 1;
        int b = 10;
        int sum = 0;

        for (a = 1; a <= b; a++) {
            sum += a;
        }
        System.out.println("정수의 합은 " + sum);
    }
}

//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("정수 a의 값 입력: ");
//    int a = sc.nextInt();
//    System.out.println("정수 b의 값 입력: ");
//    int b = sc.nextInt();
//
//    int sum = 0;
//
//    for





