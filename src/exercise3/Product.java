package exercise3;

public class Product {
    //ATTRIBUTES LIST
    private static int code = 32106;
    private static String description = "Bag";
    private static double price = 5;
    private static int availableItems = 0;

    //COSTRUCTORS LIST
    private Product() {
    }

    // GETTERS LIST
    public static void getInfo() {
        System.out.println("PRODUCT CODE: " + Product.code);
        System.out.println("PRODUCT DESCRIPTION: " + Product.description);
        System.out.println("PRODUCT DESCRIPTION: " + Product.price + " euro");
        System.out.println("PRODUCT AVAILABILITY: " + Product.availableItems + " items");
    }

    // METHODS LIST
    public static void addProduct() {
        availableItems++;
    }

    public static void removeProduct() {
        availableItems--;
    }


}
