package org.springboot.workshop.config;

import org.springboot.workshop.entities.User;
import org.springboot.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Joao", "joao@.com", "999999", "12345");
        User u2 = new User(null, "Amanda", "amanda@.com", "999999", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
