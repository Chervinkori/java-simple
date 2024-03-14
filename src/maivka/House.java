package maivka;

import java.time.LocalDate;

public class House {
    public int floors;
    public int yaer;
    public int name;

    public void setValues(int floors, int yaer, int name) {
        this.floors = floors;
        this.yaer = yaer;
        this.name = name;

    }

    public void displayValues() {
        System.out.println("Серия дома: " + name);
        System.out.println("Год постройки: " + yaer);
        System.out.println("Кол-во этажей: " + floors);
    }

    public void yaersBildt(){

        int currYaer = LocalDate.now().getYear();
        int yaers = 0;
        int buildYaer = yaer;

        while (buildYaer < currYaer) {
            buildYaer++;
            yaers++;
        }
        System.out.println("Дому: " + yaers + " лет.");
    }

}