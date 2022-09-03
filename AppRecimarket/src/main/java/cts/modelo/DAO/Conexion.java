/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cts.modelo.DAO;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author juan.rojas
 */
public class Conexion {
    
    Connection conectar = null;
    
    public Connection CONECTAR(){
        
        try {
            
            
            Class.forName("");
                    
            conectar = DriverManager.getConnection("");
            
            System.out.println("Conexion exitosa");
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Conexion exitosa");
            System.out.println("ejemplo");
        }
        return conectar;
    }
    
}
