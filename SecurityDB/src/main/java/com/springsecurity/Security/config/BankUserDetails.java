package com.springsecurity.Security.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankUserDetails implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String uname ,pass;
        //repo.findByUser(user)
        //size>0
        List<GrantedAuthority> authorities1=new ArrayList<>();
        authorities1.add(new SimpleGrantedAuthority("ADMIN"));
        return new User("test","test",authorities1);
    }
}
