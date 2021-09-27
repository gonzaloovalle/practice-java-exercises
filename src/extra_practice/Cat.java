package extra_practice;

public class Cat extends Pet implements Meowable {
    private String color;

    public Cat(int catAge, boolean catIsRescue, String catName, String color) {
        super(catAge, catIsRescue, catName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void Meow() {
        System.out.println("This is a meow!");
    }
}
