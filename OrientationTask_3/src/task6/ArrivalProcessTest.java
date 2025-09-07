package task6;

import java.util.ArrayList;
import java.util.List;

public class ArrivalProcessTest {
    public static void main(String[] args) {
        List<Event> eventList = new ArrayList<>();
        ArrivalProcess arrivals = new ArrivalProcess("Customer",  1.0,5.0);

        double currentTime = 0.0;
        for (int i = 0; i < 10; i++) { // generate 10 events
            arrivals.addEvent(eventList, currentTime);
            // Move clock to the time of the last event
            currentTime = eventList.get(eventList.size() - 1).time;
        }

        // Print all events
        for (Event e : eventList) {
            System.out.println(e);
        }
    }
}
