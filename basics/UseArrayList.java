import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args){
        
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        
        listOfIntegers.add(5);
        listOfIntegers.add(10);
        listOfIntegers.add(15);
        listOfIntegers.add(20);

        System.out.println(listOfIntegers);

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.add(2, "Orange");
        
        for(int i = 0; i < colors.size(); i++){
            if(colors.get(i).equals("Yellow")){
                colors.set(i, "Purple");
                break;
            }
        }

        colors.remove(1);

        for (String color : colors){
            System.out.println(color);
        }

        System.out.println(colors.size());
    }
}
