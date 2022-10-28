import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String random1 = ServerNameGenerator.randomElement(adjectives);
        String random2 = ServerNameGenerator.randomElement(nouns);

        System.out.println("Yur server name is "+ "'"+random1+ " " + random2 + "'.");
    }

    public static String[] adjectives = {"fast", "slow", "quick", "average", "important","lazy","great","spectacular","bitter","classic" };
    public static String[] nouns = {"horse", "cat", "dog", "duck", "elephant","mountain","tesla","toyota","gmc","lamborghini"};

    public static String randomElement(String [] arr){
        int randomInt = new Random().nextInt(arr.length);
        return arr[randomInt];
    }


}
