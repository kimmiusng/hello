package ex_1102;

import java.util.Objects;

public class Member {
    String id;

    public Member(String id) {
        this.id = id;
    }


//    (member1.equals(member2));

//    //오버라이딩
    @Override
    public boolean equals(Object obj) {
        //id가 서로 같으면 true
        //매개변수 타입 : Object
        // Object는 모든 클래스 타입의 객체를 다 받을 수 있다 (=다형성)
        //Object -> Member로 강제 형변환이 필요함
        if (obj instanceof Member) {
            if (this.id.equals(((Member)obj).id)) {
                return true; //id가 서로 같으면 true 반환
            }
        }
        return false;
    }

    //객체 동등 비교 시 사용되는 오버라이딩
    //hashCode는 객체가 가리키는 "주소값"을 말함
    //주소값까지 동일하게하려면 hashCode를 재정의해야함
      // >> 재정의: 주소값이 아닌 내가 정한 기준으로 해시코드를 리턴할 수 있다.

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

//[list / set / map]; 저장방식이 다르다고 생각하면 됨
//list는 순서가 있으며(입력 순서를 유지), 데이터(값) 중복 허용
//set은 순사가 없으며, 데이터(값) 중복을 허용하지 않음
//map은 key&Value 구조, Key는 중복을 허용하지 않으며, Value(값)는 중복을 허용

//set과 map은 중복을 허용하지 않음 >> equals와 hashcode를 체크하기때문에 오버라이딩해주어야함
