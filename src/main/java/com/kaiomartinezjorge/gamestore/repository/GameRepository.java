package com.kaiomartinezjorge.gamestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.kaiomartinezjorge.gamestore.model.Game;

public interface GameRepository extends CrudRepository<Game, Integer> {
}
