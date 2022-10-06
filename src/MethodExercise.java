
public class MethodExercise {
    public static void main(String[] args) {

        addition(5, 7);
        subtraction(7,5);
        multiplication(5,7);
        division(10,5);
        modulus(7, 5);


    }

    //Addition method taking two parameters.
    public static void addition(int input1, int input2){
        int additionInput = input1 + input2;
        System.out.printf("Your result for the addition is: %d%n", additionInput);
    }

    //Subtraction method taking two parameter as an input.
    public static void subtraction(int input1, int input2){
        int subtraction = input1 - input2;
        System.out.printf("Your result for the subtraction is: %d %n", subtraction);
    }

    //Multiplication method taking two parameters.
    public static void multiplication(int input1, int input2){
        int multiplication = input1 * input2;
        System.out.printf("Your result for the multiplication is: %d %n", multiplication);
    }

    //Division method taking two parameters.
    public static void division(int input1, int input2){
        int division = input1 / input2;
        System.out.printf("Your result for the division is:%d %n", division);
    }

    //Modulus method taking two parameters.
    public static void modulus(int input1, int input2){
        int modulus = input1 % input2;
        System.out.printf("Your remainder for the numbers provided is:%d %n", modulus);
    }


}
