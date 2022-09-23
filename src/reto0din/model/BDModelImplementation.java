/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class BDModelImplementation implements Model{

    
    private final String ObtenerSaludo= "Select saludo from saludo";
    
    private Connection con;
    private PreparedStatement stmt;
    private String driverBD;
    private String urlBD;
    private String userBD;
    private String passwordBD;
    
    public BDModelImplementation() {
        this.driverBD= ResourceBundle.getBundle("reto0din1.config")
                .getString("driver");
        this.urlBD= ResourceBundle.getBundle("reto0din1.config")
                .getString("urlBD");
        this.userBD= ResourceBundle.getBundle("reto0din1.config")
                .getString("userBD");
        this.passwordBD= ResourceBundle.getBundle("reto0din1.config")
                .getString("passwordBD");
    }
    
    
    public void openConnection (){
        try {
            con= (Connection) DriverManager.getConnection
        (urlBD, userBD, passwordBD);
        } catch (SQLException ex) {
            Logger.getLogger(BDModelImplementation.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeConnection() {
        if (stmt!= null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(BDModelImplementation.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
        if (con!= null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BDModelImplementation.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
    
  @Override
    public String getGreeting() {
        ResultSet rs= null;
        String saludo = null;
        this.openConnection();
        
        try {
            stmt= (PreparedStatement) con.prepareStatement(ObtenerSaludo);
            
            rs= stmt.executeQuery();
            
            while (rs.next()) {                
                 saludo= rs.getString("saludo");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(BDModelImplementation.class.getName())
                            .log(Level.SEVERE, null, ex);
        } finally{
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BDModelImplementation.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
                this.closeConnection();
        }
        return saludo;
    }
}