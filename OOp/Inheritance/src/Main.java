public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        Customer customer1 = new IndividualCustomer();
        customer1.customerNumber = "12345";
        Customer customer2 = new CorporateCustomer();
        customer2.customerNumber = "67890";
        customerManager.add(customer1);
        customerManager.add(customer2);
        Customer[] customers = {customer1, customer2};
        customerManager.addMultiple(customers);

    }
}