package com.valeria.estruturadados.vetor.labs;

import com.valeria.estruturadados.vetor.Lista;

public class Exercicio01 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("Z"));

	}

}
