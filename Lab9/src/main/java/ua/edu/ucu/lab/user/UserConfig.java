package ua.edu.ucu.lab.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {
    private static final User USER_FIRST =
            new User("ivan.shevchenko@ucu.edu.ua", LocalDate.of(2003, 2, 2));
    private static final User USER_SECOND =
            new User("klym.yaroslav@ucu.edu.ua", LocalDate.of(2004, 4, 14));

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            userRepository.saveAll(List.of(USER_FIRST, USER_SECOND));
        };
    }
}
