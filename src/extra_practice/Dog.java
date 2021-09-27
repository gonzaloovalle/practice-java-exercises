package extra_practice;

public class Dog extends Pet implements Barkable{
    private String breed;

    public Dog(int dogAge, boolean dogIsRescue, String dogName, String breed) {
        super(dogAge, dogIsRescue, dogName);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public void bark() {
        System.out.println("Bork bork!");
    }
}
