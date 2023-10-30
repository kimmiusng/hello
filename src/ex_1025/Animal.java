package ex_1025;

public class Animal {
    private String name;
    private String gender;
    void eat() {
        System.out.println("얌얌~");
    };

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    void sleep(){
        System.out.println("zzZ");
    }
}
