/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greglturnquist.learningspringboot.learningspringboot;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 *
 * @author cristianoaf81
 */
public interface ChapterRepository 
        extends ReactiveCrudRepository<Chapter, String> {
    
    
    
}
