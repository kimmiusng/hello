package ex_1020;

public class Quiz1 {
    public static void main(String[] args) {

        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";

        // 타입변환
        int result = (int)(var2 + var3) + (int)var1 + (int)Double.parseDouble(var4);
        System.out.println(result);

        // String var4를
        // Integer.parseInt(var4)는 불가능
        // Double.parseDouble(var4)로 변환 후,
        // (int) Double.parseDouble(var4)로 변환해야 함!


    }
}
