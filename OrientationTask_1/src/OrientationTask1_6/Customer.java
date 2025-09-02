package OrientationTask1_6;

public class Customer {
    private static int lastId = 0;

    private int id;
    private long arrivalTime;
    private long startTime;
    private long endTime;
    private long serviceTime;  // the simulated service time (sleep time)

    public Customer() {
        lastId++;
        this.id = lastId;
        this.arrivalTime = System.nanoTime(); // time when created
    }

    public int getId() { return id; }
    public long getArrivalTime() { return arrivalTime; }
    public void setStartTime(long t) { this.startTime = t; }
    public void setEndTime(long t) { this.endTime = t; }
    public void setServiceTime(long t) { this.serviceTime = t; }

    public long getServiceTime() { return serviceTime; }

    public double getWaitingTimeMs() {
        return (startTime - arrivalTime) / 1000000.0;
    }

    public double getResponseTimeMs() {
        return (endTime - arrivalTime) / 1000000.0;
    }
}

