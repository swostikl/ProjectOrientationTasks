package OrientationTask1_6;

public class Main {
    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint();
        CustomerGenerator gen = new CustomerGenerator(sp);

        gen.generateCustomers(5); // make 5 customers
        sp.serve();               // serve them
    }
}
