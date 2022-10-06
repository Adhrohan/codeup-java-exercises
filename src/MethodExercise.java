
public class MethodExercise {
    public static void main(String[] args) {

        addition(5, 7);
        subtraction(7,5);


    }

    //Addition taking two parameters.
    public static void addition(int input1, int input2){
        int additionInput = input1 + input2;
        System.out.printf("Your result for the addition is: %d%n", additionInput);
    }

    //Subtraction taking two parameter as an input.
    public static void subtraction(int input1, int input2){
        int subtraction = input1 - input2;
        System.out.printf("Your result for the subtraction is: %d %n", subtraction);
    }


}
