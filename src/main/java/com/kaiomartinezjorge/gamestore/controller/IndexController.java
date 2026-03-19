package com.kaiomartinezjorge.gamestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class IndexController {

    //Rotas de Navegação do Site
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/home")
    public String getHome() {
        return "index";
    }

    @GetMapping("/game-add")
    public String getGameAdd() {
        return "/games/add";
    }
    
    
    
}
