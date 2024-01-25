public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new DataBaseLogger());
        customerManager.add(new FileLogger());
        customerManager.add(new EmailLogger());
    }
}