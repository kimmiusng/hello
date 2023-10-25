package ex_1020;

public class Function {
    // 필드 : 상태, 메서드 : 동작
    public static void main(String[] args) {
        // 메서드는 재사용이 가능하다.
        // 메서드 호출 : func1();
//        func1();

        System.out.println(plus(10, 10));
        System.out.println(plus(10, 20));

    }

        // 메서드 선언 (정의)
        // 리턴타입 메서드명(매개변수);
        static int func1() {
//            return "5";
//            return 5.0;  타입을 동일하게 맞춰줘야 함
            return (int) 5.0;  // return에는 int값, 리턴값? 호출한 곳으로 값을 반환(리턴)
        }

        static int plus(int a, int b) {
        return a + b;
    }

}
