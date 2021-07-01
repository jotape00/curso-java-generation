package br.com.generation.atividade01;
import java.util.Scanner;
public class exercicio7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, d, e, f;
		double x, y;
		
		System.out.println("Sistema de equações lineares");
		System.out.println("Escreva o coef. a: ");
		a = scan.nextDouble();
		
		System.out.println("Escreva o coef. b: ");
		b = scan.nextDouble();
		
		System.out.println("Escreva o coef. c: ");
		c = scan.nextDouble();
		
		System.out.println("Escreva o coef. d: ");
		d = scan.nextDouble();
		
		System.out.println("Escreva o coef. e: ");
		e = scan.nextDouble();
		
		System.out.println("Escreva o coef. f: ");
		f = scan.nextDouble();
		
		x = (c*e - b*f) / (a*e - b*d);
		System.out.println("O valor de x é: "+ x);
		
		y = (a*f - c*d) / (a*e - b*d);
		System.out.println("O valor de y é: "+ y);
	}
}
