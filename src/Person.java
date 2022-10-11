import java.util.Scanner;

// defining a person class and creating an instance of it.
 public class Person {

    public static void main(String[] args) {

        Person yogesh = new Person();
        yogesh.name = "Yogesh";
        System.out.println(yogesh.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your new name?");
        String newName = scanner.nextLine();
        yogesh.setName(newName);
        yogesh.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    };

    private String name;
    public String getName(){
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    };

    public void sayHello(){
        System.out.printf("hello, %s!%n", name);
    }

    //    public String firstName;
//    public String lastName;
//
//    public String sayHello(){
//        return String.format("Hello from %s %s!", firstName, lastName);
//     }
//
//     public static void main(String[] args) {
//         Person rick = new Person();
//         rick.firstName = "Rick";
//         rick.lastName = "Sanchez";
//         System.out.println(rick.sayHello());
//
//         Person ada = new Person();
//         ada.firstName = "Ada";
//         ada.lastName = "Lovelace";
//         System.out.println(ada.sayHello());
//
//         System.out.println(Math.PI);
//
//         Person theBestDrummerAlive = new Person();
//         theBestDrummerAlive.name = "Neil Peart";
//
//         Person.worldPopulation += 1;
//         System.out.println(Person.worldPopulation);
//         System.out.println(theBestDrummerAlive.worldPopulation);
//     }
//
//     public static long worldPopulation = 750000000L;
//     public String name;


}

