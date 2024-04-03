package maivka.dz11;

 public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

     @Override
     public void makeNoise() {
         System.out.println(name + " лает: гав-гав!");

     }

     @Override
     public void eat() {
         System.out.println(name + " ест: мясо.");
     }

     @Override
     public String getDescription() {
         return "Собаку по имени " + name;
     }

 }
