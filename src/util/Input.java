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



}
