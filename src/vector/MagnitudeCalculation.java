package vector;

import java.util.Vector;

/**  Vector Magnitude
 Write a method in the Vector class that calculates and returns the magnitude (length) of a vector.
 The magnitude of a vector can be calculated by taking the square root of the sum of the squares of its elements. */

public class MagnitudeCalculation {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);


        int length = 0;
        for (int i : vector) {
            length += i * i;
        }

        System.out.print(Math.sqrt(length));
    }
}





