/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import reto0din.excepciones.Exceptions;

/**
 * Es la intefaz del modelo
 * @author 2dam
 */
public interface Model {
    
    /**
     * Recogemos el saludo de donde esté guardado.
     * @return Devuelve el saludo 
     * @throws Exceptions 
     */
    public String getGreeting() throws Exceptions;
}
