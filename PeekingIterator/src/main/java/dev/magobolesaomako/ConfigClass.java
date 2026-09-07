package dev.magobolesaomako;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.magobolesaomako")
public class ConfigClass {
    // No need to manually define beans; Component Scan will auto-detect them
}
