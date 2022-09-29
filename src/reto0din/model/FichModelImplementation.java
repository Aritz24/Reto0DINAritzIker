/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import java.util.ResourceBundle;


/**
 *
 * @author 2dam
 */
public class FichModelImplementation implements Model{
    

    @Override   
   
    public String getGreeting() {
        String greeting = ResourceBundle.getBundle("reto0din1.config")
                .getString("saludo");
       
           return greeting;    
    } 
}