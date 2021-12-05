package com.example.mednew.configs;

import com.example.mednew.dao.UserRepository;
import com.example.mednew.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(userName);
        return getByUser(user);
    }

    private Principle getByUser(User user) {
        return new Principle(user.getName(), user.getAdult(), user.getEmail(), user.getPassword(), user.getAge());
    }

//    private UserDetails buildUserForAuthentication(User user, List<SimpleGrantedAuthority> authorities) {
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
//                true, true, true, true, authorities);
//    }
}
