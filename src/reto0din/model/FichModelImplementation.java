/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class FichModelImplementation implements Model{
    

    @Override   
    /**
     * Recoge el saludo del archivo de configuración
     * 
     */
    public String getGreeting() {
        String greeting = ResourceBundle.getBundle("reto0din.config")
                .getString("saludo");
       
           return greeting;    
    } 
}