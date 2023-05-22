package arraylist;

import java.util.ArrayList;
import java.util.List;

public class StoringNumbers {
    public static void main(String[] args){
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12.3F);
        numbers.add(24D);
        numbers.add(12L);
        numbers.add((short)2);
        numbers.add((byte)1);

        for (Number number : numbers  ) {
            System.out.println(number);
        }
    }
}
