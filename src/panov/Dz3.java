import java.sql.SQLOutput;
import java.util.Arrays;

public class Dz3 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 1, 564, 65, 90, 7, 3, 4, 5, 6, 8, 9, 0, 432, 123, 64375};
        for (int a = 0; a < numbers.length; a++) {
            System.out.println(numbers[a]);
        }
        task1(numbers);// 1. Напишите программу, чтобы проверить, является ли число 3 как первый или последний элемент массива целых чисел. Длина массива должна быть больше или равна двум.
        //System.out.println(Arrays.toString(numbers));
        task2(numbers); // 2. Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
        task3(numbers); // 3. Напишите программу, которая проверяет отсортирован ли массив по возрастанию. Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”.
        // task4(); // 4. Напишите метод, который меняет местами первый и последний элемент массива.
        // task5(); // 5. Дан массив чисел. Найдите первое уникальное в этом массиве число.
    }


    public static void task1(int[] array) {
        System.out.print("Task1:");
        if (array[0] == 3 || array[array.length - 1] == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void task2(int[] arra) {
        System.out.print("Task2:");
        for (int item : arra) {

            if (item == 1 || item == 3) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }

    public static void task3(int[] blo) {
        System.out.print("Task3:");
        for (int c = 0; c < blo.length - 1; c++) {
            if (blo[c] > blo[c + 1]) {
                System.out.println("OK");
            } else {
                System.out.println("Please, try again");
            }

        }

    }

}


