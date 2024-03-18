package org.example;

import maivka.House;
import maivka.Phone;

public class Main {
    public static void main(String[] args) {
//        House();
        Phone();


    }

    public static void House() {
        House house = new House();
        house.setValues(12, 1994, 134);

        house.displayValues();
        house.yaersBildt();
    }

    public static void Phone() {

        Phone phone1 = new Phone(123456789, "iPhone 14", 0.2);
        Phone phone2 = new Phone(542547546, "Samsung Galaxy S23", 0.25);
        Phone phone3 = new Phone(431242556, "Google Pixel 6", 0.18);

        System.out.println("Телефон:1");
        phone1.info();
        phone1.receiveCall("Рома", phone3.getNumber());
//        System.out.println("Номер телефона: " + phone3.getNumber());
        System.out.println();
        System.out.println("Телефон:2");
        phone2.info();
        phone2.receiveCall("Алёша", phone1.getNumber());
//        System.out.println("Номер телефона: " + phone1.getNumber());
        System.out.println();
        System.out.println("Телефон:3");
        phone3.info();
        phone3.receiveCall("Вася", phone2.getNumber());
//        System.out.println("Номер телефона: " + phone2.getNumber());

        System.out.println();
        phone1.sendMessage(phone3.numbers, phone1.numbers, phone2.numbers);
    }


}

