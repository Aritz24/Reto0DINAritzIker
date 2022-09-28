/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din1;

import reto0din.excepciones.Exceptions;
import java.util.ResourceBundle;
import reto0din.model.Model;
import reto0din.vista.View;

/**
 *
 * @author 2dam
 */
public class Controller{
    
    /**
     * Recoge el saludo guardandolo en un String y lo manda para enseñarselo al
     * usuario.
     * @param model
     * @param view 
     */
    public void Run(Model model, View view) throws Exceptions{
        String dato;
        dato = model.getGreeting();
        view.showGreeting(dato);
        
        
    }
   
}
