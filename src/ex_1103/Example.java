//package ex_1103;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class Example {
//    public static void main(String[] args) {
//
//        ArrayList<String> names =
//                new ArrayList<>(List.of(new String[]{"ㄱㄱㄱ", "ㄴㄴㄴ", "ㄷㄷㄷ", "ㄹㄹㄹ", "ㅁㅁㅁ"}));
//
//        // 람다
//        // 정렬 전
//        System.out.println("정렬 전");
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        System.out.println("오름차순 정렬");
////        Collections.sort(names, new Comparator<String>() {
//            //         .sort(name, Comparator) Comparator는 인터페이스이기때문에 그 자리에는 구현객체를 넣어주면됨
//
////            @Override
////            public int compare(String a, String b) {
////
//////                 정렬 기준을 알려주는 메서드
//////                  -1: a이 왼쪽 (a < b)
//////                  +1: a이 오른쪽 (a > b)
//////                   0 : a = b
////
////                return a.compareTo(b) >= 0 ? 1 : -1;
////                //사전순으로 a가 b보다 크다면 1
////
////            }
////        });
//
////        //람다 표현식
////
////        Collections.sort(names,(a,b) -> {
////            return a.compareTo(b) >= 0 ? 1 : -1;
////        });
//
//
//names.stream().forEach(name -> {
//    System.out.println(name);
//});