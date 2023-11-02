package ex_1030.programmers;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution(new int[]{3, 4, 5, 2, 1});

    }

    public int solution(int[] num_list) {
        String a = "";
        String b = "";
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                a += num_list[i] + "";
            } else {
                b += num_list[i] + "";
            }
        }
        answer = Integer.parseInt(a) + Integer.parseInt(b);
        return answer;
    }
}

