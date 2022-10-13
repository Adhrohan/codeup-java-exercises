package util;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);



    public static String getString(){
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y")|| userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("true");

    }

    public static int getInt(int min, int max){
        System.out.printf("Enter numbers between %s and %s", min , max);
        int userNum = scanner.nextInt();
        if(userNum< min || userNum>max){
            getInt(min,max);
        }
        return userNum;
    }

    public static int getInt(){
        System.out.println("Enter an interger:");
        int userInput = Integer.valueOf(scanner.nextInt());
        return userInput;


    };

    public static double getDouble(double min, double max){
        System.out.printf("Enter your number between %s and %s:", min, max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max){
            getDouble(min,max);
        }
        return userInput;
    }

    public static double getDouble(){
        System.out.println("Enter an decimal number:");
        double userInput = Double.valueOf(scanner.nextDouble());
        return userInput;
    }
// Bonus exception and error handling
    public static String getBinary(){
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        String toBinary = Integer.toString(userNumber,2);
        return toBinary;

    }



}
