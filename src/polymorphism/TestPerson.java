package polymorphism;

public class TestPerson extends Person{

    public static void main(String[] args){

        Student student = new Student();
        Teacher teacher = new Teacher();

        Person [] person = {student, teacher};
        System.out.println(student.greet());
        System.out.println(teacher.greet());




    }

    @Override
    String greet() {
        return null;
    }
}
