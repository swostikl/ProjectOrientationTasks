package OrientationTask1_6;

public class AverageServiceTime {
    public static void main(String[] args) {
        int trials = 3; // how many times we run
        int nCustomers = 5;

        for (int t = 1; t <= trials; t++) {
            System.out.println("--- Trial " + t + "---");
            ServicePoint sp = new ServicePoint();
            CustomerGenerator gen = new CustomerGenerator(sp);

            gen.generateCustomers(nCustomers);
            sp.serve();
            System.out.println();
        }
    }
}

