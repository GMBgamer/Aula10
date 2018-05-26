package br.com.db1.start.exercicio6;

import java.util.Date;

public class Pedido {

	private Integer numero;
	
	private Integer numeroMessa;
	
	private Date dataPedido;
	
	public void cadastrarPedido() {
	}
	
	public void fecharPedido() {
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumeroMessa() {
		return numeroMessa;
	}
	
	public void setNumeroMessa(Integer numeroMessa) {
		this.numeroMessa = numeroMessa;
	}
	
	public Date getDataPedido() {
		return dataPedido;
	}
	
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
}

