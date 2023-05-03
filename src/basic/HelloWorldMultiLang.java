package basic;

public class HelloWorldMultiLang {
    public static void main(String[] args){
        String language = args[0];
        switch (language){
            case "English":
                System.out.println("Hello");
                break;
            default:
                System.out.println("Invalid Language");
                break;

        }
    }
}
