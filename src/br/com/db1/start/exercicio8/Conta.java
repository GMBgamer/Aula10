package br.com.db1.start.exercicio8;

public class Conta {

	private Integer numero;
	
	private Integer digitoVerificador;
	
	public Conta(Pessoa pessoa, Agencia agencia) {
		this.pessoa = pessoa;
		this.agencia = agencia;
	}
}
