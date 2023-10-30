package ex_1026.q;

public class CalculatorExample {
    public static void main(String[] args) {

    Calculator cal1 = Calculator.getInstance();
    Calculator cal2 = Calculator.getInstance();


    System.out.println(cal1.plus(1,2));
    System.out.println(cal2.divide(10,2));




//      String str = "Hello";
//      str.toLowerCase(); //인스턴스 메서드
//      String.valueOf();  //정적 메서드


    }
}