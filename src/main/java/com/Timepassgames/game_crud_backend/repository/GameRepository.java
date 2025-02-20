package com.Timepassgames.game_crud_backend.repository;

import com.Timepassgames.game_crud_backend.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}