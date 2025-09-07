package task7;

import java.util.Queue;
import java.util.LinkedList;

public class ServicePoint {
    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer c) {
        queue.add(c);
    }

    public void processCustomer(double currentTime) {
        if (!queue.isEmpty()) {
            Customer c = queue.poll();
            c.departureTime = currentTime;
            double timeSpent = c.departureTime - c.arrivalTime;
            System.out.println("Customer " + c.id + " spent " + timeSpent + " time units in system.");
        }
    }

    public boolean hasCustomers() {
        return !queue.isEmpty();
    }
}
