public class MethodLecture {
    public static void main(String[] args) {
        System.out.println("answer");
//        sayHello("hello", "Yogesh");
        String greeting = "Hello";
        String name = "Yogesh";
        sayHello(greeting, name);
        count(5);
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

}


