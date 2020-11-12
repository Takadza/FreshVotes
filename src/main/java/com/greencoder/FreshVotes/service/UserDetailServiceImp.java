package com.greencoder.FreshVotes.service;

import com.greencoder.FreshVotes.domain.User;
import com.greencoder.FreshVotes.repository.UserRepository;
import com.greencoder.FreshVotes.security.CustomSecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailServiceImp implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);

        if(user == null)

            throw new UsernameNotFoundException("Username or password invalid");

        return new CustomSecurityUser(user);

    }
}

