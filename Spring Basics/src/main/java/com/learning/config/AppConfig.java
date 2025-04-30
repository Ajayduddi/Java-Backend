package com.learning.config;

import com.learning.service.Desktop;
import com.learning.service.Dev;
import com.learning.service.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * java based configuration, here you can create beans manually using @Bean annotation
 */
@Configuration
public class AppConfig {

    @Bean
    public Laptop laptop() {
        return new Laptop("intel i5 12th generation", "8GB", "512GB");
    }

    @Bean
    public Desktop desktop() {
        return new Desktop("intel i5 14th generation", "16GB", "1TB");
    }

    // Setter injection: passing desktop bean as dependency to Dev
    @Bean
    public Dev dev(Desktop desktop) {
        Dev dev = new Dev();
        dev.setComputer(desktop);
        return dev;
    }

    // Autowiring by type: ensure Dev has @Autowired on its computer property
    @Bean
    public Dev dev2() {
        return new Dev();
    }
}