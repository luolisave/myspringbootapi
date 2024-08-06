package ca.lluo.lisexpress.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import ca.lluo.lisexpress.pojo.User;
import ca.lluo.lisexpress.repository.UserRepository;

@Configuration
public class DatabaseInitializer {
    @Autowired
    private UserRepository userRepository;

    @Bean
    public ApplicationRunner initializer() {
        return args -> {
            // set default login user data for playing.
            Set<String> adminSet = new HashSet<>();
            adminSet.add("ADMIN");
            adminSet.add("USER");
            userRepository.save(new User(1L,"admin","admin1234", true, adminSet));

            Set<String> userSet = new HashSet<>();
            userSet.add("ADMIN");
            userSet.add("USER");
            userRepository.save(new User(2L,"user","user1234", true, userSet));
        };
    }
}
