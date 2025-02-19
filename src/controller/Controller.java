package controller;

public class Controller {
	public Controller() {
		super();
	}
	public int somaAlgarismos(int [] vetor, int tamanho) {
		/*
		 * Faz a parada quando chega na primeira posição do vetor que
		 * contém os algarimos do número da entrada de dados
		 */
		if(tamanho == 0) {
			return vetor[tamanho];
		}
		/*
		 * Realiza a soma dos valores presentes nas posições do vetor
		 * e entra na recursiva para continuar fazendo a adição, até o 
		 * ponto de parada
		 */
		else {
			return vetor[tamanho] + somaAlgarismos(vetor, tamanho - 1);
		}
	}
}
