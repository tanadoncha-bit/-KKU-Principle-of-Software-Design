package com.example.lab7_673380585_0_sec3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lab7_673380585_0_sec3.model.Game;
import com.example.lab7_673380585_0_sec3.repository.GameRepository;
import com.example.lab7_673380585_0_sec3.strategy.DiscountContext;

@Service
public class GameService {

    private final GameRepository repository;
    private final DiscountContext context;

    public GameService(GameRepository repository) {
        this.repository = repository;
        this.context = new DiscountContext();
    }

    public List<Game> getAllGames() {
        return repository.findAll();
    }

    public Game getGame(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void save(Game game) {

        double finalPrice = context.calculate(
                game.getPrice(),
                game.getDiscountType());

        game.setPrice(finalPrice);

        repository.save(game);
    }

    public void delete(Long id) {

        repository.deleteById(id);
    }

}