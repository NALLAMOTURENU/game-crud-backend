package com.Timepassgames.game_crud_backend.service;

import com.Timepassgames.game_crud_backend.entity.Game;
import com.Timepassgames.game_crud_backend.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Optional<Game> getGameById(Long id) {
        return gameRepository.findById(id);
    }

    public Game updateGame(Long id, Game gameDetails) {
        return gameRepository.findById(id)
                .map(game -> {
                    game.setName(gameDetails.getName());
                    game.setUrl(gameDetails.getUrl());
                    game.setAuthor(gameDetails.getAuthor());
                    game.setPublishedDate(gameDetails.getPublishedDate());
                    return gameRepository.save(game);
                })
                .orElseThrow(() -> new RuntimeException("Game not found with id " + id));
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}