
import java.util.Scanner;
public class ConsoleIOExercise {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n",pi);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an integer: %n");
        int nxtInt = scanner.nextInt();

        System.out.printf("Enter 3 words: %n");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("The first word you entered is: %s %n", firstWord);
        System.out.printf("The second word you entered is: %s %n", secondWord);
        System.out.printf("The third word you entered is: %s %n", thirdWord);


    }

}
