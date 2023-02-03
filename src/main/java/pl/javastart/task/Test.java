package pl.javastart.task;

public class Test {
    public static void main(String[] args) {
        Tv tv1 = new Tv(false);
        tv1.showStatus();
        tv1.turnOn();
        tv1.showStatus();
        tv1.turnOff();
        tv1.showStatus();
    }
}
