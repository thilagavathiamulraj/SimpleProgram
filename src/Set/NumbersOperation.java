package Set;

import java.util.HashSet;
import java.util.Set;

public class NumbersOperation {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(23);
        numbers.add(32);
        numbers.add(41);
        numbers.add(50);
        numbers.remove(41);
        //numbers.clear();
        System.out.println("Size : "+numbers.size());
        for (Integer number : numbers) {
            System.out.println(number);
        }
        }

    }

