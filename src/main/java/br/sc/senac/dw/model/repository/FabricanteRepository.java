package br.sc.senac.dw.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sc.senac.dw.model.entidade.Fabricante;

public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {

}
