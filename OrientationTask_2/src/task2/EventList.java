package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventQueue;

    public EventList() {
        eventQueue = new PriorityQueue<>();
    }
    public void addEvent(Event event) {
        eventQueue.add(event);
    }
    public Event getNextEvent() {
        return eventQueue.poll(); // retrieves and removes the next event
    }
    public List<Event> getOrderedEvents() {
       // create copy of the priority queue to avoid modifying the original
        PriorityQueue<Event> copyQueue = new PriorityQueue<>(eventQueue);
        List<Event> orderedEvents = new ArrayList<>();
        while (!copyQueue.isEmpty()) {
            orderedEvents.add(copyQueue.poll());
        }
        return orderedEvents;
    }
}
