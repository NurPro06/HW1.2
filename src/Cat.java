public class Cat extends Animal implements Printable{
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("\nCat" + "---Name:" + getName() +
                "\nAge:" + getAge() +
                "\nColor:" + color );

    }
}
