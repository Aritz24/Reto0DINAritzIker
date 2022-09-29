/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.vista;

/**
 * Esta clase es la que muestra el mensaje en modo texto
 * @author 2dam
 */
public class TextViewImplementation implements View{

    @Override
    /**
     * Muestra el dato en la consola.
     */
    public void showGreeting(String dato) {
        System.out.println(dato);
    }
    
}
