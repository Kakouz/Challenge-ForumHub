package br.com.forumhub.app.service;

import br.com.forumhub.app.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {
    @Autowired
    AuthRepository authRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return authRepository.findByUsername(username);
    }
}
