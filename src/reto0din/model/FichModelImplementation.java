/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import java.util.ResourceBundle;


/**
 * Esta es la clase que va a recoger el saludo de archivo de configuracion
 * @author 2dam
 */
public class FichModelImplementation implements Model{
    
/**
 * El metodo recoge el saludo
 * @return greeting
 */
    @Override   
    public String getGreeting() {
        String greeting = ResourceBundle.getBundle("reto0din1.config")
                .getString("saludo");
       
           return greeting;    
    } 
}