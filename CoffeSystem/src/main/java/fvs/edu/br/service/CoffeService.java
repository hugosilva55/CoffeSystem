package fvs.edu.br.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.domain.Coffe;
import fvs.edu.br.repositories.CoffeRepository;

@Service
public class CoffeService {
	
	@Autowired
	private CoffeRepository cfRepository;
	
	public Coffe pesquisa(Integer id) {
		Optional<Coffe> express = cfRepository.findById(id);
		
		return express.orElse(null);
	}
	
}
