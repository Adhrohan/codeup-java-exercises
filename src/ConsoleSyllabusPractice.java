
import java.util.Scanner;

public class ConsoleSyllabusPractice {

    public static void main(String[] args) {
///        String name = "Yogesh";
///        System.out.printf("hello there, %s. how are you today?", name);
//
//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);


        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
////        String userInput = scanner.next();
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.printf("Enter an integer: %n");
        int integer = scanner.nextInt();
        System.out.printf("You entered %d %n",integer);

        System.out.printf("Enter a longInteger: %n");
        long longInteger = scanner.nextLong();
        System.out.printf("You entered %d %n",longInteger);

        System.out.printf("Enter a decimal number: %n");
        float decimalNumber = scanner.nextFloat();
        System.out.printf("You entered %f %n",decimalNumber);

        System.out.printf("Enter an longDemimalNumber: %n");
        double preciseDecimalNumber = scanner.nextDouble();
        System.out.printf("You entered %f %n",preciseDecimalNumber);

        System.out.printf("Enter a single string input: %n");
        String singleInput = scanner.next();
        System.out.printf("You entered %s %n",singleInput);

        System.out.printf("Enter a multiple string input: ");
        String multipleInput = scanner.nextLine();
        System.out.printf("You entered %s %n",multipleInput);

    }
}
