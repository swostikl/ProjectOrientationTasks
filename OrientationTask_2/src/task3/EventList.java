package task3;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;

public class EventList {
    private PriorityQueue<Event> queue;

    public EventList() {
        queue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        queue.add(event);
    }

    public Event getNextEvent() {
        return queue.poll();
    }

    public List<Event> getOrderedEvents() {
        PriorityQueue<Event> copy = new PriorityQueue<>(queue);
        List<Event> ordered = new ArrayList<>();
        while (!copy.isEmpty()) {
            ordered.add(copy.poll());
        }
        return ordered;
    }
}
