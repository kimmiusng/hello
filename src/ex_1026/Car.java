package ex_1026;

public class Car {

    private String model; // 인스턴스 멤버
    // 객체가 생성되어야지만 사용 가능
    static int year = 2023; // 정적(static) 멤버
    // static 키워드를 포함하고 있으며, 모두에게 공유하는 개념
    // static 키워드는 보통 final과 함께 쓰임
    // final 키워드는 상수 개념, 값음 변경할 수 없음


    // private는 getter, setter로
    // getter, setter는 인스턴트 필드를 위한 것


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    static public void setYear(int newYear){
        year = newYear;
        // this.model; (x) // static은 어디서나 접근 가능하지만, static 입장에서는 인스턴스는 접근이 안됨 (메모리구조를 생각해야함)

    }
}
