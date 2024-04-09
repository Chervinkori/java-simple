package maivka.dz11;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Шарик");
        animals[1] = new Cat("Мурзик");
        animals[2] = new Usec("Служивый");

        Veterinar vet = new Veterinar();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }
    }
}