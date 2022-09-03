
package recimarket.modelo.DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection conectar = null;
    
    public Connection conectar(){
        
        try {
            
            
            Class.forName("org.mariadb.jdbc.Driver");
                    
            conectar = DriverManager.getConnection("jdbc:mariadb:");
            System.out.println("Conexión Exitosa a la base de datos.");
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        return conectar;
    }
    
}
