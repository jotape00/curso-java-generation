package br.com.generation.atividade02;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		int contador = 1, idade, calmocontador = 0, mulhernervosa = 0, homemagressivo = 0, outrocalmo = 0, acima40Nervosa = 0, menor18Calma = 0;
		int sexo; 
		int opcao;
		Scanner scan = new Scanner(System.in);
		
		while(contador != 10) {
			System.out.println("Insira sua idade:");
			idade = scan.nextInt();
			System.out.println("Insira seu sexo de acordo com os números:" + "\n1-feminino" + "\n2-masculino" + "\n3-outros" );
			sexo = scan.nextInt();
			System.out.println("Selecione um dos estados que você se identifica:" + "\n1 - é uma pessoa calma" + "\n2 - é uma pessoa nervosa" + "\n3 - agressiva");
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				calmocontador++;
			}
			if(sexo == 1 && opcao == 2) {
				mulhernervosa++;
			}
			if(sexo == 2 && opcao == 3) {
				homemagressivo++;
			}
			if(sexo == 3 && opcao == 1) {
				outrocalmo++;
			}
			if(idade > 40 && opcao == 2) {
				acima40Nervosa++;
			}
			if(idade < 18 && opcao == 1) {
				menor18Calma++;
			}
			contador++;		
		}
		System.out.println("O número de pessoas calmas é: " + calmocontador);
		System.out.println("O número de mulheres nervosas é: " + mulhernervosa);
		System.out.println("O número de homens agressivos é: " + homemagressivo);
		System.out.println("O número de outros calmos é: " + outrocalmo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + acima40Nervosa);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + menor18Calma);
	}
}
