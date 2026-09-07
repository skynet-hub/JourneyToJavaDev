package dev.magobolesaomako;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SettingsLoaderService {
    private Map<String, String> settings = new HashMap<>();

    public Map<String, String> getSettings() {
        return settings;
    }

    @PostConstruct
    public void loadSettings(){
        settings.put("appName", "SpringBoot Demo");
        settings.put("version", "1.0.0");
        settings.put("author", "John Doe");
        System.out.println("Settings have been loaded");
    }
}
