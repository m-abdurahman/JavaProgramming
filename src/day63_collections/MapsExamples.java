package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        // <key= id (unique), value = names (can be duplicate)>
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Daria");
        map.put(100, "Max");
        map.put(101, "Max");
        System.out.println(map);
        System.out.println(map.get(100));
        System.out.println(map.get(50));

        System.out.println(map.remove(1));
        map.put(1, "Kinga");
        System.out.println(map);
        map.remove("Maxim"); //--> though it won't remove value since it's not a key, it wont print as error
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Anna"));

        for (Integer key : map.keySet()){
            System.out.println(key + " - " + map.get(key));

            if(map.get(key).equals("Daria")){
                System.out.println("This is our key " + key);
            }

        }

        //map.values()



    }
}
