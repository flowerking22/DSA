import java.util.HashMap;
import java.util.Map;

public class Mapclass {
    public static void main(String[] args){
    Map <String,Integer> map=new HashMap<>();
        // Adding key-value pairs to the map
        map.put("apple", 5);
        map.put("banana", 3);
        map.put("orange", 7);

        // Retrieving the value associated with the key "apple"
        Integer numberOfApples = map.get("apple");
        System.out.println("Number of apples: " + numberOfApples);

        // Modifying the value associated with the key "apple"
        map.put("apple", 10);

        // Removing the key-value pair with the key "banana"
        map.remove("banana");

        // Iterating over the entries of the map and printing key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("containsKey: "+map.containsKey("mango"));
        System.out.println("Size:"+map.size());
        System.out.println("toString"+map.toString());
        System.out.println("keySet"+map.keySet());
        System.out.println("Values"+map.values());  
        System.out.println("entryset"+map.entrySet());   

       System.out.println((map.isEmpty()));
        map.clear();
       System.out.println((map.isEmpty()));

        System.out.println(map);


    }
}
