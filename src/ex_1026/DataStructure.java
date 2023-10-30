package ex_1026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class DataStructure {
    public static void main(String[] args) {
        String[] str = new String[]{"1", "2", "3"};

        //1. 리스트
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("손흥민");
        arrayList.add("이강인");
        arrayList.add("황희찬");


        for (String name : arrayList) {
            System.out.println(name);

//        arrayList.remove(0);
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("손흥민");
        linkedList.add("손흥민");
//        showList(linkedList);


        // 셋, 맵
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("손흥민");
        hashSet.add("손흥민");
//        showList(hashSet); // 중복을 제거해줌

        HashMap<Integer, String> hashMap = new HashMap<>();
        // 1, 손흥민
        // 2, 이강인

        hashMap.put(1, "손흥민");   // key, 실제값 > key중복을 막아줌
        hashMap.put(2, "이강인");
        hashMap.put(3, "손흥민");

        System.out.println(hashMap.size());

    }


}


