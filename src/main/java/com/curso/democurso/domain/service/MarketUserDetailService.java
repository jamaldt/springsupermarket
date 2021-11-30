package com.curso.democurso.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * System:                 MarketProject
 * Name:                   MarketUserDetailService
 * Description:            Class that represents a MarketUserDetailService's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/28/21
 */
@Service
public class MarketUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("jamal", "{noop}123456", new ArrayList<>());
    }
}