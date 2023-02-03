package pl.javastart.task;

public class Tv {
    boolean turnOn;

    public Tv(boolean turnOn) {
        this.turnOn = turnOn;
    }

    boolean turnOn() {
        return turnOn = true;
    }

    boolean turnOff() {
        return turnOn = false;
    }

    void showStatus() {
        System.out.println(turnOn);
    }
}
