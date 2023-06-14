package com.TiendaIIQM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Maria
 */
@Controller
public class IndexController {
    @RequestMapping("/url")
    public String page(Model model) {
        model.addAttribute("mensaje", "Hola desde el controlador");
        return "index";
    }
    
}
