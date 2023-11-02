package ex_1102;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // ex) key:이름/ value:점수
        map.put("손흥민", 80);
        map.put("이강인", 90);
        map.put("황희찬", 95);
        map.put("황희찬", 95);

        System.out.println(map.size());
        //중복체크를 "키"에서 함, 값은 중복체크가 되지 않음


        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            int val = map.get(key);

            System.out.println(key + ", " + val);
        }


    }
}
