package com.br.modelos;

import java.util.Date;

public class Carro extends Veiculo {

	private boolean idoso;
	private boolean comum;
	private boolean deficiente;

	public Carro(Date entrada, Date saida, boolean idoso, boolean comum, boolean deficiente) {
		super(entrada, saida);
		this.idoso = idoso;
		this.comum = comum;
		this.deficiente = deficiente;
	}

	public boolean isIdoso() {
		return idoso;
	}

	public void setIdoso(boolean idoso) {
		this.idoso = idoso;
	}

	public boolean isComum() {
		return comum;
	}

	public void setComum(boolean comum) {
		this.comum = comum;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}

	@Override
	public String toString() {
		String modelo = "";

		modelo += " Idoso ->" + this.isIdoso() + "\n";
		modelo += "Deficiente ->" + this.isDeficiente() + "\n";
		modelo += "Comum -> " + this.isComum() + "\n";
		modelo += "Hora de entrada ->" + super.getEntrada() + "\n";
		modelo += "Hora de saida  ->" + super.getSaida() + "\n";

		return modelo;

	}
}