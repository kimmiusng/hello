package ex_1023;

public class SwitchStatement {
    public static void main(String[] args) {

        // if-else if 대체 가능
        // 범위가 한정적일 때 사용

        int num = (int) (Math.random() * 6) + 1;

        switch (num) {
            case 1:
                System.out.println("주사위는 1입니다.");
                break;  // 조건문을 빠져나가는 명령문

            case 2:
                System.out.println("주사위는 2입니다.");
                break;

            case 3:
                System.out.println("주사위는 3입니다.");
                break;

            case 4:
                System.out.println("주사위는 4입니다.");
                break;

            case 5:
                System.out.println("주사위는 5입니다.");
                break;

            default:
                System.out.println("주사위는 6입니다.");
                break;

        }
    }

}