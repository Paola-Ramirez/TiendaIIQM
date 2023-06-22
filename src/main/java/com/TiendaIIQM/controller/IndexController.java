package com.TiendaIIQM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Maria
 */
@Controller //Esto se llama anotación/
public class IndexController {
    //    mapping:URL a los que responde
    @RequestMapping("/url")
    public String page(Model model) {
        model.addAttribute("mensaje", "Hola desde el controlador");
        //qué vista se tiene que msotrar, NO son als de static, son las de tempaltes
        return "index";
    }
    
}
