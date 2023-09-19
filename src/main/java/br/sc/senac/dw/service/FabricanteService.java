package br.sc.senac.dw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sc.senac.dw.model.entidade.Fabricante;
import br.sc.senac.dw.model.repository.FabricanteRepository;
import jakarta.transaction.Transactional;

@Service
public class FabricanteService {

	@Autowired
	private FabricanteRepository fabricanteRepository; 

	@Transactional
	public List<Fabricante> listarTodos() {
		return fabricanteRepository.findAll();
	}

	public Fabricante inserir(Fabricante fabricante) {

		return fabricanteRepository.save(fabricante);
	}

}
