package LearningInterfaces;

public class ThermoStat implements ControllableDevice{

    boolean isOn = false;
    double temperature = 25.0;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat turning ON!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat turning OFF!");
    }

    @Override
    public void getStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("Thermostat status: " + status
             + " Temperature: " + this.temperature
        );
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
        System.out.println("Temperature set to: " + this.temperature + "C");
    }
}
