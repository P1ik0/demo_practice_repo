package org.example.practika;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PractikaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PractikaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(PerformanceManager pm){

        return args -> {
            pm.startPerformance();
        };
    }
}
