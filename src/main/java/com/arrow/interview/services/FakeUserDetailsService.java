package com.arrow.interview.services;

import com.arrow.interview.entity.Person;
import com.arrow.interview.entity.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class FakeUserDetailsService implements UserDetailsService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = personRepository.findByUsername(username);
        if (person == null) {
            throw new UsernameNotFoundException("Username: " + username + " not found.");
        }
        return new User(username, "password", getGrantedAuthorities(username));
    }

    private List<GrantedAuthority> getGrantedAuthorities (String username) {
        List<GrantedAuthority> userAuthorities = new ArrayList<>();

        userAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        if (username.equals("admin")) {
            userAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            //ROLE_USER as default;
        }

        return userAuthorities;
    }

    private Collection<? extends GrantedAuthority> getGrantedAuthoritiesOld(String username) {
        Collection<? extends GrantedAuthority> userAuthorities = null;

//        userAuthorities(Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));

        if (username.equals("Juan")) {
//            userAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            //ROLE_USER as default;
        }

        return userAuthorities;
    }
}
