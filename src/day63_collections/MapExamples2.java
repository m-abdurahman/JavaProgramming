package day63_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples2 {
    public static void main(String[] args) {
        // id, Person object
        Map<Integer, Person> map = new HashMap<>();
        map.put(32, new Person("MJ", 32));
        map.put(null, new Person("", 0));
        map.put(12, new Person("Nick", 10));

        System.out.println(map.get(31)); //null
        System.out.println(map.get(null)); // Person{name='', age=0}
        System.out.println(map.get(32));
        System.out.println(map);

        //insertion order guaranteed
        Map<Integer, Person> map2 = new LinkedHashMap<>();
        map2.put(32, new Person("MJ", 32));
        map2.put(null, new Person("", 0));
        map2.put(12, new Person("Nick", 10));
        System.out.println(map2);

        Map<Integer, Person> map3 = new TreeMap<>();
        map3.put(32, new Person("MJ", 32));
        map3.put(0, new Person("", 0));
        map3.put(12, new Person("Nick", 10));
        System.out.println(map3);

        /*
        BD examples

        FIRST_NAME  James
        LAST_NAME   BOND
        AGE         50
         */

         /*
        BD
        key         value

        FIRST_NAME  AMY
        LAST_NAME   ROSE
        AGE         30

            key     value
       Map<String, String> map = new HashMap<>();
       map.put("FIRST_NAME", "James");
       map.put("LAST_NAME", "Bond");

       map.get("FIRST_NAME") -> prints James
       if map.get("AGE") <0) -> fails test case
       if(map.get("FIRST_NAME") == null) -> fail test case

       List<Map<String, String> list

       list.get(0) -> Map<String, String> (James Bond)
       list.get(0).get("FIRST_NAME") -> James

         */




    }
}
