package maivka.dz11;

public abstract class Animal {
    public String name;

    public Animal(String name) {
    this.name = name;
    }

    public abstract void makeNoise();
    public abstract void eat();
    public abstract String getDescription();
}

