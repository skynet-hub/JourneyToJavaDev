package com.smarthome.devices;

public class WifiModule {

    private String ssid;

    public WifiModule(String ssid){
        this.ssid = ssid;
    }

    public String getSsid() {
        return ssid;
    }
}
