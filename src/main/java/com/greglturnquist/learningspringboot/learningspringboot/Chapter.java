/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greglturnquist.learningspringboot.learningspringboot;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author cristianoaf81
 */
@Data
@Document
public class Chapter {
    
    private String id;
    private String name;

    public Chapter( String name )
    {
        this.name = name;
    }
    
    
    
}
