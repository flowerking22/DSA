import java.util.HashSet;
import java.util.Set;

public class Setclass {
    public static void main(String[] args){
         Set<String> set = new HashSet<>();
         set.add("banana");
         set.add("apple");
         set.add("graphs");
        
        System.out.println("Size of HashSet: " + set.size()); 
        System.out.println("HashSet: " + set); 
        System.out.println("HashSet: " + set.toString()); 
String p1=set.toString();
System.out.println(p1.charAt(2)); 

        set.clear();
        System.out.println("HashSet: " + set);


    }
}
