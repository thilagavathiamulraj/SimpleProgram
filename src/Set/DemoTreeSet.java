package Set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class DemoTreeSet {
    public static void main(String[] args){

        Set<Integer> number = new TreeSet<>();
        number.add(5);
        number.add(10);
        number.add(2);
        number.add(8);
        number.add(3);


        Iterator<Integer> print = number.iterator();
        while(print.hasNext()) {
            System.out.println(print.next());
        }
        System.out.println("The Size of TreeSet is : "+number.size());
        int minNumber = Collections.min(number);
        System.out.println("The Smallest number is : "+minNumber);
        int maxNumber = Collections.max(number);
        System.out.println("The Largest number is :"+maxNumber);
    }
}
