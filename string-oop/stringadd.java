import java.util.ArrayList;
import java.util.List;

public class stringadd{
    public static void main(String[] args){
        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("apple1");
        fruits.add("banan2");

        System.out.println("Element at index 1:" + fruits.get(3));
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}