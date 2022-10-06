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
//String method practice
//        String input = "Hello Yogesh!";
//        System.out.println(input.equals("hello yogesh"));
//        System.out.println(input.equals("Hello Yogesh!"));
//        System.out.println(input.equalsIgnoreCase("hello yogesh!"));
//        System.out.println(input.equalsIgnoreCase("Hello yogesh!"));
//        System.out.println(input.startsWith("Hello"));
//        System.out.println(input.startsWith("Yogesh"));
//        System.out.println(input.endsWith("!"));
//        System.out.println(input.endsWith("Yogesh!"));
//        System.out.println(input.endsWith("yogesh!"));
//        System.out.println(input.charAt(1));
//        System.out.println(input.charAt(0));
//        System.out.println(input.indexOf("Hello"));
//        System.out.println(input.lastIndexOf('e'));
//        System.out.println(input.length());
//        System.out.println(input.replace("Hello", "Hi"));
//        System.out.println(input.substring(0,5));
//        System.out.println(input.toLowerCase());
//        System.out.println(input.toUpperCase());
//
//        String input2 = "  Hello Codeup ";
//        System.out.println(input2.trim());

    }
}
