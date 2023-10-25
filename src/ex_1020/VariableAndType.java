package ex_1020;

public class VariableAndType {
    public static void main(String[] args) {
        // 기본 타입
//        boolean isStudent = false; // 참 혹은 거짓 > 조건문과 반복문
//        char c = 1;
//        char c1 = 'A'; // 작은 따옴표 ' ' -> ,ANSWKFMF VYGUS
//        // 문자형 리터럴
//        // 'A' => 대응되는 숫자 : 65
//        // 문자, 기호를 표현하기 위해 코드가 필요
//        int i = 'A'; // 숫자로 표현

//        System.out.println(c1);
//        System.out.println(i);
//
//        // 헷갈리는 케이스
//        byte x = 10;
//        byte y = 10;
//        byte result = x + y; // 자바 컴파일러가 '+' 연산자가 양쪽에 있는 x, y를 int로 처리.. 결과도 int
//        byte result = int;
//
//        byte result = (byte) (x + y); // 결과자체가 int여서 결과를 묶어줘야 함!
//
//        String name = "이강인";
//        int age = 25;
//        System.out.println(name + ", " + age + "세");  // 이강인, 25세

//        byte x = 10;
//        byte y = 10;
//        byte result = (byte) (x + y);
//        System.out.println(result);

//        byte value1 = 10;
//        int value2 = 100;
//        long value3 = 1000L;
//
//        long result1 = value1 + value2 + value3;
//        System.out.println(result1);

//        int intValue = 7;
//        double dblValue = 7.7;
//        double result = intValue + dblValue;
//        System.out.println(result);

//        int x = 1;
//        int y = 2;
//        double result1 = x / y;
//        double result2 = x / (double) y;
//        System.out.println(result1);
//        System.out.println(result2);


        String str1 = 1 + 2 + "3";  // 왼쪽을 기준으로 비교
        String str2 = "3" + 1 + 2;
        String str3 = "3" + (1 + 2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 문자열 -> 숫자로 바꿀 수 없을까?
        int age = 25;
        int age2 = 25;
        String strAge3 = "25";
        System.out.println(Integer.parseInt(strAge3) + age + age2);



        // int : 기본타입 vs Integer : 레퍼런스 타입









    }
}
