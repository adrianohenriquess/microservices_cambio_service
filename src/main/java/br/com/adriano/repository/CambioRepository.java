package br.com.adriano.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriano.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);
}
