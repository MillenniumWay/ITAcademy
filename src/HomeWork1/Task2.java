package HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = "a";
        String type;
        int number;


        System.out.println("Введите тип данных: ");
        type = scan.next();
        System.out.println("Введите число: ");
        number = scan.nextInt();

        switch (type) {

            case "int":
                float del = number % 2;
                System.out.println("Остаток от деления : " + del);
                break;

            case "double":
                double g = number / 100;
                double r = g * 70;
                double s = number - r;
                double f = number - s;
                System.out.println("70% от вашего числа состовляет : " + f);
                break;


            case "float":
                float k = number * number;
                System.out.println("Число в квадрате: " + k);
                break;


            case "char":
                char ch = a.charAt(number);
                System.out.println(ch);
                break;


            case "String":
                System.out.println("Hello" + type);
                break;


            default :
                System.out.println("Unsupported type");

        }

    }
}


