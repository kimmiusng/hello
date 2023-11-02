package ex_1102;
public class ObjExample {
    public static void main(String[] args) {

        String name1 = new String("손흥민");
        String name2 = new String("손흥민");

        System.out.println(name1.equals(name2));
        //true가 나오는 이유는
        //String 클래스에서 equals 메서드를 "오버라이딩"
        //Object로부터 상속받은 equals 메서드를 String 클래서 특성에 맞게 재정의


        //내가 만든 클래스 Member
        Member member1 = new Member("kitri01");
        Member member2 = new Member("kitri01");
        System.out.println(member1.equals(member2));  //false;
        //true가 나오게 하려면 재정의/오버라이딩
    }
}
