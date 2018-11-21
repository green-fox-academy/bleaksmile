package Animal;

public abstract class Animal {
    String name;
    int age;
    String gender;
    String color;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();

    public abstract void eat();
}
