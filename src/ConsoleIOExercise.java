
import java.util.Scanner;
public class ConsoleIOExercise {

    public static void main(String[] args) {
        //getting back exact required number place after decimal
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n",pi);

        //Using Scanner class
        //storing a value in an integer variable
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an integer: %n");
        int nxtInt = scanner.nextInt();

        //prompting user input 3 words, storing in a variable and displaying each words to the user.
        System.out.printf("Enter 3 words: %n");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("The first word you entered is: %s %n", firstWord);
        System.out.printf("The second word you entered is: %s %n", secondWord);
        System.out.printf("The third word you entered is: %s %n", thirdWord);

        //prompting user to input a sentence, storing it in a variable and displaying it back to the user.
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("You entered: %s",sentence);

        //prompting user to input length and width of a classroom.
        System.out.println("Enter the length of the classroom: ");
        int length = scanner.nextInt();

        System.out.println("Enter the width of the classroom: ");
        int width = scanner.nextInt();

        //calculating the perimeter and area of a classroom
        int perimeter = (2 * length) + (2 * width);
        int area = length * width;

        //displaying perimeter and area of a classroom to the user
        System.out.printf("The perimeter of the classroom is: %d.%n",perimeter);
        System.out.printf("The area of the classroom is: %d.%n",area);








    }

}
