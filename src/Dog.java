public class Dog extends Animal implements Printable{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {
        System.out.println("\nDog" + "---Name:" + getName() +
                "\nAge:" + getAge() +
                "\nBreed:" + breed);

    }
}
