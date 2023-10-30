package ex_1026.q;

public class Calculator {

    private static final double PI = 3.14159;
    private int result = 0;

    private static Calculator cal = new Calculator();

    private Calculator() {
    }

    public static Calculator getInstance() {
        return cal;
    }


    int plus(int a, int b){
        this.result = a + b;
        return getresult();
    }
    int minus(int a, int b){
        this.result = a - b;
        return getresult();
    }

    int multiply(int a, int b){
        this.result = a * b;
        return getresult();
    }

    int divide(int a, int b){
        this.result = a / b;
        return getresult();
    }

    int modulo(int a, int b){
        this.result = a % b;
        return getresult();
    }

    int getresult(){
        return this.result;
    }

}
