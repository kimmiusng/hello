package ex_1020;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("여기에 입력 >>");
            String input = sc.nextLine();

            if(input.equals("q")) {
                System.out.println(sum);
                break;

            }

            int num = Integer.parseInt(input);
              sum += num;

        }
    }
}
