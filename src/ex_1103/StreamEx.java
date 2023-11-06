//package ex_1103;
//
//import java.util.ArrayList;
//import java.util.OptionalDouble;
//
//public class StreamEx {
//    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("손흥민", 100));
//        students.add(new Student("이강인", 95));
//        students.add(new Student("황희찬", 80));
//
//
//        //1.for문 이용
//        int sum = 0;
//        for (Student student : students) {
//            sum += student.getScores();
//        }
//        System.out.println(sum / students.size());
//
//
//        //2.스트림 이용한 방법
//          // (1) 스트림 객체를 얻는다. (리스트, 셋, 파일 등...)
//          // (2) 처리를 진행 _ 중간처리 : 매핑 정렬 필터링 등,, > 최종처리 : 평균, 총합, 카운팅 등등..
//
//        OptionalDouble avg = students.stream().mapToInt(student -> {
//            return student.getScores();
//
//        }).map(score -> score* 10)
//                .average();
////        avg.getAsDouble(); // 값이 null이 아닐 경우 값을 리턴
//        System.out.println(avg);
//    }
//}
