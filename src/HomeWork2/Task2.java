package HomeWork2;

import java.util.Scanner;

public class Task2 {
    static Scanner sc = new Scanner(System.in);


    /*Задание 2. Ввести n слов с консоли. Найти слово, в котором число различных
     * символов минимально. Если таких слов несколько,
     * Найти первое из них. */

    public static void main(String[] args) {
        System.out.println("Введите количество слов: ");
        int equ = sc.nextInt();
        String[] arr = new String[equ]; // Массив количества

        for (int i = 0; i < equ; i++) {
            System.out.printf("Введите слово: ", i + 1);
            arr[i] = sc.next();
        }

        int[] unique = new int[arr.length]; // Массив слов Пользователя

        for (int i = 0; i < arr.length; i++) {
            char[] word = arr[i].toCharArray();
            int[] counter = new int[256];
            for (char c : word) {
                counter[c]++;
                if (counter[c] == 1) {
                    unique[i]++;
                }
            }
        }

        int min = unique[0];
        int minIndex = 0;

        for (int l = 0; l < unique.length; l++) {
            if (min > unique[l]) {
                min = unique[l];
                minIndex = l;
            }
        }

        System.out.println(" A Первое слово с минимальным количеством различных символов: " + arr[minIndex]);
        System.out.printf(" B Количество уникальных символов в слове: " + unique[minIndex], arr[minIndex]);
    }
}


