package LearningInterfaces;

public class Main {
    public static void main(String[] args){
        ControllableDevice smartLight = new SmartLight();
        ControllableDevice thermoStat = new ThermoStat();

        smartLight.turnOn();
        smartLight.getStatus();
        smartLight.turnOff();

        System.out.println();

        //Let us do thermoStat work
        thermoStat.turnOn();
        ((ThermoStat) thermoStat).setTemperature(31.0);
        thermoStat.getStatus();
        thermoStat.turnOff();
    }
}
