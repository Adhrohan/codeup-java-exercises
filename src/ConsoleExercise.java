
import java.util.Scanner;

public class ConsoleExercise {

    public static void main(String[] args) {
///        String name = "Yogesh";
///        System.out.printf("hello there, %s. how are you today?", name);
//
//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}
