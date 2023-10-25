package ex_1024.quiz;

public class Quiz12 {
    public static void main(String[] args) {
        int[] nums = new int[] {10, 20, 30, 40, 50};
        int[] delNums = deleteElementsFromArray(nums, 30);

        for (int returnNums : delNums) {
            System.out.println(returnNums);
        }



    }
    static int[] deleteElementsFromArray(int[] arr, int n) {
        // 결과값은 정수열 배열이어야 함
        // 매개변수 : 호출할때 사용하기 위해
        // arr = {...}에서 n을 찾아 지워주기
        // 순회에서 n값이랑 비교 후 같으면 삭제


        int[] arr2 = new int[arr.length-1];
        int j =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                arr2[j] = arr[i];
                j++;

            }
        } return arr2;
    }
}


