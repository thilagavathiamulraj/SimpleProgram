package Map;



import java.util.WeakHashMap;

public class WeakHMapImplementation {
    public static void main(String[] args){
        WeakHashMap<Gender, Name> identifier = new WeakHashMap<>();

        Gender gender1 = new Gender("Male");
        Name name1 = new Name("John");
        Gender gender2 = new Gender("Female");
        Name name2 = new Name("Clarie");

        identifier.put(gender1, name1);
        identifier.put(gender2, name2);

        System.out.println("Map Size :"+identifier.size());
        System.out.println("Value for key1 : "+identifier.get(gender1));
        System.out.println("Value for key2 : "+identifier.get(gender2));

        gender2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Map Size :"+identifier.size());
        System.out.println("Value for key1 : "+identifier.get(gender1));
        System.out.println("Value for key2 : "+identifier.get(gender2));

    }
}

class Gender {
    private String gender;

    public Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Key{" +
                "gender='" + gender + '\'' +
                '}';
    }
}

class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Value{" +
                "name='" + name + '\'' +
                '}';

    }
}
