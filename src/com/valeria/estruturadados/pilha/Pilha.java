package com.valeria.estruturadados.pilha;

import com.valeria.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	
	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public T topo() {
		if(this.estaVazia()) {
			return null;
	}
		return this.elementos[tamanho-1];
	}
}
