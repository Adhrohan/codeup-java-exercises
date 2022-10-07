import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade:");
        int grade = scan.nextInt();
        System.out.printf("You entered %d", grade);
    }
}
