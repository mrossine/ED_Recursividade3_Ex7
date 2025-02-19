package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class SomaAlgarismos {
	public static void main(String[] args) {
		Controller n = new Controller();
		String numero = JOptionPane.showInputDialog("Informe um valor inteiro");
		String [] vetorS = numero.split("");
		int tamanho = vetorS.length;
		int [] vetor = new int [tamanho];
		int j = 0;
		for(String i: vetorS) {
			vetor[j] = Integer.parseInt(i);
			j++;
		}
		int resultado = n.somaAlgarismos(vetor, tamanho - 1);
		System.out.println(resultado);
	}
}
