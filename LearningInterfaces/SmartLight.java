package LearningInterfaces;

public class SmartLight implements ControllableDevice{

    boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("SmartLight turning ON!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("SmartLight turning OFF!");
    }

    @Override
    public void getStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("Status: " + status);
    }
}
