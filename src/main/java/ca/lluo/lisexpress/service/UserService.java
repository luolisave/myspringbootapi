package ca.lluo.lisexpress.service;

import ca.lluo.lisexpress.pojo.User;
import ca.lluo.lisexpress.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createUser(String username, String plainPassword, Set<String> roles) {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new IllegalArgumentException("Username already exists");
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(plainPassword)); // Encode the password
        user.setRoles(roles);
        user.setEnabled(true);
        userRepository.save(user);
    }
}
