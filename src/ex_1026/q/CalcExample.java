package ex_1026.q;

public class CalcExample {
    public static void main(String[] args) {

        Calc calc = new Calc();

        calc.plus(1, 2);
        System.out.println(calc.result);

        calc.minus(3, 1);
        System.out.println(calc.result);

        calc.multiply(2, 1);
        System.out.println(calc.result);

        calc.divide(10, 5);
        System.out.println(calc.result);



    }
}