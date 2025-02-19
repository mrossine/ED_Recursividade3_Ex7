package controller;

public class Controller {
	public Controller() {
		super();
	}
	public int somaAlgarismos(int [] vetor, int tamanho) {
		if(tamanho == 0) {
			return vetor[tamanho];
		}
		else {
			return vetor[tamanho] + somaAlgarismos(vetor, tamanho - 1);
		}
	}
}
