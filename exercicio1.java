package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.println("Escreva o segundo número: ");
		num2 = scan.nextInt();
		
		System.out.println("Escreva o terceiro número: ");
		num3 = scan.nextInt();
		
		if((num1 >= num2) && (num1 >= num3)) {
			System.out.println("O número " + num1 + " é o maior.");
		}
		else if((num2 >= num1) && (num2 >= num3)) {
			System.out.println("O número " + num2 + " é o maior.");
		}
		else if((num3 > num1) && (num3 > num2)) {
			System.out.println("O número " + num3 + " é o maior");
		}
		else if((num1 == num2) && (num2 == num3)) {
			System.out.println("Os números são todos iguais!, e é: " +num1);
		}
	}
}
