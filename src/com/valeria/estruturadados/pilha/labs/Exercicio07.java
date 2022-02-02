package com.valeria.estruturadados.pilha.labs;

import java.util.Stack;

public class Exercicio07 {

	public static void main(String[] args) {

		imprimeResultado(2);
		imprimeResultado(4);
		imprimeResultado(10);
		imprimeResultado(25);
		imprimeResultado(64);
		imprimeResultado(256);
		imprimeResultado(1024);
		
		imprimeResultadoQualquerBase(25, 2);
		imprimeResultadoQualquerBase(25, 16);
		imprimeResultadoQualquerBase(10035, 8);
		imprimeResultadoQualquerBase(1024, 8);
		imprimeResultadoQualquerBase(100000000, 16);
		

	}

	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em binário é: " + decimalBinario(numero));
	}

	public static void imprimeResultadoQualquerBase(int numero, int base) {
		
		if (base > 16) {
			throw new IllegalArgumentException();
		}
		System.out.println(numero + " na base " + base + " é: " + decimalQualquerBase(numero, base));
	}

	// CONVERTER NUMERO DECIMAL PARA BINÁRIO
	public static String decimalBinario(int numero) {

		Stack<Integer> pilha = new Stack<>();
		String numBinario = "";
		int resto;

		while (numero > 0) {
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2; // numero = numero/2
		}

		while (!pilha.isEmpty()) {
			numBinario += pilha.pop();
		}

		return numBinario;
	}

	// CONVERTER NUMERO DECIMAL PARA QUALQUER BASE
	public static String decimalQualquerBase(int numero, int base) {

		Stack<Integer> pilha = new Stack<>();
		String numbase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (numero > 0) {
			resto = numero % base;
			pilha.push(resto);
			numero /= base; // numero = numero/base
		}

		while (!pilha.isEmpty()) {
			numbase += bases.charAt(pilha.pop());
		}

		return numbase;
	}

}
