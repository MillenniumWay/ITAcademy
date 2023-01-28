package HomeWork3.DealShop;
import java.util.Scanner;
public class Settings {
        public static void start(Scanner scan, Deal deal) {
        System.out.println("Доступные функции - 4 " );
        System.out.println("1 - Показать товар доступный в магазине");
        System.out.println("2 - Добавить товар в корзину");
        System.out.println("3 - Просмотреть вашу коризну");
        System.out.println("4 - Оплатить ваши покупки");
        System.out.println("Вы были перенаправлены в меню ");
            while (true) {
            int swit = scan.nextInt();

            switch (swit) {
                case 1 -> {
                    deal.printStock(deal.products);
                }

                case 2 -> {
                    deal.AddToBucket(deal.bucket);
                }

                case 3 -> {
                  deal.printBucket(deal.bucket);
                }

                case 4 -> {
                    deal.printReceipt(deal.bucket);
                }

                default -> System.out.println("Вы ввели что-то не то :( ");

            }
        }
    }
}

