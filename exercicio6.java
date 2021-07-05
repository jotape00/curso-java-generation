package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0, contador=0;
		double media, soma = 0;
		
		do {
			System.out.println("Insira um número: ");
			numero = scan.nextInt();
			if(numero%3 == 0) {
				soma += numero;
				contador++;
			}
		}
		while(numero != 0);		
		media = soma/contador;
		System.out.println("A média dos números múltiplos de três apresentados é: " + media);
	}
}
