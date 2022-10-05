
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
        for (int i = 5; i <= 15; i++){
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }

        for (int i = 100; i >= -10; i -= 5){
            System.out.println(i);
        }

    }
}
