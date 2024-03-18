package org.example;

import maivka.House;
import maivka.Phone;

public class Main {
    public static void main(String[] args) {

//        House house = new House();
//        house.setValues(12, 1994, 134);
//
//        house.displayValues();
//        house.yaersBildt();

        Phone phone1 = new Phone(123456789, "iPhone 14", 0.2);
        Phone phone2 = new Phone(542547546, "Samsung Galaxy S23", 0.25);
        Phone phone3 = new Phone(431242556, "Google Pixel 6", 0.18);

        phone1.info();
        System.out.println();
        phone2.info();
        System.out.println();
        phone3.info();

    }

}