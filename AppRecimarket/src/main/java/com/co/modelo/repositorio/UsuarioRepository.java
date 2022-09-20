
package com.co.modelo.repositorio;

import com.co.modelo.entidad.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
    
}
