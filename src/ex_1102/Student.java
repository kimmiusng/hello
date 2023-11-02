package ex_1102;

import java.util.Objects;

public class Student {
    String name;
    int score;



    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int hashCode() {
// 객체 간 name과 score가 같으면 동일한 hashCode() 값을 리턴
        return Objects.hash(name, score);
//        return this.name.hashCode() + score;

    }

    //student1 = this, student2 = s
//    student1.equals(student2);
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            if(((this.name).equals(s.name)) && (this.score == s.score)) {
                return true;
            }
        }
        return false;
    }

}


