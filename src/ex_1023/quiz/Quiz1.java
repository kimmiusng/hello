package ex_1023.quiz;

public class Quiz1 {
    public static void main(String[] args) {

        // Q. for문을 이용해서 1부터 100까지 정수 중 3의 배수의 총합을 구하시오

        int sum = 0;

        for (int i=1; i<=100; i++){
            if (i % 3 == 0){
                sum += i;
            }
        }
        System.out.println("3의 배수의 총 합은 " + sum);
    }
}
