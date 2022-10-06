import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        boolean conversation = false;
        do {
            System.out.println("Ask question to Bob:");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")){
                System.out.println("Sure.");
            }
            else if (userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }
            else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            }
            else {
                System.out.println("whatever");
            }

        }while (conversation == true);


    }
}
