package br.com.generation.atividade01;
import java.util.Scanner;
public class exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		
		System.out.println("Insira a coordenada X do primeiro ponto: ");
		x1 = scan.nextDouble();
		
		System.out.println("Insira a coordenada Y do primeiro ponto: ");
		y1 = scan.nextDouble();
		
		System.out.println("Insira a coordenada X do segundo ponto: ");
		x2 = scan.nextDouble();
		
		System.out.println("Insira a coordenada Y do segundo ponto: ");
		y2 = scan.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0)) ;
		System.out.println("A distância entre os dois pontos é: "+ d);
	}
}
