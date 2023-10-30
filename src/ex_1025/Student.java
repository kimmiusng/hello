package ex_1025;

import java.security.PublicKey;

public class Student {

        // 학생 속성을 추상화 (모델링)
        private String name;  // 초기화 값: null
        private long id;
        private int age;
        private String address;
        private String grade;
        private String circle;

        // 동작(행동)
        // private한 name의 상태를 보여주는 메서드
        // name의 상태를 보여주는 메서드
        // 읽기전용 : getter





        // 쓰기 전용 : setter
        // 매개값에 의해서 객체의 필드가 변경되는 메서드

        public void setName(String name){
                this.name = name;
        }      //name이라는 필드를 바꾸겠다. // 매개값에 의해서 변경

        public String getName() {
                return this.name;  // retrun ""; (String 타입) // this : 내가 속한 객체(인스턴스)
        }
        public Long getId() {
                return this.id;
        }
        public int getAge(){
                return this.age;
        }
        public String getAddress(){
                return this.address;
        }

        public String getGrade(){
                return this.grade;
        }

        public String getCircle(){
                return this.circle;
        }



        public void setId(long id) {
                this.id = id;
        }

        public void setAge(int age){
                this.age = age;
        }

        public void setAddress(String address){
                this.address = address;
        }

        public void setGrade(String grade){
                this.grade = grade;
        }
        public void setCircle(String circle){
                this.circle = circle;
        }

        // alt + insert를 누르면
        // getter와 setter 자동 코드 제공
        // 객체를 만들때 기본 요소

}
