package com.br.modelos;

import com.br.testeEstacionamento.Estacionamento;

public class Catraca extends Estacionamento {
	//public double calcularTempoParadoNoEstacionamento(Date entrada, Date saida) {

	public double calcularQuantoVouPagarNoEstacionamento(double minutos) {
         double  resultadoDaHora = 
		double valorAPagar = 0;

		if(minutos <= 15) {

			valorAPagar = 0;
		}else if(minutos > 15 && minutos <= 60) {
			valorAPagar = 10;
		}else { 
			valorAPagar = 10;
			double horas = transformarMinutosEmHora(minutos);
			horas = horas - 1;
			valorAPagar = valorAPagar + horas * 5;
		}
		return valorAPagar;
	}

	public double transformarMinutosEmHora(double minutos) {
		//56.89(double, float) => 56(Inteiro[byte, short, int, long])
		double horas = minutos/60;
		return horas;



	}
}	

