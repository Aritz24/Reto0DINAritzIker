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
 *
 * @author 2dam
 */
public class BDModelImplementationTest {
    
    public BDModelImplementationTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*
    @Test
    public void testOpenConnection() throws Exception {
        System.out.println("openConnection");
        BDModelImplementation instance = new BDModelImplementation();
        instance.openConnection();
        fail("The test case is a prototype.");
    }*/

    /*
    @Test
    public void testCloseConnection() throws Exception {
        System.out.println("closeConnection");
        BDModelImplementation instance = new BDModelImplementation();
        instance.closeConnection();
        fail("The test case is a prototype.");
    }
*/

    @Test
    public void testGetGreeting() throws Exception {
        BDModelImplementation instance = new BDModelImplementation();
        String expResult = "saludos usuario";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    }
    
}
