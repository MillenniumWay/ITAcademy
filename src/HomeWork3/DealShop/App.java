package HomeWork3.DealShop;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Product cola = new CocaCola("Coca-Cola.Original", 3.99, 5, 1);
        Product colaCherry = new CocaColaCherry("Coca-Cola.Cherry", 4.99, 5, 2);
        Product cheetos = new Cheetos("Cheetos.Original", 1.99, 10, 3);
        Product cheetosCheese = new CheetosCheese("Cheetos.Cheese", 2.99, 10, 4);
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Product> bucket = new ArrayList<>();
        products.add(cola);
        products.add(colaCherry);
        products.add(cheetos);
        products.add(cheetosCheese);
        People seller = new Seller("Seller", 1500);
        Deal deal = new Deal(products, bucket);

        Scanner sc = new Scanner(System.in);

        Settings.start(sc, deal);

        sc.close();
    }
}

