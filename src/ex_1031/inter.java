package ex_1031;

public interface inter {

    int a = 0; // 고정값 상수는 사용 가능, 꼭 초기화 필요

    void methodA();
    Void methodB(); // 디폴트가 abstract여서 { }스코프블록을 따로 주면 에러 발생

}
