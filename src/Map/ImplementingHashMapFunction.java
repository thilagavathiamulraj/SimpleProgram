package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImplementingHashMapFunction {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap();
        phoneBook.put("John", "9789564326");
        phoneBook.put("Charlie", "7895684373");
        phoneBook.put("Neha", "8596957385");
        phoneBook.put("Jerold", "7694738596");
        phoneBook.put("Kennedy", "98768768");
        phoneBook.put("Edward", "987979879879");

        Set<String> keys = phoneBook.keySet();
        for (String i : keys) {
            System.out.println(i + " : " + phoneBook.get(i));

        }
    }
}