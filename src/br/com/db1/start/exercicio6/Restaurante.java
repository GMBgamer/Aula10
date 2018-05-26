package br.com.db1.start.exercicio6;

import java.util.Date;
import java.util.List;

public class Restaurante {

	private String nome;
	
	private Boolean serveAlmoco;
	
	private Boolean serveJanta;
	
	private Boolean serveCafeDaManha;
	
	private Endereco endereco;
	
	private List<Telefone> telefones;
	
	private Pedido pedido;
	
	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {
		
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJanta() {
		return serveJanta;
	}

	public void setServeJanta(Boolean serveJanta) {
		this.serveJanta = serveJanta;
	}

	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}

	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
}
