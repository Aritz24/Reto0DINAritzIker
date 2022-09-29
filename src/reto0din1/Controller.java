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
 * Esta es la clase de el controlador
 * @author 2dam
 */
public class Controller{
    
    /**
     * Recoge el saludo guardandolo en un String y lo manda para enseñarselo al
     * usuario.
     * @param model Dependiendo de los datos del archivo de configuracion enviaremos
     * un objeto de una implementacion u otra.
     * @param view Dependiendo de los datos del archivo de configuracion enviaremos
     * un objeto de una implementacion u otra.
     */
    public void Run(Model model, View view) throws Exceptions{
        String dato;
        dato = model.getGreeting();
        view.showGreeting(dato);
        
        
    }
   
}
