package task2;

import java.time.LocalDateTime;

public class EventTestProgram {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // Adding events
        eventList.addEvent(new Event("Event 1", LocalDateTime.of(2023, 10, 1, 10, 0)));
        eventList.addEvent(new Event("Event 2", LocalDateTime.of(2023, 9, 15, 9, 30)));
        eventList.addEvent(new Event("Event 3", LocalDateTime.of(2023, 11, 5, 14, 0)));

        // Retrieving and printing ordered events
        System.out.println("Ordered Events:");
        for (Event event : eventList.getOrderedEvents()) {
            System.out.println(event);
        }

        // Getting the next event
        System.out.println("\nNext Event:");
        System.out.println(eventList.getNextEvent());
    }
}
