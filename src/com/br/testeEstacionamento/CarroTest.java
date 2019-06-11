package com.br.testeEstacionamento;

import java.util.Calendar;
import java.util.Scanner;

import com.br.modelos.Carro;

public class CarroTest {
	public static void main(String[] args){
		Calendar calendario = Calendar.getInstance();


		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o dia");
	String line = sc.nextLine();

		System.out.println("Informe o hora ");
		line = sc.nextLine();
		calendario.set(Calendar.HOUR_OF_DAY, Integer.parseInt(line));

		System.out.println("Informe o minuto");
		line = sc.nextLine();
		calendario.set(Calendar.MINUTE,  Integer.parseInt(line));

		System.out.println("\"Informe o segundos ");
		line = sc.nextLine();
		calendario.set(Calendar.SECOND,  Integer.parseInt(line));

		System.out.println("\"Informe milesegundos ");
		calendario.set(Calendar.MILLISECOND,  Integer.parseInt(line));
		line = sc.nextLine();
		
		sc.close();
		Carro c = new Carro(calendario.getTime(), calendario.getTime(), true, false,false);

		System.out.println(c);
	}

}


