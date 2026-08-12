package com.smarthome.devices;

public class SmartThermostat extends SmartDevice{
    public SmartThermostat(PowerSource powerSource){
        super(powerSource);
    }

    @Override
    public void showDeviceDetails(){
        System.out.println("SmartThermostat powered by " + powerSource.getType());

        if (getWifiModule() != null){
            System.out.println("Connected to wifi: " + getWifiModule().getSsid());
        }
    }
}
