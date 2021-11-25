package com.curso.democurso.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * System:                 CleanBnB
 * Name:                   HelloWorldController
 * Description:            Class that represents a HelloWorldController's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@RestController
@RequestMapping("/saludar")
public class HelloWorldController
{
    @GetMapping("/hola")
    public String saludar(){
        return "Nunca pares ,never stop ";
    }
}
