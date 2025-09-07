package task7;

class Event {
    double time;
    EventType type;
    Customer customer;

    public Event(double time, EventType type, Customer customer) {
        this.time = time;
        this.type = type;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Event[ type = " + type + ", time = " + time + ", Customer = " + customer + "]";
    }
}