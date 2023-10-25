package ex_1023;

public class IfStatement {
    public static void main(String[] args) {
        // 조건문
        // if, if-else, if-else(=swith)

        // 기초
        if(true) {
            // 조건식 자리: boolea 타입(참/거짓)
               // 리턴값이 불린인 메소드
               // 결과만 불린이 나오면 ok
            System.out.println("참입니다.");
        }

        int age = 20;
        // if else
        if(age>19) {
           // true일 때 실행하는 블럭
            System.out.println("성인입니다.");
        } else {
            // false일 때 실행하는 블럭
            System.out.println("성인이 아닙니다.");
        }


        //if - else if - else
          // 논리(로직) -> 순서가 중요함*

    }
}
