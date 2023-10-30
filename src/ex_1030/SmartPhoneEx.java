package ex_1030;

public class SmartPhoneEx {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("iphone14","black");
//        SmartPhone smartPhone = new SmartPhone("5G","iPhone15","white");
        CellPhone samsung = new SmartPhone("4G", "Galaxy23","BLACK");
        // 부모는 자식을 받아 줄 수 있다. 자동 타입 변환이 가능함
        // 타입이 Cellphone이라면, 자식타입의 SmartPhone이 지닌 필드는 접근 불가하다
//        samsung.internetMode; // 접근 불가

//
//        smartPhone.model = "Galaxy23";
////        smartPhone.color = "white";
//        smartPhone.powerOn();
//        smartPhone.powerOff();
//        smartPhone.showInternetConnect(); // 진하게 표현된 것이 자식의 메소드, 자식의 필드를 말해줌
////        smartPhone.notify(); // 애초에 기본으로 상속받고 있는 object 클래스들도 있음
//
////        cellPhone.powerOn();
////        cellPhone.powerOff();
//
//        smartPhone.powerOn();


        //자식클래스는 부모클래스 + 본인의 필드를 포함하기 때문에
        // 좀 더 확장의 개념 -> 구체적일 수 밖에 없음



    }
}
