package dio.aula.repository;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import dio.aula.model.User;
import jakarta.persistence.EntityManager;

public class UserRepository extends SimpleJpaRepository<User, Integer> {

    public UserRepository(Class<User> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        
    }
    
}
