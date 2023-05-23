package Set;


import java.util.LinkedHashSet;
import java.util.Set;

public class StringOperations {

    public static void main(String[] args) {
        Set<String> stringValues = new LinkedHashSet<>();
        stringValues.add("apple");
        stringValues.add("banana");
        stringValues.add("cherry");
        stringValues.add("date");
        stringValues.remove("banana");
        stringValues.add("elderberry");
        stringValues.clear();
        System.out.println(stringValues);
        System.out.println("The size is :" + stringValues.size());
    }
}
