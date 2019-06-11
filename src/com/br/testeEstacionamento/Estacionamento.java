package com.br.testeEstacionamento;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.br.modelos.Carro;
import com.br.modelos.Catraca;
import com.br.modelos.Moto;
import com.br.modelos.Vaga;

public class Estacionamento {

	public static void main(String[] args) {

		Calendar calendarioEntrada = Calendar.getInstance();
		Calendar calendarioSaida = Calendar.getInstance();
		Catraca catraca = new Catraca();
		Scanner sc = new Scanner(System.in);

		int porcentagemDeVagas = 10;
		int total = digiteInt("Quantas vagas seu estacionamento terá? ");
		int vagaMotos = digiteInt("Quantas vagas de moto terá?");
		int vagaIdoso = (total * porcentagemDeVagas) / 100;
		int vagaDeficiente = (total * porcentagemDeVagas) / 100;
		int vagas = total - vagaDeficiente - vagaIdoso - vagaMotos;

		Vaga vaga = new Vaga(vagas, vagaIdoso, vagaDeficiente, vagaMotos);
		System.out.println(vaga);

		String line;
		System.out.println("Informe a hora de entrada:");
		line = sc.nextLine();
		calendarioEntrada.set(Calendar.HOUR_OF_DAY, Integer.parseInt(line));

		System.out.println("Informe o minuto de entrada: ");
		line = sc.nextLine();
		calendarioEntrada.set(Calendar.MINUTE, Integer.parseInt(line));

		System.out.println("Informe o segundos de entrada: ");
		line = sc.nextLine();
		calendarioEntrada.set(Calendar.SECOND, Integer.parseInt(line));

		// calendario de saida

		System.out.println("Informe a hora de saida?");
		line = sc.nextLine();
		calendarioSaida.set(Calendar.HOUR_OF_DAY, Integer.parseInt(line));

		System.out.println("Informe o minuto atual");
		line = sc.nextLine();
		calendarioSaida.set(Calendar.HOUR_OF_DAY, Integer.parseInt(line));


		Date dataEntra = calendarioEntrada.getTime();
		Date dataSaida = calendarioSaida.getTime();
		Carro carro = new Carro(calendarioEntrada.getTime(), calendarioSaida.getTime(), true, false, false);
		System.out.println(carro);

		System.out.println(dataEntra.compareTo(dataSaida));
		int comparacaoDeCalendarios = (dataEntra.compareTo(dataSaida));


		double valorAPagar;
		if (comparacaoDeCalendarios <= 00.15) {

			valorAPagar = 0;
		} else if (comparacaoDeCalendarios> 15 && comparacaoDeCalendarios<= 60) {
			valorAPagar = 10;
		} else {
			valorAPagar = 10;


		}

		System.out.println("valor a pagar"+valorAPagar);
	}

	public static int digiteInt(String string) {
		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static String digiteString(String string) {
		System.out.println(string);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}
}
