package panov.Dz10.Animals;

public class Bear extends Animal {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " что там оон про гондурас решил!?");
    }

    @Override
    public void eat() {
        System.out.println(name + " пьет водку");
    }

    @Override
    public String getDescription() {
        return "самая сильная нация ";
    }
}
