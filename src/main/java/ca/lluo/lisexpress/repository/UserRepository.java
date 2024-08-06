package ca.lluo.lisexpress.repository;

import ca.lluo.lisexpress.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository; // This one have more methods like saveAll()
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
