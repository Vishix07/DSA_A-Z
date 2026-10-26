import java.util.*;

public class Hashmap{

    public static void main(String[] args) {
       HashMap<Integer, String> map = new HashMap<>();
       map.put(1, "Vansh");
       map.put(2, "Vish");
       map.put(3, "Kimi");

       System.out.println(map);

       System.out.println("=====================================================");

       String Student = map.get(3);
         System.out.println(Student);
        
        System.out.println("=====================================================");

        String s = map.get(69);
        System.out.println(s);

        System.out.println("=====================================================");

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Kimi"));

        System.out.println("=====================================================");

        Set<Integer> keys = map.keySet();
        for( int i : keys){
            System.out.println(map.get(i));
        }

        System.out.println("=====================================================");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println("=====================================================");

        map.remove(2);
        System.out.println(map);

        System.out.println("=====================================================");

        List<Integer> list  = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.contains(4));

        System.out.println("=====================================================");
        
    }
}