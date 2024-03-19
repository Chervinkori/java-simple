package panov.DZ9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 2
        Phone iphone = new Phone();
        iphone.number = 999;
        iphone.weight = 250;
        iphone.model = "3gs";

        Phone nokia = new Phone();
        nokia.number = 905;
        nokia.weight = 100;
        nokia.model = "N92";

        Phone samsung = new Phone();
        samsung.number = 911;
        samsung.weight = 175;
        samsung.model = "S24";

        //Task 3
        System.out.println("-----------Задача 3-----------");
        System.out.println(iphone.number + " " + iphone.weight + " " + iphone.model);
        System.out.println(nokia.number + " " + nokia.weight + " " + nokia.model);
        System.out.println(samsung.number + " " + samsung.weight + " " + samsung.model);

        //Task 4
        System.out.println("-----------Задача 4-----------");
        samsung.receiveCall(samsung.model);
        nokia.receiveCall(nokia.model);
        iphone.receiveCall(iphone.model);

        samsung.getNumber(samsung.number);
        nokia.getNumber(nokia.number);
        iphone.getNumber(iphone.number);

        //Task 5
        System.out.println("-----------Задача 5-----------");
        samsung.receiveCall(samsung.model, samsung.number);
        nokia.receiveCall(nokia.model, nokia.number);
        iphone.receiveCall(iphone.model, iphone.number);

        //Task 7
//        System.out.println("-----------Задача 7-----------");
//        System.out.println();
    }
}
