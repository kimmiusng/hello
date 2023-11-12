import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new java.util.HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println(map.size());

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(value);

        Set<String> keyset = map.keySet();
        Iterator<String> keyIterator = keyset.iterator();
        while (keyIterator.hasNext()){
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            int v = entry.getValue();
            System.out.println(k + " : " + v);
        }

        map.remove("홍길동");
        System.out.println(map.size());

    }
}
