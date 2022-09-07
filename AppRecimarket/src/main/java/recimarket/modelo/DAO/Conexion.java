
package recimarket.modelo.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3386/recimarket";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    private Connection conexion;
    private static Conexion instancia;
    
    private Conexion(){
        conexion = null;
    }
    
    // conexión de la base de datos
    public Connection conectar() throws SQLException{
        try {
            conexion=DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.conexion;
    }
    
    // Método para cerrar la conexión de la BD
    public void desconectar(){
        try {
            this.conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // Retorna una unica instancia de la clase Conexion
    public synchronized static Conexion getInstancia(){
        if (instancia==null){
            instancia=new Conexion();
        }
        return instancia;
    }
    
}