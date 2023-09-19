package br.sc.senac.dw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.sc.senac.dw.model.Specification.ProdutoSpecifications;
import br.sc.senac.dw.model.entidade.Produto;
import br.sc.senac.dw.model.repository.ProdutoRepository;
import br.sc.senac.dw.model.seletor.ProdutoSeletor;
import jakarta.transaction.Transactional;

@Service
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
	
//	public List<Produto> listarComSeletor(ProdutoSeletor seletor){
//		
//		Specification<Produto> specification = ProdutoSpecifications.comFiltros(seletor);
//		
//		return produtoRepository.findAll(specification);
//		
//	}
	
	public Produto inserir(Produto novoProduto)  {
		
		return produtoRepository.save(novoProduto);
	}

	public Produto atualizar(Produto produto) {
		return produtoRepository.save(produto);
	}

	public boolean excluir(Long id) {
		produtoRepository.deleteById(id);
		return false;
	}
	
	

}
