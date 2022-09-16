package br.com.brunocs.clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("mensagem")
    public String mensagem(ModelMap modelMap){
        modelMap.addAttribute("mensagem", "Outra mensagem vinda do servidor ...");
        return "mensagem";
    }
}
