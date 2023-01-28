package HomeWork3.DealShop;

public class People {
    String role;
    double cash;

    public People(String role, double cash) {
        this.role = role;
        this.cash = cash;
    }


    @Override
    public String toString() {
        return "People{" +
                "role='" + role + '\'' +
                ", cash=" + cash +
                '}';
    }
}
