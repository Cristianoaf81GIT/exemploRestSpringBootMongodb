/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greglturnquist.learningspringboot.learningspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 * @author cristianoaf81
 */
@RestController
public class ChapterController {
    
    private final ChapterRepository repository;

    
    public ChapterController(ChapterRepository repository) 
    {
        this.repository = repository;
    }
    
    @GetMapping("/capitulos")
    public Flux<Chapter> listing()
    {
        return repository.findAll();
    }
    
}
