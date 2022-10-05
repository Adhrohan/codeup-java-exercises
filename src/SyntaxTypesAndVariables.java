public class SyntaxTypesAndVariables {

    public static void main(String[] args) {
        int myFavoriteNumber = 619;
        String myString = "Yogesh";
        char newString;
        newString = 'Y';
        double string = 3.14159;
//        long myNumber;
//        myNumber = 3.14;
//        myNumber = 123L;
//        myNumber = 123;
        float myNumber;
        myNumber = (float) 3.14;
        double myNewNumber = myNumber;
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // value is increased after and printed.
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //value is increased first and then printed.
//        int class;
        //class is a reserved word in java and cannot be defined as an identifier.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
        System.out.println("Favorite int number is " + myFavoriteNumber);
        System.out.println("Name as a string " + myString);
        System.out.println(newString);
        System.out.println(string);
        System.out.println(myNumber);
        System.out.println(myNewNumber);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);




    }

}
