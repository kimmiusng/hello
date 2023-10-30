package ex_1030.programmers;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution(2, 3);


    }


    public int solution(int num1, int num2) {
        // int answer = 0;

        int result = 0;
        if (num1 == num2) {
            result = 1;
        } else {
            result = -1;
        }

        System.out.println(result);
        return result;

    }
}



