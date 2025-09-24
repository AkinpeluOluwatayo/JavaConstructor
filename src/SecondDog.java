public class SecondDog extends Dog{
    private boolean verified = false;

    public SecondDog(String name, String breed, String membership, int age) {
        super(name, breed, membership, age);
    }


    public void  setVerified(boolean verified){
        this.verified = verified;
     }

    public boolean getVerified() {
        return verified;
    }
}
