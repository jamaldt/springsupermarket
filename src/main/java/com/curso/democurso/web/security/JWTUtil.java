package com.curso.democurso.web.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * System:                 CleanBnB
 * Name:                   JWTUtil
 * Description:            Class that represents a JWTUtil's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/28/21
 */
@Component
public class JWTUtil {
    private static final String KEY = "pl4tz1";

    public String generateToken(UserDetails userDetails) {
        return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
            .signWith(SignatureAlgorithm.HS256, KEY).compact();
    }
}
