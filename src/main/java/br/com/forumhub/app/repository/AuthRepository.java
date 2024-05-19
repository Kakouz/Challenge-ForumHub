package br.com.forumhub.app.repository;

import br.com.forumhub.app.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<AuthUser, Long> {

    Optional<AuthUser> findByUsernameAndPassword(String username, String password);

    UserDetails findByUsername(String subject);
}
