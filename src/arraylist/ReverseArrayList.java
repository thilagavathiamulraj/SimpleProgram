package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/** Reverse ArrayList
 Write a method that takes an ArrayList of any type as input and reverses the order of its elements. */

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList<String> concepts = new ArrayList<>();
        concepts.add("vector");
        concepts.add("Exceptions");
        concepts.add("Encapsulation");
        concepts.add("Polymorphism");
        concepts.add("Inheritance");
        concepts.add("Abstract Class");
        concepts.add("method Overloading");
        concepts.add("Method Overriding");
        concepts.add("Data Types");
        concepts.add("Class");
        concepts.add("Objects");
        System.out.println("Before reversing");
        System.out.println(concepts);


        Collections.reverse(concepts);
        System.out.println("After Reversing");
        System.out.println(concepts);
    }
}

