package br.com.diegocordeiro.diodesafioacademia.repositorio;

import br.com.diegocordeiro.diodesafioacademia.modelo.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {

}
