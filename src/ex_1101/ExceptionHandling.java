package ex_1101;

public class ExceptionHandling {
    public static void main(String[] args) throws ClassNotFoundException{

        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            System.out.println("value1 + value2 = " + (value1 + value2));

            Class.forName("???");
            fineClass("jang.lang.String3");

            String str = null;
            str.charAt(2);

        } catch (ArrayIndexOutOfBoundsException e){


        } catch (ClassNotFoundException e) {

        } catch (NumberFormatException e) {
            //예외처리 catch도 여러개 생성가능
//        }  catch (Exception e){
//            // 모든 예외 처리 가능
//        } finally {

        } System.out.println("프로그램 정상종료");
    }

    private static void fineClass(String name) throws ClassNotFoundException {
        Class.forName(name);
    }
}
