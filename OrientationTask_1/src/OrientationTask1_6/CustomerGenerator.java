package OrientationTask1_6;

public class CustomerGenerator {
    private ServicePoint sp;

    public CustomerGenerator(ServicePoint sp) {
        this.sp = sp;
    }

    public void generateCustomers(int n) {
        for (int i = 0; i < n; i++) {
            sp.addToQueueue(new Customer());
        }
    }
}

