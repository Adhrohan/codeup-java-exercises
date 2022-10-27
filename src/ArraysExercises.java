import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //This code will not give the properties of number array as properties of an arrays are defined by an index

        //System.out.println(numbers);

        //Arrays.toString method returns string representation of an array.
        System.out.println(Arrays.toString(numbers));

        String[] person = new String[3];
        System.out.println(person.length);
        person[0] = "Paul";
        person[1] = "Sam";
        person[2] = "John";

        //printing out the name of each person in the array
        for (String persons: person
             ) {
            System.out.println(persons);
        }

    }

    public static void addPerson(String[] person){

    }
}

