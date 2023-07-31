package br.com.faening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.faening.model.Game;

public interface GameRepository extends JpaRepository<Game, Long>{ }