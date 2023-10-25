package ex_1023.quiz;

import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (i < 10) {
            System.out.print("숫자를 입력해주세요> ");
            String val = sc.nextLine();
            int num = Integer.parseInt(val);

            if (rand == num) {
                System.out.println("일치합니다!");
                break;
            } else if (rand > num) {
                System.out.println("임의의 수보다 작습니다.");
            } else {
                System.out.println("임의의 수보다 큽니다.");
            }
            i++;

            if (i == 10) {
                System.out.println("10번의 기회가 모두 끝났습니다. 실패!");
            }
        }
    }
}