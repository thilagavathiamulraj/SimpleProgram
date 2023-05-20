package arraylist;

import java.util.ArrayList;

/** find Maximum Value
 Write a method that takes an ArrayList of integers as input and returns the maximum value in the list. */


public class FindMaxValue {
    public static void main(String[] args) {
        ArrayList<Integer> maxNumber = new ArrayList<>();
        maxNumber.add(10);
        maxNumber.add(20);
        maxNumber.add(30);
        maxNumber.add(40);

        int maximum = maxNumber.get(0);
        for (int i = 1; i < maxNumber.size(); i++) {
            if (maximum < maxNumber.get(i)) {
                maximum = maxNumber.get(i);
            }
            System.out.println("Maximum array element is " + maximum);
        }
    }
}

