package ex_1025;
// 클래스는 객체가 X
// 클래스 : 객체를 만드는 방법 (설계도와 비슷)
public class Example {
    public static void main(String[] args) {

        String str = new String();
        // 힙에 String 객체를 할당
        // String 클래스로부터 String 인스턴스(=객체)를 만드는 것

        // 학생 관리 프로그램
        Student student1 = new Student();  // 독립적인 객체 생성, 인스턴스화
        Student student2 = new Student();  // new

        // "." 객체의 필드 혹은 메서드에 접근하기 위한 방법
        student1.getName(); // 값을 읽을 때 사용, 읽기 전용
        System.out.println(student1.getName());

        student2.getName(); // 값을 읽을 때 사용, 읽기 전용
        System.out.println(student2.getName());




//        student1.name = "손흥민";
//        System.out.println(student1.name);
//        student2.name = "손흥민";
//        System.out.println(student2.name);
        // student1 객체와 student2 객체는 같은 객체인가요?
        // no, // 각각 독립적인 객체를 생성했기 때문에


        // 객체 필드는 왠만하면 감춰라
//        student1.name = ""; // <- 필드접근 바로 하는 방법 권장 X

//
//        student1 손흥민 = new Student1("손흥민", 32);
//        student1 이강인 = new student1("이강인"); // age : 0 초기화
//        student1 아무개 = new student1(20); // name : null 초기화
//        student1 황희찬 = new student1(); // name : null, age : 0 초기화


    }
}
