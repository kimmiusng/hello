package ex_1106;

public class MemberEx {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");


        if (obj1.equals(obj2)){
            System.out.println("obj1과 obj2는 동등합니다");
        }else {
            System.out.println("obj와 obj2는 동등하지 않습니다");
        }

        if (obj2.equals(obj3)){
            System.out.println("obj2과 obj3는 동등합니다");
        }else {
            System.out.println("ob2와 obj3는 동등하지 않습니다");
        }

    }
}
