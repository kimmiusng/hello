package ex_1026.q;

public class Calc {

    double PI = 3.14159; // 인스턴스 필드
    int result; // 인스턴스 필드(결과값을 받기 위해)


    int plus(int a, int b){
        this.result = a + b;
        return this.result;
    }
    int minus(int a, int b){
        this.result = a - b;
        return this.result;
    }

    int multiply(int a, int b){
        this.result = a * b;
        return this.result;
    }

    int divide(int a, int b){
        this.result = a / b;
        return this.result;
    }

    int modulo(int a, int b){
        this.result = a % b;
        return this.result;
    }

}




