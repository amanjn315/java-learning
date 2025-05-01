import java.util.HashMap;
import java.util.TreeMap;

public class UseMap {
    public static void main(String[] args){

        HashMap<String, Integer> hashMap = new HashMap<>();
    
        hashMap.put("Laptop", 55000);
        hashMap.put("Phone", 30000);
        hashMap.put("Tablet", 25000);
        hashMap.put("Phone", 32000);
    
        System.out.println(hashMap);
        System.out.println("Price of Phone: " + hashMap.get("Phone"));
        System.out.println("Watch in map? " + hashMap.containsKey("Watch"));
    
        hashMap.remove("Tablet");
    
        System.out.println(hashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Laptop", 55000);
        treeMap.put("Phone", 30000);
        treeMap.put("Tablet", 25000);
        treeMap.put("Phone", 32000);

        System.out.println(treeMap);
    }
}
