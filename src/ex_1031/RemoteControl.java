package ex_1031;

public interface RemoteControl {
    // 인터페이스의 대표적인 예
    // 인터페이스는 공통의 기능을 찾아서 작성하면 됨
    // 동작 (메서드)에 중점!


    //인터페이스를 생성하면
    //그 인터페이스의 기능을 구현 할 "객체"가 필요!! **
    //ex)TV,audio


    public int MAX_VOLUME = 10;    // 필드선언은 되지 않으나, 상수로 지정했을때는 반드시 값을 설정해주어야한다.
    public int MIN_VOLUME = 0;
    void turnOn();
    void turnOff();
    void setVolume(int volume); //set은 매개변수 타입을 지정해주어야함




}
