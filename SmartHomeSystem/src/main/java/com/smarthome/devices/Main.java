package com.smarthome.devices;

public class Main {
    public static void main(String[] args) {
        PowerSource battery = new PowerSource("Battery");
        PowerSource Electric = new PowerSource("Electric");

        SmartLight light = new SmartLight(battery);
        SmartThermostat thermostat = new SmartThermostat(Electric);

        WifiModule wifiLight = new WifiModule("Wifi_Light");
        WifiModule wifiThermostat = new WifiModule("Wifi_Thermostat");

        light.setWifiModule(wifiLight);
        thermostat.setWifiModule(wifiThermostat);

        //Show the details
        light.showDeviceDetails();
        thermostat.showDeviceDetails();
    }
}