package ex_1023.quiz;

public class Quiz5 {
    public static void main(String[] args) {

        // for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성하시오

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
