package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio2 {
	public static void main(String[] args) {
		double num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro n�mero: ");
		num1 = scan.nextInt();
		
		System.out.println("Escreva o segundo n�mero: ");
		num2 = scan.nextInt();
		
		System.out.println("Escreva o terceiro n�mero: ");
		num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			if(num2>num3) {
				System.out.println("A ordem crescente dos n�meros �: " + num3 + ", " + num2 + " e " + num1 + ".");
			}
			else if(num3>num2) {
				System.out.println("A ordem crescente dos n�meros �: " + num2 + ", " + num3 + " e " + num1 + ".");
			}
		}
		
		else if(num2>num1 && num2>num3) {
			if(num1>num3) {
				System.out.println("A ordem crescente dos n�meros �: " + num3 + ", " + num1 + " e " + num2 + ".");
			}
			else if(num3>num1) {
				System.out.println("A ordem crescente dos n�meros �: " + num1 + ", " + num3 + " e " + num2 + ".");
			}
		}
		
		else if(num3>num1 && num3>num2) {
			if(num1>num2) {
				System.out.println("A ordem crescente dos n�meros �: " + num2 + ", " + num1 + " e " + num3 + ".");
			}
			else if(num2>num1) {
				System.out.println("A ordem crescente dos n�meros �: " + num1 + ", " + num2 + " e " + num3 + ".");
			}
		}
		
	}
}
