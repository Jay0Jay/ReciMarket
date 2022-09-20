
package com.co.modelo.servicio;

import com.co.modelo.entidad.Usuario;
import java.util.List;

public interface IUsuarioServicio {
    public List<Usuario> listarTodos();
    public void guardar(Usuario usuario);
    public Usuario buscarPorId(Integer id);
}
