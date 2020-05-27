package ru.itis.jlab.security.detail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.itis.jlab.model.User;
import ru.itis.jlab.repositories.UserRepository;

import java.util.Optional;

@Service(value = "customUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepositories;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepositories.findByEmail(email);
        if (user.isPresent()) {
            User user1 = user.get();
            return new UserDetailsImpl(user1);
        }
        throw new UsernameNotFoundException("User not found");
    }
}
