import java.util.HashSet;
import java.util.TreeSet;

public class UseSet {
    public static void main(String[] args){

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Banana");
    
        System.out.println(hashSet);
    
        System.out.println("Contains Apple? " + hashSet.contains("Apple"));
    
        hashSet.remove("Cherry");
        System.out.println(hashSet);
    
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(3);
    
        System.out.println(treeSet);
    }
}