package ex_1024;

public class MultiArrayExample {
    public static void main(String[] args) {

        int[][] scores = new int[2][3];  // 2차원 배열 생성 : 2*3 6개의 int형 함수를 담을 수 있음

        // 행렬
        System.out.println(scores);
        System.out.println(scores[0]);  // 메모리가 저장되어 있는 주소 값 출력
        System.out.println(scores[1]);

        System.out.println(scores[0][0]);
        System.out.println(scores[0][1]);
        System.out.println(scores[0][2]);
        System.out.println(scores[1][0]);
                  //  ... 총 6가지 생성


        int[][] scores1 = new int[10][10];

        // 초기화 값 0을 1로 전부 변경하고 싶다.
        // 각 요소에 접근해서 값을 변경 -> for문을 사용해서

        for (int i = 0; i < scores1.length; i++) { //scores1.length의 값은 행
            for (int j = 0; j < scores1[0].length; j++){
                //scores1[].length값은 열, []이 비어도 되지만 에러가 뜨기 때문에 아무 숫자나 넣어도 가능
                scores1[i][j] = 1;
                System.out.println("[" + i + "], [" + j + "] = " + scores1[i][j]);
            }
        }

        System.out.println();

        int[][] scores2 = new int[5][5];

        for (int i = 0; i < scores2.length; i++) {
            for (int j = 0; j < scores2[0].length; j++) {
                scores2[i][j] = 1;
                System.out.println("[" + i + "], [" + j + "] = " + scores2[i][j]);
            }
        }

    }
}
