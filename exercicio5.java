package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio5 {
	public static void main(String[] args) {
		int numero = 0, soma = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Escreva um número: ");
			numero = scan.nextInt();
			soma += numero; 
		}
		while(numero != 0);
		System.out.println("A soma dos números digitados é: " + soma);
	}
}
