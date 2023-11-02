package ex_1101;

public class Outer {
    class Inner{
        Inner(){}
        int field;

        void method(){
            System.out.println("내부 클래스의 메서드 호출");
        }

//        static int field2;  // 클래스 내부에서는 static으로 사용이 안됨.
    }

    void method(){
        Inner inner = new Inner();
        inner.method();
        StaticInner.field3 = 0;

        //로컬클래스; 메서드 안에서도 클래스 선언이 가능하다
        class InnerMethod {

        }


    }
    static class StaticInner{
        StaticInner(){

        }
        int field2;
        static int field3;

    }

}
