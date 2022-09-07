/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recimarket.modelo.DAO;

import recimarket.modelo.VO.Usuarios;
import recimarket.modelo.DAO.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDao {
    private static final String SQL_SELECT = "SELECT id_usuario, Nombres, Apellidos, "
            + "Numero_Identificacion, Direccion, Telefono, Correo, Estado FROM usuarios";
    
    private final Conexion CONEXION;

    public UsuarioDao() {
        this.CONEXION = Conexion.getInstancia();
    }
    
    // Retorna la lista de todos los registros que se obtiene 
    // de la tabla usuarios de la BD.
    public List<Usuarios> listarUsuarios()throws SQLException{
        List<Usuarios> listaUsuario = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = CONEXION.conectar().prepareStatement(SQL_SELECT);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuarios usuario = new Usuarios();
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setNombres(rs.getString(2));
                usuario.setApellidos(rs.getString(3));
                usuario.setNumeroIdentificacion(rs.getString(4));
                usuario.setDireccion(rs.getString(5));
                usuario.setTelefono(rs.getString(6));
                usuario.setCorreo(rs.getString(7));
                usuario.setEstado(rs.getByte(8));
                listaUsuario.add(usuario);
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            ps=null;
            rs=null;
            CONEXION.desconectar();
        }
        return listaUsuario;
    }
}
