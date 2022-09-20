
package com.co.modelo.servicio;

import com.co.modelo.entidad.Usuario;
import com.co.modelo.repositorio.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImp implements IUsuarioServicio {
   
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuario> listarTodos() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public void guardar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
