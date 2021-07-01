package br.com.generation.atividade01;
import java.util.Scanner;
public class exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, nota3, mediapon;
		
		System.out.println("Insira a primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = scan.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = scan.nextDouble();
		
		mediapon = (2*nota1 + 3*nota2 + 5*nota3) / 10;
		System.out.println("A média ponderada é: " + mediapon);
	}
}
