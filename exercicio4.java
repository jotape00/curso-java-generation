package br.com.generation.atividade01;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A, B, C, D;
		double R, S;
		
		System.out.print("Insira o n�mero A: ");
		A = scan.nextDouble();
		
		System.out.print("Insira o n�mero B: ");
		B = scan.nextDouble();
		
		System.out.print("Insira o n�mero C: ");
		C = scan.nextDouble();
		
		R = Math.pow((A+B), 2.0);
		S = Math.pow((B+C), 2.0);
		
		D = (R+S) / 2;
		System.out.println("O resultado dessa express�o com os n�meros dados �: "+ D);
	}
}
