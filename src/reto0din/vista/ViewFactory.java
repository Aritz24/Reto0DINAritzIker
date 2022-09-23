/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.vista;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    
    /**
     * La factoría compara el string para determinar que tipo de objeto se 
     * quiere construir.
     * @author iker.
     * @param v
     * @return 
     */
    public View getView(String v){
        if(v.equalsIgnoreCase("Texto")){
            return new TextViewImplementation();
        }else{
            return new WindowViewImplementation();
        }
    }
}
