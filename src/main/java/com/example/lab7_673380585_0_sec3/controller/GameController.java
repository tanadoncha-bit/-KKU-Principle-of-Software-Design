package com.example.lab7_673380585_0_sec3.controller;

import com.example.lab7_673380585_0_sec3.model.Game;
import com.example.lab7_673380585_0_sec3.service.GameService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/games")
public class GameController {

    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    // READ
    @GetMapping
    public String listGames(Model model) {
        model.addAttribute("games", service.getAllGames());
        return "games/list";
    }

    // CREATE
    @GetMapping("/add")
    public String addGame(Model model) {
        model.addAttribute("game", new Game());
        return "games/add";
    }

    @PostMapping("/save")
    public String saveGame(@ModelAttribute Game game,
            RedirectAttributes redirectAttributes) {

        service.save(game);

        redirectAttributes.addFlashAttribute("message");

        return "redirect:/games";
    }

    // UPDATE
    @GetMapping("/edit/{id}")
    public String editGame(@PathVariable Long id, Model model) {
        model.addAttribute("game", service.getGame(id));
        return "games/edit";
    }

    @PostMapping("/update/{id}")
    public String updateGame(@PathVariable Long id, @ModelAttribute Game game) {

        game.setId(id);
        service.save(game);

        return "redirect:/games";
    }

    // DELETE
    @GetMapping("/delete/{id}")
    public String deletePage(@PathVariable Long id, Model model) {

        model.addAttribute("game", service.getGame(id));

        return "games/delete";
    }

    @PostMapping("/delete/{id}")
    public String deleteGame(@PathVariable Long id) {

        service.delete(id);

        return "redirect:/games";
    }

}