package Map;

import java.util.WeakHashMap;

public class StudentDetailsWeakMap {
    public static void main(String[] args) {

        WeakHashMap<StudentID, StudentGrade> students = new WeakHashMap<>();

        StudentID studentID1 = new StudentID(1);
        StudentGrade studentGrade1 = new StudentGrade('O');
        StudentID studentID2 = new StudentID(2);
        StudentGrade studentGrade2 = new StudentGrade('A');

        students.put(studentID1, studentGrade1);
        students.put(studentID2, studentGrade2);

        System.out.println(students.size());
        System.out.println(students.get(studentID1));
        System.out.println(students.get(studentID2));

        studentID1 = null;
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(students.size());
        System.out.println(students.get(studentID1));
        System.out.println(students.get(studentID2));

    }
}

class StudentID {
    private int studentID;

    public StudentID(int studentID){
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Value: " + studentID;
    }
}

class StudentGrade{
    private char studentGrade;

    public StudentGrade(char studentGrade){
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "Value: " + studentGrade;
    }
}
