import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        highLow(50);

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
        else {
            if (userInput == num){
                System.out.println("good guess");
                System.out.printf("guess number was %d.%n", guessNUmber);
            }
            if (userInput < num){
                System.out.println("Higher");
            }
            if (userInput > num){
                System.out.println("Lower");
            }
        }


    }

}
