package HomeWork3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTask {
    static Pattern patternA = Pattern.compile("[0-3][0-9]/[0-1][0-9]/" + "\\d{4}");
    static Pattern patternB = Pattern.compile("[0-3][0-9]-[0-1][0-9]-" + "\\d{4}");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String str = sc.nextLine();
        Matcher matcherA = patternA.matcher(str);
        Matcher matcherB = patternB.matcher(str);

        if (matcherA.matches()) {
            System.out.println("Ввведена дата в формате dd/MM/yyyy");
        } else if (matcherB.matches()) {
            System.out.println("Введена дата в формате dd-MM-yyyy");
        } else
            System.out.println("Дата введена неверно");

        sc.close();

    }
}

