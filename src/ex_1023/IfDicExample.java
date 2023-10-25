package ex_1023;

public class IfDicExample {
    public static void main(String[] args) {

        int num = (int) (Math.random()*6) + 1;  // 범위; 1 <= int num < 7

        // Quiz.
        // num값이 1일 때 "주사위 결과는 1입니다."
        // num값이 n일 때 "주사위 결과는 n입니다."



        if (num == 1) {
            System.out.println("주사위 결과는 1입니다.");
        } else if (num == 2) {
            System.out.println("주사위 결과는 2입니다.");
        } else if (num == 3) {
            System.out.println("주사위 결과는 3입니다.");
        } else if (num == 4) {
            System.out.println("주사위 결과는 4입니다.");
        } else if (num == 5) {
            System.out.println("주사위 결과는 5입니다.");
        } else {
            System.out.println("주사위 결과는 6입니다.");
        }


    }
}
