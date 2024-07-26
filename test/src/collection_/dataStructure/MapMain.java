package collection_.dataStructure;

import java.util.HashMap;
import java.util.Map;

/* Interface Map<K,v>
*
* */
public class MapMain {
    public static void main(String[] args) {
        // Map<String,String>map = new map();  // interface이므로 new가 안된다.
        Map<String,String>map = new HashMap<>();

        map.put("book101","백설공주");
        map.put("book101","엄지공주");  // key 중복 허용 -> 엄지공주가 덮어 버림
        map.put("book201","인어공주");
        map.put("book100","인어공주");  // value 중복 허용
        map.put("book102","덕혜옹주");

        System.out.println(map.get("book101"));
        System.out.println(map.get("book201"));
        System.out.println(map.get("book100"));
        System.out.println(map.get("book102"));
        System.out.println(map.get("book1214214124214"));  // 없는 키 -> null
        System.out.println("--------------------------");

        for(Map.Entry<String,String> data :map.entrySet()){  // map for-each문으로 순회
            System.out.println(data);
            String key = data.getKey();
            String value = data.getValue();
            System.out.println("key : "+key+", value : "+value);
        }
    }
}
