package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        /* Ввести две строки с консоли. Определить, является ли одна строка
         *  перестановкой символов другой строки. Учитываем регистр */


        String str1, str2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        str1 = scan.nextLine();
        char[] arr1 = str1.toCharArray();

        System.out.println("Введите вторую строку");
        str2 = scan.nextLine();
        char[] arr2 = str2.toCharArray();

        scan.close();

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        arr1[i] = '\u0000';
                        arr2[j] = '\u0000';
                        break;
                    }
                }
            }
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Первая строка является перестановкой символов второй");
            } else {
                System.out.println("Первая строка не является перестановкой символов второй");
            }
        }
    }
}

