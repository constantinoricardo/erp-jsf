package br.com.constantino.enterprise.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.constantino.enterprise.dao.EstabelecimentoDAO;
import br.com.constantino.enterprise.dao.ProdutoDAO;
import br.com.constantino.enterprise.entities.Estabelecimento;
import br.com.constantino.enterprise.entities.Pedido;
import br.com.constantino.enterprise.entities.Produto;

@ManagedBean
public class PedidoController {
	
	private Pedido pedido = new Pedido();
	private Estabelecimento estabelecimento = new Estabelecimento();
	private Produto produto = new Produto();
	private Integer estabelecimentoId;
	
	public List<Estabelecimento> getEstabelecimentos() {
		EstabelecimentoDAO dao = new EstabelecimentoDAO();
		return dao.listar();
	}
	
	public List<Produto> getProdutos() {
		ProdutoDAO dao = new ProdutoDAO();
		return dao.getProdutos();
	}
	
	public void salva(Pedido pedido) {
		
		System.out.println(pedido.getProduto());
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void setEstabelecimentoId(Integer estabelecimentoId) {
		this.estabelecimentoId = estabelecimentoId;
	}
	
	public Integer getEstabelecimentoId() {
		return estabelecimentoId;
	}
	
}