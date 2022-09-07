/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recimarket.test;
import recimarket.modelo.DAO.Conexion;
import recimarket.modelo.DAO.UsuarioDao;
import java.sql.SQLException;
import recimarket.modelo.VO.Usuarios;

public class OperacionesDB {
    
    public static void main(String[] args) {
        listarUsuarios();
    }
    
    public static void listarUsuarios(){
        UsuarioDao dao = new UsuarioDao();
        try {
            for (Usuarios u: dao.listarUsuarios()) {
                System.out.println(u);
            }
        } catch (SQLException ex) {
        }
    }
}
