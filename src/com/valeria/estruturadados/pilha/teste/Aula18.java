package com.valeria.estruturadados.pilha.teste;

import java.util.Stack;

import com.valeria.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1); //empilhar
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		System.out.println("Tamanho da pilha: " + stack.size());
		System.out.println(stack);
		
		System.out.println("Espiar: " + stack.peek());
		
		System.out.println("Desempilha: " + stack.pop());
		
		System.out.println(stack);

	}

}
