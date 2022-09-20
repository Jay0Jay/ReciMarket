
package com.co.controlador;

import com.co.modelo.entidad.Usuario;
import com.co.modelo.servicio.IUsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vista/usuarios")
public class UsuarioControlador {
    
    @Autowired
    private IUsuarioServicio usuarioServicio;
   
    @GetMapping("/")
    public String ListarUsuarios(Model model){
        List<Usuario> listadoUsuarios = usuarioServicio.listarTodos();
        model.addAttribute("titulo", "Lista de Usuarios");
        model.addAttribute("usuarios", listadoUsuarios);
        return "/vista/usuarios/listar";
    }
}
