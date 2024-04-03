package maivka.dz11;

public class Usec extends Animal {
    public Usec(String name){
        super(name);
    }
    @Override
    public void makeNoise() {
        System.out.println(name + " чё то там пендосит...");
    }

    @Override
    public void eat() {
        System.out.println(name + " хавает: MRE.");

    }

    @Override
    public String getDescription() {
        return "Юсека по прозвищу " + name;
    }
}
