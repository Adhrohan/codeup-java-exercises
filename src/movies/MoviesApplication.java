package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "Enter a number to select option: ");
        int selectOption = Input.getInt();
        do {
            if (selectOption ==1){
                System.out.println(MoviesArray.findAll(""));
            }

        }while (selectOption != 0);




    }
}
