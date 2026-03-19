package com.kaiomartinezjorge.gamestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kaiomartinezjorge.gamestore.model.Game;
import com.kaiomartinezjorge.gamestore.repository.GameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    //conversar com o crud
    @Autowired
    GameRepository gameRepository;
    
    @GetMapping("/game-list")
    public ModelAndView gameList() {
        ModelAndView mv = new ModelAndView("/games/list");
        mv.addObject("games", gameRepository.findAll());
        return mv;
    }

    @PostMapping("game-add")
    public ModelAndView createGame(Game game) {
        ModelAndView mv = new ModelAndView("/games/add");
        gameRepository.save(game);
        mv.setViewName("redirect:/game-list");
        
        return mv;
    }
    
    



}

