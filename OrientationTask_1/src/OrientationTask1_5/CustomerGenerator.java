package OrientationTask1_5;

public class CustomerGenerator {
    private ServicePoint servicePoint;

    public CustomerGenerator(ServicePoint sp) {
        this.servicePoint = sp;
    }

    // Generate n customers at program start
    public void generateCustomers(int n) {
        for (int i = 0; i < n; i++) {
            Customer c = new Customer();
            servicePoint.addToQueueue(c);
        }
    }
}

// to demonstrate the functionality
class Main {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator(servicePoint);

        // Create 5 customers initially
        generator.generateCustomers(5);

        // Start serving
        servicePoint.serve();
    }
}
