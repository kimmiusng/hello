package ex_1024.quiz;

public class Quiz11 {
    public static void main(String[] args) {

//        int[] nums = new int[] {10,20,30,40,50};
//        printReverseAllElements(nums);

        printReverseAllElements(new int[]{1,3,5,7});

    }

    static void printReverseAllElements(int[] arr){
        // void는 return할 값이 없음.

//        for (int i=(arr.length-1); i>=0; i--) {
//            System.out.println(arr[i]);

        // 인덱스 번호
        int index = arr.length-1;

        while (index>=0){
            System.out.print(arr[index--] + " ");

        }
    }
}
