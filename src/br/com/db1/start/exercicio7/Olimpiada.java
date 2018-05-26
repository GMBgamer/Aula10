package br.com.db1.start.exercicio7;

public class Olimpiada {

	private Modalidade modalidade;
	
	private Pessoa pessoa;
	
	private Sede sede;
	
	private Integer ano;
	
	public Olimpiada(Modalidade modalidade, Pessoa pessoa, Sede sede) {
		this.modalidade = modalidade;
		this.pessoa = pessoa;
		this.sede = sede;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
}
