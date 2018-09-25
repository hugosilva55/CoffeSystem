package fvs.edu.br.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.domain.Coffe;
import fvs.edu.br.service.CoffeService;

@RestController
@RequestMapping(value = "/coffe")
public class CoffeResource {

	@Autowired
	private CoffeService cfService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Coffe expresso = cfService.pesquisa(id);

		return ResponseEntity.ok().body(expresso);

	}
}
