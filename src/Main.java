public class Main  {
    public static void main(String[] args) {
       Dog d = new Dog("Kramer", "rottweiler", "platinum", 30); // constructor

        System.out.println("The dog name is" + " " + d.getName() + " " + "and the breed is" + " "+ d.getBreed() + " " + "and the age is" + " "+ d.getAge() + " " + "with a" + " " + d.getMembership() + " " + "membership");


    }
}