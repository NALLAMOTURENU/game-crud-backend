package com.Timepassgames.game_crud_backend.controller;

import com.Timepassgames.game_crud_backend.entity.Game;
import com.Timepassgames.game_crud_backend.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameService.createGame(game);
    }

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Optional<Game> getGameById(@PathVariable Long id) {
        return gameService.getGameById(id);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game game) {
        return gameService.updateGame(id, game);
    }

    @DeleteMapping("/{id}")
    public String deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
        return "Game deleted successfully";
    }
}