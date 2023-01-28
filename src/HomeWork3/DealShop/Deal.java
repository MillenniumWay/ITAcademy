package HomeWork3.DealShop;
import java.util.ArrayList;
import java.util.Scanner;
public class Deal implements Info{
    public ArrayList<Product> products = new ArrayList<>();
    public ArrayList<Product> bucket = new ArrayList<>();

    public Deal(ArrayList<Product> products, ArrayList<Product> bucket) {
    this.products = products;
    this.bucket = bucket;
    }

    public void printStock(ArrayList<Product> products) {
        System.out.println("Наш ассортимент: ");
        for (Product app : products) {
            System.out.println(app);
        }
    }

    public void AddToBucket(ArrayList<Product> bucket) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер объекта : ");
        int numObj = sc.nextInt();
        if (numObj == 1) {
            System.out.println("Введите колличество: ");
            int quantityOfObject1 = sc.nextInt();
            if (quantityOfObject1 < 5 && quantityOfObject1 >= 1) {
                bucket.add(new Product("Coca-Cola.Original", 3.99, quantityOfObject1, 1));
                System.out.println("Вы успешно добавили продукт! ");
                if ( quantityOfObject1 > 5) {
                    System.out.println("В магазине нету столько товара!");
                }
            }
        }
        if (numObj == 2) {
            System.out.println("Введите колличество: ");
            int quantityOfObject2 = sc.nextInt();
            if (quantityOfObject2 < 5 && quantityOfObject2 >= 1) {
                bucket.add(new Product ("Coca-Cola.Cherry", 4.99, quantityOfObject2, 2));
                System.out.println("Вы успешно добавили продукт! ");
                if ( quantityOfObject2 > 5) {
                    System.out.println("В магазине нету столько товара!");
                }
            }
        }
        if (numObj == 3) {
            System.out.println("Введите колличество: ");
            int quantityOfObject3 = sc.nextInt();
            if (quantityOfObject3 < 5 && quantityOfObject3 >= 1) {
                bucket.add(new Product("Cheetos.Original", 1.99, quantityOfObject3, 2));
                System.out.println("Вы успешно добавили продукт! ");
                if ( quantityOfObject3 > 5) {
                    System.out.println("В магазине нету столько товара!");
                }
            }
        }
        if (numObj == 4) {
            System.out.println("Введите колличество: ");
            int quantityOfObject4 = sc.nextInt();
            if (quantityOfObject4 < 5 && quantityOfObject4 >= 1) {
                bucket.add(new Product("Cheetos.Cheese", 2.99, quantityOfObject4, 2));
                System.out.println("Вы успешно добавили продукт! ");
                if ( quantityOfObject4 > 5) {
                    System.out.println("В магазине нету столько товара!");
                }
            }
        }
    }
//    public static void calcPrice(ArrayList<Product> bucket) {
//      for(int i = 0; i < bucket.size(); i++) {
//          System.out.println(bucket.get(i).price * bucket.get(i).quantity);
//      }
//    }
    @Override
    public String toString() {
        return "DealMethodsForObjects [buckList=" + bucket + "]";
    }

    public void printBucket(ArrayList<Product> bucket) {
        System.out.println("В вашей корзине : ");
        for (Object a : bucket) {
            System.out.println(a);
        }

    }
    public static void printReceipt(ArrayList<Product> bucket) {
        double back = 0;
        double all = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Чтобы продолжить выберите способ оплаты");
        System.out.println("1 - Наличные");
        System.out.println("2 - Карта");
        int choice = scan.nextInt();
        int tempback;
        if (choice == 1) {
            while (count > bucket.size())
                System.out.println("К оплате - " + bucket.size() * (bucket.get(count).quantity * bucket.get(count).price) + " $ ");
            System.out.println("Введите колличество денег");
             back = scan.nextDouble();
        }
        if (choice ==2){
            while (count > bucket.size())
                System.out.println("К оплате - " + bucket.size() * (bucket.get(count).quantity * bucket.get(count).price) + " $ ");

        }

        String divider = "-----------------------------------------------";
        System.out.println("Name of product  |  Price of product | Quantity |  Amount  " + "\n" + divider);
        for (int i = 0; i < bucket.size(); i++) {
            System.out.println(bucket.get(i) + " - " + (bucket.get(i).price * bucket.get(i).quantity) + " $ ");
            all = bucket.size() * (bucket.get(i).price * bucket.get(i).quantity);

        }
        System.out.println(divider);
        System.out.println("All price - " + all + " $ ");
        System.out.println("Money back  " + (back - all) + " $ ");

    }

    }





