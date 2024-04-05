package panov.Dz10.Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("mr. Кот, ");
        animals[1] = new Dog("Собака-Улыбака, ");
        animals[2] = new Bear("Вася Влажный, ");

        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }
    }
}
