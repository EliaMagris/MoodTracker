package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); // Avvia l'applicazione Spring Boot
    }

    @GetMapping("/mood")
    public String findMood(@RequestParam(value = "feel", defaultValue = "i'm ok") String mood){
        return String.format("today %s!", mood);
    }
}
