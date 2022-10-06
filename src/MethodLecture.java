public class MethodLecture {
    public static void main(String[] args) {
        System.out.println("answer");
//        sayHello("hello", "Yogesh");
        String greeting = "Hello";
        String name = "Yogesh";
        sayHello(greeting, name);
        count(5);
        countBackwards(5);
        System.out.println(factorial(5));
        System.out.println(bunnyEars(4));
        System.out.println(fibonacci(6));

    }

    //Defining method and calling function
    public static double multiply(double num1, double num2){
        double answer = num1 * num2;
        return answer;
    }
    public static void sayHello(String greeting, String name){
        System.out.printf("%s, %s!\n", greeting, name);
    }

    //recursion
    public static void count(int n){
        if (n <= 0){
            System.out.println("all done.");
            return;
        }
        System.out.println(n);
        count(n-1);
    }

    //count backward using recursive method
    public static void countBackwards(int n){
        if (n == 0){
            System.out.println("all done");
        }
        else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }

    //factorial using recursion
    public static int factorial(int num){
        //base of recursion to stop iteration.
        if (num == 1){
            return num;
        }
        else {
            return num * factorial(num - 1);
        }
    }

    //total number of bunnies ears using recursion
    public static int bunnyEars(int bunnies){
        if (bunnies == 0){
            return 0;
        }
        else {
            return bunnies + bunnies;
        }
    };

    //fibonacci using recursion
    public static int fibonacci(int n)  {
        if (n < 2){
            return n;

        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


};




