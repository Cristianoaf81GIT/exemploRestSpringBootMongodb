/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greglturnquist.learningspringboot.learningspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

/**
 *
 * @author cristianoaf81
 */
@Configuration
public class LoadDatabase {
    
    @Bean
    CommandLineRunner init(ChapterRepository repository)
    {
        return args -> {
            
            Flux.just( 
                new Chapter( "Quick start with java" ),
                new Chapter( "Reactive web with Spring Boot" ),
                new Chapter( "...and more!" )                    
            ).flatMap( repository::save ).subscribe( System.out::println );
            
        };
    }
    
    
}
