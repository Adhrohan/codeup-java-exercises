package javaPractice;

public class review {
    public static void main(String[] args) {
        System.out.println(circumference(5));
        System.out.println(circumference1(5));
        System.out.println(total(100,10));

    }
    public static double circumference(double r){
        return 2 * Math.PI * r;
    }

    public static int circumference1(int r){

         double circumference1 = (2 * Math.PI * r);
         return (int) circumference1;
    }

    public static double total(double bill, double tipPercentage){
        return bill + ((tipPercentage/100)*bill);
    }

//    public static void even(int[] numbers){
//        if (numbers % 2 == 0){
//            return numbers;
//        }
//    }


}
