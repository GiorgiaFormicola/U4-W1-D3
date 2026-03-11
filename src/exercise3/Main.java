package exercise3;

public class Main {
    public static void main(String[] args) {
        Product.getInfo();
        Product.addProduct();
        Product.getInfo();
        Product.removeProduct();
        Product.getInfo();

        Customer customer1 = new Customer("Mario", "Rossi", "mariorossi@gmail.com");

    }
}
