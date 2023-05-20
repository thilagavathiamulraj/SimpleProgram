package vector;

import java.util.Vector;
/** Write a method in the Vector class that normalizes a vector.
 *  Normalizing a vector involves dividing each of its elements by its magnitude, resulting in a unit vector
 *  (a vector with a magnitude of 1).  */


public class VNormalization {

    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        v.add(4);
        v.add(5);

        int length =0;
        for (int j : v) {
            length = j*j;
        }
        double vec = Math.sqrt(length);
        System.out.print(vec);

        for(int i : v) {
            double r = i/vec;
            System.out.print(r);
        }
    }

}
