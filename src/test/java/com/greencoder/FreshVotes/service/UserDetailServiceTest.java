package com.greencoder.FreshVotes.service;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class UserDetailServiceTest {

    @Test
    public void generateEncryptedPassword(){

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "pass";
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println(encodedPassword);

        assertThat(rawPassword, not(encodedPassword));


    }

}