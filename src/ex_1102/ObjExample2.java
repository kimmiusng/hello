package ex_1102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ObjExample2 {
    public static void main(String[] args) {
        // 객체 복사
        ArrayList<String> members1 = new ArrayList<>();
        members1.add("손흥민");
        members1.add("이강인");
        members1.add("황희찬");

        ArrayList<String> members2 = null;
        // members1의 요소를 members2에 복사할 수 있는 방법
        //1.대입 members2 = member1;
        //2.for문
        for (String member : members1) {
            members2.add(member);
        }
        //3.메서드(자체 제작, 기존 라이브러리 활용)
        members2 = (ArrayList<String>) members1.clone();
              // 좌측은 ArrayList 타입 // 우측은 Object  >>>> members2의 타입으로 강제 형변환 과정을 거쳐야함
        // Collections.copy();
    }
}
