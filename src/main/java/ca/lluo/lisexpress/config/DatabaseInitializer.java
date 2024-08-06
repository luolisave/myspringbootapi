package ca.lluo.lisexpress.config;

import ca.lluo.lisexpress.service.UserService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import ca.lluo.lisexpress.pojo.User;
import ca.lluo.lisexpress.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class DatabaseInitializer {
    @Autowired
    private UserService userService;


    @Bean
    public ApplicationRunner initializer() {
        return args -> {
            // set default login user data for playing.
            Set<String> adminSet = new HashSet<>();
            adminSet.add("ADMIN");
            adminSet.add("USER");
            userService.createUser("admin", "admin1234", adminSet);
            // userRepository.save(new User(1L,"admin",passwordEncoder.encode("admin1234"), true, adminSet));

            Set<String> userSet = new HashSet<>();
            userSet.add("USER");
            userService.createUser("user", "user1234", userSet);
            // userRepository.save(new User(2L,"user",passwordEncoder.encode("user1234"), true, userSet));
        };
    }
}
