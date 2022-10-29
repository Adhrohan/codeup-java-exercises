package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addGrade(60);
        bob.addGrade(80);
        System.out.println(bob.getStudentName());
        System.out.println(bob.getGradeAverage());

    }
}
