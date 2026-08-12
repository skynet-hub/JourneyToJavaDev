package com.smarthome.devices;

public class SmartLight extends SmartDevice{

    public SmartLight(PowerSource powerSource){
        super(powerSource);
    }

    @Override
    public void showDeviceDetails() {
        System.out.println("Smart Light powered by " + powerSource.getType());

        if (getWifiModule() != null){
            System.out.println("Connected to wifi: " + getWifiModule().getSsid());
        }
    }
}
