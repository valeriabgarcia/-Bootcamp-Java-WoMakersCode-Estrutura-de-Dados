package com.valeria.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.valeria.estruturadados.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>(5);
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");
		
		System.out.println(arrayList.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));

	}

}
