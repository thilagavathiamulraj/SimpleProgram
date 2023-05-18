package CollectionsVector;

import java.util.Vector;

public class VNormalization {

    public static void main(String[] args){
        Vector<Integer> v = new Vector();
        v.add(4);
        v.add(5);

        int length =0;
        for (int j : v) {
            int k = j*j;
            length = k;
        }
        double vec = Math.sqrt(length);
        System.out.print(vec);

        for(int i : v) {
            double r = i/vec;
            System.out.print(r);
        }
    }

}
