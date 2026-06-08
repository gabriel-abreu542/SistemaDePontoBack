package br.com.projetos.repository;

import br.com.projetos.models.entities.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoRepository extends JpaRepository<Ponto, Long> {
}
