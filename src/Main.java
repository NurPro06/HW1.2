public class Main {
    public static void main(String[] args) {
        Printable dog = createObject("Dog");
        Printable cat = createObject("Cat");
        Printable bird = createObject("Bird");

        Printable[] animals = {dog, cat, bird};

        for (Printable animal : animals) {
            animal.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Dog":
                return new Dog("Max", 5, "Golden Retriever");
            case "Cat":
                return new Cat("Garfild", 3, "White");
            case "Bird":
                return new Bird("Volt", 1, 25);
            default:
                return null;
        }
    }
}