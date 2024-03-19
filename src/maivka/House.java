package maivka;

import java.time.LocalDate;

public class House {
    public int floors;
    public int year;
    public int name;

    public void setValues(int floors, int year, int name) {
        this.floors = floors;
        this.year = year;
        this.name = name;

    }

    public void displayValues() {
        System.out.println("Серия дома: " + name);
        System.out.println("Год постройки: " + year);
        System.out.println("Кол-во этажей: " + floors);
    }

    public void yaersBildt(){

        int currYaer = LocalDate.now().getYear();
        int yaers = 0;
        int buildYaer = year;

        while (buildYaer < currYaer) {
            buildYaer++;
            yaers++;
        }
        System.out.println("Дому: " + yaers + " лет.");
    }

}