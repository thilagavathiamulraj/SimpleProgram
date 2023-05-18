package CollectionsVector;

import inheritance.Square;

import java.util.Vector;

public class MagnitudeCalculation {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);


        int length = 0;
        for (int i : vector) {
            int j = i * i;
            length = j;
        }
        Math.sqrt(length);

        System.out.print(Math.sqrt(length));
    }
}





