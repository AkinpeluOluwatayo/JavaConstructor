public class Dog  {
    private String name;
    private String breed;
    private int age;
    private String membership;

    public Dog(String name, String breed, String membership, int age) { //constructor
        setName("kramer");
        setBreed("rottweiler");
        setAge(30);
        setMembership("platinum");
    }

    public Dog() {

    }

    //setter and getter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setAge(int age){

        this.age = age;
    }
    public int getAge(){

        return age;
    }
    public void setMembership(String membership){
        this.membership = membership;
    }
    //overloading using enum class
    public void setMembership(Membership membership){
        this.membership = membership.name();
    }

    public enum Membership {
        bronze, silver, platinum;
    }

    public String getMembership(){
        return membership;
    }



}
