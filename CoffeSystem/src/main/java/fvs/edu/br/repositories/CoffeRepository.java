package fvs.edu.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.domain.Coffe;

@Repository
public interface CoffeRepository extends JpaRepository<Coffe, Integer>{

}
