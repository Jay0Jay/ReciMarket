
package recimarket.modelo.DAO;
import java.sql.Connection;
import java.sql.DriverManager;

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
