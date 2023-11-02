package ex_1030.programmers;

public class Ex {
    public static void main(String[] args) {

      String data = "st350-1DX23-M31LZ-XDM7E-MKUT1";

      int sum = 0;
      String[] split = data.split("-");

      for (int i = 0; i<split.length; i++){
          split[i] = split[i].replaceAll("[^0-9]","");

          for (int j = 0; j < split.length; i++){
              int tmp = Integer.parseInt(split[j]);
              sum += tmp;
              System.out.println(sum);
          }
      }


    }
}
