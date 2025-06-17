import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
    
        arrayList.add(45);
        arrayList.add(10);
        arrayList.add(90);
        arrayList.add(30);
        arrayList.add(60);
    
        System.out.println("Original: " + arrayList);
    
        Collections.sort(arrayList);
        System.out.println("Sorted (asc): " + arrayList);
    
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("Sorted (desc): " + arrayList);

        System.out.println("Contains 30? " + arrayList.contains(30));
        System.out.println("Index of 90: " + arrayList.indexOf(90));
    }
}
