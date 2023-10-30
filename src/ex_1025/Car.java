package ex_1025;

public class Car {

    private String model;
    private String color;
    // private String color = "White"; 선언과 동시에 초기화 작업 완료, 이후에 세터로 변경
    // private final String color; 의 final은 상수, 고정값, 처음에 초기화작업을 한 이후에 변경 불가
    private int maxSpeed;

//    컴파일을 하게되면 기본 생성자가 생성될 것
//    public Car() {
//
//    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car() {
        this("BMW", "BLACK"); // 여기서 this는 생성자, super() 부모 생성자
    }

    public String getModel() {
        return model;
    }

    // *****
    // 오버로딩 (생성자 오버로딩/메서드 오버로딩)
    // 이름은 동일하나 매개 변수의 갯수와 타입이 다를 때
    // ex) println()


    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

//    public Car(){

//    }
//}
