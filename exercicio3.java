package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade, categoria;
		
		System.out.println("Escreva qual a sua idade: ");
		idade = scan.nextInt();
		System.out.print("Você se enquadra na categoria: ");
		
		if(idade>=10 && idade<=14) {
			System.out.println("Infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idade inválida ou não há categoria para alocação.");
		}
	}
}
