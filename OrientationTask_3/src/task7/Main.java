package task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        ServicePoint service = new ServicePoint();
        List<Event> eventList = new ArrayList<>();

        // Generate 10 arrival events
        ArrivalProcess arrivals = new ArrivalProcess("Arrival" , 1,5);
        for (int i = 0; i < 10; i++) {
            arrivals.addEvent(eventList, clock.getTime());
            // move clock to last event
            clock.setTime(eventList.get(eventList.size() - 1).time);
        }

        System.out.println("All events generated. Clock at: " + clock.getTime());

        // Process arrivals sequentially
        for (Event e : eventList) {
            service.addCustomer(e.customer);
        }

        // Advance clock by 5 units
        clock.advance(5.0);
        System.out.println("Clock advanced by 5 units. Current time: " + clock.getTime());

        // Process customers one by one
        while (service.hasCustomers()) {
            service.processCustomer(clock.getTime());
        }
    }
}
