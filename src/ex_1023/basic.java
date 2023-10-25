package ex_1023;


//JVM
//main()
//main(String[]{"이강인", "손흥민","..."}

public class basic {
    public static void main(String[] args) {
//
//        String str = "Hello";
//        // str 변수 : 스택
//        // "Hello" : 힙
//        System.out.println(str);
//        str = null; // 어떤 객체도 참조하지 않고 있다.
//        System.out.println(str);
//
////        str.toLowerCase(); // Hello -> hello
//          // NullPointerException
//          // str에 null값으로 반환 된 후에, 매서드를 넣었기 때문에 예외발생
//

        // 배열
        // 데이터를 연속된 공간에 나열하는 자료 구조
        // 인덱스로 접근 (인덱스는 0부터 시작)
        // 같은 타입의 데이터만 하나의 배열에 저장이 가능

        String[] studentNames1 = {"이강인", "손흥민","황희찬"}; // "문자열"을 넣을 수 있는 배열
//        String[] studentNames2 = new String[]{"이강인", "손흥민", "..."};
//        String[] studentNames3;
//        studentNames3 = new String[]{"11", "22", "..."};

        System.out.println(studentNames1.length); //3출력
        System.out.println(studentNames1[0]); //이강인출력
        System.out.println(studentNames1[1]); //손흥민출력

        for (int i = 0; i < studentNames1.length; i++){
            System.out.println(studentNames1[i]);
        }

        // 향상된 for문
        for (String name : studentNames1){
            System.out.println(name);
        }


//        studentNames = new String[] {};

    }
}
