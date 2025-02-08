package br.com.desafio.ScreenMatch.repositories;

import br.com.desafio.ScreenMatch.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}