package task7;

public class Clock {
    private double time = 0.0;

    public double getTime() {
        return time;
    }

    public void setTime(double newTime) {
        time = newTime;
    }

    public void advance(double dt) {
        time += dt;
    }
}
