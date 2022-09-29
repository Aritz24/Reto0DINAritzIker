/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

/**
 * Es la clase que crea modelos
 * @author 2dam
 */
public class ModelFactory {
    
    /**
     * La factoría compara el string para determinar que tipo de objeto se 
     * quiere construir.
     * @param v Es una variable que guarda la forma en que queremos coger el dato
     * @return Dependiendo de la opcion que se seleccione no devolvera una u 
     * otra implementacion
     */
    public Model getModel(String v){
        
        
        if (v.equalsIgnoreCase("Fichero")) {
            return new FichModelImplementation();
        }else{
            return new BDModelImplementation();
        }
        
    } 
    
    
}
