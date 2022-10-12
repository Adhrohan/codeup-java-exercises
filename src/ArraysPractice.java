public class ArraysPractice {
    public static void main(String[] args) {
        // using the array initializer syntax
        String[] beatles = {"John", "Paul", "Ringo"};
        System.out.println(beatles.length);
        System.out.println(beatles[0]); // "John"
        System.out.println(beatles[1]); // "Paul"
        System.out.println(beatles[2]); // "Ringo"
        //System.out.println(beatles[3]); // Error Index 3 out of bounds for length 3

        // Iterating through property of an array using for loop.
        String[] languages = {"html", "css", "javascript", "java"};

        for (int i = 0; i < languages.length; i++){
            System.out.println(languages[i]);
        }

        // forEach loop
        String[] codings = {"python", "c#", "javascript", "java"};

        for (String coding : codings
             ) {
            System.out.println(coding);
        }
    }
}
