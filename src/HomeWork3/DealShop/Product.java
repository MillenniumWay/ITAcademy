package HomeWork3.DealShop;

public class Product{
    String name;
    double price;
    int quantity;
    int id;


    Product(String name, double price, int quantity,int id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Product(Product name) {
        this.name = String.valueOf(name);
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                  name +
                " Price: "  + price +
                " ID: " + id +
                " Quantity: " + quantity;
    }

    public String getName() {
        return name;
    }
}
