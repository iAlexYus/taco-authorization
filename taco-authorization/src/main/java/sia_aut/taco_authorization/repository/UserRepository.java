package sia_aut.taco_authorization.repository;

import org.springframework.data.repository.CrudRepository;
import sia_aut.taco_authorization.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}