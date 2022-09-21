
package com.co.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Convertir una clase en controladora
@Controller
public class ControladorInicio {
    
    //MAPEO CON GET -- Mostrar la pagina....
    @GetMapping("/")    
    //MAPEO A UNA CLASE, METODO
    public String index(){
            return "index";
    }
    
    
    @GetMapping("/registro")
    public String registro()
    {
        return "registro";
    }
    
    @GetMapping("/iniciosesion")
    public String iniciosesion()
    {
        return "iniciosesion";
    }    
    
    @GetMapping("/venta")    
    //MAPEO A UNA CLASE, METODO
    public String venta(){
            return "venta";
    }

    
    
}
