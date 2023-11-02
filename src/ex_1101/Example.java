package ex_1101;

public class Example {
    public static void main(String[] args) {
        //인스턴스 멤버 클래스
        Outer outer = new Outer(); //외부 outer 객체 생성
        Outer.Inner inner = outer.new Inner();

        inner.method();

        //정적 멤버 클래스
        Outer.StaticInner inner1 = new Outer.StaticInner();
        //outer가 아닌 "Outer"
    }
}