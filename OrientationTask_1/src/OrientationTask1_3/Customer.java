package OrientationTask1_3;

public class Customer {
    private static int lastCustomerId = 0;

    private int id;
    private long startTime;
    private long endTime;

    //  Default Constructor for real-time scenarios where we track actual time
    public Customer() {
        lastCustomerId++;
        this.id = lastCustomerId;
        this.startTime = System.nanoTime(); // Sets automatically start time into current time in nanoTime.
    }

    // getters
    public int getId() {
        return id;
    }
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    // setters
    public void setStartTime(long startTime) {
        this.startTime = startTime;

    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    //methods
    public long getTimeSpent() {
        if (endTime == 0) {
            return -1;          // simply for error handling
        }
        return (endTime - startTime) / 1000000000; // convert nanoseconds to seconds
    }
    // method to set end time to current time
    public void endService() {
        endTime = System.nanoTime();
    }



    @Override
    public String toString() {
        return "Customer [id = " + id + ", " +
                "startTime = " + startTime + ", " +
                "endTime = " + endTime + ", " +
                "timeSpent = " + getTimeSpent() + " seconds" + "]";

    }
}

// main to demonstrate the functionality

class Main{
    public static void main(String[] args) {
        System.out.println("---- Customer Class Test Program ----\n");

        System.out.println("Creating first customer...");

        try {
            Customer customer1 = new Customer();
            customer1.setStartTime(System.nanoTime());
            Thread.sleep(1000); // stimulate 1 second of processing
            customer1.endService(); // record end time
            System.out.println(customer1);

            Customer customer2 = new Customer();
            customer2.setStartTime(System.nanoTime());
            Thread.sleep(500);  // 0.5 sec of processing
            customer2.endService();
            System.out.println(customer2);
        }
        catch ( InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}