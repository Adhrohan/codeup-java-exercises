package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("BOB",60);
        students.put("BOB",70);
        students.put("BOB",80);
        students.put("TOM",90);
        students.put("TOM",80);
        students.put("TOM",70);
        students.put("GARY",80);
        students.put("GARY",70);
        students.put("GARY",80);
        students.put("JERRY",90);
        students.put("JERRY",60);
        students.put("JERRY",80);
        System.out.println(students);

    }
}
