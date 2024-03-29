package panov.DZ9;

import javax.xml.namespace.QName;
import java.util.Arrays;

/**
 * ДЗ:
 * 1. Создайте класс Phone, который содержит переменные number, model и weight.
 * 2. Создайте три экземпляра этого класса.
 * 3. Выведите на консоль значения их переменных.
 * 4. Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 * 5. Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
 * Вызвать этот метод.
 * 6. Создать метод sendMessage с аргументами переменной длины.
 * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 * 7. Метод выводит на консоль номера этих телефонов.
 * 7. Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * 8. Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
 * 9. Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
 * Если средняя оценка студента равна 5, то сумма 2000 грн, иначе 1900. Переопределить этот метод в классе Aspirant.
 * Если средняя оценка аспиранта равна 5, то сумма 2500 грн, иначе 2200.
 * 10. Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
 */
public class Phone {
    int number;
    int weight;
    String model;

    //Task 4
    public void receiveCall(String model) {
        System.out.println("Звонит " + model);
    }

    public void getNumber(int number) {
        System.out.println(number);
    }

    //Task 5
    public void receiveCall(String model, int number) {
        System.out.println(model + " " + number);
    }

    //Task 6
    public void sendMessage(int... number) {
        System.out.println(Arrays.toString(number));
    }
}

