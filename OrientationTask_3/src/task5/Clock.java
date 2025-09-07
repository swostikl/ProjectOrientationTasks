package task5;

public class Clock {
    // The single instance
    private static Clock instance;

    // Internal time variable
    private double currentTime;

    // Private constructor
    private Clock() {
        currentTime = 0.0; // start at time 0
    }

    // Public method to get the single instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Get current time
    public double getTime() {
        return currentTime;
    }

    // Set or change time
    public void setTime(double newTime) {
        currentTime = newTime;
    }
}

class ClockTest{
    public static void main(String[] args) {
        // Get the singleton instance
        Clock clock = Clock.getInstance();

        // Show initial time
        System.out.println("Initial time: " + clock.getTime());

        // Change the time
        clock.setTime(8.55);
        System.out.println("Updated time: " + clock.getTime());

        // Try to get another instance
        Clock anotherClock = Clock.getInstance();
        System.out.println("Another instance time: " + anotherClock.getTime());

        // Verify that both references point to the same object
        System.out.println("Both instances are the same: " + (clock == anotherClock));
    }
}
