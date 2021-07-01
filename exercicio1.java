package br.com.generation.atividade01;
import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anos, meses, dias, diasTotal;
		
		System.out.println("Quantos anos você tem?: ");
		anos = scan.nextInt();
		
		System.out.println("Quantos meses de vida?: ");
		meses = scan.nextInt();
		
		System.out.println("Quantos dias de vida?: ");
		dias = scan.nextInt();
		
		diasTotal = 365*anos + 28*meses + dias;
		
		System.out.println("Você tem aproximadamente um total de: " + diasTotal + " de dias vividos!");
	}
}
