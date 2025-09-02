package task3;

import java.time.LocalDateTime;

public class EventTest {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // a) Generate events with types
        eventList.addEvent(new Event("Train arrives", LocalDateTime.of(2025, 9, 3, 8, 0), EventType.ARRIVAL));
        eventList.addEvent(new Event("Passenger exits", LocalDateTime.of(2025, 9, 3, 8, 5), EventType.EXIT));
        eventList.addEvent(new Event("Bus arrives", LocalDateTime.of(2025, 9, 3, 9, 0), EventType.ARRIVAL));
        eventList.addEvent(new Event("Driver exits", LocalDateTime.of(2025, 9, 3, 9, 15), EventType.EXIT));

        // b) Remove and print the next event
        System.out.println("Next event to process:");
        System.out.println(eventList.getNextEvent());

        // c) Print remaining events in chronological order
        System.out.println("\nRemaining events in order:");
        for (Event e : eventList.getOrderedEvents()) {
            System.out.println(e);
        }
    }
}


