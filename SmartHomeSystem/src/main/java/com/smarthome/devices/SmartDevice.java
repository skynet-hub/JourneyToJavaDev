package com.smarthome.devices;

public abstract class SmartDevice {

    PowerSource powerSource;
    WifiModule wifiModule;

    public SmartDevice(PowerSource powerSource){
        this.powerSource = powerSource;
    }

    public PowerSource getPowerSource() {
        return powerSource;
    }

    public void setWifiModule(WifiModule wifiModule){
        this.wifiModule = wifiModule;
    }

    public WifiModule getWifiModule() {
        return wifiModule;
    }

    public abstract void showDeviceDetails();
}
