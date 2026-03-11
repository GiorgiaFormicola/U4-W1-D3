package exercise3;

import java.time.LocalDateTime;


public class Customer {
    private static int customersCount;
    //ATTRIBUTES LIST
    private int code;
    private String nameAndSurname;
    private String email;
    private LocalDateTime registeredAt;

    // CONSTRUCTORS LIST
    public Customer(String name, String surname, String email) {
        this.code = customersCount;
        this.nameAndSurname = name + " " + surname;
        this.email = email;
        this.registeredAt = LocalDateTime.now();
        Cart cart = new Cart(this.code);
        customersCount++;
    }

    // GETTERS LIST
    public void getInfo() {
        System.out.println(toString());
    }

    //METHODS LIST
    @Override
    public String toString() {
        return "Customer" + code + " {" +
                " \n code = " + code +
                ", \n name = " + nameAndSurname +
                ", \n email = " + email +
                ", \n registeredAt = " + registeredAt +
                "\n}";
    }
}
