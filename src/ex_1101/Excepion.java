package ex_1101;

public class Excepion {

    public static void printLength(String data) {
        try {
            int result = data.length();  //예외 NullPointerException
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e){
            e.printStackTrace();  // 문제가 어디서 왜 발생했는지 알려줌
            System.out.println("예외처리메세지: " + e.getMessage());
        } finally {
            System.out.println("예외가 발생해도 무조건 실행해줘!");
        }
        //예외가 생기면 try에서 catch로 넘어감
    }
        public static void main (String[]args){
            System.out.println("[프로그램 시작]\n");
            printLength("ThisIsJava");
//            printLength(null);
            System.out.println("[프로그램 종료]");
        }
    }


