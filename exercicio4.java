package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero;
		
		System.out.println("Insira um número para encontrar a paridade: ");
		numero = scan.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("O número é par!");
			numero = Math.sqrt(numero);
			System.out.println("E sua raíz quadrada é: " + numero);
		}
		else {
			System.out.println("O número é ímpar!");
			numero = Math.pow(numero, 2.0);
			System.out.println("E seu valor ao quadrado vale: " + numero );
		}
	}
}
