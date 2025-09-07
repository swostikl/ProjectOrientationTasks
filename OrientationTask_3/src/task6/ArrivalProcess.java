package task6;

import java.util.List;
import distributions.Uniform;

public class ArrivalProcess {
    private String eventType;
    private Uniform generator; // actual random generator

    public ArrivalProcess(String eventType, double minInterval, double maxInterval){
        this.eventType = eventType;
        this.generator = new Uniform(minInterval, maxInterval);
    }
    // new event is added
    public void addEvent(List<Event> eventList, double currentTime){
        double interval = generator.sample(); //generate random number
        double eventTime = currentTime + interval;
        Event newEvent = new Event(eventTime, eventType);
        eventList.add(newEvent);
    }
}
