
package recimarket.modelo.DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection conectar = null;
    private String host = "127.0.0.1";
    private String port = "3306";
    private String dbName = "dbrecimarket";
    private String userName ="root";
    private  String password = "admin";
    
    public Connection conectar(){
        
        try {
            
            
            Class.forName("org.mysql.jdbc.Driver");
            String url =  "jdbc:mysql://"+ this.host + ":" + this.port + "/" + this.dbName;
            conectar = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexión Exitosa a la base de datos.");
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        return conectar;
    }
    
}
