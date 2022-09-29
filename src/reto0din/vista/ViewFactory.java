/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.vista;

/**
 * Esta es la clase que crea vistas
 * @author 2dam
 */
public class ViewFactory {
    
    /**
     * La factoría compara el string para determinar que tipo de objeto se 
     * quiere construir.
     * @param v Es una variable que guarda la forma en que queremos mostrar el dato
     * @return Dependiendo de la opcion que se seleccione no devolvera una u 
     * otra implementacion
     */
    public View getView(String v){
        if(v.equalsIgnoreCase("Texto")){
            return new TextViewImplementation();
        }else{
            return new WindowViewImplementation();
        }
    }
}
