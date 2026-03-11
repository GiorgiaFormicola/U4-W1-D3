package exercise3;

import java.util.Arrays;

public class Cart {
    //ATTRIBUTES LIST
    private int customerCode;
    private Product[] productsList;
    private double total;

    //CONSTRUCTORS LIST
    public Cart(int customerCode) {
        this.customerCode = customerCode;
        this.productsList = new Product[0];
        this.total = 0;
    }

    //METHOD LIST
    @Override
    public String toString() {
        return "Cart customer+" + customerCode + " {" +
                ",\n productsList=" + Arrays.toString(productsList) +
                ",\n total=" + total +
                '}';
    }
}
