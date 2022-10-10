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


    }

}
