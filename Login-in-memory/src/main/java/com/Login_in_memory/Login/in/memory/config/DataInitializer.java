package com.Login_in_memory.Login.in.memory.config;

import com.Login_in_memory.Login.in.memory.model.Role;
import com.Login_in_memory.Login.in.memory.model.User;
import com.Login_in_memory.Login.in.memory.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findByName("admin").isEmpty()) {
                User user = new User();
                user.setName("admin");
                user.setPassword(passwordEncoder.encode("admin123"));
                user.setRole(Role.ADMIN);
                userRepository.save(user);

                System.out.println("🟢 Usuario 'admin' creado con contraseña 'admin123'");
            }
        };
    }
}
