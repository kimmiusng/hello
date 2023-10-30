package ex_1026;

public class SingletonExample {
    public static void main(String[] args) {
        // 기본적으로 객체 생성하는 방법
        // new

//        new Singleton(); //생성자 호출
//        new Singleton();
//        new Singleton();

        // new를 못쓰게 해주어야한다
        // 생성자를 접근하지 못하도록 해야한다.
        // 그럼 어떻게 생성자 접근을 막을 수 있을까?
        // ▶ private으로 생성자 접근을 제한한다

        //new Singleton(); // private로 제한이 되어 있어서 new로는 객체 생성 불가(생성자호출 불가).


//        Singleton s1 = Singleton.singleton;  // 컴파일 에러

        Singleton s1 = Singleton.getInstance(); // 정적 메소드를 호출해서 싱글톤 객체를 얻음

    }

}
