package ex_1019;

public class Scope {
    public static void main(String[] args) {

        String name1 = "김미성";
        System.out.println(name1);
        {
            System.out.println(name1);
        }


    }
}
