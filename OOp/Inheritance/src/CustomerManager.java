public class CustomerManager {
    public void add(Customer customer) {
        System.out.println(customer.customerNumber+ " kaydedildi.");
    }
    public void addMultiple(Customer[] customer){
        for(Customer customers : customer){
            add(customers);
        }
    }
}
