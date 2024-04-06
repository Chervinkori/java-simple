package panov.Dz10.Animals;

/*
2.1. Создать класс Animal и расширяющие его абстрактные классы Dog, Cat, Bear.
2.2. Класс Animal содержит переменную name и абстрактные методы makeNoise, eat, getDescription.
Метод makeNoise, например, может выводить на консоль звуки животных.
Метод  eat выводит на консоль список того, чем питается данное животное.
Метод getDescription возвращает описание животного.
2.3. Dog, Cat, Bear переопределяют методы makeNoise, eat, getDescription.
2.4. Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
Пусть этот метод распечатывает name и описание пришедшего на прием животного.
2.5. В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
В цикле отправляйте их на прием к ветеринару. В отдельном цикле вызовите методы  makeNoise, eat для каждого животного.
 */

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public abstract String getDescription();
}