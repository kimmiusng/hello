package ex_1024.quiz;

public class Ex {
    public static void main(String[] args) {

        int[] nums = new int[] {10,20,30,40,50};
        printAllElements(nums);
    }
    static void printAllElements(int[] arr) {
        for (int nums : arr) {
            System.out.println(nums);
        }
    }
}
