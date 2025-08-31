package OrientationTask1_5;

public class Customer {
    private static int lastCustomerId = 0;

    private int id;
    private long arrivalTime;
    private long serviceStartTime;
    private long endTime;

    public Customer() {
        lastCustomerId++;
        this.id = lastCustomerId;
        this.arrivalTime = System.nanoTime(); // record arrival time
    }

    public int getId() {
        return id;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setServiceStartTime(long start) {
        this.serviceStartTime = start;
    }

    public void endService() {
        this.endTime = System.nanoTime();
    }

    // waiting time = service started - arrival
    public double getWaitingTimeMs() {
        return (serviceStartTime - arrivalTime) / 1000000.0;
    }

    // service time = end - service start
    public double getServiceTimeMs() {
        return (endTime - serviceStartTime) / 1000000.0;
    }

    // response time = waiting + service
    public double getResponseTimeMs() {
        return (endTime - arrivalTime) / 1000000.0;
    }
}



