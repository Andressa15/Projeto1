package com.br.modelos;

import java.util.Date;

public class Veiculo {

	private Date entrada;
	private Date saida;

	public Veiculo(Date entrada, Date saida) {
		super();
		this.entrada = entrada;
		this.saida = saida;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Date getSaida() {
		return saida;
	}
	public void setSaida(Date saida) {
		this.saida = saida;
	}
}

