package ex_1030;

public class CellPhone {

    //필드
    String model;
    String color;


    //생성자
    public CellPhone(){
        System.out.println("부모 생성자가 호출");
    }

    public CellPhone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("매개변수 2개짜리 부모생성자 호출");

    }



    //메소드
    void powerOn() { System.out.println("전원을 켭니다."); }
    void powerOff() { System.out.println("전원을 끕니다."); }
    void bell() { System.out.println("벨이 울립니다."); }
    void sendVoice(String message) { System.out.println("자기: " + message); }
    void receiveVoice(String message) { System.out.println("상대방: " + message); }
    void hangUp() { System.out.println("전화를 끊습니다."); }
}