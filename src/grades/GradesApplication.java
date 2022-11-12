package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        Student bob = new Student("BOB");
        Student tom = new Student("Tom");
        Student garry = new Student("GARRY");
        Student jerry = new Student("Jerry");

        students.put("bob","bob1");
        students.put("tom","tom1");
        students.put("gary","garry1");
        students.put("jerry","jerry1");

        bob.addGrade(60);
        bob.addGrade(70);
        bob.addGrade(80);

        tom.addGrade(80);
        tom.addGrade(70);
        tom.addGrade(90);

        garry.addGrade(70);
        garry.addGrade(90);
        garry.addGrade(60);

        jerry.addGrade(85);
        jerry.addGrade(75);
        jerry.addGrade(90);

        System.out.println("welcome!");
        System.out.println("Here are the GitHub usernames of our students:");

        for (Map.Entry<String, String> people : students.entrySet()){
            System.out.printf("|%S|",people.getKey(),"/n");

        }

    }

    public static void displayUser(HashMap<String, String> student){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        do {
            System.out.println("What student would you like to see more information on?");
        }


    }
}
