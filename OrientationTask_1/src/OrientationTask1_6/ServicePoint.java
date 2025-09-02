package OrientationTask1_6;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    private long totalServiceTime = 0;
    private int served = 0;

    public void addToQueueue(Customer c) {
        queue.add(c);
    }

    public Customer removeFromQueueue() {
        if (!queue.isEmpty()) return queue.removeFirst();
        return null;
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer c = removeFromQueueue();
            long start = System.nanoTime();
            c.setStartTime(start);

            // service time = random 500–1500 ms
            long serviceTime = (long) (500 + Math.random() * 1500);
            c.setServiceTime(serviceTime);

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            c.setEndTime(System.nanoTime());

            // print info
            System.out.println("Customer " + c.getId());
            System.out.println("  Waiting: " + String.format("%.2f", c.getWaitingTimeMs()) + " ms");
            System.out.println("  Service: " + c.getServiceTime() + " ms");
            System.out.println("  Response: " + String.format("%.2f", c.getResponseTimeMs()) + " ms\n");

            totalServiceTime += serviceTime;
            served++;
        }

        if (served > 0) {
            double avg = (double) totalServiceTime / served;
            System.out.println("Average service time = " + String.format("%.2f", avg) + " ms");
        }
    }
}

