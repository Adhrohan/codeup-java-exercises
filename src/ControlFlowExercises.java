import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
//        Loop Basic
//         while loop
//        int whileNum = 5;
//        while (whileNum <= 15 ){
//            System.out.println(whileNum);
//            whileNum++;
//        }
//
//        //do while loop
//       int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//        }while (num < 100);
//        System.out.println(num);
//
//        //do while
//        int num1 = 100;
//        do {
//            System.out.println(num1);
//            num1 -= 5;
//        } while (num1 >= -10);

//        long num2 = 2;
//        do {
//            System.out.println(num2);
//            num2 *= num2;
//        }while (num2 <= 1000000);

        //forloop
//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        for (int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

        //fizzbuzz
//        for (int i = 1; i <= 100; i++){
//            System.out.println(i);
//            if (i % 3 == 0){
//                System.out.println("fizz");
//            }
//        };

//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0){
//                System.out.println("fizz");
//            }
//            else {
//                System.out.println(i);
//            }
//        };

        boolean calculation;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("choose a number from 1 to 5:");
            int userInput = scanner.nextInt();
            System.out.printf("Here is your table!%n");
            System.out.println("Nmber | Squared | Cubed");
            System.out.println("------------------------");

            for(int i = 1; i <= userInput; i++){
                System.out.printf(" %d | %d | %d %n", i, i*i, i*i*i);
            }
            System.out.println("Would you like to do more math?");
            String moreMath = scanner.next();
            if (moreMath.equalsIgnoreCase("yes")){
                calculation = true;
            }
            else {
                calculation = false;
            }
        }while (calculation);

    }
}
