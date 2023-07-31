package br.com.faening.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faening.DTO.GameMinDTO;
import br.com.faening.model.Game;
import br.com.faening.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(element -> new GameMinDTO(element)).toList();
	}

}
