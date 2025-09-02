package task2;

import java.time.LocalDateTime;

public class Event implements Comparable<Event> {
    private String name;
    private LocalDateTime eventTime;

    public Event(String name, LocalDateTime eventTime) {
        this.name = name;
        this.eventTime = eventTime;
    }

    public String getName() {
        return name;
    }
    public LocalDateTime getEventTime() {
        return eventTime;
    }
    @Override
    public int compareTo(Event other) {
        return this.eventTime.compareTo(other.eventTime);
    }

    @Override
    public String toString() {
        return "Event{name='" + name + "', eventTime=" + eventTime + '}';
    }


}
