package org.example;

import maivka.House;

public class Main {
    public static void main(String[] args) {

        House house = new House();
        house.setValues(12, 1994, 134);

        house.displayValues();
        house.yaersBildt();

    }

}