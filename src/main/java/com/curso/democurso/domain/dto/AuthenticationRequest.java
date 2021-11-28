package com.curso.democurso.domain.dto;

/**
 * System:                 CleanBnB
 * Name:                   AuthenticationRequest
 * Description:            Class that represents a AuthenticationRequest's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/28/21
 */
public class AuthenticationRequest
{
    private String username;
    private String password;

    public String getUsername()
    {
        return username;
    }

    public AuthenticationRequest setUsername(String username)
    {
        this.username = username;
        return this;
    }

    public String getPassword()
    {
        return password;
    }

    public AuthenticationRequest setPassword(String password)
    {
        this.password = password;
        return this;
    }
}
