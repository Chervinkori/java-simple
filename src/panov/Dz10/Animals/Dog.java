package panov.Dz10.Animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " woof");
    }

    @Override
    public void eat() {
        System.out.println(name + " о! я буду-буду!");
    }

    @Override
    public String getDescription() {
        return "собака сутулая ";
    }
}
