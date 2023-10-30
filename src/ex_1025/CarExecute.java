package ex_1025;
// 클래스도 종류가 있다.
// 1. 실행 클래스
// 2. 라이브 클래스...등

public class CarExecute {
    public static void main(String[] args) {

        // 객체 생성은 "New" ***
        Car bmw = new Car("BMW", "WHITE", 200);
        Car benz = new Car("BENZ", "BLACK", 190);
        Car car = new Car();
        // 생성자 작성 이후 초기화 작업 완료

        car.setModel("Hyundai");
        car.setModel("Blue");
        car.setMaxSpeed(200);


    } // [bmw/benz]라는 객체가 힙 영역에 생성됨
      // 변수에 담으면 사용 가능(참조)
      // 필드 초기화
        //1. 생성자
        //2. setter 메서드



}
