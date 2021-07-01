package br.com.generation.atividade01;
import java.util.Scanner;
public class exercicio8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double custoCarro, distribuidor, imposto, custoConsumidor;
		
		System.out.println("Qual é o custo de fábrica?: ");
		custoCarro = scan.nextDouble();
		
		distribuidor = custoCarro*0.28;
		imposto = custoCarro*0.45;
		custoConsumidor = custoCarro + distribuidor + imposto;
		
		System.out.println("O custo do consumidor será: "+ custoConsumidor);
	}
}
