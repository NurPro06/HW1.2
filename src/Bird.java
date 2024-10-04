public class Bird extends Animal implements Printable{
    private int wingspan;

    public Bird(String name, int age, int wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    @Override
    public void print() {
        System.out.println("\nBird" + "---Name:" + getName() +
                "\nAge:" + getAge() +
                "\nWingspan:" + wingspan + "cm" );

    }
}
