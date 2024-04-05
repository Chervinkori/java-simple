package panov.Dz10.Animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " мay");
    }

    @Override
    public void eat() {
        System.out.println(name + " что это ты мне такое суешь, мразь?");
    }

    @Override
    public String getDescription() {
        return "киса - такая киса ";
    }
}
