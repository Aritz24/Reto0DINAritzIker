/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.excepciones;

/**
 * Es la Clase que controla las excepciones
 * @author 2dam
 */
public class Exceptions extends Exception{
    
    private static final long serialVersionUID = 1L;
    
    public Exceptions(){
        super();
    }
    
    public Exceptions(String message){
        super(message);
    }
    
}