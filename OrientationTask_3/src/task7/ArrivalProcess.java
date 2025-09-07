package task7;

import java.util.List;
import distributions.Uniform; // or Uniform

public class ArrivalProcess {
    private String eventType;
    private Uniform generator;
    private int customerCounter =1;


    public ArrivalProcess(String eventType, double minInterval, double maxInterval){
        this.eventType = eventType;
        this.generator = new Uniform(minInterval, maxInterval);
    }
    // new event is added
    public void addEvent(List<Event> eventList, double currentTime){
        double interval = generator.sample(); //generate random number
        double eventTime = currentTime + interval;
        Customer customer = new Customer (customerCounter++, eventTime);
        Event newEvent = new Event(eventTime, EventType.ARRIVAL, customer );
        eventList.add(newEvent);
    }
}

