package ex_1024.quiz;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 길이 n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] newArr = new int[arr.length];


        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("요소를 역순으로 바꿔 새로운 배열을 만들었습니다.");

        System.out.print("newArr = [ ");


        int j = 0;
        for (int k = n-1; k >= 0; k--){
            newArr[j] = arr[k];
            System.out.print(newArr[j]);
            if(k != 0){
                System.out.print(", ");
            }
        }
        System.out.print(" ]");

    }
}
