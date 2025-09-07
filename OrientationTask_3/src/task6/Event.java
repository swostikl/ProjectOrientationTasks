package task6;

class Event {
    double time;
    String type;

    public Event(double time, String type) {
        this.time = time;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event[ type = " + type + ", time = " + time + "]";
    }
}