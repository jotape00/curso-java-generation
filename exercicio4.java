package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero;
		
		System.out.println("Insira um n�mero para encontrar a paridade: ");
		numero = scan.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("O n�mero � par!");
			numero = Math.sqrt(numero);
			System.out.println("E sua ra�z quadrada �: " + numero);
		}
		else {
			System.out.println("O n�mero � �mpar!");
			numero = Math.pow(numero, 2.0);
			System.out.println("E seu valor ao quadrado vale: " + numero );
		}
	}
}
