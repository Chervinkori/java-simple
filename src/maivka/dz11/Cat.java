package maivka.dz11;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " мяукает: мяу-мяу!");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест: рыбу.");

    }

    @Override
    public String getDescription() {
        return "Кису по имени  " + name;
    }
}
