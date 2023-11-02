package ex_1102;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringJoiner;

public class ClassExample {
    public static void main(String[] args) {

        String A = "A";
        String B = "B";
        String C = "C";
        System.out.println(String.join(", ", "A", "B", "C"));


        StringJoiner sj = new StringJoiner("-");
        sj.add("a");
        sj.add("b");
        sj.add("c");
        System.out.println(sj);


        HashSet<String> names = new HashSet<>();

        names.add("손흥민");
        names.add("이강인");
        names.add("황희찬");
        names.add("손흥민");   // set은 중복을 허용하지 않음

        for (String name : names) {
            System.out.println(name);
        }


        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(it.hasNext());


        HashSet<Student> students = new HashSet<>();
        students.add(new Student("손흥민", 100));
        students.add(new Student("이강인", 95));
        students.add(new Student("이강인", 95));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            System.out.println("이름 : " + s.name + ", 점수 : " + s.score);
        }








    }
}