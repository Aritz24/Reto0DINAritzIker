/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din1;

import reto0din.excepciones.Exceptions;
import java.util.ResourceBundle;
import reto0din.model.ModelFactory;
import reto0din.vista.ViewFactory;

/**
 * Esta es la clase de Aplicacion donde se ejecuta.
 * @author 2dam
 */
public class Application {

    /**
     *  El metodo main guardamos de donde cogemos el dato y el tipo de vista que 
     * usaremos para ejecutarlo
     * Despues ejecutaremos el metodo Run de el objeto control
     */
        public static void main(String[] args) throws Exceptions {
        // TODO code application logic here 
        
        String tipo_dato = ResourceBundle.getBundle("reto0din1.config")
                .getString("tipo_dato");
        
        String tipo_vista = ResourceBundle.getBundle("reto0din1.config")
                .getString("tipo_vista");
        
       ModelFactory modelo = new ModelFactory();
       ViewFactory vista = new ViewFactory();
        
       Controller control = new Controller();
       control.Run(modelo.getModel(tipo_dato),vista.getView(tipo_vista));
        
    }
    
}
