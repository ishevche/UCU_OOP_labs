package ua.edu.ucu.lab.item.flower;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FlowerConfig {
    private final static Flower first =
            new Flower(10., FlowerColor.BLUE, 50.);
    private final static Flower second =
            new Flower(20., FlowerColor.RED, 25.);

    @Bean
    CommandLineRunner commandLineRunner(FlowerRepository flowerRepository) {
        return args -> {
            flowerRepository.saveAll(List.of(first, second));
        };
    }
}
