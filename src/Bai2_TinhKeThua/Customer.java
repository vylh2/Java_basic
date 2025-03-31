package Bai2_TinhKeThua;

public class Customer extends Person{
    public Customer(String name, int age, float height, String phone) {
        super(name, age, height, phone);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Long", 35, 170.0F, "0123456789");
        customer.getInfo();
    }
}
