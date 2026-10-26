import java.util.*;

public class Hashmap{

    public static void main(String[] args) {
       HashMap<Integer, String> map = new HashMap<>();
       map.put(1, "Vansh");
       map.put(2, "Vish");
       map.put(3, "Kimi");

       System.out.println(map);

       String Student = map.get(3);
         System.out.println(Student);

        String s = map.get(69);
        System.out.println(s);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Kimi"));

        Set<Integer> keys = map.keySet();
        for( int i : keys){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        
    }
}