/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import reto0din.excepciones.Exceptions;

/**
 *
 * @author 2dam
 */
public class BDModelImplementationTest {
    private final BDModelImplementation bd =new BDModelImplementation();
    
    public BDModelImplementationTest() {
    }
    
    @Before
    public void setUp() throws Exceptions {
       bd.openConnection();
    }
    
    @After
    public void tearDown() throws Exceptions {
        bd.closeConnection();
    }

    @Test
    public void testGetGreeting() throws Exception {
       
        String expResult = "Saludos usuario";
        String result = bd.getGreeting();
        assertEquals(expResult, result);
    }
    
   
    
}
