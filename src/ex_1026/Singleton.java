package ex_1026;

public class Singleton {
    // 싱글톤?
    // 하나의 인스턴스만 생성시켜주는 패턴
    // 또는 객체의 생성수를 제한하고 싶을 때 사용

    private static Singleton singleton = new Singleton(); // 객체 생성
                    // 여기서 singleton: 인스턴스



    private Singleton(){

    }
    //private도 내부에서는 접근 가능
    //내부에서 객체를 생성
    //Singleton에 접근하기 위해
    //static으로 선언 > 어디서나 접근가능

    public static Singleton getInstance() {
        return singleton;

        // private로 선언을 해주었기때문에
        // 보통은 getter,setter를 사용하지만
        // 정적 메소드 선언
    }
}
