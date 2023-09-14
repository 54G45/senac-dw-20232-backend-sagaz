package br.sc.senac.dw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sc.senac.dw.model.entidade.Produto;
import br.sc.senac.dw.service.ProdutoService;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService; //AntigoBO
	
	@GetMapping(path = "/todos")
	public List<Produto> listarTodos() {
		return produtoService.listarTodos();
	}
	
	/**
	 * Método GET
	 * Parâmetro id foi enviado via URL
	 * @return um produto específico, dado o seu id
	 */
	
	@GetMapping(path = "/{id}")
	public Produto consultarPorId(@PathVariable Integer id) {
		return produtoService.consultarPorId(id.longValue());
	}
	
	/**
	 * Método POST: geralmente utilizado para inserir novos registros
	 * Parâmetros são enviados no corpo da requisição HTTP, 
	 * para isso usamos a anotação @RequestBody
	 * 
	 * @return o produto salvo, com id preenchido
	 * @throws CampoInvalidoException 
	 */
	
	@PostMapping
	public Produto salvar(@RequestBody Produto novoProduto) { // criar exception
		return produtoService.inserir(novoProduto);
	}
	
	
	/**
	 * Método PUT: utilizado para atualizar registros. 
	 * Muitas vezes é usado o POST em seu lugar
	 * Parâmetros são enviados no corpo da requisição HTTP, 
	 * para isso usamos a anotação @RequestBody
	 * 
	 * @return um booleano indicando se a vacina em questão foi atualizada
	 * @throws CampoInvalidoException 
	 */
	
	@PutMapping
	public void atualizar (@RequestBody Produto produto) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
