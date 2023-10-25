package ex_1020;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

//        while (true){
//            // 무한 반복
//            Scanner sc = new Scanner(System.in);
//            System.out.print(">>입력");
//            String input = sc.nextLine();
//            System.out.println(input);
//
//
//        }

        while (true) {
            //무한반복
            Scanner sc2 = new Scanner(System.in);
            System.out.println(">>여기에 입력");
            String input2 = sc2.nextLine();
            System.out.println(input2);

            // 종료 조건
            // q키를 눌렀을때 종료 하고 싶다

            // 객체.필드 (o)  객체.필드
            // 객체.메서드 (o) 객체.메서드()

            // 숫자 == 숫자
            // 문자열 == 문자열 오류 발생-> 문자열.equals(문자열)

            if (input2.equals("q")) {
                System.out.println("종료했습니다.");
                break; // 반복루프를 빠져나오세요!
            }


        }
        System.out.println("반복문을 빠져나왔습니다.");



//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("x값 입력: ");
//        String strX = scanner.nextLine();
//        int x = Integer.parseInt(strX);
//
//        System.out.print("y값 입력: ");
//        String strY = scanner.nextLine();
//        int y = Integer.parseInt(strY);
//
//        int result = x + y;
//        System.out.println("x + y = " + result);
//        System.out.println();
//

    }





                }
