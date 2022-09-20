
package com.co.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlador {
    
    @GetMapping({"/","index","home"})
    public String index(){
        return "home";
    }
    
}
