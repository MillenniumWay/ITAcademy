package HomeWork1;

import java.util.Scanner;

public class Cat {




        String name = "Felix";
        int age = 12;
        int walletMove = 150;
        Scanner scan = new Scanner(System.in);

        public void nameAge() {
            System.out.println("Name of cat : " + name + " | Age : " + age);

        }

        public void grow() {
            do {
                if (age < 17) {
                }
                age++;
                System.out.println(" Felix grow !" + " He is : " + age + " Years " + " (After one year) ");

            } while (age < 13);

        }

        public void eat() {
            int eatj;
            System.out.println("Felix is hungry right now " + " Type on Console : 1 ");
            eatj = scan.nextInt();
            if (eatj == 1) {
                System.out.println("Felix say's Thank's !");
                if (eatj != 1) {
                    System.out.println("Felix is sad :( ");

                }

            }
        }

        public void sleep() {
            System.out.println("Felix is don't slepp right now");
        }

        public void money() {
            double wallet = 1000;
            for (int i = 1; i < 2; i++) {
                wallet = wallet + walletMove;
                System.out.println("In Felix's Wallet : " + wallet + "$ Dollars");
            }
        }

        public void walk() {
            System.out.println(name + "is walk to School :з");
        }

    }

