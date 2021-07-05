package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		
		System.out.println("Digite dez números inteiros para descobrir a paridade: ");
		for(int i = 0; i<10; i++) {
			if(scan.nextInt() % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Pares: " + par);
		System.out.println("Impares: " + impar);
	}
}
