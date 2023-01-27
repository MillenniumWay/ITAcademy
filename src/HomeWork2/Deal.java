package HomeWork2;

import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        int cards = 5;
        int players = 0;



        String[] suit = { "Spades", "Diamonds", "Hearts", "Clubs" };

        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };



        // Колода 52а листа

        int n = suit.length * rank.length;



        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");

            if (sc.hasNextInt()) {

                players = sc.nextInt();

                if (cards * players <= n) {
                    break;

                } else {
                    if (players == 0) {

                        System.out.println("В игре не может быть 0 игроков.");
                        break;

                    } else if (players < 0) {

                        System.out.println("Число игроков не может быть меньше 0 ");

                    } else {

                        System.out.println("Много игроков!");
                    }
                }

            } else {
                System.out.println("");

            }
        }


        // Формирование колоды

        String[] deck = new String[n];

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {

                deck[suit.length * i + j] = rank[i] + " " + suit[j];


            }

        }

        for (int i = 0; i < n; i++) {


            // Перетасовка колоды с рандомом

            int r = i + (int) (Math.random() * (n - i));



            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // Вывод колоды на экран

        for (int i = 0; i < players * cards; i++) {
            System.out.println(deck[i]);
            if (i % cards == cards - 1)
                System.out.println();
        }
    }
}




