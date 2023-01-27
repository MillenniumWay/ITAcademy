package HomeWork2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String wordX;

        String WordY;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите первое слово состоящее из четного числа букв: ");
            wordX = scan.next();
        } while (wordX.length() % 2 != 0);

        do {
            System.out.print("Введите второе слово состоящее из четного числа букв:: ");
            WordY = scan.next();
        } while (WordY.length() % 2 != 0);

        String subs = new String(
                wordX.substring(0, wordX.length() / 2) + WordY.substring(WordY.length() / 2, WordY.length()));

        System.out.println("Ваше слово :" + subs);
        scan.close();
    }

}
