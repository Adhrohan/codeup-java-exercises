import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        highLow(6);

    }
    public static void highLow(int num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
        int guessNUmber = (int)Math.floor(Math.random()*num+1);
        if (userInput < 1 || userInput > 100){
            System.out.println("Your input is not in the range");
        }


    }

}
