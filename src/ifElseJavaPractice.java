import java.util.Scanner;
public class ifElseJavaPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade:");

        int grade = scan.nextInt();
        System.out.printf("You have entered %d.%n", grade);

        if (grade >= 90 && grade <= 100){
            System.out.println("Your grade is \"A\".");
        }
        else if (grade >= 80 && grade < 90){
            char result = 'B';
            System.out.printf("Your grade is %s.%n ", result);
        }
        else {
            System.out.printf("You have failed the exam.");
        }
    }
}
