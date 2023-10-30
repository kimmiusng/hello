package ex_1030;

public class SmartPhone extends CellPhone {

    String internetMode;

    public SmartPhone(String internetMode, String model, String color) {
//         super(); 부모생성자를 호출
        super(model, color); // super는 항상 자식보다 먼저// 맨 위쪽에 기재

        this.internetMode = internetMode;
        this.model = model;
        this.color = color;
        System.out.println("자식 생성자 호출");
    }

    void showInternetConnect() {
        System.out.println("현재 인터넷 접속은 " + internetMode + "로 연결되었습니다.");
    }

    // ▼ 메소드 재정의 = 오버라이딩
    // alt+insert 누르면 override가 뜰 정도로 자주 쓰임
    //@override 오버라이드 어노케이션
    @Override
    void powerOn() {
        super.powerOn();   //오버라이딩 한 후에 부모를 호출하고 싶다면,
//        System.out.println("스마트폰 전원을 켭니다."); } // 메소드 재정의 1.
    }
        @Override
        void powerOff() {System.out.println("스마트폰 전원을 끕니다.");} // 메소드 재정의 2.

    }
