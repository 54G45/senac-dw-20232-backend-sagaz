package br.sc.senac.dw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.sc.senac.dw.model.entidade.Produto;
import br.sc.senac.dw.model.repository.ProdutoRepository;
import jakarta.transaction.Transactional;

public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository; // antigo DAO
	
	@Transactional
	public List<Produto> listarTodos(){
		return produtoRepository.findAll();
	}
	
	public Produto consultarPorId(long id) {
		
		return produtoRepository.findById(id).get();
	}

}
