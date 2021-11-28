package com.curso.democurso.domain.dto;

/**
 * System:                 CleanBnB
 * Name:                   AuthenticationResponse
 * Description:            Class that represents a AuthenticationResponse's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/28/21
 */
public class AuthenticationResponse
{
    private String jwt;

    public AuthenticationResponse(String jwt)
    {
        this.jwt = jwt;
    }

    public String getJwt()
    {
        return jwt;
    }

    public AuthenticationResponse setJwt(String jwt)
    {
        this.jwt = jwt;
        return this;
    }
}
