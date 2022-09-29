/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Esta es una clase de Testeo de Archivo
 * @author 2dam
 */
public class FichModelImplementationTest {
    
    public FichModelImplementationTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Este metodo comprueba que el saludo que recibe sea saludos usuario
     */
    @Test
    public void testGetGreeting() {
        FichModelImplementation instance = new FichModelImplementation();
        String expResult = "saludos usuario";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    }
    
}
