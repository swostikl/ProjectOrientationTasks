package OrientationTask1_5;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    // Add customer to queue
    public void addToQueueue(Customer a) {
        queue.add(a);
    }

    // Remove customer from queue
    public Customer removeFromQueueue() {
        if (!queue.isEmpty()) {
            return queue.removeFirst();
        }
        return null;
    }

    // Serve all customers in order
    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueueue();

            if (customer != null) {
                long serviceStart = System.nanoTime();
                customer.setServiceStartTime(serviceStart);

                // Random service time 500–2000ms
                long serviceTime = (long) (500 + Math.random() * 1500);

                try {
                    Thread.sleep(serviceTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                customer.endService();

                // Print times
                System.out.println("Customer #" + customer.getId() + " served:");
                System.out.println("  Waiting time: " + String.format("%.2f", customer.getWaitingTimeMs()) + " ms");
                System.out.println("  Service time: " + String.format("%.2f", customer.getServiceTimeMs()) + " ms");
                System.out.println("  Response time: " + String.format("%.2f", customer.getResponseTimeMs()) + " ms\n");
            }
        }
        System.out.println("=== All customers served ===");
    }
}

