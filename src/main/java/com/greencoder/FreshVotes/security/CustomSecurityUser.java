package com.greencoder.FreshVotes.security;

import com.greencoder.FreshVotes.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Set;

public class CustomSecurityUser extends User implements UserDetails {


   // public CustomSecurityUser(org.springframework.security.core.userdetails.User user) {
      //  this.setAuthorities(user.getAuthorities());
       // this.setId(user.getId());
        //this.setName(user.getName());
       // this.setPassword(user.getPassword());
       // this.setUsername(user.getUsername());
   // }

    public CustomSecurityUser(){}

    public CustomSecurityUser(User user) {

        this.setAuthorities(user.getAuthorities());
        this.setId(user.getId());
        this.setName(user.getName());
        this.setPassword(user.getPassword());
        this.setUsername(user.getUsername());

    }

    @Override
    public Set<Authority> getAuthorities() {
        return super.getAuthorities();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
