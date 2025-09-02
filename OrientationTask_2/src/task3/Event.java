package task3;

import java.time.LocalDateTime;

public class Event implements Comparable<Event> {
    private String name;
    private LocalDateTime eventTime;
    private EventType eventType;

    public Event(String name, LocalDateTime eventTime, EventType eventType) {
        this.name = name;
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Event other) {
        return this.eventTime.compareTo(other.eventTime);
    }
    @Override
    public String toString() {
        return "[" + eventType + "] " + name + " at " + eventTime;
    }
}
