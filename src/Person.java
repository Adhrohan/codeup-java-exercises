

// defining a person class and creating an instance of it.
 class Person {
    public static void main(String[] args) {

        Person yogesh = new Person();
        yogesh.name = "Yogesh";
        System.out.println(yogesh.getName());
    }
    public String name;
    public String getName(){
        return String.format(name);
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

