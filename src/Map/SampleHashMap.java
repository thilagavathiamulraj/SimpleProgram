package Map;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Navin", 56);
        marks.put("Harsh", 23);
        marks.put("Sushil", 87);
        marks.put("Kiran", 56);
        marks.put("Kani", 87);
        marks.put("Navin", 60);

        System.out.println(marks.keySet());
        System.out.println(marks.values());
        for (String key : marks.keySet()) {
            System.out.println(key + ":" + marks.get(key));
        }
    }
}
