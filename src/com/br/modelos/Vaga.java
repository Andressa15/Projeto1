package com.br.modelos;

public class Vaga {
	
	private int vagas = "";
	private int numeroVaga = 0;
	private int
	private int 
	
	
	public Vaga(int vagas, int vagaIdoso, int vagaDeficiente, int vagaMotos) {
		super();
		this.vagas = vagas;
		this.vagaIdoso = vagaIdoso;
		this.vagaDeficiente = vagaDeficiente;
		this.vagaMotos = vagaMotos;
	}
	public int getVagas() {
		return vagas;
	}


	public void setVagas(int vagas) {
		this.vagas = vagas;
	}


	public int getVagaIdoso() {
		return vagaIdoso;
	}


	public void setVagaIdoso(int vagaIdoso) {
		this.vagaIdoso = vagaIdoso;
	}


	public int getVagaDeficiente() {
		return vagaDeficiente;
	}


	public void setVagaDeficiente(int vagaDeficiente) {
		this.vagaDeficiente = vagaDeficiente;
	}


	public int getVagaMotos() {
		return vagaMotos;
	}


	public void setVagaMotos(int vagaMotos) {
		this.vagaMotos = vagaMotos;
	}


	public String toString() {
		 String modelo = "";
		 modelo += "Total de Vagas: "       +this.getVagas()          + "\n";
		 modelo += "Vagas de Idosos: "      +this.getVagaIdoso()      + "\n";
		 modelo += "Vagas de Deficiente: "  +this.getVagaDeficiente() + "\n";
		 modelo += "Vagas de Motos: "       +this.getVagaMotos()      + "\n";
		 return modelo;
	 }
	
	
	
}
